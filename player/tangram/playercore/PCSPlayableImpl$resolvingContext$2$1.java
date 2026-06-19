package com.bilibili.player.tangram.playercore;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImpl$resolvingContext$2$1.class */
final class PCSPlayableImpl$resolvingContext$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final A $it;
    int label;
    final PCSPlayableImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PCSPlayableImpl$resolvingContext$2$1(PCSPlayableImpl pCSPlayableImpl, A a7, Continuation<? super PCSPlayableImpl$resolvingContext$2$1> continuation) {
        super(2, continuation);
        this.this$0 = pCSPlayableImpl;
        this.$it = a7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PCSPlayableImpl$resolvingContext$2$1(this.this$0, this.$it, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<A> mutableSharedFlow = this.this$0.f79422k;
            A a7 = this.$it;
            this.label = 1;
            if (mutableSharedFlow.emit(a7, this) == coroutine_suspended) {
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
