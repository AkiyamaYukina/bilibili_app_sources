package com.bilibili.ship.theseus.cheese.biz.bottomcontainer;

import androidx.compose.runtime.internal.StabilityInferred;
import eu0.C7001t;
import eu0.C7002u;
import javax.inject.Inject;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/i.class */
@StabilityInferred(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f89088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f89089b;

    @Inject
    public i(@NotNull C7001t c7001t) {
        C7002u c7002u = c7001t.f117577b;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(c7002u != null ? c7002u.f117585e : false));
        this.f89088a = MutableStateFlow;
        this.f89089b = FlowKt.asStateFlow(MutableStateFlow);
    }
}
