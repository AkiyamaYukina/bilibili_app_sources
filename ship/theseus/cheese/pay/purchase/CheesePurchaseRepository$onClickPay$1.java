package com.bilibili.ship.theseus.cheese.pay.purchase;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/CheesePurchaseRepository$onClickPay$1.class */
public final class CheesePurchaseRepository$onClickPay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $location;
    int label;
    final CheesePurchaseRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePurchaseRepository$onClickPay$1(CheesePurchaseRepository cheesePurchaseRepository, int i7, Continuation<? super CheesePurchaseRepository$onClickPay$1> continuation) {
        super(2, continuation);
        this.this$0 = cheesePurchaseRepository;
        this.$location = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheesePurchaseRepository$onClickPay$1(this.this$0, this.$location, continuation);
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
        BLog.i("CheesePayRepository", "payRepo onClickPay, result = " + this.this$0.f90496b.tryEmit(Boxing.boxInt(this.$location)) + ", location = " + this.$location);
        return Unit.INSTANCE;
    }
}
