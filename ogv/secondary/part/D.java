package com.bilibili.ogv.secondary.part;

import com.bilibili.ogv.operation3.module.list.MoreLoadingState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/D.class */
public interface D {
    @NotNull
    MutableStateFlow<MoreLoadingState> a();

    @Nullable
    Object b(@NotNull ContinuationImpl continuationImpl);
}
