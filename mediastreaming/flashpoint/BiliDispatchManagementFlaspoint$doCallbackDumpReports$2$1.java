package com.bilibili.mediastreaming.flashpoint;

import com.bilibili.live.streaming.LivePush;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliDispatchManagementFlaspoint$doCallbackDumpReports$2$1.class */
final class BiliDispatchManagementFlaspoint$doCallbackDumpReports$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $reportMessage;
    int label;
    final BiliDispatchManagementFlaspoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliDispatchManagementFlaspoint$doCallbackDumpReports$2$1(BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, String str, Continuation<? super BiliDispatchManagementFlaspoint$doCallbackDumpReports$2$1> continuation) {
        super(2, continuation);
        this.this$0 = biliDispatchManagementFlaspoint;
        this.$reportMessage = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliDispatchManagementFlaspoint$doCallbackDumpReports$2$1(this.this$0, this.$reportMessage, continuation);
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
        g gVar = this.this$0.f65980a;
        LivePush livePush = this.this$0.f65982c;
        if (livePush != null) {
            livePush.onEvent("live.push.full.lifecycle.tracker", this.$reportMessage, System.currentTimeMillis());
        }
        return Unit.INSTANCE;
    }
}
