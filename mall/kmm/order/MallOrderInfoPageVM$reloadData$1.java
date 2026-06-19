package com.bilibili.mall.kmm.order;

import fh0.X;
import gh0.u;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/MallOrderInfoPageVM$reloadData$1.class */
public final class MallOrderInfoPageVM$reloadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final MallOrderInfoPageVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MallOrderInfoPageVM$reloadData$1(MallOrderInfoPageVM mallOrderInfoPageVM, Continuation<? super MallOrderInfoPageVM$reloadData$1> continuation) {
        super(2, continuation);
        this.this$0 = mallOrderInfoPageVM;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MallOrderInfoPageVM$reloadData$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            X x6 = this.this$0.d().f65634a;
            if (x6 != null) {
                MallOrderInfoPageVM mallOrderInfoPageVM = this.this$0;
                u uVar = new u(x6, mallOrderInfoPageVM.f65623f, mallOrderInfoPageVM.d());
                this.L$0 = SpillingKt.nullOutSpilledVariable(x6);
                this.L$1 = SpillingKt.nullOutSpilledVariable(uVar);
                this.I$0 = 0;
                this.label = 1;
                if (MallOrderInfoPageVM.a(mallOrderInfoPageVM, mallOrderInfoPageVM.f65622e, uVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
