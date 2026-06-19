package com.bilibili.sistersplayer.p2p.utils;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/utils/P2PIO.class */
public final class P2PIO {
    private final boolean internalIO;

    @NotNull
    private final CoroutineDispatcher p2pIOThreadContext;

    public P2PIO(boolean z6) {
        this.internalIO = z6;
        this.p2pIOThreadContext = z6 ? ThreadPoolDispatcherKt.newSingleThreadContext("P2P-IO") : Dispatchers.getIO();
    }

    @NotNull
    public final CoroutineDispatcher getIOContext() {
        return this.p2pIOThreadContext;
    }

    public final boolean getInternalIO() {
        return this.internalIO;
    }

    public final void release() {
        if (this.internalIO) {
            ExecutorCoroutineDispatcher executorCoroutineDispatcher = this.p2pIOThreadContext;
            if (executorCoroutineDispatcher instanceof ExecutorCoroutineDispatcher) {
                executorCoroutineDispatcher.close();
            }
        }
    }
}
