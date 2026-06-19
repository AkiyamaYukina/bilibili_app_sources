package com.bilibili.module.vip.combine;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/BiliVipPaymentCombineService$pinVipPaymentTipsFloat$1.class */
final class BiliVipPaymentCombineService$pinVipPaymentTipsFloat$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    Object result;
    final d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliVipPaymentCombineService$pinVipPaymentTipsFloat$1(d dVar, Continuation<? super BiliVipPaymentCombineService$pinVipPaymentTipsFloat$1> continuation) {
        super(continuation);
        this.this$0 = dVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objE = this.this$0.e(null, null, null, null, this);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : Result.box-impl(objE);
    }
}
