package com.bilibili.sistersplayer.p2p.peer;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.webrtc.DataChannel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeer$onStateChange$2$1.class */
public final class NyaPeer$onStateChange$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final DataChannel.State $it;
    final NyaPeer $thiz;
    int label;
    final NyaPeer this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/NyaPeer$onStateChange$2$1$WhenMappings.class */
    public final /* synthetic */ class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DataChannel.State.values().length];
            try {
                iArr[DataChannel.State.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[DataChannel.State.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[DataChannel.State.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[DataChannel.State.CONNECTING.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NyaPeer$onStateChange$2$1(DataChannel.State state, NyaPeer nyaPeer, NyaPeer nyaPeer2, Continuation<? super NyaPeer$onStateChange$2$1> continuation) {
        super(2, continuation);
        this.$it = state;
        this.this$0 = nyaPeer;
        this.$thiz = nyaPeer2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NyaPeer$onStateChange$2$1(this.$it, this.this$0, this.$thiz, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i7 = WhenMappings.$EnumSwitchMapping$0[this.$it.ordinal()];
        if (i7 == 1) {
            this.this$0.observer.connected(this.$thiz);
        } else if (i7 == 2 || i7 == 3) {
            this.this$0.observer.disconnected(this.$thiz);
        } else if (i7 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
