package com.bilibili.tensorflow.utils;

import com.bilibili.lib.neuron.internal.model.NeuronEvent;
import ed0.f;
import ed0.g;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/utils/CoroutineUtilsKt.class */
public final class CoroutineUtilsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableSharedFlow<NeuronEvent> f110812a;

    static {
        final MutableSharedFlow<NeuronEvent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);
        f fVarB = f.b();
        g gVar = new g(mutableSharedFlowMutableSharedFlow$default) { // from class: com.bilibili.tensorflow.utils.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableSharedFlow f110813a;

            {
                this.f110813a = mutableSharedFlowMutableSharedFlow$default;
            }

            public final void a(NeuronEvent neuronEvent) {
                BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new CoroutineUtilsKt$flow$1$1$1(this.f110813a, neuronEvent, null), 3, (Object) null);
            }
        };
        if (!((CopyOnWriteArrayList) fVarB.e).contains(gVar)) {
            ((CopyOnWriteArrayList) fVarB.e).add(gVar);
        }
        f110812a = mutableSharedFlowMutableSharedFlow$default;
    }
}
