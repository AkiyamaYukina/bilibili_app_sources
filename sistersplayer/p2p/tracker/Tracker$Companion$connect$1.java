package com.bilibili.sistersplayer.p2p.tracker;

import com.bilibili.sistersplayer.p2p.P2PContext;
import com.bilibili.sistersplayer.p2p.tracker.Tracker;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/Tracker$Companion$connect$1.class */
public final class Tracker$Companion$connect$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final P2PLogger $logger;
    final Tracker.TrackerMessageSink $msgSink;
    final P2PContext $p2pCtx;
    final String $trackerSourceParam;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tracker$Companion$connect$1(P2PContext p2PContext, String str, Tracker.TrackerMessageSink trackerMessageSink, P2PLogger p2PLogger, Continuation<? super Tracker$Companion$connect$1> continuation) {
        super(2, continuation);
        this.$p2pCtx = p2PContext;
        this.$trackerSourceParam = str;
        this.$msgSink = trackerMessageSink;
        this.$logger = p2PLogger;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Tracker$Companion$connect$1(this.$p2pCtx, this.$trackerSourceParam, this.$msgSink, this.$logger, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Tracker tracker = new Tracker(this.$p2pCtx, this.$trackerSourceParam, this.$msgSink, this.$logger, null);
            this.$msgSink.onTrackerInit(tracker);
            this.label = 1;
            Object objConnect = tracker.connect(this);
            obj = objConnect;
            if (objConnect == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            this.$msgSink.onTrackerConnected(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }
}
