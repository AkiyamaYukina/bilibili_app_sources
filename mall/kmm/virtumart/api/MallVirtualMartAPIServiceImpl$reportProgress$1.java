package com.bilibili.mall.kmm.virtumart.api;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/virtumart/api/MallVirtualMartAPIServiceImpl$reportProgress$1.class */
final class MallVirtualMartAPIServiceImpl$reportProgress$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    Object result;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MallVirtualMartAPIServiceImpl$reportProgress$1(b bVar, Continuation<? super MallVirtualMartAPIServiceImpl$reportProgress$1> continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, 0L, false, 0L, this);
    }
}
