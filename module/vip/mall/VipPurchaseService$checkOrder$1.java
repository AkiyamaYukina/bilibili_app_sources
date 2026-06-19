package com.bilibili.module.vip.mall;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipPurchaseService$checkOrder$1.class */
final class VipPurchaseService$checkOrder$1 extends ContinuationImpl {
    int label;
    Object result;
    final B this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipPurchaseService$checkOrder$1(B b7, Continuation<? super VipPurchaseService$checkOrder$1> continuation) {
        super(continuation);
        this.this$0 = b7;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        B b7 = this.this$0;
        B b8 = B.f66198a;
        Object objD = b7.d(null, null, null, null, null, this);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : Result.box-impl(objD);
    }
}
