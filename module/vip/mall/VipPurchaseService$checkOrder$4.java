package com.bilibili.module.vip.mall;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipPurchaseService$checkOrder$4.class */
final class VipPurchaseService$checkOrder$4 extends SuspendLambda implements Function3<FlowCollector<? super Result<? extends VipPayResultInfo>>, Throwable, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;

    public VipPurchaseService$checkOrder$4(Continuation<? super VipPurchaseService$checkOrder$4> continuation) {
        super(3, continuation);
    }

    public final Object invoke(FlowCollector<? super Result<VipPayResultInfo>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        VipPurchaseService$checkOrder$4 vipPurchaseService$checkOrder$4 = new VipPurchaseService$checkOrder$4(continuation);
        vipPurchaseService$checkOrder$4.L$0 = flowCollector;
        vipPurchaseService$checkOrder$4.L$1 = th;
        return vipPurchaseService$checkOrder$4.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Throwable th = (Throwable) this.L$1;
            Result.Companion companion = Result.Companion;
            Result result = Result.box-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            this.L$0 = null;
            this.label = 1;
            if (flowCollector.emit(result, this) == coroutine_suspended) {
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
