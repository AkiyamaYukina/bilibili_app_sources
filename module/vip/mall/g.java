package com.bilibili.module.vip.mall;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/g.class */
public final class g implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VipPaymentResultDialog f66255a;

    public g(VipPaymentResultDialog vipPaymentResultDialog) {
        this.f66255a = vipPaymentResultDialog;
    }

    public final Object invoke(Object obj) {
        VipPaymentResultDialog vipPaymentResultDialog = this.f66255a;
        vipPaymentResultDialog.setOnDismissListener(null);
        vipPaymentResultDialog.cancel();
        return Unit.INSTANCE;
    }
}
