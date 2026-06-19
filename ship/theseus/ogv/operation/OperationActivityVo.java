package com.bilibili.ship.theseus.ogv.operation;

import RQ.l;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogv.infra.gson.DurationFromMillisTypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/OperationActivityVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OperationActivityVo implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f94061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final UIStyle f94062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("show_choice")
    @NotNull
    private final ShowTime f94063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @JsonAdapter(DurationFromMillisTypeAdapter.class)
    public final long f94064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final OperationTextVo f94065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final OperationTextVo f94066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final OperationCountdownVo f94067g;

    @Nullable
    public final OperationTextVo h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final OperationTextVo f94068i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final OperationImageVo f94069j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final OperationImageVo f94070k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final OperationTextVo f94071l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SerializedName("event_ids")
    @Nullable
    private final OperationReportEvents f94072m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SerializedName("track_params")
    @NotNull
    private final Map<String, String> f94073n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f94074o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final OgvClickTarget f94075p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public transient boolean f94076q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public transient boolean f94077r;

    public OperationActivityVo() {
        throw null;
    }

    public OperationActivityVo(String str, UIStyle uIStyle, ShowTime showTime, long j7, OperationTextVo operationTextVo, OperationTextVo operationTextVo2, OperationCountdownVo operationCountdownVo, OperationTextVo operationTextVo3, OperationTextVo operationTextVo4, OperationImageVo operationImageVo, OperationImageVo operationImageVo2, OperationTextVo operationTextVo5, OperationReportEvents operationReportEvents, Map map, Map map2, OgvClickTarget ogvClickTarget, int i7) {
        uIStyle = (i7 & 2) != 0 ? UIStyle.BAR_ICON : uIStyle;
        showTime = (i7 & 4) != 0 ? ShowTime.INTO_VIEW_PAGE : showTime;
        j7 = (i7 & 8) != 0 ? Duration.Companion.getZERO-UwyO8pc() : j7;
        map = (i7 & 8192) != 0 ? MapsKt.emptyMap() : map;
        map2 = (i7 & 16384) != 0 ? MapsKt.emptyMap() : map2;
        this.f94061a = str;
        this.f94062b = uIStyle;
        this.f94063c = showTime;
        this.f94064d = j7;
        this.f94065e = operationTextVo;
        this.f94066f = operationTextVo2;
        this.f94067g = operationCountdownVo;
        this.h = operationTextVo3;
        this.f94068i = operationTextVo4;
        this.f94069j = operationImageVo;
        this.f94070k = operationImageVo2;
        this.f94071l = operationTextVo5;
        this.f94072m = operationReportEvents;
        this.f94073n = map;
        this.f94074o = map2;
        this.f94075p = ogvClickTarget;
    }

    @Override // com.bilibili.ship.theseus.ogv.operation.d
    public final void a() {
        this.f94077r = true;
    }

    @Override // com.bilibili.ship.theseus.ogv.operation.d
    public final boolean b() {
        return this.f94077r;
    }

    @Nullable
    public final OperationReportEvents c() {
        return this.f94072m;
    }

    @NotNull
    public final Map<String, String> d() {
        return this.f94073n;
    }

    @NotNull
    public final ShowTime e() {
        return this.f94063c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OperationActivityVo)) {
            return false;
        }
        OperationActivityVo operationActivityVo = (OperationActivityVo) obj;
        return Intrinsics.areEqual(this.f94061a, operationActivityVo.f94061a) && this.f94062b == operationActivityVo.f94062b && this.f94063c == operationActivityVo.f94063c && Duration.equals-impl0(this.f94064d, operationActivityVo.f94064d) && Intrinsics.areEqual(this.f94065e, operationActivityVo.f94065e) && Intrinsics.areEqual(this.f94066f, operationActivityVo.f94066f) && Intrinsics.areEqual(this.f94067g, operationActivityVo.f94067g) && Intrinsics.areEqual(this.h, operationActivityVo.h) && Intrinsics.areEqual(this.f94068i, operationActivityVo.f94068i) && Intrinsics.areEqual(this.f94069j, operationActivityVo.f94069j) && Intrinsics.areEqual(this.f94070k, operationActivityVo.f94070k) && Intrinsics.areEqual(this.f94071l, operationActivityVo.f94071l) && Intrinsics.areEqual(this.f94072m, operationActivityVo.f94072m) && Intrinsics.areEqual(this.f94073n, operationActivityVo.f94073n) && Intrinsics.areEqual(this.f94074o, operationActivityVo.f94074o) && Intrinsics.areEqual(this.f94075p, operationActivityVo.f94075p);
    }

    @Override // com.bilibili.ship.theseus.ogv.operation.d
    @NotNull
    public final Map<String, String> getParams() {
        return this.f94073n;
    }

    @Override // com.bilibili.ship.theseus.ogv.operation.d
    @Nullable
    public final String getShowEventId() {
        OperationReportEvents operationReportEvents = this.f94072m;
        return operationReportEvents != null ? operationReportEvents.f94103a : null;
    }

    public final int hashCode() {
        int iA = l.a((this.f94063c.hashCode() + ((this.f94062b.hashCode() + (this.f94061a.hashCode() * 31)) * 31)) * 31, 31, this.f94064d);
        OperationTextVo operationTextVo = this.f94065e;
        int iHashCode = operationTextVo == null ? 0 : operationTextVo.hashCode();
        OperationTextVo operationTextVo2 = this.f94066f;
        int iHashCode2 = operationTextVo2 == null ? 0 : operationTextVo2.hashCode();
        OperationCountdownVo operationCountdownVo = this.f94067g;
        int iHashCode3 = operationCountdownVo == null ? 0 : operationCountdownVo.hashCode();
        OperationTextVo operationTextVo3 = this.h;
        int iHashCode4 = operationTextVo3 == null ? 0 : operationTextVo3.hashCode();
        OperationTextVo operationTextVo4 = this.f94068i;
        int iHashCode5 = operationTextVo4 == null ? 0 : operationTextVo4.hashCode();
        OperationImageVo operationImageVo = this.f94069j;
        int iHashCode6 = operationImageVo == null ? 0 : operationImageVo.hashCode();
        OperationImageVo operationImageVo2 = this.f94070k;
        int iHashCode7 = operationImageVo2 == null ? 0 : operationImageVo2.hashCode();
        OperationTextVo operationTextVo5 = this.f94071l;
        int iHashCode8 = operationTextVo5 == null ? 0 : operationTextVo5.hashCode();
        OperationReportEvents operationReportEvents = this.f94072m;
        int iA2 = J2.g.a(J2.g.a((((((((((((((((((iA + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (operationReportEvents == null ? 0 : operationReportEvents.hashCode())) * 31, this.f94073n, 31), this.f94074o, 31);
        OgvClickTarget ogvClickTarget = this.f94075p;
        return iA2 + (ogvClickTarget == null ? 0 : ogvClickTarget.hashCode());
    }

    @NotNull
    public final String toString() {
        return "OperationActivityVo(position=" + this.f94061a + ", styleType=" + this.f94062b + ", showTime=" + this.f94063c + ", showDuration=" + Duration.toString-impl(this.f94064d) + ", title=" + this.f94065e + ", subtitle=" + this.f94066f + ", countdown=" + this.f94067g + ", button=" + this.h + ", closeButton=" + this.f94068i + ", banner=" + this.f94069j + ", icon=" + this.f94070k + ", iconTag=" + this.f94071l + ", eventIds=" + this.f94072m + ", reportParams=" + this.f94073n + ", extraParams=" + this.f94074o + ", clickTarget=" + this.f94075p + ")";
    }
}
