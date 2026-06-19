package com.bilibili.module.vip.mall;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipPurchaseService$checkOrder$3.class */
final class VipPurchaseService$checkOrder$3 extends SuspendLambda implements Function2<Throwable, Continuation<? super Boolean>, Object> {
    Object L$0;
    int label;

    public VipPurchaseService$checkOrder$3(Continuation<? super VipPurchaseService$checkOrder$3> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VipPurchaseService$checkOrder$3 vipPurchaseService$checkOrder$3 = new VipPurchaseService$checkOrder$3(continuation);
        vipPurchaseService$checkOrder$3.L$0 = obj;
        return vipPurchaseService$checkOrder$3;
    }

    public final Object invoke(Throwable th, Continuation<? super Boolean> continuation) {
        return create(th, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(true);
    }
}
