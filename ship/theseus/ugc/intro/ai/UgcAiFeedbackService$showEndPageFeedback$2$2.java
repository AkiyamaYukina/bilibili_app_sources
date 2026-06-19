package com.bilibili.ship.theseus.ugc.intro.ai;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/UgcAiFeedbackService$showEndPageFeedback$2$2.class */
final class UgcAiFeedbackService$showEndPageFeedback$2$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final UgcAiFeedbackService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcAiFeedbackService$showEndPageFeedback$2$2(UgcAiFeedbackService ugcAiFeedbackService, Continuation<? super UgcAiFeedbackService$showEndPageFeedback$2$2> continuation) {
        super(1, continuation);
        this.this$0 = ugcAiFeedbackService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UgcAiFeedbackService$showEndPageFeedback$2$2(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.united.utils.d dVar = this.this$0.f96945i.f103315a;
            this.label = 1;
            if (dVar.a(this) == coroutine_suspended) {
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
