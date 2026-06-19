package com.bilibili.sistersplayer.p2p.tracker;

import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/Tracker$connect$2$1$onMessage$1.class */
public final class Tracker$connect$2$1$onMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $text;
    int label;
    final Tracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tracker$connect$2$1$onMessage$1(Tracker tracker, String str, Continuation<? super Tracker$connect$2$1$onMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = tracker;
        this.$text = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Tracker$connect$2$1$onMessage$1(this.this$0, this.$text, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            P2PLogger.logI$default(this.this$0.logger, Tracker.TAG_RECEIVE, this.$text, null, 4, null);
            Tracker tracker = this.this$0;
            String str = this.$text;
            this.label = 1;
            if (tracker.onMessageReceived(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
