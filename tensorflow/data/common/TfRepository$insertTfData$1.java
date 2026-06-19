package com.bilibili.tensorflow.data.common;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/data/common/TfRepository$insertTfData$1.class */
final class TfRepository$insertTfData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final h $entry;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TfRepository$insertTfData$1(h hVar, Continuation<? super TfRepository$insertTfData$1> continuation) {
        super(2, continuation);
        this.$entry = hVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TfRepository$insertTfData$1(this.$entry, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            a aVar = TfDatabase.f110720a;
            h hVar = this.$entry;
            this.label = 1;
            if (aVar.f(hVar, this) == coroutine_suspended) {
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
