package com.bilibili.sistersplayer.httpserver;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bilibili.sistersplayer.hls.StreamQueue;
import com.bilibili.sistersplayer.httpserver.SimpleHttpServer;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import com.bilibili.sistersplayer.p2p.utils.PLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/httpserver/LiveMiniServer.class */
public class LiveMiniServer {
    private static final String TAG = "LiveMiniServer";
    private final MiniServerImpl server_;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/httpserver/LiveMiniServer$Handler.class */
    public interface Handler {
        StreamQueue getStream();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/httpserver/LiveMiniServer$MiniServerImpl.class */
    public static class MiniServerImpl extends SimpleHttpServer {
        private Handler handler_;
        private String path_;

        public MiniServerImpl(int i7, P2PLogger p2PLogger) {
            super(i7, p2PLogger);
            this.handler_ = null;
            this.path_ = null;
        }

        @Override // com.bilibili.sistersplayer.httpserver.SimpleHttpServer
        public SimpleHttpServer.Response onResponse(SimpleHttpServer.Request request) {
            if (TextUtils.equals(request.url, this.path_)) {
                this.logger.logI(LiveMiniServer.TAG, "connected to " + request.url + ", path= " + this.path_, null);
                return newResponse(StatusLine.OK, "video/mp4", this.handler_.getStream(), -1L);
            }
            this.logger.logI(LiveMiniServer.TAG, "connect failed to " + request.url + ", path= " + this.path_, null);
            return newResponse(StatusLine.BAD_REQUEST, "Bad request info");
        }

        public void setHandler(String str, Handler handler) {
            this.handler_ = handler;
            this.path_ = str;
        }
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
    }

    public LiveMiniServer(int i7, P2PLogger p2PLogger) {
        MiniServerImpl miniServerImpl = new MiniServerImpl(i7, p2PLogger);
        this.server_ = miniServerImpl;
        miniServerImpl.start();
    }

    public void get(String str, Handler handler) {
        this.server_.setHandler(str, handler);
    }

    public int getPort() {
        return this.server_.getListeningPort();
    }

    @Nullable
    public String getRemoteConnectString() {
        MiniServerImpl miniServerImpl = this.server_;
        if (miniServerImpl == null || miniServerImpl.address == null) {
            return null;
        }
        return this.server_.address;
    }

    public void stop() {
        this.server_.stop();
    }
}
