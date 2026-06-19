package com.bilibili.ship.theseus.ogv.pay;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/OgvPayService$showPayTipUnStartDialog$1$1.class */
final class OgvPayService$showPayTipUnStartDialog$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final OgvPayService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvPayService$showPayTipUnStartDialog$1$1(OgvPayService ogvPayService, Continuation<? super OgvPayService$showPayTipUnStartDialog$1$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvPayService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvPayService$showPayTipUnStartDialog$1$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.ogv.intro.community.a aVar = this.this$0.f94159i;
            this.label = 1;
            if (aVar.a(false, this) == coroutine_suspended) {
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
