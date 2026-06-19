package com.bilibili.pegasus.components.recover;

import android.view.View;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/CardRecoverComponent$scheduleForceRemove$1.class */
final class CardRecoverComponent$scheduleForceRemove$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $delayMs;
    final View $view;
    int label;
    final CardRecoverComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRecoverComponent$scheduleForceRemove$1(long j7, CardRecoverComponent cardRecoverComponent, View view, Continuation<? super CardRecoverComponent$scheduleForceRemove$1> continuation) {
        super(2, continuation);
        this.$delayMs = j7;
        this.this$0 = cardRecoverComponent;
        this.$view = view;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardRecoverComponent$scheduleForceRemove$1(this.$delayMs, this.this$0, this.$view, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            long j7 = this.$delayMs;
            this.label = 1;
            if (DelayKt.delay(j7, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.f(this.$view);
        return Unit.INSTANCE;
    }
}
