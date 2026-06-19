package com.bilibili.sistersplayer.p2p.tracker;

import androidx.compose.ui.text.font.C4496a;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/Tracker$connect$2$1$onClosing$1.class */
public final class Tracker$connect$2$1$onClosing$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $reason;
    int label;
    final Tracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tracker$connect$2$1$onClosing$1(Tracker tracker, String str, Continuation<? super Tracker$connect$2$1$onClosing$1> continuation) {
        super(2, continuation);
        this.this$0 = tracker;
        this.$reason = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Tracker$connect$2$1$onClosing$1(this.this$0, this.$reason, continuation);
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
        P2PLogger.logE$default(this.this$0.logger, Tracker.TAG, C4496a.a("[LiveP2PProblem][tracker:error_state]", this.$reason), null, 4, null);
        return Unit.INSTANCE;
    }
}
