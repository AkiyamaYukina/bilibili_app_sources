package com.bilibili.ship.theseus.ugc.endpage.qoe;

import com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeService$showQoeWidget$3$1$1$3$1.class */
final class UgcDmQoeService$showQoeWidget$3$1$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcDmQoeService$showQoeWidget$3$1$1$3$1(x xVar, Continuation<? super UgcDmQoeService$showQoeWidget$3$1$1$3$1> continuation) {
        super(2, continuation);
        this.this$0 = xVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcDmQoeService$showQoeWidget$3$1$1$3$1(this.this$0, continuation);
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
        MutableStateFlow<UgcDmQoeComponent.State> mutableStateFlow = this.this$0.f96781j;
        mutableStateFlow.tryEmit(UgcDmQoeComponent.State.a((UgcDmQoeComponent.State) mutableStateFlow.getValue(), null, 0L, System.currentTimeMillis() - this.this$0.f96786o, 0, null, null, UgcDmQoeComponent.State.AnimType.RESUME, 0L, 0, 443));
        return Unit.INSTANCE;
    }
}
