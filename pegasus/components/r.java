package com.bilibili.pegasus.components;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/r.class */
@StabilityInferred(parameters = 0)
public final class r extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f77124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f77125b;

    public r() {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.f77124a = MutableStateFlow;
        this.f77125b = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void I0() {
        MutableStateFlow<Boolean> mutableStateFlow = this.f77124a;
        if (((Boolean) mutableStateFlow.getValue()).booleanValue()) {
            return;
        }
        mutableStateFlow.setValue(Boolean.TRUE);
    }
}
