package com.bilibili.ogv.operation3.module.vcards3x2;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/vcards3x2/VCards3x2SupportModule$provide$1$2$1$1$1$2$1$1.class */
final class VCards3x2SupportModule$provide$1$2$1$1$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final com.bilibili.ogv.operation3.module.switchit.h $switchableModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VCards3x2SupportModule$provide$1$2$1$1$1$2$1$1(com.bilibili.ogv.operation3.module.switchit.h hVar, Continuation<? super VCards3x2SupportModule$provide$1$2$1$1$1$2$1$1> continuation) {
        super(2, continuation);
        this.$switchableModel = hVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VCards3x2SupportModule$provide$1$2$1$1$1$2$1$1(this.$switchableModel, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        com.bilibili.ogv.operation3.module.switchit.a aVarC = this.$switchableModel.c();
        if (aVarC != null) {
            aVarC.invoke();
        }
        return Unit.INSTANCE;
    }
}
