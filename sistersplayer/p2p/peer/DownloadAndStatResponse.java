package com.bilibili.sistersplayer.p2p.peer;

import androidx.core.app.NotificationCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.msgpack.core.MessagePacker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/DownloadAndStatResponse.class */
public final class DownloadAndStatResponse implements IMsgPackSeriable {

    @NotNull
    private String type = "response";
    private int requestId = -1;

    @NotNull
    private String status = "ok";

    @NotNull
    private Data data = new Data();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/DownloadAndStatResponse$Data.class */
    public static final class Data implements IMsgPackSeriable {

        @Nullable
        private byte[] block;

        @Nullable
        private byte[] distances;
        private int requestId = -1;

        @Nullable
        public final byte[] getBlock() {
            return this.block;
        }

        @Nullable
        public final byte[] getDistances() {
            return this.distances;
        }

        @Override // com.bilibili.sistersplayer.p2p.peer.IMsgPackSeriable
        public int getRequestId() {
            return this.requestId;
        }

        @Override // com.bilibili.sistersplayer.p2p.peer.IMsgPackSeriable
        public void pack(@NotNull MessagePacker messagePacker) {
            messagePacker.packMapHeader(2);
            byte[] bArr = this.block;
            if (bArr == null || messagePacker.packString("block").packBinaryHeader(bArr.length).writePayload(bArr) == null) {
                messagePacker.packString("block").packNil();
            }
            byte[] bArr2 = this.distances;
            if (bArr2 == null || messagePacker.packString("distances").packBinaryHeader(bArr2.length).writePayload(bArr2) == null) {
                messagePacker.packString("distances").packNil();
            }
        }

        public final void setBlock(@Nullable byte[] bArr) {
            this.block = bArr;
        }

        public final void setDistances(@Nullable byte[] bArr) {
            this.distances = bArr;
        }

        @Override // com.bilibili.sistersplayer.p2p.peer.IMsgPackSeriable
        public void setRequestId(int i7) {
            this.requestId = i7;
        }
    }

    @NotNull
    public final Data getData() {
        return this.data;
    }

    @Override // com.bilibili.sistersplayer.p2p.peer.IMsgPackSeriable
    public int getRequestId() {
        return this.requestId;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Override // com.bilibili.sistersplayer.p2p.peer.IMsgPackSeriable
    public void pack(@NotNull MessagePacker messagePacker) {
        messagePacker.packMapHeader(4);
        messagePacker.packString("type").packString("response");
        messagePacker.packString("requestId").packInt(getRequestId());
        messagePacker.packString(NotificationCompat.CATEGORY_STATUS).packString(this.status);
        PeerMessageKt.pack(messagePacker.packString("data"), this.data);
    }

    public final void setData(@NotNull Data data) {
        this.data = data;
    }

    @Override // com.bilibili.sistersplayer.p2p.peer.IMsgPackSeriable
    public void setRequestId(int i7) {
        this.requestId = i7;
    }

    public final void setStatus(@NotNull String str) {
        this.status = str;
    }

    public final void setType(@NotNull String str) {
        this.type = str;
    }
}
