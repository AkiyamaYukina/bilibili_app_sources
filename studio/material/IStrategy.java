package com.bilibili.studio.material;

import com.bilibili.studio.material.internal.ProcessorItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/IStrategy.class */
public abstract class IStrategy<T extends ProcessorItem> {
    @Nullable
    public abstract Object action(@NotNull T t7, @NotNull MaterialConfig materialConfig, @NotNull Continuation<? super Unit> continuation);
}
