package com.bilibili.ship.theseus.united.page.backpress;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/backpress/BackActionRepository$cancelOnBackAction$2$job$1.class */
public final class BackActionRepository$cancelOnBackAction$2$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function1<Continuation<? super Unit>, Object> $task;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackActionRepository$cancelOnBackAction$2$job$1(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super BackActionRepository$cancelOnBackAction$2$job$1> continuation) {
        super(2, continuation);
        this.$task = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BackActionRepository$cancelOnBackAction$2$job$1(this.$task, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Function1<Continuation<? super Unit>, Object> function1 = this.$task;
            this.label = 1;
            if (function1.invoke(this) == coroutine_suspended) {
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
