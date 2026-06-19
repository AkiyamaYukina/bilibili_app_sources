package com.bilibili.sistersplayer.httpserver;

import com.bilibili.sistersplayer.hls.StreamQueue;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;
import com.tencent.connect.common.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/httpserver/SimpleBaseClient.class */
public abstract class SimpleBaseClient implements Closeable {
    public static final int BUFFER_SIZE = 1024000;
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CRLF = "\r\n";
    public static final String LOCATION = "Location";
    public static final int SO_TIMEOUT = 15000;
    private static final String TAG = "SimpleBaseClient";
    public static final Charset UTF8_CHARSET = StandardCharsets.UTF_8;
    protected BufferedInputStream mInStream;
    protected final byte[] mLineBuffer = new byte[BUFFER_SIZE];
    protected BufferedOutputStream mOutStream;
    protected Request mRequest;
    private Socket mSocket;
    protected URI mUri;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/httpserver/SimpleBaseClient$Headers.class */
    public static class Headers extends HashMap<String, String> {
        public String find(String str) {
            String str2 = (String) super.get(str);
            if (str2 != null) {
                return str2;
            }
            for (Map.Entry<String, String> entry : entrySet()) {
                if (entry.getKey().equalsIgnoreCase(str)) {
                    return entry.getValue();
                }
            }
            return null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/httpserver/SimpleBaseClient$Request.class */
    public static class Request extends Headers {
        public ByteBuffer body;
        public String method;
        public String url;

        public Request(String str) {
            this(Constants.HTTP_GET, str);
        }

        public Request(String str, String str2) {
            this(str, str2, null);
        }

        public Request(String str, String str2, ByteBuffer byteBuffer) {
            this.method = str;
            this.url = str2;
            this.body = byteBuffer;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/httpserver/SimpleBaseClient$Response.class */
    public static class Response extends Headers {
        public long contentLength;
        public StatusLine statusLine;

        public boolean shouldRedirect() {
            StatusLine statusLine = this.statusLine;
            return statusLine == StatusLine.MOVED_PERMANENTLY || statusLine == StatusLine.MOVED_TEMPORARILY || statusLine == StatusLine.TEMPORARY_REDIRECT;
        }

        public void throwIfFailed() throws IOException {
            int i7 = this.statusLine.code;
            if (i7 < 200 || i7 >= 300) {
                throw new IOException(this.statusLine.toString());
            }
        }

        public Map<String, List<String>> toMultiMap() {
            HashMap map = new HashMap(size());
            for (Map.Entry<String, String> entry : entrySet()) {
                map.put(entry.getKey(), Collections.singletonList(entry.getValue()));
            }
            return map;
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.statusLine.toString() + ' ' + super.toString();
        }
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
    }

    public static void closeSilently(Closeable closeable) {
        try {
            closeable.close();
        } catch (Exception e7) {
        }
    }

    public static void closeSilently(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            closeSilently(closeable);
        }
    }

    public static int findHexadecimalEnd(byte[] bArr, int i7, int i8) {
        for (int i9 = i7; i9 < i7 + i8; i9++) {
            byte b7 = bArr[i9];
            if ((b7 < 48 || b7 > 57) && ((b7 < 97 || b7 > 102) && (b7 < 65 || b7 > 70))) {
                return i9;
            }
        }
        return -1;
    }

    public static int findLineEnd(byte[] bArr, int i7, int i8) {
        for (int i9 = i7; i9 < i7 + i8; i9++) {
            if (bArr[i9] == 10) {
                return i9;
            }
        }
        return -1;
    }

    public static String findLocationOrThrow(Response response) throws IOException {
        String strFind = response.find(LOCATION);
        if (isEmpty(strFind)) {
            response.throwIfFailed();
        }
        return strFind;
    }

    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static int parseInteger(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e7) {
            e7.printStackTrace();
            return 0;
        }
    }

    public static long parseLong(String str) {
        try {
            return Long.parseLong(str);
        } catch (Exception e7) {
            e7.printStackTrace();
            return 0L;
        }
    }

    public static int readFully(InputStream inputStream, byte[] bArr) throws IOException {
        return readFully(inputStream, bArr, 0, bArr.length);
    }

    public static int readFully(InputStream inputStream, byte[] bArr, int i7, int i8) throws IOException {
        int i9;
        int i10 = 0;
        do {
            int i11 = inputStream.read(bArr, i7 + i10, i8 - i10);
            if (i11 > 0) {
                i9 = i10 + i11;
            } else {
                i9 = i10;
                if (i11 == -1) {
                    if (i10 <= 0) {
                        i10 = -1;
                    }
                    return i10;
                }
            }
            i10 = i9;
        } while (i9 < i8);
        return i9;
    }

    public static String readUtf8Line(InputStream inputStream, byte[] bArr) throws IOException {
        return new String(bArr, 0, readUtf8LineStrictly(inputStream, bArr), UTF8_CHARSET);
    }

    public static int readUtf8LineStrictly(InputStream inputStream, byte[] bArr) throws IOException {
        int i7;
        int iFindLineEnd;
        inputStream.mark(bArr.length);
        int i8 = 0;
        int i9 = -1;
        while (true) {
            int i10 = inputStream.read(bArr, i8, bArr.length - i8);
            if (i10 <= 0) {
                i7 = i8;
                iFindLineEnd = i9;
                if (i10 != -1) {
                    break;
                    break;
                }
                break;
            }
            iFindLineEnd = findLineEnd(bArr, i8, i10);
            i7 = i8 + i10;
            i8 = i7;
            i9 = iFindLineEnd;
            if (iFindLineEnd != -1) {
                break;
            }
            i8 = i7;
            i9 = iFindLineEnd;
            if (i7 >= bArr.length) {
                i9 = iFindLineEnd;
                i8 = i7;
                break;
            }
        }
        if (i9 == -1 && i8 == 0) {
            throw new IOException("closed");
        }
        int i11 = i9;
        if (i9 >= 0) {
            inputStream.reset();
            inputStream.skip(i9 + 1);
            i11 = i9;
            if (i9 > 0) {
                i11 = i9;
                if (bArr[i9 - 1] == 13) {
                    i11 = i9 - 1;
                }
            }
        }
        return i11;
    }

    public static long writeFully(InputStream inputStream, long j7, OutputStream outputStream) throws IOException {
        long j8;
        byte[] bArr = new byte[BUFFER_SIZE];
        long j9 = 0;
        while (true) {
            int i7 = inputStream.read(bArr, 0, (int) Math.min(BUFFER_SIZE, j7 - j9));
            if (i7 <= 0) {
                j8 = j9;
                if (i7 > 0) {
                    break;
                    break;
                }
                break;
            }
            outputStream.write(bArr, 0, i7);
            j8 = j9 + ((long) i7);
            j9 = j8;
            if (j8 >= j7) {
                j9 = j8;
                break;
            }
        }
        return j9;
    }

    public static long writeFully(InputStream inputStream, OutputStream outputStream) throws IOException {
        return writeFully(inputStream, Long.MAX_VALUE, outputStream);
    }

    public static void writeFully(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int iMin;
        try {
            outputStream.write(byteBuffer.array());
        } catch (UnsupportedOperationException e7) {
            byte[] bArr = new byte[16384];
            do {
                iMin = Math.min(16384, byteBuffer.remaining());
                byteBuffer.get(bArr, 0, iMin);
                if (iMin > 0) {
                    outputStream.write(bArr, 0, iMin);
                }
            } while (iMin >= 0);
        }
    }

    public static void writeStream(StreamQueue streamQueue, BufferedOutputStream bufferedOutputStream, P2PLogger p2PLogger) {
        p2PLogger.logI(TAG, "writeStream start", null);
        while (true) {
            try {
                bufferedOutputStream.write(streamQueue.take());
                bufferedOutputStream.flush();
            } catch (InterruptedException e7) {
                p2PLogger.logI(TAG, "writeStream InterruptedException", null);
                p2PLogger.logI(TAG, "writeStream end", null);
                return;
            } catch (Exception e8) {
                e8.printStackTrace();
                p2PLogger.logE(TAG, "writeStream error", e8);
                p2PLogger.logI(TAG, "writeStream end", null);
                return;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        closeSilently(this.mInStream, this.mOutStream, this.mSocket);
        this.mInStream = null;
        this.mOutStream = null;
        this.mSocket = null;
    }

    public URI connect(Request request) throws IOException {
        URI uriCreate = URI.create(request.url);
        String scheme = uriCreate.getScheme();
        int port = uriCreate.getPort();
        int defaultPort = port;
        if (port == -1) {
            defaultPort = getDefaultPort(scheme);
        }
        Socket socketCreateSocket = (isSecure(scheme) ? SSLSocketFactory.getDefault() : SocketFactory.getDefault()).createSocket();
        this.mSocket = socketCreateSocket;
        socketCreateSocket.setSoTimeout(SO_TIMEOUT);
        this.mSocket.connect(new InetSocketAddress(uriCreate.getHost(), defaultPort), SO_TIMEOUT);
        this.mInStream = new BufferedInputStream(this.mSocket.getInputStream(), BUFFER_SIZE);
        this.mOutStream = new BufferedOutputStream(this.mSocket.getOutputStream(), BUFFER_SIZE);
        this.mRequest = request;
        this.mUri = uriCreate;
        return uriCreate;
    }

    public abstract int getDefaultPort(String str);

    public abstract String getProtocolVersion();

    public String getUrl() {
        Request request = this.mRequest;
        return request != null ? request.url : null;
    }

    public abstract boolean isSecure(String str);

    public StringBuilder makeBaseMessage(String str, String str2) {
        StringBuilder sb = new StringBuilder(256);
        sb.append(str);
        sb.append(' ');
        sb.append(str2);
        sb.append(' ');
        sb.append(getProtocolVersion());
        sb.append(CRLF);
        for (Map.Entry<String, String> entry : this.mRequest.entrySet()) {
            sb.append(entry.getKey());
            sb.append(':');
            sb.append(entry.getValue());
            sb.append(CRLF);
        }
        return sb;
    }

    public abstract void onParseHeader(String str, String str2);

    public long open(String str) throws IOException {
        return open(new Request(str)).contentLength;
    }

    public abstract Response open(Request request) throws IOException;

    public int read(byte[] bArr, int i7, int i8) throws IOException {
        return this.mInStream.read(bArr, i7, i8);
    }

    public byte[] readContent(Response response) throws IOException {
        byte[] byteArray;
        try {
            long j7 = response.contentLength;
            if (j7 > 0) {
                byteArray = new byte[(int) j7];
                readFully(this.mInStream, byteArray);
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(BUFFER_SIZE);
                response.contentLength = writeFully(this.mInStream, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
            }
            return byteArray;
        } catch (OutOfMemoryError e7) {
            throw new IOException(e7);
        }
    }

    public long readHexadecimalUnsignedLong() throws IOException {
        int i7;
        int iFindHexadecimalEnd;
        byte[] bArr = this.mLineBuffer;
        this.mInStream.mark(bArr.length);
        int i8 = -1;
        int i9 = 0;
        while (true) {
            int i10 = this.mInStream.read(bArr, i9, bArr.length - i9);
            if (i10 <= 0) {
                i7 = i9;
                iFindHexadecimalEnd = i8;
                if (i10 != -1) {
                    break;
                    break;
                }
                break;
            }
            iFindHexadecimalEnd = findHexadecimalEnd(bArr, i9, i10);
            i7 = i9 + i10;
            i9 = i7;
            i8 = iFindHexadecimalEnd;
            if (iFindHexadecimalEnd != -1) {
                break;
            }
            i9 = i7;
            i8 = iFindHexadecimalEnd;
            if (i7 >= bArr.length) {
                i8 = iFindHexadecimalEnd;
                i9 = i7;
                break;
            }
        }
        if (i8 == -1 && i9 == 0) {
            throw new IOException("closed");
        }
        if (i8 >= 0) {
            this.mInStream.reset();
            this.mInStream.skip(i8);
        }
        long j7 = 0;
        for (int i11 = 0; i11 < i8; i11++) {
            byte b7 = bArr[i11];
            j7 = (j7 << 4) | ((long) ((b7 < 48 || b7 > 57) ? (b7 < 97 || b7 > 102) ? (b7 < 65 || b7 > 70) ? 0 : b7 - 55 : b7 - 87 : b7 - 48));
        }
        return j7;
    }

    public Response receiveHeaders() throws IOException {
        String utf8Line = readUtf8Line(this.mInStream, this.mLineBuffer);
        System.out.println(utf8Line);
        String strTrim = utf8Line.substring(getProtocolVersion().length()).trim();
        Response response = new Response();
        response.statusLine = StatusLine.parse(strTrim);
        while (true) {
            String utf8Line2 = readUtf8Line(this.mInStream, this.mLineBuffer);
            if (isEmpty(utf8Line2)) {
                return response;
            }
            System.out.println(utf8Line2);
            int iIndexOf = utf8Line2.indexOf(58);
            if (iIndexOf > 0) {
                String strSubstring = utf8Line2.substring(0, iIndexOf);
                String strTrim2 = utf8Line2.substring(iIndexOf + 1).trim();
                response.put(strSubstring, strTrim2);
                if (CONTENT_LENGTH.equalsIgnoreCase(strSubstring)) {
                    response.contentLength = parseLong(strTrim2);
                }
                onParseHeader(strSubstring, strTrim2);
            }
        }
    }

    public void send(String str) throws IOException {
        System.out.println(str);
        this.mOutStream.write(str.getBytes(UTF8_CHARSET));
        this.mOutStream.flush();
    }

    public void send(ByteBuffer byteBuffer) throws IOException {
        writeFully(byteBuffer, this.mOutStream);
        this.mOutStream.flush();
    }
}
