package com.bilibili.mediastreaming.flashpoint;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliDispatchManagementFlaspoint$stopGetNetStatsInfo$1$1.class */
public final class BiliDispatchManagementFlaspoint$stopGetNetStatsInfo$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final BiliDispatchManagementFlaspoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliDispatchManagementFlaspoint$stopGetNetStatsInfo$1$1(BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, Continuation<? super BiliDispatchManagementFlaspoint$stopGetNetStatsInfo$1$1> continuation) {
        super(2, continuation);
        this.this$0 = biliDispatchManagementFlaspoint;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliDispatchManagementFlaspoint$stopGetNetStatsInfo$1$1(this.this$0, continuation);
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
        this.this$0.logInfo("stopGetNetStatsInfo....", null, null, null);
        BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = this.this$0;
        biliDispatchManagementFlaspoint.f65991m = false;
        biliDispatchManagementFlaspoint.f65994p = 0L;
        return Unit.INSTANCE;
    }
}
