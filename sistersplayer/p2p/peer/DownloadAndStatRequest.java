package com.bilibili.sistersplayer.p2p.peer;

import org.jetbrains.annotations.NotNull;
import org.msgpack.core.MessagePacker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/DownloadAndStatRequest.class */
public final class DownloadAndStatRequest implements IMsgPackSeriable {
    private int requestId = -1;

    @NotNull
    private String action = "downloadAndStat";

    @NotNull
    private Data data = new Data();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/DownloadAndStatRequest$Data.class */
    public static final class Data implements IMsgPackSeriable {
        private boolean nonblocking;
        private int requestId = -1;

        @NotNull
        private String frag = "";
        private int blockId = -1;

        public final int getBlockId() {
            return this.blockId;
        }

        @NotNull
        public final String getFrag() {
            return this.frag;
        }

        public final boolean getNonblocking() {
            return this.nonblocking;
        }

        @Override // com.bilibili.sistersplayer.p2p.peer.IMsgPackSeriable
        public int getRequestId() {
            return this.requestId;
        }

        @Override // com.bilibili.sistersplayer.p2p.peer.IMsgPackSeriable
        public void pack(@NotNull MessagePacker messagePacker) {
            messagePacker.packMapHeader(3);
            messagePacker.packString("frag").packString(this.frag);
            messagePacker.packString("blockId").packInt(this.blockId);
            messagePacker.packString("nonblocking").packBoolean(this.nonblocking);
        }

        public final void setBlockId(int i7) {
            this.blockId = i7;
        }

        public final void setFrag(@NotNull String str) {
            this.frag = str;
        }

        public final void setNonblocking(boolean z6) {
            this.nonblocking = z6;
        }

        @Override // com.bilibili.sistersplayer.p2p.peer.IMsgPackSeriable
        public void setRequestId(int i7) {
            this.requestId = i7;
        }
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final Data getData() {
        return this.data;
    }

    @Override // com.bilibili.sistersplayer.p2p.peer.IMsgPackSeriable
    public int getRequestId() {
        return this.requestId;
    }

    @Override // com.bilibili.sistersplayer.p2p.peer.IMsgPackSeriable
    public void pack(@NotNull MessagePacker messagePacker) {
        messagePacker.packMapHeader(4);
        messagePacker.packString("type").packString("request");
        messagePacker.packString("action").packString(this.action);
        messagePacker.packString("requestId").packInt(getRequestId());
        PeerMessageKt.pack(messagePacker.packString("data"), this.data);
    }

    public final void setAction(@NotNull String str) {
        this.action = str;
    }

    public final void setData(@NotNull Data data) {
        this.data = data;
    }

    @Override // com.bilibili.sistersplayer.p2p.peer.IMsgPackSeriable
    public void setRequestId(int i7) {
        this.requestId = i7;
    }
}
