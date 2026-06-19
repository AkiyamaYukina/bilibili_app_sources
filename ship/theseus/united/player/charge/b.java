package com.bilibili.ship.theseus.united.player.charge;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import vv0.p;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<p> f104415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<p> f104416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Function1<TextVo, Unit>> f104417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<Function1<TextVo, Unit>> f104418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Function1<ReportVo, Unit>> f104419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final StateFlow<Function1<ReportVo, Unit>> f104420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public d f104421g;

    /* JADX WARN: Type inference failed for: r1v9, types: [com.bilibili.ship.theseus.united.player.charge.d, java.lang.Object] */
    @Inject
    public b() {
        MutableStateFlow<p> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f104415a = MutableStateFlow;
        this.f104416b = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Function1<TextVo, Unit>> MutableStateFlow2 = StateFlowKt.MutableStateFlow((Object) null);
        this.f104417c = MutableStateFlow2;
        this.f104418d = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Function1<ReportVo, Unit>> MutableStateFlow3 = StateFlowKt.MutableStateFlow((Object) null);
        this.f104419e = MutableStateFlow3;
        this.f104420f = FlowKt.asStateFlow(MutableStateFlow3);
        this.f104421g = new Object();
    }
}
