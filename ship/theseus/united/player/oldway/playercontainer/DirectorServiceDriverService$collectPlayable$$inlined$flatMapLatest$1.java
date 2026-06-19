package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/DirectorServiceDriverService$collectPlayable$$inlined$flatMapLatest$1.class */
public final class DirectorServiceDriverService$collectPlayable$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super Pair<? extends com.bilibili.ship.theseus.keel.player.j, ? extends StateFlow<? extends GeminiCommonPlayableParams>>>, com.bilibili.ship.theseus.keel.player.j, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;
    final DirectorServiceDriverService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectorServiceDriverService$collectPlayable$$inlined$flatMapLatest$1(Continuation continuation, DirectorServiceDriverService directorServiceDriverService) {
        super(3, continuation);
        this.this$0 = directorServiceDriverService;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((FlowCollector<? super Pair<? extends com.bilibili.ship.theseus.keel.player.j, ? extends StateFlow<? extends GeminiCommonPlayableParams>>>) obj, (com.bilibili.ship.theseus.keel.player.j) obj2, (Continuation<? super Unit>) obj3);
    }

    public final Object invoke(FlowCollector<? super Pair<? extends com.bilibili.ship.theseus.keel.player.j, ? extends StateFlow<? extends GeminiCommonPlayableParams>>> flowCollector, com.bilibili.ship.theseus.keel.player.j jVar, Continuation<? super Unit> continuation) {
        DirectorServiceDriverService$collectPlayable$$inlined$flatMapLatest$1 directorServiceDriverService$collectPlayable$$inlined$flatMapLatest$1 = new DirectorServiceDriverService$collectPlayable$$inlined$flatMapLatest$1(continuation, this.this$0);
        directorServiceDriverService$collectPlayable$$inlined$flatMapLatest$1.L$0 = flowCollector;
        directorServiceDriverService$collectPlayable$$inlined$flatMapLatest$1.L$1 = jVar;
        return directorServiceDriverService$collectPlayable$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Flow flowFlowOf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            com.bilibili.ship.theseus.keel.player.j jVar = (com.bilibili.ship.theseus.keel.player.j) this.L$1;
            if (jVar == null) {
                flowFlowOf = FlowKt.flowOf((Object) null);
            } else if (jVar.f().getInteract() != null) {
                FlowKt.flowOf(TuplesKt.to(jVar, StateFlowKt.MutableStateFlow(jVar.f())));
                flowFlowOf = FlowKt.flow(new DirectorServiceDriverService$collectPlayable$lambda$0$$inlined$transform$1(jVar.l(), null, this.this$0, jVar));
            } else {
                flowFlowOf = FlowKt.flowOf(TuplesKt.to(jVar, jVar.l()));
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
