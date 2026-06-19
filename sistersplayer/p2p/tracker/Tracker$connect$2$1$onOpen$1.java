package com.bilibili.sistersplayer.p2p.tracker;

import androidx.compose.ui.text.font.C4496a;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.WebSocket;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/Tracker$connect$2$1$onOpen$1.class */
public final class Tracker$connect$2$1$onOpen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final CancellableContinuation<Boolean> $it;
    final String $url;
    final WebSocket $webSocket;
    int label;
    final Tracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Tracker$connect$2$1$onOpen$1(Tracker tracker, String str, WebSocket webSocket, CancellableContinuation<? super Boolean> cancellableContinuation, Continuation<? super Tracker$connect$2$1$onOpen$1> continuation) {
        super(2, continuation);
        this.this$0 = tracker;
        this.$url = str;
        this.$webSocket = webSocket;
        this.$it = cancellableContinuation;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Tracker$connect$2$1$onOpen$1(this.this$0, this.$url, this.$webSocket, this.$it, continuation);
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
        P2PLogger.logI$default(this.this$0.logger, Tracker.TAG, C4496a.a("tracker connect success! ", this.$url), null, 4, null);
        this.this$0.webSocket = this.$webSocket;
        if (this.$it.isActive()) {
            CancellableContinuation<Boolean> cancellableContinuation = this.$it;
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.constructor-impl(Boxing.boxBoolean(true)));
        } else {
            this.this$0.destroy();
        }
        return Unit.INSTANCE;
    }
}
