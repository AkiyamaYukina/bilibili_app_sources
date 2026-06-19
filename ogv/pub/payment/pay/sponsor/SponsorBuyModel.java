package com.bilibili.ogv.pub.payment.pay.sponsor;

import android.app.Activity;
import com.bilibili.okretro.response.BiliApiResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ul0.AbstractC8740a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/pay/sponsor/SponsorBuyModel.class */
public final class SponsorBuyModel extends AbstractC8740a<SponsorCheckResult> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f71572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f71573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Activity f71574f;

    public SponsorBuyModel(long j7, int i7, int i8, @NotNull Activity activity) {
        super(j7);
        this.f71572d = i7;
        this.f71573e = i8;
        this.f71574f = activity;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // ul0.InterfaceC8741b
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.bilibili.okretro.response.BiliApiResponse<com.bilibili.ogv.pub.payment.pay.sponsor.SponsorCheckResult>> r6) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.pub.payment.pay.sponsor.SponsorBuyModel.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // ul0.InterfaceC8741b
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.pub.payment.pay.sponsor.SponsorBuyModel.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // ul0.InterfaceC8741b
    @Nullable
    public final Object c(@NotNull Continuation<? super BiliApiResponse<Integer>> continuation) {
        return d(this.f71574f, continuation);
    }
}
