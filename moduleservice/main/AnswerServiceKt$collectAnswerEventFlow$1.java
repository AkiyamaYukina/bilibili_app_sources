package com.bilibili.moduleservice.main;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/AnswerServiceKt$collectAnswerEventFlow$1.class */
final class AnswerServiceKt$collectAnswerEventFlow$1 extends SuspendLambda implements Function2<a, Continuation<? super Unit>, Object> {
    final Function1<a, Unit> $onEvent;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnswerServiceKt$collectAnswerEventFlow$1(Function1<? super a, Unit> function1, Continuation<? super AnswerServiceKt$collectAnswerEventFlow$1> continuation) {
        super(2, continuation);
        this.$onEvent = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AnswerServiceKt$collectAnswerEventFlow$1 answerServiceKt$collectAnswerEventFlow$1 = new AnswerServiceKt$collectAnswerEventFlow$1(this.$onEvent, continuation);
        answerServiceKt$collectAnswerEventFlow$1.L$0 = obj;
        return answerServiceKt$collectAnswerEventFlow$1;
    }

    public final Object invoke(a aVar, Continuation<? super Unit> continuation) {
        return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$onEvent.invoke((a) this.L$0);
        return Unit.INSTANCE;
    }
}
