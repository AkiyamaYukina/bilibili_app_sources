package com.bilibili.ogv.infra.coroutine;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/coroutine/b.class */
public final class b {
    @Nullable
    public static final <T> Object a(@NotNull Flow<? extends T> flow, @NotNull Continuation<? super T> continuation) {
        return FlowKt.first(FlowKt.filterNotNull(flow), continuation);
    }
}
