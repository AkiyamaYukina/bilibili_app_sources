package com.bilibili.ship.theseus.ugc.cachevideo;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlin.Unit;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/cachevideo/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f96363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f96364b;

    @Inject
    public b(@NotNull Context context) {
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_LATEST, 1, (Object) null);
        this.f96363a = mutableSharedFlowMutableSharedFlow$default;
        this.f96364b = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }
}
