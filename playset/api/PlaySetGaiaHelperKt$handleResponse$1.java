package com.bilibili.playset.api;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/PlaySetGaiaHelperKt$handleResponse$1.class */
final class PlaySetGaiaHelperKt$handleResponse$1<T, R> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    Object result;

    public PlaySetGaiaHelperKt$handleResponse$1(Continuation<? super PlaySetGaiaHelperKt$handleResponse$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return t.c(null, null, null, null, null, null, this);
    }
}
