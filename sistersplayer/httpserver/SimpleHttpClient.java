package com.bilibili.sistersplayer.httpserver;

import I.C2143d;
import androidx.room.B;
import com.bilibili.sistersplayer.httpserver.SimpleBaseClient;
import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/httpserver/SimpleHttpClient.class */
public class SimpleHttpClient extends SimpleBaseClient {
    protected static final String CHUNKED = "chunked";
    private static final int NO_CHUNK_YET = -1;
    protected static final String PROTOCOL_VERSION = "HTTP/1.1";
    protected static final String TRANSFER_ENCODING = "transfer-encoding";
    public static final String USER_AGENT = "stagefright/1.2 (Linux;Android 9)";
    private int mBytesInChunk;
    private boolean mChunkTransfer;
    private boolean mHasMoreChunks;

    private void readChunkSize() throws IOException {
        if (this.mBytesInChunk != -1) {
            SimpleBaseClient.readUtf8LineStrictly(this.mInStream, this.mLineBuffer);
        }
        this.mBytesInChunk = (int) readHexadecimalUnsignedLong();
        SimpleBaseClient.readUtf8LineStrictly(this.mInStream, this.mLineBuffer);
        if (this.mBytesInChunk == 0) {
            this.mHasMoreChunks = false;
        }
    }

    @Override // com.bilibili.sistersplayer.httpserver.SimpleBaseClient
    public int getDefaultPort(String str) {
        return isSecure(str) ? 443 : 80;
    }

    @Override // com.bilibili.sistersplayer.httpserver.SimpleBaseClient
    public String getProtocolVersion() {
        return PROTOCOL_VERSION;
    }

    @Override // com.bilibili.sistersplayer.httpserver.SimpleBaseClient
    public boolean isSecure(String str) {
        return "https".equals(str);
    }

    @Override // com.bilibili.sistersplayer.httpserver.SimpleBaseClient
    public void onParseHeader(String str, String str2) {
        if (TRANSFER_ENCODING.equalsIgnoreCase(str)) {
            this.mChunkTransfer = CHUNKED.equalsIgnoreCase(str2);
        }
    }

    @Override // com.bilibili.sistersplayer.httpserver.SimpleBaseClient
    public SimpleBaseClient.Response open(SimpleBaseClient.Request request) throws IOException {
        super.connect(request);
        sendMethod(request.method);
        ByteBuffer byteBuffer = request.body;
        if (byteBuffer != null) {
            send(byteBuffer);
        }
        this.mChunkTransfer = false;
        SimpleBaseClient.Response responseReceiveHeaders = receiveHeaders();
        if (responseReceiveHeaders.shouldRedirect()) {
            request.url = URI.create(request.url).resolve(SimpleBaseClient.findLocationOrThrow(responseReceiveHeaders)).toString();
            close();
            return open(request);
        }
        responseReceiveHeaders.throwIfFailed();
        this.mHasMoreChunks = this.mChunkTransfer;
        this.mBytesInChunk = -1;
        return responseReceiveHeaders;
    }

    @Override // com.bilibili.sistersplayer.httpserver.SimpleBaseClient
    public int read(byte[] bArr, int i7, int i8) throws IOException {
        if (!this.mChunkTransfer) {
            return SimpleBaseClient.readFully(this.mInStream, bArr, i7, i8);
        }
        if (!this.mHasMoreChunks) {
            return -1;
        }
        int i9 = this.mBytesInChunk;
        if (i9 == 0 || i9 == -1) {
            readChunkSize();
            if (!this.mHasMoreChunks) {
                return -1;
            }
        }
        int fully = SimpleBaseClient.readFully(this.mInStream, bArr, i7, Math.min(i8, this.mBytesInChunk));
        if (fully == -1) {
            throw new IOException("socket closed");
        }
        this.mBytesInChunk -= fully;
        return fully;
    }

    public void sendMethod(String str) throws IOException {
        String rawPath = this.mUri.getRawPath();
        String rawQuery = this.mUri.getRawQuery();
        String strA = rawPath;
        if (!SimpleBaseClient.isEmpty(rawQuery)) {
            strA = C2143d.a(rawPath, '?', rawQuery);
        }
        StringBuilder sbMakeBaseMessage = super.makeBaseMessage(str, strA);
        sbMakeBaseMessage.append("Host: ");
        sbMakeBaseMessage.append(this.mUri.getHost());
        sbMakeBaseMessage.append(SimpleBaseClient.CRLF);
        sbMakeBaseMessage.append("Accept-Encoding: identity");
        sbMakeBaseMessage.append(SimpleBaseClient.CRLF);
        B.a("Connection: Keep-Alive", SimpleBaseClient.CRLF, "User-Agent: ", USER_AGENT, sbMakeBaseMessage);
        sbMakeBaseMessage.append(SimpleBaseClient.CRLF);
        sbMakeBaseMessage.append(SimpleBaseClient.CRLF);
        send(sbMakeBaseMessage.toString());
    }
}
