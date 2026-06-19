package com.bilibili.pegasus.request;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/request/ApiManagerKt$getIndexFeed$1.class */
final class ApiManagerKt$getIndexFeed$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    Object result;

    public ApiManagerKt$getIndexFeed$1(Continuation<? super ApiManagerKt$getIndexFeed$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.c(null, null, this);
    }
}
