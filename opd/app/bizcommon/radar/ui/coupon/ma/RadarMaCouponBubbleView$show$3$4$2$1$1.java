package com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma;

import android.app.Activity;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/ma/RadarMaCouponBubbleView$show$3$4$2$1$1.class */
public final class RadarMaCouponBubbleView$show$3$4$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Activity $activity;
    final MutableState<Boolean> $requestEnabled$delegate;
    int label;
    final RadarMaCouponBubbleView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarMaCouponBubbleView$show$3$4$2$1$1(RadarMaCouponBubbleView radarMaCouponBubbleView, Activity activity, MutableState<Boolean> mutableState, Continuation<? super RadarMaCouponBubbleView$show$3$4$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = radarMaCouponBubbleView;
        this.$activity = activity;
        this.$requestEnabled$delegate = mutableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(RadarMaCouponBubbleView radarMaCouponBubbleView) {
        radarMaCouponBubbleView.a();
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RadarMaCouponBubbleView$show$3$4$2$1$1(this.this$0, this.$activity, this.$requestEnabled$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma.RadarMaCouponBubbleView$show$3$4$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
