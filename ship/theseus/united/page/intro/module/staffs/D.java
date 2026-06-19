package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.send.VideoDetailStateChange;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/D.class */
@StabilityInferred(parameters = 0)
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f101763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<C6369f> f101764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<VideoDetailStateChange.Request> f101765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<VideoDetailStateChange.Request> f101766d;

    @Inject
    public D(@NotNull CoroutineScope coroutineScope, @NotNull StateFlow<C6369f> stateFlow) {
        this.f101763a = coroutineScope;
        this.f101764b = stateFlow;
        MutableStateFlow<VideoDetailStateChange.Request> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f101765c = MutableStateFlow;
        this.f101766d = FlowKt.asStateFlow(MutableStateFlow);
    }
}
