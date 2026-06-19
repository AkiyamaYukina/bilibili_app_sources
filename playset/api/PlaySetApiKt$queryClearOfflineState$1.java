package com.bilibili.playset.api;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/PlaySetApiKt$queryClearOfflineState$1.class */
final class PlaySetApiKt$queryClearOfflineState$1 extends ContinuationImpl {
    int label;
    Object result;

    public PlaySetApiKt$queryClearOfflineState$1(Continuation<? super PlaySetApiKt$queryClearOfflineState$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return i.e(0L, this);
    }
}
