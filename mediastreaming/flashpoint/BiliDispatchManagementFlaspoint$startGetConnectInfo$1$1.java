package com.bilibili.mediastreaming.flashpoint;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliDispatchManagementFlaspoint$startGetConnectInfo$1$1.class */
final class BiliDispatchManagementFlaspoint$startGetConnectInfo$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $intervalTimeS;
    int label;
    final BiliDispatchManagementFlaspoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliDispatchManagementFlaspoint$startGetConnectInfo$1$1(BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, int i7, Continuation<? super BiliDispatchManagementFlaspoint$startGetConnectInfo$1$1> continuation) {
        super(2, continuation);
        this.this$0 = biliDispatchManagementFlaspoint;
        this.$intervalTimeS = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliDispatchManagementFlaspoint$startGetConnectInfo$1$1(this.this$0, this.$intervalTimeS, continuation);
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
        Boolean boolK = BiliDispatchManagementFlaspoint.k(this.this$0, this.$intervalTimeS);
        if (!(boolK != null ? boolK.booleanValue() : false)) {
            return Unit.INSTANCE;
        }
        BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = this.this$0;
        biliDispatchManagementFlaspoint.logInfo(com.bilibili.app.comm.bh.x5.b.a("isStartDoGetConnectStats:", biliDispatchManagementFlaspoint.f65990l), null, null, null);
        BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint2 = this.this$0;
        if (!biliDispatchManagementFlaspoint2.f65990l) {
            BiliDispatchManagementFlaspoint.m(biliDispatchManagementFlaspoint2);
            this.this$0.f65990l = true;
        }
        return Unit.INSTANCE;
    }
}
