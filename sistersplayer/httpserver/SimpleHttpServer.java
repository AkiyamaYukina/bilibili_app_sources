package com.bilibili.sistersplayer.httpserver;

import android.os.SystemClock;
import com.bilibili.sistersplayer.hls.FetchErrorCode;
import com.bilibili.sistersplayer.hls.StreamQueue;
import com.bilibili.sistersplayer.httpserver.SimpleBaseClient;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import com.google.common.util.concurrent.SettableFuture;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/httpserver/SimpleHttpServer.class */
public abstract class SimpleHttpServer implements Runnable {
    public static final String MIME_PLAINTEXT = "text/plain";
    private static final String TAG = "SimpleHttpServer";
    protected P2PLogger logger;
    private int mPort;
    public volatile String address = null;
    private final AtomicReference<ServerSocket> mSocketRef = new AtomicReference<>();
    private final AtomicReference<Thread> mThreadRef = new AtomicReference<>();
    private final SettableFuture<Void> mWaitForStart = SettableFuture.create();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/httpserver/SimpleHttpServer$ClientWorker.class */
    public class ClientWorker {
        private BufferedInputStream mInStream;
        private final byte[] mLineBuffer = new byte[SimpleBaseClient.BUFFER_SIZE];
        private BufferedOutputStream mOutStream;
        private Socket mSocket;
        final SimpleHttpServer this$0;

        public ClientWorker(SimpleHttpServer simpleHttpServer, Socket socket) throws IOException {
            this.this$0 = simpleHttpServer;
            this.mInStream = new BufferedInputStream(socket.getInputStream());
            this.mOutStream = new BufferedOutputStream(socket.getOutputStream());
            this.mSocket = socket;
        }

        public Request receive(boolean z6) throws IOException {
            String utf8Line = SimpleBaseClient.readUtf8Line(this.mInStream, this.mLineBuffer);
            this.this$0.logger.logI(SimpleHttpServer.TAG, "receive:\n" + utf8Line, null);
            String[] strArrSplit = utf8Line.split(" ");
            for (int i7 = 0; i7 < strArrSplit.length; i7++) {
                strArrSplit[i7] = strArrSplit[i7].trim();
            }
            if (strArrSplit.length != 3 || !"HTTP/1.1".equals(strArrSplit[2])) {
                throw new IOException("wrong request: ".concat(utf8Line));
            }
            Request request = new Request(strArrSplit[0], URLDecoder.decode(strArrSplit[1]));
            int integer = 0;
            while (true) {
                String utf8Line2 = SimpleBaseClient.readUtf8Line(this.mInStream, this.mLineBuffer);
                if (SimpleBaseClient.isEmpty(utf8Line2)) {
                    break;
                }
                this.this$0.logger.logI(SimpleHttpServer.TAG, utf8Line2, null);
                int iIndexOf = utf8Line2.indexOf(58);
                if (iIndexOf > 0) {
                    String strSubstring = utf8Line2.substring(0, iIndexOf);
                    String strTrim = utf8Line2.substring(iIndexOf + 1).trim();
                    request.put(strSubstring, strTrim);
                    if (SimpleBaseClient.CONTENT_LENGTH.equalsIgnoreCase(strSubstring)) {
                        integer = SimpleBaseClient.parseInteger(strTrim);
                    }
                }
            }
            if (z6 && integer > 0) {
                try {
                    byte[] bArr = new byte[integer];
                    SimpleBaseClient.readFully(this.mInStream, bArr);
                    request.body = ByteBuffer.wrap(bArr);
                } catch (OutOfMemoryError e7) {
                    throw new IOException(e7);
                }
            }
            return request;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.sistersplayer.httpserver.SimpleHttpServer$Response] */
        public void run() {
            InputStream inputStream;
            try {
                try {
                    Response responseOnResponse = this.this$0.onResponse(receive(true));
                    try {
                        try {
                            sendResponse(responseOnResponse);
                            inputStream = responseOnResponse.content;
                        } catch (SocketException e7) {
                            this.this$0.logger.logE(SimpleHttpServer.TAG, "Proxy socket closed, error code: " + FetchErrorCode.ERROR_PROXY_SOCKET_CLOSED.getEc(), e7);
                            inputStream = responseOnResponse.content;
                        }
                    } catch (IOException e8) {
                        e8.printStackTrace();
                        this.this$0.logger.logI(SimpleHttpServer.TAG, "sendResponse error", e8);
                        inputStream = responseOnResponse.content;
                    }
                    SimpleBaseClient.closeSilently(inputStream);
                    SimpleBaseClient.closeSilently(this.mInStream, this.mOutStream, this.mSocket);
                } catch (Throwable th) {
                    SimpleBaseClient.closeSilently(inputStream.content);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    th2.printStackTrace();
                    this.this$0.logger.logI(SimpleHttpServer.TAG, "receive error", th2);
                    SimpleBaseClient.closeSilently(this.mInStream, this.mOutStream, this.mSocket);
                } catch (Throwable th3) {
                    SimpleBaseClient.closeSilently(this.mInStream, this.mOutStream, this.mSocket);
                    this.mInStream = null;
                    this.mOutStream = null;
                    this.mSocket = null;
                    throw th3;
                }
            }
            this.mInStream = null;
            this.mOutStream = null;
            this.mSocket = null;
        }

