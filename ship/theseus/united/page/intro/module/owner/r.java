package com.bilibili.ship.theseus.united.page.intro.module.owner;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlin.Unit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/r.class */
@StabilityInferred(parameters = 0)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f100671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f100672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f100673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Boolean> f100674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Boolean> f100675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<com.bilibili.playerbizcommonv2.utils.i> f100676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final SharedFlow<com.bilibili.playerbizcommonv2.utils.i> f100677g;

    @NotNull
    public final MutableSharedFlow<com.bilibili.playerbizcommonv2.utils.i> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final SharedFlow<com.bilibili.playerbizcommonv2.utils.i> f100678i;

    @Inject
    public r(@NotNull CoroutineScope coroutineScope) {
        this.f100671a = coroutineScope;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_LATEST;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f100672b = mutableSharedFlowMutableSharedFlow$default;
        this.f100673c = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f100674d = mutableSharedFlowMutableSharedFlow$default2;
        this.f100675e = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<com.bilibili.playerbizcommonv2.utils.i> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f100676f = mutableSharedFlowMutableSharedFlow$default3;
        this.f100677g = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<com.bilibili.playerbizcommonv2.utils.i> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.h = mutableSharedFlowMutableSharedFlow$default4;
        this.f100678i = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
    }
}
