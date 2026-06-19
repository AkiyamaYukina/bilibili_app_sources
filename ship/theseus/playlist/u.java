package com.bilibili.ship.theseus.playlist;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/u.class */
public interface u {
    @Nullable
    Object a(@NotNull Continuation<? super InterfaceC6214a> continuation);

    @Nullable
    Object b(boolean z6, boolean z7, boolean z8, @NotNull ContinuationImpl continuationImpl);

    @Nullable
    Object c(boolean z6, @NotNull Continuation continuation);

    boolean hasNext();

    boolean hasPrevious();
}
