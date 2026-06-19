package com.bilibili.sistersplayer.p2p.tracker;

import androidx.core.app.o;
import com.bilibili.sistersplayer.p2p.IP2PEventReport;
import com.bilibili.sistersplayer.p2p.TrackerConnectFail;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/Tracker$connect$2$1$onClosed$1.class */
public final class Tracker$connect$2$1$onClosed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $code;
    final String $reason;
    final String $url;
    int label;
    final Tracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tracker$connect$2$1$onClosed$1(Tracker tracker, int i7, String str, String str2, Continuation<? super Tracker$connect$2$1$onClosed$1> continuation) {
        super(2, continuation);
        this.this$0 = tracker;
        this.$code = i7;
        this.$reason = str;
        this.$url = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Tracker$connect$2$1$onClosed$1(this.this$0, this.$code, this.$reason, this.$url, continuation);
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
        P2PLogger.logE$default(this.this$0.logger, Tracker.TAG, o.a(this.$code, "[LiveP2PProblem][tracker=error_state] ", " : ", this.$reason), null, 4, null);
        if (this.$code != 4000) {
            this.this$0.destroy();
            this.this$0.msgSink.onTrackerConnected(false);
            IP2PEventReport p2pEventReportCallback = this.this$0.p2pContext.getP2pEventReportCallback();
            if (p2pEventReportCallback != null) {
                p2pEventReportCallback.onP2PEventReport(new TrackerConnectFail(this.$code, this.$url));
            }
        }
        return Unit.INSTANCE;
    }
}
