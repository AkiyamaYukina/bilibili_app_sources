package com.bilibili.opd.app.bizcommon.radar.ui.coupon;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/RadarCouponViewKt$CouponFloatingCard$1$1.class */
public final class RadarCouponViewKt$CouponFloatingCard$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableState<Boolean> $isVisible$delegate;
    final State<Boolean> $shouldAnimateEntry$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarCouponViewKt$CouponFloatingCard$1$1(State<Boolean> state, MutableState<Boolean> mutableState, Continuation<? super RadarCouponViewKt$CouponFloatingCard$1$1> continuation) {
        super(2, continuation);
        this.$shouldAnimateEntry$delegate = state;
        this.$isVisible$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RadarCouponViewKt$CouponFloatingCard$1$1(this.$shouldAnimateEntry$delegate, this.$isVisible$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$shouldAnimateEntry$delegate.getValue().booleanValue()) {
                this.label = 1;
                if (DelayKt.delay(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$isVisible$delegate.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
