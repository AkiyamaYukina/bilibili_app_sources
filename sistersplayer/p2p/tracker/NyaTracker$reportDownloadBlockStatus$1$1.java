package com.bilibili.sistersplayer.p2p.tracker;

import java.util.HashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/tracker/NyaTracker$reportDownloadBlockStatus$1$1.class */
public final class NyaTracker$reportDownloadBlockStatus$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $isSuccess;
    final Tracker $it;
    final String $remotePeerId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NyaTracker$reportDownloadBlockStatus$1$1(boolean z6, String str, Tracker tracker, Continuation<? super NyaTracker$reportDownloadBlockStatus$1$1> continuation) {
        super(2, continuation);
        this.$isSuccess = z6;
        this.$remotePeerId = str;
        this.$it = tracker;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NyaTracker$reportDownloadBlockStatus$1$1(this.$isSuccess, this.$remotePeerId, this.$it, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            HashMap map = new HashMap();
            map.put("id", this.$isSuccess ? "peerConnected" : "peerConnectFailed");
            map.put("remote", this.$remotePeerId);
            Tracker tracker = this.$it;
            Integer numBoxInt = Boxing.boxInt(-1);
            this.label = 1;
            if (tracker.sendServerRequest("report", numBoxInt, map, this) == coroutine_suspended) {
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
