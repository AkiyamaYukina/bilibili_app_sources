package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.playercore.FlattenedPCSFacade;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$masterPieceProgress$1$special$$inlined$flatMapLatest$1.class */
public final class FlattenedPCSFacade$masterPieceProgress$1$special$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super Duration>, FlattenedPCSFacade.c, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;
    final FlattenedPCSFacade this$0;
    final FlattenedPCSFacade$masterPieceProgress$1 this$1$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlattenedPCSFacade$masterPieceProgress$1$special$$inlined$flatMapLatest$1(Continuation continuation, FlattenedPCSFacade flattenedPCSFacade, FlattenedPCSFacade$masterPieceProgress$1 flattenedPCSFacade$masterPieceProgress$1) {
        super(3, continuation);
        this.this$0 = flattenedPCSFacade;
        this.this$1$inlined = flattenedPCSFacade$masterPieceProgress$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((FlowCollector<? super Duration>) obj, (FlattenedPCSFacade.c) obj2, (Continuation<? super Unit>) obj3);
    }

    public final Object invoke(FlowCollector<? super Duration> flowCollector, FlattenedPCSFacade.c cVar, Continuation<? super Unit> continuation) {
        FlattenedPCSFacade$masterPieceProgress$1$special$$inlined$flatMapLatest$1 flattenedPCSFacade$masterPieceProgress$1$special$$inlined$flatMapLatest$1 = new FlattenedPCSFacade$masterPieceProgress$1$special$$inlined$flatMapLatest$1(continuation, this.this$0, this.this$1$inlined);
        flattenedPCSFacade$masterPieceProgress$1$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
        flattenedPCSFacade$masterPieceProgress$1$special$$inlined$flatMapLatest$1.L$1 = cVar;
        return flattenedPCSFacade$masterPieceProgress$1$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            FlattenedPCSFacade.c cVar = (FlattenedPCSFacade.c) this.L$1;
            int i8 = cVar.f79380a;
            int i9 = this.this$0.f79357f;
            Flow<Duration> flowFlowOf = i8 < i9 ? FlowKt.flowOf(Duration.box-impl(Duration.Companion.getZERO-UwyO8pc())) : i8 == i9 ? cVar.f79381b.J() : FlowKt.flowOf(this.this$1$inlined.q());
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
