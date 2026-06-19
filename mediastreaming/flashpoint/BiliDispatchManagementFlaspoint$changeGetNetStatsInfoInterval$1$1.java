package com.bilibili.mediastreaming.flashpoint;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliDispatchManagementFlaspoint$changeGetNetStatsInfoInterval$1$1.class */
public final class BiliDispatchManagementFlaspoint$changeGetNetStatsInfoInterval$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $intervalTimeMs;
    int label;
    final BiliDispatchManagementFlaspoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliDispatchManagementFlaspoint$changeGetNetStatsInfoInterval$1$1(BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, int i7, Continuation<? super BiliDispatchManagementFlaspoint$changeGetNetStatsInfoInterval$1$1> continuation) {
        super(2, continuation);
        this.this$0 = biliDispatchManagementFlaspoint;
        this.$intervalTimeMs = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliDispatchManagementFlaspoint$changeGetNetStatsInfoInterval$1$1(this.this$0, this.$intervalTimeMs, continuation);
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
        Boolean boolL = BiliDispatchManagementFlaspoint.l(this.this$0, this.$intervalTimeMs);
        this.this$0.logInfo(com.bilibili.app.comm.bh.x5.b.a("innerChangeGetNetInfoLoopTime, ret:", boolL != null ? boolL.booleanValue() : false), null, null, null);
        return Unit.INSTANCE;
    }
}
