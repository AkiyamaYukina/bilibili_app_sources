package com.bilibili.ogv.kmm.operation.reservation;

import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/reservation/CreateReservationNotificationKomponent$invoke$1$1.class */
final class CreateReservationNotificationKomponent$invoke$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableState<Boolean> $reservationNoticeShowing$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateReservationNotificationKomponent$invoke$1$1(MutableState<Boolean> mutableState, Continuation<? super CreateReservationNotificationKomponent$invoke$1$1> continuation) {
        super(2, continuation);
        this.$reservationNoticeShowing$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateReservationNotificationKomponent$invoke$1$1(this.$reservationNoticeShowing$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(50L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$reservationNoticeShowing$delegate.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$reservationNoticeShowing$delegate.setValue(Boolean.TRUE);
        this.label = 2;
        if (DelayKt.delay(5000L, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.$reservationNoticeShowing$delegate.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
