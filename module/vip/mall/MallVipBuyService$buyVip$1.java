package com.bilibili.module.vip.mall;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/MallVipBuyService$buyVip$1.class */
final class MallVipBuyService$buyVip$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final C5418a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MallVipBuyService$buyVip$1(C5418a c5418a, Continuation<? super MallVipBuyService$buyVip$1> continuation) {
        super(continuation);
        this.this$0 = c5418a;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objA = this.this$0.a(null, null, this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Result.box-impl(objA);
    }
}
