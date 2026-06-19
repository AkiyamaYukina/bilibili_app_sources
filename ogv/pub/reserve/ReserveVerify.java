package com.bilibili.ogv.pub.reserve;

import I.E;
import J1.z;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.C4277b;
import androidx.room.B;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/ReserveVerify.class */
@Bson
public final class ReserveVerify {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("id")
    private final long f71639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("cover")
    @NotNull
    private final String f71640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("title")
    @NotNull
    private final String f71641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("index")
    @NotNull
    private final String f71642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("season_title")
    @NotNull
    private final String f71643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("is_reserve")
    private final int f71644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("pub_time")
    private final long f71645g;

    @SerializedName("is_online")
    private final int h;

    public ReserveVerify() {
        this(0L, null, null, null, null, 0, 0L, 0, 255);
    }

    public ReserveVerify(long j7, String str, String str2, String str3, String str4, int i7, long j8, int i8, int i9) {
        j7 = (i9 & 1) != 0 ? 0L : j7;
        str = (i9 & 2) != 0 ? "" : str;
        str2 = (i9 & 4) != 0 ? "" : str2;
        str3 = (i9 & 8) != 0 ? "" : str3;
        str4 = (i9 & 16) != 0 ? "" : str4;
        i7 = (i9 & 32) != 0 ? 0 : i7;
        j8 = (i9 & 64) != 0 ? 0L : j8;
        i8 = (i9 & 128) != 0 ? 0 : i8;
        this.f71639a = j7;
        this.f71640b = str;
        this.f71641c = str2;
        this.f71642d = str3;
        this.f71643e = str4;
        this.f71644f = i7;
        this.f71645g = j8;
        this.h = i8;
    }

    @NotNull
    public final String a() {
        return this.f71640b;
    }

    public final long b() {
        return this.f71639a;
    }

    @NotNull
    public final String c() {
        return this.f71642d;
    }

    public final long d() {
        return this.f71645g;
    }

    @NotNull
    public final String e() {
        return this.f71643e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReserveVerify)) {
            return false;
        }
        ReserveVerify reserveVerify = (ReserveVerify) obj;
        return this.f71639a == reserveVerify.f71639a && Intrinsics.areEqual(this.f71640b, reserveVerify.f71640b) && Intrinsics.areEqual(this.f71641c, reserveVerify.f71641c) && Intrinsics.areEqual(this.f71642d, reserveVerify.f71642d) && Intrinsics.areEqual(this.f71643e, reserveVerify.f71643e) && this.f71644f == reserveVerify.f71644f && this.f71645g == reserveVerify.f71645g && this.h == reserveVerify.h;
    }

    @NotNull
    public final String f() {
        return this.f71641c;
    }

    public final int g() {
        return this.h;
    }

    public final int h() {
        return this.f71644f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + C3554n0.a(I.a(this.f71644f, E.a(E.a(E.a(E.a(Long.hashCode(this.f71639a) * 31, 31, this.f71640b), 31, this.f71641c), 31, this.f71642d), 31, this.f71643e), 31), 31, this.f71645g);
    }

    @NotNull
    public final String toString() {
        long j7 = this.f71639a;
        String str = this.f71640b;
        String str2 = this.f71641c;
        String str3 = this.f71642d;
        String str4 = this.f71643e;
        int i7 = this.f71644f;
        long j8 = this.f71645g;
        int i8 = this.h;
        StringBuilder sbA = n.a(j7, "ReserveVerify(epId=", ", cover=", str);
        B.a(", title=", str2, ", index=", str3, sbA);
        bf.a.a(i7, ", seasonTitle=", str4, ", isReserve=", sbA);
        z.a(j8, ", pubTime=", ", isOnline=", sbA);
        return C4277b.a(i8, ")", sbA);
    }
}
