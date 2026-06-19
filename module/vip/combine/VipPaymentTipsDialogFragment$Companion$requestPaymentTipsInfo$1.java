package com.bilibili.module.vip.combine;

import com.bilibili.module.vip.combine.VipPaymentTipsDialogFragment;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/VipPaymentTipsDialogFragment$Companion$requestPaymentTipsInfo$1.class */
final class VipPaymentTipsDialogFragment$Companion$requestPaymentTipsInfo$1 extends ContinuationImpl {
    int label;
    Object result;
    final VipPaymentTipsDialogFragment.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipPaymentTipsDialogFragment$Companion$requestPaymentTipsInfo$1(VipPaymentTipsDialogFragment.a aVar, Continuation<? super VipPaymentTipsDialogFragment$Companion$requestPaymentTipsInfo$1> continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
