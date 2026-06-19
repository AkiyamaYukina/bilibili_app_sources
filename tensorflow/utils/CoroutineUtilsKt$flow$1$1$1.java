package com.bilibili.tensorflow.utils;

import com.bilibili.lib.neuron.internal.model.NeuronEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/utils/CoroutineUtilsKt$flow$1$1$1.class */
public final class CoroutineUtilsKt$flow$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final NeuronEvent $it;
    final MutableSharedFlow<NeuronEvent> $this_apply;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineUtilsKt$flow$1$1$1(MutableSharedFlow<NeuronEvent> mutableSharedFlow, NeuronEvent neuronEvent, Continuation<? super CoroutineUtilsKt$flow$1$1$1> continuation) {
        super(2, continuation);
        this.$this_apply = mutableSharedFlow;
        this.$it = neuronEvent;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoroutineUtilsKt$flow$1$1$1(this.$this_apply, this.$it, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<NeuronEvent> mutableSharedFlow = this.$this_apply;
            NeuronEvent neuronEvent = this.$it;
            this.label = 1;
            if (mutableSharedFlow.emit(neuronEvent, this) == coroutine_suspended) {
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
