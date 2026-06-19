package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryRepository$updateCouponLayerSelect$1.class */
final class CheesePrimaryRepository$updateCouponLayerSelect$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final C6101w this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePrimaryRepository$updateCouponLayerSelect$1(C6101w c6101w, Continuation<? super CheesePrimaryRepository$updateCouponLayerSelect$1> continuation) {
        super(2, continuation);
        this.this$0 = c6101w;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheesePrimaryRepository$updateCouponLayerSelect$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<Unit> mutableSharedFlow = this.this$0.f89783e;
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            if (mutableSharedFlow.emit(unit, this) == coroutine_suspended) {
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
