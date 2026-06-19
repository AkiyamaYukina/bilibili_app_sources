package com.bilibili.sistersplayer.p2p.peer;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeerManager$accept$1$1.class */
public final class NyaPeerManager$accept$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final NyaPeer $it;
    final NyaPeer $rp;
    private Object L$0;
    int label;
    final NyaPeerManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NyaPeerManager$accept$1$1(NyaPeerManager nyaPeerManager, NyaPeer nyaPeer, NyaPeer nyaPeer2, Continuation<? super NyaPeerManager$accept$1$1> continuation) {
        super(2, continuation);
        this.this$0 = nyaPeerManager;
        this.$it = nyaPeer;
        this.$rp = nyaPeer2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NyaPeerManager$accept$1$1 nyaPeerManager$accept$1$1 = new NyaPeerManager$accept$1$1(this.this$0, this.$it, this.$rp, continuation);
        nyaPeerManager$accept$1$1.L$0 = obj;
        return nyaPeerManager$accept$1$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            long j7 = this.this$0.p2pContext.getSistersConfiguration().peerConnectionTimeoutMs;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (DelayKt.delay(j7, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope2;
        }
        if (CoroutineScopeKt.isActive(coroutineScope)) {
            this.this$0.onPeerConnectComplete(this.$it, false);
        } else {
            this.$rp.destroy();
        }
        return Unit.INSTANCE;
    }
}
