package com.bilibili.opd.app.bizcommon.mangapaysdk.view;

import com.bilibili.lib.bilipay.BiliPay;
import kotlin.Result;
import kotlin.coroutines.SafeContinuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/m.class */
public final class m implements BiliPay.BiliPayRechargeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SafeContinuation f74157a;

    public m(SafeContinuation safeContinuation) {
        this.f74157a = safeContinuation;
    }

    public final void onRechargeResult(int i7, String str, String str2) {
        Xi1.b.a(bilibili.live.app.service.resolver.a.b(i7, "rechargeStatus: ", ", msg:", str, ", rechargeResult:"), str2, "MangaPayFragmentTag");
        Result.Companion companion = Result.Companion;
        this.f74157a.resumeWith(Result.constructor-impl(Boolean.valueOf(i7 == 0)));
    }
}
