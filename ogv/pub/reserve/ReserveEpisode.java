package com.bilibili.ogv.pub.reserve;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/ReserveEpisode.class */
@Bson
public final class ReserveEpisode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("aid")
    private final long f71628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f71629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f71630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f71631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f71632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f71633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f71634g;

    @NotNull
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Dimension f71635i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f71636j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f71637k;

    public ReserveEpisode(long j7, @NotNull String str, long j8, @NotNull String str2, int i7, int i8, @NotNull String str3, @NotNull String str4, @Nullable Dimension dimension, @NotNull String str5, @NotNull String str6) {
        this.f71628a = j7;
        this.f71629b = str;
        this.f71630c = j8;
        this.f71631d = str2;
        this.f71632e = i7;
        this.f71633f = i8;
        this.f71634g = str3;
        this.h = str4;
        this.f71635i = dimension;
        this.f71636j = str5;
        this.f71637k = str6;
    }

    public final long a() {
        return this.f71628a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReserveEpisode)) {
            return false;
        }
        ReserveEpisode reserveEpisode = (ReserveEpisode) obj;
        return this.f71628a == reserveEpisode.f71628a && Intrinsics.areEqual(this.f71629b, reserveEpisode.f71629b) && this.f71630c == reserveEpisode.f71630c && Intrinsics.areEqual(this.f71631d, reserveEpisode.f71631d) && this.f71632e == reserveEpisode.f71632e && this.f71633f == reserveEpisode.f71633f && Intrinsics.areEqual(this.f71634g, reserveEpisode.f71634g) && Intrinsics.areEqual(this.h, reserveEpisode.h) && Intrinsics.areEqual(this.f71635i, reserveEpisode.f71635i) && Intrinsics.areEqual(this.f71636j, reserveEpisode.f71636j) && Intrinsics.areEqual(this.f71637k, reserveEpisode.f71637k);
    }

    public final int hashCode() {
        int iA = E.a(E.a(I.a(this.f71633f, I.a(this.f71632e, E.a(C3554n0.a(E.a(Long.hashCode(this.f71628a) * 31, 31, this.f71629b), 31, this.f71630c), 31, this.f71631d), 31), 31), 31, this.f71634g), 31, this.h);
        Dimension dimension = this.f71635i;
        return this.f71637k.hashCode() + E.a((iA + (dimension == null ? 0 : dimension.hashCode())) * 31, 31, this.f71636j);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbA = n.a(this.f71628a, "ReserveEpisode(avid=", ", cover=", this.f71629b);
        sbA.append(", cid=");
        sbA.append(this.f71630c);
        sbA.append(", title=");
        sbA.append(this.f71631d);
        sbA.append(", epIndex=");
        sbA.append(this.f71632e);
        sbA.append(", sectionIndex=");
        sbA.append(this.f71633f);
        sbA.append(", longTitle=");
        sbA.append(this.f71634g);
        sbA.append(", from=");
        sbA.append(this.h);
        sbA.append(", dimension=");
        sbA.append(this.f71635i);
        sbA.append(", link=");
        sbA.append(this.f71636j);
        sbA.append(", bvid=");
        return C8770a.a(sbA, this.f71637k, ")");
    }
}
