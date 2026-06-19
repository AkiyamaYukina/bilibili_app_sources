package com.bilibili.mediastreaming.flashpoint;

import com.bilibili.live.streaming.LivePush;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliDispatchManagementFlaspoint$doCallbackConnectStatsInfo$2$2.class */
final class BiliDispatchManagementFlaspoint$doCallbackConnectStatsInfo$2$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $connectStatsInfo;
    final long $curTimestampMs;
    int label;
    final BiliDispatchManagementFlaspoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliDispatchManagementFlaspoint$doCallbackConnectStatsInfo$2$2(BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, String str, long j7, Continuation<? super BiliDispatchManagementFlaspoint$doCallbackConnectStatsInfo$2$2> continuation) {
        super(2, continuation);
        this.this$0 = biliDispatchManagementFlaspoint;
        this.$connectStatsInfo = str;
        this.$curTimestampMs = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliDispatchManagementFlaspoint$doCallbackConnectStatsInfo$2$2(this.this$0, this.$connectStatsInfo, this.$curTimestampMs, continuation);
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
        LivePush livePush = this.this$0.f65982c;
        if (livePush != null) {
            livePush.onConnectStats(this.$connectStatsInfo, this.$curTimestampMs);
        }
        return Unit.INSTANCE;
    }
}
