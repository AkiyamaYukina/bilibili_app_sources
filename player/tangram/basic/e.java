package com.bilibili.player.tangram.basic;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/e.class */
public interface e extends WithVideoProgress, j {
    @Nullable
    Object I(long j7, boolean z6, @Nullable Object obj, @NotNull ContinuationImpl continuationImpl);

    @Nullable
    default Object w() {
        return null;
    }
}
