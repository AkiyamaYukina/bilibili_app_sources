package com.bilibili.sistersplayer.p2p.peer;

import org.jetbrains.annotations.NotNull;
import org.msgpack.core.MessagePacker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/IMsgPackSeriable.class */
public interface IMsgPackSeriable {
    int getRequestId();

    void pack(@NotNull MessagePacker messagePacker);

    void setRequestId(int i7);
}
