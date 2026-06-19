package com.bilibili.mall.kmm.order;

import gh0.u;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/MallOrderInfoPageVM$loadData$4$1$1.class */
public final class MallOrderInfoPageVM$loadData$4$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MallOrderInfoPageVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MallOrderInfoPageVM$loadData$4$1$1(MallOrderInfoPageVM mallOrderInfoPageVM, Continuation<? super MallOrderInfoPageVM$loadData$4$1$1> continuation) {
        super(2, continuation);
        this.this$0 = mallOrderInfoPageVM;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MallOrderInfoPageVM$loadData$4$1$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableStateFlow<MallOrderInfoState<u>> mutableStateFlow = this.this$0.f65622e;
            this.label = 1;
            if (MallOrderInfoPageVM.h(mutableStateFlow, null, this) == coroutine_suspended) {
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
