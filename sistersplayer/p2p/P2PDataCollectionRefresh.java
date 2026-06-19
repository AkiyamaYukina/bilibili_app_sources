package com.bilibili.sistersplayer.p2p;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2PDataCollectionRefresh.class */
public final class P2PDataCollectionRefresh {
    private final long callbackIntervalMs;
    private final boolean isClearData;

    @NotNull
    private final IP2PDataCollectionListener listener;

    public P2PDataCollectionRefresh(@NotNull IP2PDataCollectionListener iP2PDataCollectionListener, long j7, boolean z6) {
        this.listener = iP2PDataCollectionListener;
        this.callbackIntervalMs = j7;
        this.isClearData = z6;
    }

    public final long getCallbackIntervalMs() {
        return this.callbackIntervalMs;
    }

    @NotNull
    public final IP2PDataCollectionListener getListener() {
        return this.listener;
    }

    public final boolean isClearData() {
        return this.isClearData;
    }
}
