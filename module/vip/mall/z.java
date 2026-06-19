package com.bilibili.module.vip.mall;

import com.bilibili.bilipay.base.PaymentChannel;
import com.bilibili.lib.bilipay.BiliPay;
import com.bilibili.module.vip.mall.VipPurchaseException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/z.class */
public final class z implements BiliPay.BiliPayCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f66302a;

    public z(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f66302a = cancellableContinuationImpl;
    }

    public final void onPayResult(int i7, int i8, String str, int i9, String str2) {
        int iCode = PaymentChannel.PayStatus.SUC.code();
        CancellableContinuationImpl cancellableContinuationImpl = this.f66302a;
        if (i8 == iCode) {
            com.bilibili.ogv.infra.coroutine.a.a(cancellableContinuationImpl, Result.box-impl(Result.constructor-impl(new PayResult(i7, i8, str, i9, str2))));
        } else {
            Result.Companion companion = Result.Companion;
            com.bilibili.ogv.infra.coroutine.a.a(cancellableContinuationImpl, Result.box-impl(Result.constructor-impl(ResultKt.createFailure(VipPurchaseException.PayFailed.INSTANCE))));
        }
    }
}
