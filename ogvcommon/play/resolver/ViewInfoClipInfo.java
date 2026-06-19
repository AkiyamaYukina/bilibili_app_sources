package com.bilibili.ogvcommon.play.resolver;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/ViewInfoClipInfo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class ViewInfoClipInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f73228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @JsonAdapter(DurationFromMillisTypeAdapter.class)
    public final long f73229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @JsonAdapter(DurationFromMillisTypeAdapter.class)
    public final long f73230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ClipType f73231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f73232e;

    public ViewInfoClipInfo(long j7, long j8, long j9, ClipType clipType, String str) {
        this.f73228a = j7;
        this.f73229b = j8;
        this.f73230c = j9;
        this.f73231d = clipType;
        this.f73232e = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewInfoClipInfo)) {
            return false;
        }
        ViewInfoClipInfo viewInfoClipInfo = (ViewInfoClipInfo) obj;
        return this.f73228a == viewInfoClipInfo.f73228a && Duration.equals-impl0(this.f73229b, viewInfoClipInfo.f73229b) && Duration.equals-impl0(this.f73230c, viewInfoClipInfo.f73230c) && this.f73231d == viewInfoClipInfo.f73231d && Intrinsics.areEqual(this.f73232e, viewInfoClipInfo.f73232e);
    }

    public final int hashCode() {
        int iA = l.a(l.a(Long.hashCode(this.f73228a) * 31, 31, this.f73229b), 31, this.f73230c);
        int iHashCode = this.f73231d.hashCode();
        String str = this.f73232e;
        return ((iHashCode + iA) * 31) + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        String str = Duration.toString-impl(this.f73229b);
        String str2 = Duration.toString-impl(this.f73230c);
        StringBuilder sb = new StringBuilder("ViewInfoClipInfo(materialNumber=");
        G0.d.a(this.f73228a, ", start=", str, sb);
        B0.b.b(", end=", str2, ", clipType=", sb);
        sb.append(this.f73231d);
        sb.append(", toastText=");
        return C8770a.a(sb, this.f73232e, ")");
    }
}
