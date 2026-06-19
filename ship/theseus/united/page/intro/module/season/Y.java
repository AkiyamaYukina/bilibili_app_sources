package com.bilibili.ship.theseus.united.page.intro.module.season;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/Y.class */
@StabilityInferred(parameters = 0)
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f101640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f101641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final tv.danmaku.bili.widget.preference.a f101642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f101643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f101644e;

    @Inject
    public Y() {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f101640a = MutableStateFlow;
        this.f101641b = FlowKt.asStateFlow(MutableStateFlow);
        tv.danmaku.bili.widget.preference.a aVar = new tv.danmaku.bili.widget.preference.a(0);
        this.f101642c = aVar;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.valueOf(aVar.a.getBoolean("sp_user_last_operate_favorite", false)));
        this.f101643d = MutableStateFlow2;
        this.f101644e = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final boolean a() {
        return ((Boolean) this.f101640a.getValue()).booleanValue();
    }

    public final void b(boolean z6) {
        this.f101640a.setValue(Boolean.valueOf(z6));
    }
}
