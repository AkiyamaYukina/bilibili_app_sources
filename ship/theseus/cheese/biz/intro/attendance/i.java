package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/i.class */
@StabilityInferred(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<h> f89319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<h> f89320b;

    @Inject
    public i() {
        MutableStateFlow<h> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f89319a = MutableStateFlow;
        this.f89320b = FlowKt.asStateFlow(MutableStateFlow);
    }

    @NotNull
    public final Map<String, String> a() {
        h hVar = (h) this.f89319a.getValue();
        return hVar == null ? MapsKt.emptyMap() : MapsKt.mapOf(new Pair[]{TuplesKt.to("cha_id", String.valueOf(hVar.f89317j)), TuplesKt.to("cha_status", String.valueOf(hVar.f89318k))});
    }
}
