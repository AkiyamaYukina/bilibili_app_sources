package com.bilibili.module.vip.combine;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/BiliVipPaymentCombineService$queryVipPrivilegeInfo$1.class */
final class BiliVipPaymentCombineService$queryVipPrivilegeInfo$1 extends ContinuationImpl {
    int label;
    Object result;
    final d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliVipPaymentCombineService$queryVipPrivilegeInfo$1(d dVar, Continuation<? super BiliVipPaymentCombineService$queryVipPrivilegeInfo$1> continuation) {
        super(continuation);
        this.this$0 = dVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objB = this.this$0.b(null, this);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : Result.box-impl(objB);
    }
}
