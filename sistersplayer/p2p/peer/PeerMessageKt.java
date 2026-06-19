package com.bilibili.sistersplayer.p2p.peer;

import org.jetbrains.annotations.NotNull;
import org.msgpack.core.MessagePacker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/PeerMessageKt.class */
public final class PeerMessageKt {
    public static final void pack(@NotNull MessagePacker messagePacker, @NotNull IMsgPackSeriable iMsgPackSeriable) {
        iMsgPackSeriable.pack(messagePacker);
    }
}
