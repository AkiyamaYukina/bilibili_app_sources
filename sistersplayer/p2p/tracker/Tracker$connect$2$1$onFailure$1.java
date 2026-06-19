package com.bilibili.sistersplayer.p2p.tracker;

import com.bilibili.sistersplayer.hls.FetchErrorCode;
import com.bilibili.sistersplayer.p2p.IP2PEventReport;
import com.bilibili.sistersplayer.p2p.TrackerConnectFail;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Response;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/Tracker$connect$2$1$onFailure$1.class */
public final class Tracker$connect$2$1$onFailure$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Response $response;
    final Throwable $t;
    final String $url;
    int label;
    final Tracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tracker$connect$2$1$onFailure$1(Tracker tracker, Response response, String str, Throwable th, Continuation<? super Tracker$connect$2$1$onFailure$1> continuation) {
        super(2, continuation);
        this.this$0 = tracker;
        this.$response = response;
        this.$url = str;
        this.$t = th;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Tracker$connect$2$1$onFailure$1(this.this$0, this.$response, this.$url, this.$t, continuation);
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
        this.this$0.destroy();
        this.this$0.msgSink.onTrackerConnected(false);
        IP2PEventReport p2pEventReportCallback = this.this$0.p2pContext.getP2pEventReportCallback();
        if (p2pEventReportCallback != null) {
            Response response = this.$response;
            p2pEventReportCallback.onP2PEventReport(new TrackerConnectFail(response != null ? response.code() : FetchErrorCode.ERROR_TRACKER_URL.getEc(), this.$url));
        }
        P2PLogger p2PLogger = this.this$0.logger;
        Response response2 = this.$response;
        String strBoxInt = response2 != null ? Boxing.boxInt(response2.code()) : " unknown reason";
        this.$t.printStackTrace();
        Unit unit = Unit.INSTANCE;
        P2PLogger.logE$default(p2PLogger, Tracker.TAG, "[LiveP2PProblem][tracker=connect_failed]" + strBoxInt + ", " + unit, null, 4, null);
        return unit;
    }
}
