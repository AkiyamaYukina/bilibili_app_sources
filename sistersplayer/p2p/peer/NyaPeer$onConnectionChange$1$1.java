package com.bilibili.sistersplayer.p2p.peer;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeer$onConnectionChange$1$1.class */
public final class NyaPeer$onConnectionChange$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final PeerConnection.PeerConnectionState $it;
    int label;
    final NyaPeer this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeer$onConnectionChange$1$1$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PeerConnection.PeerConnectionState.values().length];
            try {
                iArr[PeerConnection.PeerConnectionState.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[PeerConnection.PeerConnectionState.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[PeerConnection.PeerConnectionState.CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NyaPeer$onConnectionChange$1$1(PeerConnection.PeerConnectionState peerConnectionState, NyaPeer nyaPeer, Continuation<? super NyaPeer$onConnectionChange$1$1> continuation) {
        super(2, continuation);
        this.$it = peerConnectionState;
        this.this$0 = nyaPeer;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NyaPeer$onConnectionChange$1$1(this.$it, this.this$0, continuation);
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
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.$it.ordinal()];
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            this.this$0.observer.disconnected(this.this$0);
        }
        return Unit.INSTANCE;
    }
}
