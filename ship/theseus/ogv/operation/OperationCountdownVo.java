package com.bilibili.ship.theseus.ogv.operation;

import RQ.l;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.adapter.FirstFromListAdapter;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/OperationCountdownVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OperationCountdownVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @JsonAdapter(DurationFromMillisTypeAdapter.class)
    public final long f94089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @JsonAdapter(DurationFromMillisTypeAdapter.class)
    public final long f94090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @JsonAdapter(FirstFromListAdapter.class)
    @Nullable
    public final c f94091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("event_ids")
    @Nullable
    private final OperationReportEvents f94092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("track_params")
    @NotNull
    private final Map<String, String> f94093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f94094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final OgvClickTarget f94095g;

    public OperationCountdownVo() {
        throw null;
    }

    public OperationCountdownVo(long j7, long j8, c cVar, OperationReportEvents operationReportEvents, Map map, Map map2, OgvClickTarget ogvClickTarget, int i7) {
        cVar = (i7 & 4) != 0 ? null : cVar;
        operationReportEvents = (i7 & 8) != 0 ? null : operationReportEvents;
        map = (i7 & 16) != 0 ? MapsKt.emptyMap() : map;
        map2 = (i7 & 32) != 0 ? MapsKt.emptyMap() : map2;
        ogvClickTarget = (i7 & 64) != 0 ? null : ogvClickTarget;
        this.f94089a = j7;
        this.f94090b = j8;
        this.f94091c = cVar;
        this.f94092d = operationReportEvents;
        this.f94093e = map;
        this.f94094f = map2;
        this.f94095g = ogvClickTarget;
    }

    @Nullable
    public final OperationReportEvents a() {
        return this.f94092d;
    }

    @NotNull
    public final Map<String, String> b() {
        return this.f94093e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OperationCountdownVo)) {
            return false;
        }
        OperationCountdownVo operationCountdownVo = (OperationCountdownVo) obj;
        return Duration.equals-impl0(this.f94089a, operationCountdownVo.f94089a) && Duration.equals-impl0(this.f94090b, operationCountdownVo.f94090b) && Intrinsics.areEqual(this.f94091c, operationCountdownVo.f94091c) && Intrinsics.areEqual(this.f94092d, operationCountdownVo.f94092d) && Intrinsics.areEqual(this.f94093e, operationCountdownVo.f94093e) && Intrinsics.areEqual(this.f94094f, operationCountdownVo.f94094f) && Intrinsics.areEqual(this.f94095g, operationCountdownVo.f94095g);
    }

    public final int hashCode() {
        int iA = l.a(Duration.hashCode-impl(this.f94089a) * 31, 31, this.f94090b);
        c cVar = this.f94091c;
        int iHashCode = cVar == null ? 0 : cVar.f94119a.hashCode();
        OperationReportEvents operationReportEvents = this.f94092d;
        int iA2 = J2.g.a(J2.g.a((((iA + iHashCode) * 31) + (operationReportEvents == null ? 0 : operationReportEvents.hashCode())) * 31, this.f94093e, 31), this.f94094f, 31);
        OgvClickTarget ogvClickTarget = this.f94095g;
        return iA2 + (ogvClickTarget == null ? 0 : ogvClickTarget.hashCode());
    }

    @NotNull
    public final String toString() {
        String str = Duration.toString-impl(this.f94089a);
        String str2 = Duration.toString-impl(this.f94090b);
        OperationReportEvents operationReportEvents = this.f94092d;
        Map<String, String> map = this.f94093e;
        Map<String, String> map2 = this.f94094f;
        StringBuilder sbA = G0.b.a("OperationCountdownVo(countdownCost=", str, ", countdownDuration=", str2, ", textColor=");
        sbA.append(this.f94091c);
        sbA.append(", eventIds=");
        sbA.append(operationReportEvents);
        sbA.append(", reportParams=");
        sbA.append(map);
        sbA.append(", extraParams=");
        sbA.append(map2);
        sbA.append(", clickTarget=");
        sbA.append(this.f94095g);
        sbA.append(")");
        return sbA.toString();
    }
}
