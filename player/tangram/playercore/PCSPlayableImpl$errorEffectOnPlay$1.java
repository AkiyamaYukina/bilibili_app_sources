package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImpl$errorEffectOnPlay$1.class */
final class PCSPlayableImpl$errorEffectOnPlay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final PCSPlayableImpl this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImpl$errorEffectOnPlay$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PCSPlayableImpl f79425a;

        public a(PCSPlayableImpl pCSPlayableImpl) {
            this.f79425a = pCSPlayableImpl;
        }

        public final Object emit(Object obj, Continuation continuation) {
            if (((PlayerAvailability) obj) == PlayerAvailability.ERROR) {
                BLog.i("PCSPlayableImpl$errorEffectOnPlay$1$1-emit", "[tangram-player-core-PCSPlayableImpl$errorEffectOnPlay$1$1-emit] PlayerAvailability.ERROR call player pause");
                this.f79425a.f79413a.pause();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PCSPlayableImpl$errorEffectOnPlay$1(PCSPlayableImpl pCSPlayableImpl, Continuation<? super PCSPlayableImpl$errorEffectOnPlay$1> continuation) {
        super(2, continuation);
        this.this$0 = pCSPlayableImpl;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PCSPlayableImpl$errorEffectOnPlay$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<PlayerAvailability> flowD = this.this$0.f79413a.d();
            a aVar = new a(this.this$0);
            this.label = 1;
            if (flowD.collect(aVar, this) == coroutine_suspended) {
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
