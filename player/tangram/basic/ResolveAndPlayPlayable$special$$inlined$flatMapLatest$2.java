package com.bilibili.player.tangram.basic;

import com.bilibili.player.tangram.basic.ResolveAndPlayPlayable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: Add missing generic type declarations: [InnerPlayer] */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/ResolveAndPlayPlayable$special$$inlined$flatMapLatest$2.class */
public final class ResolveAndPlayPlayable$special$$inlined$flatMapLatest$2<InnerPlayer> extends SuspendLambda implements Function3<FlowCollector<? super Duration>, ResolveAndPlayPlayable.c<? extends InnerPlayer>, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;
    final ResolveAndPlayPlayable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolveAndPlayPlayable$special$$inlined$flatMapLatest$2(Continuation continuation, ResolveAndPlayPlayable resolveAndPlayPlayable) {
        super(3, continuation);
        this.this$0 = resolveAndPlayPlayable;
    }

    public final Object invoke(FlowCollector<? super Duration> flowCollector, ResolveAndPlayPlayable.c<? extends InnerPlayer> cVar, Continuation<? super Unit> continuation) {
        ResolveAndPlayPlayable$special$$inlined$flatMapLatest$2 resolveAndPlayPlayable$special$$inlined$flatMapLatest$2 = new ResolveAndPlayPlayable$special$$inlined$flatMapLatest$2(continuation, this.this$0);
        resolveAndPlayPlayable$special$$inlined$flatMapLatest$2.L$0 = flowCollector;
        resolveAndPlayPlayable$special$$inlined$flatMapLatest$2.L$1 = cVar;
        return resolveAndPlayPlayable$special$$inlined$flatMapLatest$2.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            ResolveAndPlayPlayable.c cVar = (ResolveAndPlayPlayable.c) this.L$1;
            Flow<Duration> flowJ = cVar instanceof ResolveAndPlayPlayable.c.C0510c ? ((ResolveAndPlayPlayable.c.C0510c) cVar).f79314a.J() : this.this$0.f79304c;
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowJ, this) == coroutine_suspended) {
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
