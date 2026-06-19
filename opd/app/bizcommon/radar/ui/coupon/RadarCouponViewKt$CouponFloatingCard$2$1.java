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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/RadarCouponViewKt$CouponFloatingCard$2$1.class */
public final class RadarCouponViewKt$CouponFloatingCard$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableState<Boolean> $isExiting$delegate;
    final State<Boolean> $shouldAnimateExit$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarCouponViewKt$CouponFloatingCard$2$1(State<Boolean> state, MutableState<Boolean> mutableState, Continuation<? super RadarCouponViewKt$CouponFloatingCard$2$1> continuation) {
        super(2, continuation);
        this.$shouldAnimateExit$delegate = state;
        this.$isExiting$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RadarCouponViewKt$CouponFloatingCard$2$1(this.$shouldAnimateExit$delegate, this.$isExiting$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$shouldAnimateExit$delegate.getValue().booleanValue()) {
            this.$isExiting$delegate.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
