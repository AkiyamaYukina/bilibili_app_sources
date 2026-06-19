package com.bilibili.studio.material;

import com.bilibili.studio.material.internal.ProcessorItem;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/g.class */
public abstract class g<T extends ProcessorItem> {
    @Nullable
    public abstract Object a(@NotNull List<? extends T> list, @NotNull MaterialConfig materialConfig, @NotNull Continuation<? super Unit> continuation);
}
