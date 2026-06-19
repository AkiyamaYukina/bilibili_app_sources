package com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/ma/RadarMaCouponSupport$releaseManualCoupons$1.class */
final class RadarMaCouponSupport$releaseManualCoupons$1 extends ContinuationImpl {
    int label;
    Object result;
    final w this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarMaCouponSupport$releaseManualCoupons$1(w wVar, Continuation<? super RadarMaCouponSupport$releaseManualCoupons$1> continuation) {
        super(continuation);
        this.this$0 = wVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, this);
    }
}
