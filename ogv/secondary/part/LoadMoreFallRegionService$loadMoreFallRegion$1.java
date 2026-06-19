package com.bilibili.ogv.secondary.part;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/LoadMoreFallRegionService$loadMoreFallRegion$1.class */
final class LoadMoreFallRegionService$loadMoreFallRegion$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    int label;
    Object result;
    final B this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadMoreFallRegionService$loadMoreFallRegion$1(B b7, Continuation<? super LoadMoreFallRegionService$loadMoreFallRegion$1> continuation) {
        super(continuation);
        this.this$0 = b7;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(0L, false, 0L, this);
    }
}
