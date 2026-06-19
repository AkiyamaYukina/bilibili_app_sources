package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/M.class */
@StabilityInferred(parameters = 0)
public final class M extends androidx.databinding.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f102574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f102575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PageReportService f102576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ua0.c f102577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f102578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ExposureEntry f102579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f102580g;

    @Nullable
    public TextVo h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public TextVo f102581i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public String f102582j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f102583k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f102584l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f102585m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public String f102586n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public RestrictionLayerVo.BottomDisplayVo f102587o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public RestrictionLayerVo.BottomDisplayVo f102588p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public RestrictionLayerVo.BottomDisplayVo f102589q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public RestrictionLayerVo.BottomDisplayVo f102590r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final MutableState f102591s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final MutableState f102592t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f102593u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public RestrictionLayerVo.NextPlayableVo f102594v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f102595w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public L f102596x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Duration> f102597y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final StateFlow<Duration> f102598z;

    public M(boolean z6, int i7, @NotNull PageReportService pageReportService) {
        this.f102574a = z6;
        this.f102575b = i7;
        this.f102576c = pageReportService;
        Boolean bool = Boolean.FALSE;
        this.f102580g = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f102591s = SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
        this.f102592t = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        Duration.Companion companion = Duration.Companion;
        this.f102595w = companion.getZERO-UwyO8pc();
        MutableStateFlow<Duration> MutableStateFlow = StateFlowKt.MutableStateFlow(Duration.box-impl(companion.getZERO-UwyO8pc()));
        this.f102597y = MutableStateFlow;
        this.f102598z = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void m() {
        L l7 = this.f102596x;
        if (l7 != null) {
            l7.cancel();
        }
        this.f102597y.setValue(Duration.box-impl(Duration.Companion.getZERO-UwyO8pc()));
        this.f102596x = null;
    }

    @NotNull
    public final List<C6378c> n() {
        return (List) this.f102591s.getValue();
    }

    @JvmName(name = "getIsFullscreen")
    public final boolean o() {
        return this.f102580g.getValue().booleanValue();
    }
}
