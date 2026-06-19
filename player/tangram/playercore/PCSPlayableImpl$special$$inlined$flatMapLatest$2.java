package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.basic.ResolveAndPlayPlayable;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImpl$special$$inlined$flatMapLatest$2.class */
public final class PCSPlayableImpl$special$$inlined$flatMapLatest$2 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends com.bilibili.player.tangram.basic.a>>, ResolveAndPlayPlayable.c<? extends InterfaceC5778f>, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;

    public PCSPlayableImpl$special$$inlined$flatMapLatest$2(Continuation continuation) {
        super(3, continuation);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((FlowCollector<? super List<? extends com.bilibili.player.tangram.basic.a>>) obj, (ResolveAndPlayPlayable.c<? extends InterfaceC5778f>) obj2, (Continuation<? super Unit>) obj3);
    }

    public final Object invoke(FlowCollector<? super List<? extends com.bilibili.player.tangram.basic.a>> flowCollector, ResolveAndPlayPlayable.c<? extends InterfaceC5778f> cVar, Continuation<? super Unit> continuation) {
        PCSPlayableImpl$special$$inlined$flatMapLatest$2 pCSPlayableImpl$special$$inlined$flatMapLatest$2 = new PCSPlayableImpl$special$$inlined$flatMapLatest$2(continuation);
        pCSPlayableImpl$special$$inlined$flatMapLatest$2.L$0 = flowCollector;
        pCSPlayableImpl$special$$inlined$flatMapLatest$2.L$1 = cVar;
        return pCSPlayableImpl$special$$inlined$flatMapLatest$2.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            ResolveAndPlayPlayable.c cVar = (ResolveAndPlayPlayable.c) this.L$1;
            Flow<List<com.bilibili.player.tangram.basic.a>> flowT = cVar instanceof ResolveAndPlayPlayable.c.C0510c ? ((InterfaceC5778f) ((ResolveAndPlayPlayable.c.C0510c) cVar).f79314a).t() : FlowKt.emptyFlow();
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowT, this) == coroutine_suspended) {
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
