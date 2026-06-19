package com.bilibili.studio.material;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialTask$progress$$inlined$flatMapLatest$1.class */
public final class MaterialTask$progress$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super i>, Integer, Continuation<? super Unit>, Object> {
    final boolean $ensureLast$inlined;
    final long $interval$inlined;
    private Object L$0;
    Object L$1;
    int label;
    final MaterialTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTask$progress$$inlined$flatMapLatest$1(Continuation continuation, MaterialTask materialTask, boolean z6, long j7) {
        super(3, continuation);
        this.this$0 = materialTask;
        this.$ensureLast$inlined = z6;
        this.$interval$inlined = j7;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((FlowCollector<? super i>) obj, (Integer) obj2, (Continuation<? super Unit>) obj3);
    }

    public final Object invoke(FlowCollector<? super i> flowCollector, Integer num, Continuation<? super Unit> continuation) {
        MaterialTask$progress$$inlined$flatMapLatest$1 materialTask$progress$$inlined$flatMapLatest$1 = new MaterialTask$progress$$inlined$flatMapLatest$1(continuation, this.this$0, this.$ensureLast$inlined, this.$interval$inlined);
        materialTask$progress$$inlined$flatMapLatest$1.L$0 = flowCollector;
        materialTask$progress$$inlined$flatMapLatest$1.L$1 = num;
        return materialTask$progress$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            ((Number) this.L$1).intValue();
            Flow flowChannelFlow = FlowKt.channelFlow(new MaterialTask$progress$1$1(this.this$0, new Ref.BooleanRef(), this.$ensureLast$inlined, this.$interval$inlined, null));
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowChannelFlow, this) == coroutine_suspended) {
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
