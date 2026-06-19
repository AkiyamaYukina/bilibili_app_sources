package com.bilibili.ship.theseus.cheese.pay.purchase.guide;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/guide/CheesePurchaseGuideService$tryShowPurchaseGuidePanel$1.class */
final class CheesePurchaseGuideService$tryShowPurchaseGuidePanel$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final CheesePurchaseGuideService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePurchaseGuideService$tryShowPurchaseGuidePanel$1(CheesePurchaseGuideService cheesePurchaseGuideService, Continuation<? super CheesePurchaseGuideService$tryShowPurchaseGuidePanel$1> continuation) {
        super(continuation);
        this.this$0 = cheesePurchaseGuideService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CheesePurchaseGuideService.a(this.this$0, null, this);
    }
}
