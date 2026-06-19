package com.bilibili.pegasus.components;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/InlineComponent$startDelayAutoPlay$2.class */
final class InlineComponent$startDelayAutoPlay$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InlineComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineComponent$startDelayAutoPlay$2(InlineComponent inlineComponent, Continuation<? super InlineComponent$startDelayAutoPlay$2> continuation) {
        super(2, continuation);
        this.this$0 = inlineComponent;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InlineComponent$startDelayAutoPlay$2(this.this$0, continuation);
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
            if (DelayKt.delay(100L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        InlineComponent.d(this.this$0, false, 1);
        this.this$0.f75802v = null;
        return Unit.INSTANCE;
    }
}
