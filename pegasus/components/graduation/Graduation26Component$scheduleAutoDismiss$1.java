package com.bilibili.pegasus.components.graduation;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$scheduleAutoDismiss$1.class */
final class Graduation26Component$scheduleAutoDismiss$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $durationMillis;
    int label;
    final Graduation26Component this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Graduation26Component$scheduleAutoDismiss$1(long j7, Graduation26Component graduation26Component, Continuation<? super Graduation26Component$scheduleAutoDismiss$1> continuation) {
        super(2, continuation);
        this.$durationMillis = j7;
        this.this$0 = graduation26Component;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Graduation26Component$scheduleAutoDismiss$1(this.$durationMillis, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            long j7 = this.$durationMillis;
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
        if (((C5607h) this.this$0.f75989p.getValue()).f76126b) {
            this.this$0.g();
        }
        return Unit.INSTANCE;
    }
}
