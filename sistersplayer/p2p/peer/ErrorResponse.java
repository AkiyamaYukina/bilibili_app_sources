package com.bilibili.sistersplayer.p2p.peer;

import androidx.core.app.NotificationCompat;
import org.jetbrains.annotations.NotNull;
import org.msgpack.core.MessagePacker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/ErrorResponse.class */
public final class ErrorResponse implements IMsgPackSeriable {

    @NotNull
    private String type = "response";

    @NotNull
    private String status = "not_implemented";
    private int requestId = -1;

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
        messagePacker.packMapHeader(3);
        messagePacker.packString("type").packString("response");
        messagePacker.packString("requestId").packInt(getRequestId());
        messagePacker.packString(NotificationCompat.CATEGORY_STATUS).packString(this.status);
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
