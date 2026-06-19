package com.bilibili.pegasus.recommendlabel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelViewModel.class */
@StabilityInferred(parameters = 0)
public final class RecommendLabelViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final l0 f78648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<f0> f78649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<InterfaceC5755y> f78650c;

    public RecommendLabelViewModel() {
        l0 l0Var = new l0();
        this.f78648a = l0Var;
        this.f78649b = FlowKt.asStateFlow(l0Var.f78757a);
        this.f78650c = l0Var.f78758b;
    }

    public final void I0(@NotNull InterfaceC5739h interfaceC5739h) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new RecommendLabelViewModel$handleAction$1(this, interfaceC5739h, null), 3, (Object) null);
    }
}
