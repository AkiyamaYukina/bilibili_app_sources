package com.bilibili.ship.theseus.cheese.pay.purchase.guide;

import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/guide/c.class */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableSharedFlow f90541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheesePurchaseGuideService f90542b;

    public /* synthetic */ c(MutableSharedFlow mutableSharedFlow, CheesePurchaseGuideService cheesePurchaseGuideService) {
        this.f90541a = mutableSharedFlow;
        this.f90542b = cheesePurchaseGuideService;
    }

    public final Object invoke() {
        return CheesePurchaseGuideService$showPurchaseGuidePanel$2$1.invokeSuspend$lambda$0(this.f90541a, this.f90542b);
    }
}
