package com.bilibili.ogv.pub.reserve;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/VipReserveCacheStorage$watchAll$1.class */
public final class VipReserveCacheStorage$watchAll$1 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends l>>, Throwable, Continuation<? super Unit>, Object> {
    int label;

    public VipReserveCacheStorage$watchAll$1(Continuation<? super VipReserveCacheStorage$watchAll$1> continuation) {
        super(3, continuation);
    }

    public final Object invoke(FlowCollector<? super List<l>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return new VipReserveCacheStorage$watchAll$1(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
