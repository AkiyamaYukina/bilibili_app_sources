package com.bilibili.module.vip.combine;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/VipPaymentFloatContainerFragment$await$1.class */
final class VipPaymentFloatContainerFragment$await$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final VipPaymentFloatContainerFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipPaymentFloatContainerFragment$await$1(VipPaymentFloatContainerFragment vipPaymentFloatContainerFragment, Continuation<? super VipPaymentFloatContainerFragment$await$1> continuation) {
        super(continuation);
        this.this$0 = vipPaymentFloatContainerFragment;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objHf = this.this$0.hf(null, this);
        return objHf == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHf : Result.box-impl(objHf);
    }
}
