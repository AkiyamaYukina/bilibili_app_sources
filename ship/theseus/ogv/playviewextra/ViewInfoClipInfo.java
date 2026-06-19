package com.bilibili.ship.theseus.ogv.playviewextra;

import B0.b;
import G0.d;
import RQ.l;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.pgc.gateway.player.v2.ClipType;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogv.infra.gson.DurationFromMillisTypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playviewextra/ViewInfoClipInfo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class ViewInfoClipInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f94377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @JsonAdapter(DurationFromMillisTypeAdapter.class)
    public final long f94378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @JsonAdapter(DurationFromMillisTypeAdapter.class)
    public final long f94379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ClipType f94380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f94381e;

    public ViewInfoClipInfo(long j7, long j8, long j9, ClipType clipType, String str) {
        this.f94377a = j7;
        this.f94378b = j8;
        this.f94379c = j9;
        this.f94380d = clipType;
        this.f94381e = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewInfoClipInfo)) {
            return false;
        }
        ViewInfoClipInfo viewInfoClipInfo = (ViewInfoClipInfo) obj;
        return this.f94377a == viewInfoClipInfo.f94377a && Duration.equals-impl0(this.f94378b, viewInfoClipInfo.f94378b) && Duration.equals-impl0(this.f94379c, viewInfoClipInfo.f94379c) && this.f94380d == viewInfoClipInfo.f94380d && Intrinsics.areEqual(this.f94381e, viewInfoClipInfo.f94381e);
    }

    public final int hashCode() {
        int iA = l.a(l.a(Long.hashCode(this.f94377a) * 31, 31, this.f94378b), 31, this.f94379c);
        int iHashCode = this.f94380d.hashCode();
        String str = this.f94381e;
        return ((iHashCode + iA) * 31) + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        String str = Duration.toString-impl(this.f94378b);
        String str2 = Duration.toString-impl(this.f94379c);
        StringBuilder sb = new StringBuilder("ViewInfoClipInfo(materialNumber=");
        d.a(this.f94377a, ", start=", str, sb);
        b.b(", end=", str2, ", clipType=", sb);
        sb.append(this.f94380d);
        sb.append(", toastText=");
        return C8770a.a(sb, this.f94381e, ")");
    }
}
