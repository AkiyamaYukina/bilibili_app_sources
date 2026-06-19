package com.bilibili.ship.theseus.ogv.season;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogv.pub.season.a;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/OgvSeasonInfo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OgvSeasonInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f94481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f94482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("show_season_type")
    @NotNull
    private final a f94483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final OgvSeasonRights f94484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f94485e;

    public OgvSeasonInfo(long j7, @NotNull a aVar, @NotNull a aVar2, @NotNull OgvSeasonRights ogvSeasonRights, @NotNull String str) {
        this.f94481a = j7;
        this.f94482b = aVar;
        this.f94483c = aVar2;
        this.f94484d = ogvSeasonRights;
        this.f94485e = str;
    }

    @NotNull
    public final a a() {
        return this.f94483c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvSeasonInfo)) {
            return false;
        }
        OgvSeasonInfo ogvSeasonInfo = (OgvSeasonInfo) obj;
        return this.f94481a == ogvSeasonInfo.f94481a && Intrinsics.areEqual(this.f94482b, ogvSeasonInfo.f94482b) && Intrinsics.areEqual(this.f94483c, ogvSeasonInfo.f94483c) && Intrinsics.areEqual(this.f94484d, ogvSeasonInfo.f94484d) && Intrinsics.areEqual(this.f94485e, ogvSeasonInfo.f94485e);
    }

    public final int hashCode() {
        int iA = I.a(this.f94483c.f71782a, I.a(this.f94482b.f71782a, Long.hashCode(this.f94481a) * 31, 31), 31);
        return this.f94485e.hashCode() + ((this.f94484d.hashCode() + iA) * 31);
    }

    @NotNull
    public final String toString() {
        a aVar = this.f94483c;
        StringBuilder sb = new StringBuilder("OgvSeasonInfo(seasonId=");
        sb.append(this.f94481a);
        sb.append(", seasonType=");
        sb.append(this.f94482b);
        sb.append(", displayedSeasonType=");
        sb.append(aVar);
        sb.append(", rights=");
        sb.append(this.f94484d);
        sb.append(", seasonTitle=");
        return C8770a.a(sb, this.f94485e, ")");
    }
}
