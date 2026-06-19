package com.bilibili.module.vip.mall;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipPaymentResultDialog$onCreate$1$1$1$1.class */
public final /* synthetic */ class VipPaymentResultDialog$onCreate$1$1$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public VipPaymentResultDialog$onCreate$1$1$1$1(Object obj) {
        super(0, obj, VipPaymentResultDialog.class, "onDismissRequest", "onDismissRequest()V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m7114invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m7114invoke() {
        VipPaymentResultDialog vipPaymentResultDialog = (VipPaymentResultDialog) ((CallableReference) this).receiver;
        int i7 = VipPaymentResultDialog.f66243e;
        VipBuyResultDialogViewModel vipBuyResultDialogViewModel = vipPaymentResultDialog.f66247d;
        vipBuyResultDialogViewModel.f66207b.setValue(Boolean.FALSE);
        vipPaymentResultDialog.dismiss();
    }
}
