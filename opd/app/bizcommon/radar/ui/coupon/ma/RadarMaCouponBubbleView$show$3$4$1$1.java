package com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma;

import androidx.compose.runtime.MutableLongState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/ma/RadarMaCouponBubbleView$show$3$4$1$1.class */
public final class RadarMaCouponBubbleView$show$3$4$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableLongState $remainLeftTime$delegate;
    final long $startTimeMs;
    final long $totalLeftTimeMs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarMaCouponBubbleView$show$3$4$1$1(long j7, long j8, MutableLongState mutableLongState, Continuation<? super RadarMaCouponBubbleView$show$3$4$1$1> continuation) {
        super(2, continuation);
        this.$totalLeftTimeMs = j7;
        this.$startTimeMs = j8;
        this.$remainLeftTime$delegate = mutableLongState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RadarMaCouponBubbleView$show$3$4$1$1(this.$totalLeftTimeMs, this.$startTimeMs, this.$remainLeftTime$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$totalLeftTimeMs <= 0) {
                return Unit.INSTANCE;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        do {
            long jCoerceAtLeast = RangesKt.coerceAtLeast(this.$totalLeftTimeMs - (System.currentTimeMillis() - this.$startTimeMs), 0L);
            this.$remainLeftTime$delegate.setLongValue(jCoerceAtLeast);
            if (jCoerceAtLeast <= 0) {
                return Unit.INSTANCE;
            }
            this.label = 1;
        } while (DelayKt.delay(1000L, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
