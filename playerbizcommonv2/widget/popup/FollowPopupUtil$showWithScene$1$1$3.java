package com.bilibili.playerbizcommonv2.widget.popup;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/popup/FollowPopupUtil$showWithScene$1$1$3.class */
public final class FollowPopupUtil$showWithScene$1$1$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final long $duration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowPopupUtil$showWithScene$1$1$3(long j7, Continuation<? super FollowPopupUtil$showWithScene$1$1$3> continuation) {
        super(1, continuation);
        this.$duration = j7;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FollowPopupUtil$showWithScene$1$1$3(this.$duration, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            long j7 = this.$duration;
            this.label = 1;
            if (DelayKt.delay-VtjQ1oo(j7, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
