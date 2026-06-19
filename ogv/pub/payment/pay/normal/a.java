package com.bilibili.ogv.pub.payment.pay.normal;

import android.app.Activity;
import com.bilibili.ogv.pub.payment.pay.PayResult;
import com.bilibili.ogv.pub.payment.pay.c;
import com.bilibili.okretro.response.BiliApiResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ul0.AbstractC8740a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/pay/normal/a.class */
public final class a extends AbstractC8740a<PayResult> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Activity f71567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f71568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f71569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f71570g;

    @Nullable
    public final Long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f71571i;

    public a(long j7, @NotNull Activity activity, int i7, @Nullable String str, @Nullable String str2, @Nullable Long l7, @Nullable String str3) {
        super(j7);
        this.f71567d = activity;
        this.f71568e = i7;
        this.f71569f = str;
        this.f71570g = str2;
        this.h = l7;
        this.f71571i = str3;
    }

    @Override // ul0.InterfaceC8741b
    @Nullable
    public final Object a(@NotNull Continuation<? super BiliApiResponse<PayResult>> continuation) {
        c.f71564a.getClass();
        return c.a.a().checkOrder(this.f71568e, this.f127878b, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // ul0.InterfaceC8741b
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.pub.payment.pay.normal.a.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // ul0.InterfaceC8741b
    @Nullable
    public final Object c(@NotNull Continuation<? super BiliApiResponse<Integer>> continuation) {
        return d(this.f71567d, continuation);
    }
}