        public void sendResponse(Response response) throws IOException {
            StringBuilder sb = new StringBuilder(8192);
            sb.append("HTTP/1.1 ");
            sb.append(response.statusLine.toString());
            sb.append("\r\nConnection: close\r\n");
            for (Map.Entry<String, String> entry : response.entrySet()) {
                sb.append(entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
                sb.append(SimpleBaseClient.CRLF);
            }
            sb.append(SimpleBaseClient.CRLF);
            String string = sb.toString();
            this.this$0.logger.logI(SimpleHttpServer.TAG, "send:\n" + string, null);
            this.mOutStream.write(string.getBytes(SimpleBaseClient.UTF8_CHARSET));
            this.mOutStream.flush();
            InputStream inputStream = response.content;
            if (inputStream != null) {
                long j7 = response.contentLength;
                if (j7 <= 0) {
                    j7 = Long.MAX_VALUE;
                }
                SimpleBaseClient.writeFully(inputStream, j7, this.mOutStream);
                this.mOutStream.flush();
                return;
            }
            if (response instanceof StreamResponse) {
                StreamQueue streamQueue = ((StreamResponse) response).outQueue;
                SimpleBaseClient.writeStream(streamQueue, this.mOutStream, this.this$0.logger);
                streamQueue.clear();
                streamQueue.closeStream();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/httpserver/SimpleHttpServer$Request.class */
    public static class Request extends SimpleBaseClient.Request {
        public Request(String str, String str2) {
            super(str, str2);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/httpserver/SimpleHttpServer$Response.class */
    public static class Response extends SimpleBaseClient.Response {
        public InputStream content;

        public Response() {
        }

        public Response(StatusLine statusLine, InputStream inputStream, long j7) {
            this.statusLine = statusLine;
            this.contentLength = j7;
            this.content = inputStream;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/httpserver/SimpleHttpServer$StreamResponse.class */
    public static class StreamResponse extends Response {
        public StreamQueue outQueue;

        public StreamResponse(StatusLine statusLine, StreamQueue streamQueue) {
            this.statusLine = statusLine;
            this.outQueue = streamQueue;
        }
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
    }

    public SimpleHttpServer(int i7, P2PLogger p2PLogger) {
        this.mPort = i7;
        this.logger = p2PLogger;
    }

    private void closeServerSocket() {
        ServerSocket andSet = this.mSocketRef.getAndSet(null);
        if (andSet != null) {
            SimpleBaseClient.closeSilently(andSet);
        }
    }

    public static void parseRequestRange(String str, long[] jArr) {
        String str2 = str;
        try {
            String lowerCase = str.toLowerCase();
            String strSubstring = lowerCase;
            if (lowerCase.startsWith("bytes=")) {
                strSubstring = lowerCase.substring(6);
            }
            String[] strArrSplit = strSubstring.split("-");
            String str3 = strSubstring;
            if (strArrSplit.length > 0) {
                String str4 = strSubstring;
                jArr[0] = Long.parseLong(strArrSplit[0]);
            }
            String str5 = strSubstring;
            if (strArrSplit.length > 1) {
                str2 = strSubstring;
                jArr[1] = Long.parseLong(strArrSplit[1]);
            }
        } catch (Exception e7) {
            System.err.println("Parse range error: " + str2 + ", " + e7);
        }
    }

    public int getListeningPort() {
        return this.mPort;
    }

    public boolean isAlive() {
        return this.mThreadRef.get() != null;
    }

    public Response newResponse(StatusLine statusLine, String str) {
        return newResponse(statusLine, MIME_PLAINTEXT, str);
    }

    public Response newResponse(StatusLine statusLine, String str, StreamQueue streamQueue, long j7) {
        StreamResponse streamResponse = new StreamResponse(statusLine, streamQueue);
        if (str != null) {
            streamResponse.put(SimpleBaseClient.CONTENT_TYPE, str);
        }
        return streamResponse;
    }

    public Response newResponse(StatusLine statusLine, String str, InputStream inputStream, long j7) {
        Response response = new Response(statusLine, inputStream, j7);
        if (str != null) {
            response.put(SimpleBaseClient.CONTENT_TYPE, str);
        }
        return response;
    }

    public Response newResponse(StatusLine statusLine, String str, String str2) {
        return newResponse(statusLine, str, new ByteArrayInputStream(str2.getBytes(SimpleBaseClient.UTF8_CHARSET)), r0.length);
    }

    public abstract Response onResponse(Request request);

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                ServerSocket serverSocket = new ServerSocket(this.mPort, 1, InetAddress.getByName("127.0.0.1"));
                this.mSocketRef.set(serverSocket);
                this.mPort = serverSocket.getLocalPort();
                this.address = "s:" + serverSocket.getLocalSocketAddress().toString();
                this.logger.logI(TAG, "Listen: " + this.address, null);
                this.mWaitForStart.set((Object) null);
                this.logger.logI(TAG, "In Accept ", null);
                Socket socketAccept = serverSocket.accept();
                this.address = "c:" + socketAccept.getRemoteSocketAddress().toString() + "-> s:" + socketAccept.getLocalSocketAddress().toString();
                P2PLogger p2PLogger = this.logger;
                StringBuilder sb = new StringBuilder("Client: ");
                sb.append(this.address);
                p2PLogger.logI(TAG, sb.toString(), null);
                closeServerSocket();
                socketAccept.setSoTimeout(SimpleBaseClient.SO_TIMEOUT);
                new ClientWorker(this, socketAccept).run();
            } catch (SocketException e7) {
                this.logger.logE(TAG, "Proxy socket closed, error code: " + FetchErrorCode.ERROR_PROXY_SOCKET_CLOSED.getEc(), e7);
            } catch (IOException e8) {
                this.logger.logE(TAG, "IOException", e8);
            }
            this.logger.logI(TAG, "Server stopped port:" + this.mPort, null);
        } finally {
            closeServerSocket();
            this.mThreadRef.set(null);
        }
    }

    public boolean start() {
        this.logger.logI(TAG, "--start--", null);
        Thread thread = new Thread(this);
        thread.setName("live-p2p-server");
        AtomicReference<Thread> atomicReference = this.mThreadRef;
        while (!atomicReference.compareAndSet(null, thread)) {
            if (atomicReference.get() != null) {
                this.logger.logW(TAG, "Server already started", null);
                return false;
            }
        }
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.logger.logI(TAG, "Server started", null);
            thread.start();
            this.mWaitForStart.get(2L, TimeUnit.SECONDS);
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            this.logger.logI(TAG, "Server started， port：" + this.mPort + " duration:" + (jUptimeMillis2 - jUptimeMillis), null);
            return true;
        } catch (Exception e7) {
            this.mThreadRef.set(null);
            this.logger.logE(TAG, "Fail to start server", e7);
            return false;
        }
    }

    public void stop() {
        this.logger.logI(TAG, "--stop--", null);
        closeServerSocket();
        Thread andSet = this.mThreadRef.getAndSet(null);
        if (andSet != null) {
            andSet.interrupt();
        }
    }
}
