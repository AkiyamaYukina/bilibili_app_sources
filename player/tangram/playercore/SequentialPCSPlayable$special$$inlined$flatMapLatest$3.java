package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/SequentialPCSPlayable$special$$inlined$flatMapLatest$3.class */
public final class SequentialPCSPlayable$special$$inlined$flatMapLatest$3 extends SuspendLambda implements Function3<FlowCollector<? super PlayerAvailability>, v, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;
    final SequentialPCSPlayable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequentialPCSPlayable$special$$inlined$flatMapLatest$3(Continuation continuation, SequentialPCSPlayable sequentialPCSPlayable) {
        super(3, continuation);
        this.this$0 = sequentialPCSPlayable;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((FlowCollector<? super PlayerAvailability>) obj, (v) obj2, (Continuation<? super Unit>) obj3);
    }

    public final Object invoke(FlowCollector<? super PlayerAvailability> flowCollector, v vVar, Continuation<? super Unit> continuation) {
        SequentialPCSPlayable$special$$inlined$flatMapLatest$3 sequentialPCSPlayable$special$$inlined$flatMapLatest$3 = new SequentialPCSPlayable$special$$inlined$flatMapLatest$3(continuation, this.this$0);
        sequentialPCSPlayable$special$$inlined$flatMapLatest$3.L$0 = flowCollector;
        sequentialPCSPlayable$special$$inlined$flatMapLatest$3.L$1 = vVar;
        return sequentialPCSPlayable$special$$inlined$flatMapLatest$3.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            v vVar = (v) this.L$1;
            Flow flowFlowOf = vVar == null ? FlowKt.flowOf(PlayerAvailability.IDLE) : FlowKt.combine(this.this$0.f79430a, vVar.d(), new SequentialPCSPlayable$playerAvailabilityFlow$1$1(null));
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == coroutine_suspended) {
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
