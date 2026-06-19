package com.bilibili.ship.theseus.ogv.operation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/OperationImageVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OperationImageVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f94097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("event_ids")
    @Nullable
    private final OperationReportEvents f94098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("track_params")
    @NotNull
    private final Map<String, String> f94099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f94100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final OgvClickTarget f94101e;

    public OperationImageVo() {
        throw null;
    }

    public OperationImageVo(String str, OperationReportEvents operationReportEvents, Map map, Map map2, OgvClickTarget ogvClickTarget, int i7) {
        operationReportEvents = (i7 & 2) != 0 ? null : operationReportEvents;
        map = (i7 & 4) != 0 ? MapsKt.emptyMap() : map;
        map2 = (i7 & 8) != 0 ? MapsKt.emptyMap() : map2;
        ogvClickTarget = (i7 & 16) != 0 ? null : ogvClickTarget;
        this.f94097a = str;
        this.f94098b = operationReportEvents;
        this.f94099c = map;
        this.f94100d = map2;
        this.f94101e = ogvClickTarget;
    }

    @Nullable
    public final OperationReportEvents a() {
        return this.f94098b;
    }

    @NotNull
    public final Map<String, String> b() {
        return this.f94099c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OperationImageVo)) {
            return false;
        }
        OperationImageVo operationImageVo = (OperationImageVo) obj;
        return Intrinsics.areEqual(this.f94097a, operationImageVo.f94097a) && Intrinsics.areEqual(this.f94098b, operationImageVo.f94098b) && Intrinsics.areEqual(this.f94099c, operationImageVo.f94099c) && Intrinsics.areEqual(this.f94100d, operationImageVo.f94100d) && Intrinsics.areEqual(this.f94101e, operationImageVo.f94101e);
    }

    public final int hashCode() {
        int iHashCode = this.f94097a.hashCode();
        OperationReportEvents operationReportEvents = this.f94098b;
        int iA = J2.g.a(J2.g.a(((iHashCode * 31) + (operationReportEvents == null ? 0 : operationReportEvents.hashCode())) * 31, this.f94099c, 31), this.f94100d, 31);
        OgvClickTarget ogvClickTarget = this.f94101e;
        return iA + (ogvClickTarget == null ? 0 : ogvClickTarget.hashCode());
    }

    @NotNull
    public final String toString() {
        return "OperationImageVo(url=" + this.f94097a + ", eventIds=" + this.f94098b + ", reportParams=" + this.f94099c + ", extraParams=" + this.f94100d + ", clickTarget=" + this.f94101e + ")";
    }
}
