package com.bilibili.mall.kmm.order;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/MallOrderInfoPageVM$loadData$4$2$1$1.class */
public final class MallOrderInfoPageVM$loadData$4$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $jumpUrl;
    int label;
    final MallOrderInfoPageVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MallOrderInfoPageVM$loadData$4$2$1$1(MallOrderInfoPageVM mallOrderInfoPageVM, String str, Continuation<? super MallOrderInfoPageVM$loadData$4$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = mallOrderInfoPageVM;
        this.$jumpUrl = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MallOrderInfoPageVM$loadData$4$2$1$1(this.this$0, this.$jumpUrl, continuation);
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
        WR0.b bVar = this.this$0.f65623f;
        if (bVar != null) {
            bVar.b(this.$jumpUrl);
        }
        return Unit.INSTANCE;
    }
}
