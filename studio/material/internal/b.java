package com.bilibili.studio.material.internal;

import com.bilibili.studio.material.MaterialRequest;
import com.bilibili.studio.material.i;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/b.class */
public interface b {
    @Nullable
    Object a(@NotNull CoroutineScope coroutineScope, @NotNull MaterialRequest materialRequest, @NotNull ContinuationImpl continuationImpl);

    void b();

    @Nullable
    Object c(@NotNull Continuation<? super i> continuation);
}
