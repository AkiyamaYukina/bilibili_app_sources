package com.bilibili.mall.kmm.order.combine;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/combine/MallCombineOrderPageVM$createOrder$2$2$1$1.class */
public final class MallCombineOrderPageVM$createOrder$2$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $jumpUrl;
    int label;
    final MallCombineOrderPageVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MallCombineOrderPageVM$createOrder$2$2$1$1(MallCombineOrderPageVM mallCombineOrderPageVM, String str, Continuation<? super MallCombineOrderPageVM$createOrder$2$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = mallCombineOrderPageVM;
        this.$jumpUrl = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MallCombineOrderPageVM$createOrder$2$2$1$1(this.this$0, this.$jumpUrl, continuation);
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
        WR0.c cVar = this.this$0.f65650f;
        if (cVar != null) {
            cVar.b(this.$jumpUrl);
        }
        return Unit.INSTANCE;
    }
}
