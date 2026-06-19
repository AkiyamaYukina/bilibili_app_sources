package com.bilibili.module.vip.mall;

import com.google.gson.JsonSyntaxException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipPurchaseService$createOrder$1.class */
final class VipPurchaseService$createOrder$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final B this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipPurchaseService$createOrder$1(B b7, Continuation<? super VipPurchaseService$createOrder$1> continuation) {
        super(continuation);
        this.this$0 = b7;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.gson.JsonSyntaxException */
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws JsonSyntaxException {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        B b7 = this.this$0;
        B b8 = B.f66198a;
        Object objE = b7.e(null, null, this);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : Result.box-impl(objE);
    }
}
