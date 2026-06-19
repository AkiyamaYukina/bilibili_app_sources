package com.bilibili.pegasus.components.interest;

import dp0.C6828a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/LowActiveInterestChoosePlugin$onViewCreated$2$guide$1.class */
public final class LowActiveInterestChoosePlugin$onViewCreated$2$guide$1 extends SuspendLambda implements Function2<C6828a, Continuation<? super Boolean>, Object> {
    Object L$0;
    int label;

    public LowActiveInterestChoosePlugin$onViewCreated$2$guide$1(Continuation<? super LowActiveInterestChoosePlugin$onViewCreated$2$guide$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LowActiveInterestChoosePlugin$onViewCreated$2$guide$1 lowActiveInterestChoosePlugin$onViewCreated$2$guide$1 = new LowActiveInterestChoosePlugin$onViewCreated$2$guide$1(continuation);
        lowActiveInterestChoosePlugin$onViewCreated$2$guide$1.L$0 = obj;
        return lowActiveInterestChoosePlugin$onViewCreated$2$guide$1;
    }

    public final Object invoke(C6828a c6828a, Continuation<? super Boolean> continuation) {
        return create(c6828a, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C6828a c6828a = (C6828a) this.L$0;
        return Boxing.boxBoolean((c6828a != null ? c6828a.w() : null) != null);
    }
}
