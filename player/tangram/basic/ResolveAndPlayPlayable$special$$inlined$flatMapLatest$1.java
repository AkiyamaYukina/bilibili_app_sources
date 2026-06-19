package com.bilibili.player.tangram.basic;

import com.bilibili.player.tangram.basic.ResolveAndPlayPlayable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: Add missing generic type declarations: [InnerPlayer] */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/ResolveAndPlayPlayable$special$$inlined$flatMapLatest$1.class */
public final class ResolveAndPlayPlayable$special$$inlined$flatMapLatest$1<InnerPlayer> extends SuspendLambda implements Function3<FlowCollector<? super PlayerAvailability>, ResolveAndPlayPlayable.c<? extends InnerPlayer>, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;

    public ResolveAndPlayPlayable$special$$inlined$flatMapLatest$1(Continuation continuation) {
        super(3, continuation);
    }

    public final Object invoke(FlowCollector<? super PlayerAvailability> flowCollector, ResolveAndPlayPlayable.c<? extends InnerPlayer> cVar, Continuation<? super Unit> continuation) {
        ResolveAndPlayPlayable$special$$inlined$flatMapLatest$1 resolveAndPlayPlayable$special$$inlined$flatMapLatest$1 = new ResolveAndPlayPlayable$special$$inlined$flatMapLatest$1(continuation);
        resolveAndPlayPlayable$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
        resolveAndPlayPlayable$special$$inlined$flatMapLatest$1.L$1 = cVar;
        return resolveAndPlayPlayable$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Flow<PlayerAvailability> flowFlowOf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            ResolveAndPlayPlayable.c cVar = (ResolveAndPlayPlayable.c) this.L$1;
            if (cVar instanceof ResolveAndPlayPlayable.c.b) {
                flowFlowOf = FlowKt.flowOf(PlayerAvailability.IDLE);
            } else if (cVar instanceof ResolveAndPlayPlayable.c.d) {
                flowFlowOf = FlowKt.flowOf(PlayerAvailability.LOADING);
            } else if (cVar instanceof ResolveAndPlayPlayable.c.C0510c) {
                flowFlowOf = ((ResolveAndPlayPlayable.c.C0510c) cVar).f79314a.d();
            } else {
                if (!(cVar instanceof ResolveAndPlayPlayable.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                flowFlowOf = FlowKt.flowOf(PlayerAvailability.ERROR);
            }
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
