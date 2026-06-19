package com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma;

import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/ma/RadarMaCouponDialog$onCreate$2$4$1$1.class */
public final class RadarMaCouponDialog$onCreate$2$4$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableState<Float> $closeProgress$delegate;
    final MutableLongState $remainDuration$delegate;
    final long $startTimeMs;
    final long $totalDuration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarMaCouponDialog$onCreate$2$4$1$1(long j7, long j8, MutableLongState mutableLongState, MutableState<Float> mutableState, Continuation<? super RadarMaCouponDialog$onCreate$2$4$1$1> continuation) {
        super(2, continuation);
        this.$totalDuration = j7;
        this.$startTimeMs = j8;
        this.$remainDuration$delegate = mutableLongState;
        this.$closeProgress$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RadarMaCouponDialog$onCreate$2$4$1$1(this.$totalDuration, this.$startTimeMs, this.$remainDuration$delegate, this.$closeProgress$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$totalDuration <= 0) {
                MutableLongState mutableLongState = this.$remainDuration$delegate;
                int i8 = RadarMaCouponDialog.f74319r;
                mutableLongState.setLongValue(0L);
                this.$closeProgress$delegate.setValue(Float.valueOf(0.0f));
                return Unit.INSTANCE;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        do {
            long jCoerceAtLeast = RangesKt.coerceAtLeast(this.$totalDuration - (System.currentTimeMillis() - this.$startTimeMs), 0L);
            MutableLongState mutableLongState2 = this.$remainDuration$delegate;
            int i9 = RadarMaCouponDialog.f74319r;
            mutableLongState2.setLongValue(jCoerceAtLeast);
            this.$closeProgress$delegate.setValue(Float.valueOf(RangesKt.coerceIn(jCoerceAtLeast / this.$totalDuration, 0.0f, 1.0f)));
            if (jCoerceAtLeast <= 0) {
                return Unit.INSTANCE;
            }
            this.label = 1;
        } while (DelayKt.delay(16L, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
