package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlin.Pair;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/Z.class */
@StabilityInferred(parameters = 0)
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Pair<Integer, Integer>> f101085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Pair<Integer, Integer>> f101086b;

    @Inject
    public Z() {
        MutableSharedFlow<Pair<Integer, Integer>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, (Object) null);
        this.f101085a = mutableSharedFlowMutableSharedFlow$default;
        this.f101086b = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }
}
