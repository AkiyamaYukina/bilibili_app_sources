package com.bilibili.ship.theseus.united.page.weblayer;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<g> f104249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SharedFlow<g> f104250b;

    @Inject
    public e() {
        MutableSharedFlow<g> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, (Object) null);
        this.f104249a = mutableSharedFlowMutableSharedFlow$default;
        this.f104250b = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }
}
