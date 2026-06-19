package com.bilibili.module.vip.mall;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipPurchaseService$pay$1.class */
final class VipPurchaseService$pay$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final B this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipPurchaseService$pay$1(B b7, Continuation<? super VipPurchaseService$pay$1> continuation) {
        super(continuation);
        this.this$0 = b7;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        B b7 = this.this$0;
        B b8 = B.f66198a;
        Object objG = b7.g(null, null, this);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : Result.box-impl(objG);
    }
}
