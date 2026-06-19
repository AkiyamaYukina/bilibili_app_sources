package com.bilibili.ship.theseus.united.page.toolbar;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.toolbar.MenuService;
import javax.inject.Inject;
import kotlin.Unit;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/j.class */
@StabilityInferred(parameters = 0)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f103397a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f103398b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public MenuService.a f103399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f103400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f103401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f103402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f103403g;

    @NotNull
    public final MutableSharedFlow<Unit> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f103404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Long> f103405j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Long> f103406k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f103407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f103408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f103409n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f103410o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f103411p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f103412q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f103413r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f103414s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f103415t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f103416u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f103417v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f103418w;

    @Inject
    public j() {
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f103400d = mutableSharedFlowMutableSharedFlow$default;
        this.f103401e = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f103402f = mutableSharedFlowMutableSharedFlow$default2;
        this.f103403g = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.h = mutableSharedFlowMutableSharedFlow$default3;
        this.f103404i = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableStateFlow<Long> MutableStateFlow = StateFlowKt.MutableStateFlow(0L);
        this.f103405j = MutableStateFlow;
        this.f103406k = FlowKt.asSharedFlow(MutableStateFlow);
        BufferOverflow bufferOverflow2 = BufferOverflow.DROP_LATEST;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow2, 1, (Object) null);
        this.f103407l = mutableSharedFlowMutableSharedFlow$default4;
        this.f103408m = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow2, 1, (Object) null);
        this.f103409n = mutableSharedFlowMutableSharedFlow$default5;
        this.f103410o = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow2, 1, (Object) null);
        this.f103411p = mutableSharedFlowMutableSharedFlow$default6;
        this.f103412q = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow2, 1, (Object) null);
        this.f103413r = mutableSharedFlowMutableSharedFlow$default7;
        this.f103414s = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default7);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default8 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow2, 1, (Object) null);
        this.f103415t = mutableSharedFlowMutableSharedFlow$default8;
        this.f103416u = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default8);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default9 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow2, 1, (Object) null);
        this.f103417v = mutableSharedFlowMutableSharedFlow$default9;
        this.f103418w = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default9);
    }
}
