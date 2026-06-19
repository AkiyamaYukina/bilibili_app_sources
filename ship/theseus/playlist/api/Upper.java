package com.bilibili.ship.theseus.playlist.api;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/Upper.class */
@StabilityInferred(parameters = 1)
@Bson
public final class Upper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f95319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f95320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f95321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f95322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f95323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f95324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f95325g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f95326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f95327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f95328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f95329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f95330m;

    public Upper() {
        this(null, null, 0L, 0, 0L, null, null, 0, null, 0L, 0, 0, 0, 8191);
    }

    public Upper(String str, String str2, long j7, int i7, long j8, String str3, String str4, int i8, String str5, long j9, int i9, int i10, int i11, int i12) {
        str = (i12 & 1) != 0 ? "" : str;
        str2 = (i12 & 2) != 0 ? "" : str2;
        j7 = (i12 & 4) != 0 ? 0L : j7;
        i7 = (i12 & 8) != 0 ? 0 : i7;
        j8 = (i12 & 16) != 0 ? 0L : j8;
        str3 = (i12 & 32) != 0 ? "" : str3;
        str4 = (i12 & 64) != 0 ? "" : str4;
        i8 = (i12 & 128) != 0 ? 0 : i8;
        str5 = (i12 & 256) != 0 ? "" : str5;
        j9 = (i12 & 512) != 0 ? 0L : j9;
        i9 = (i12 & 1024) != 0 ? 0 : i9;
        i10 = (i12 & 2048) != 0 ? 0 : i10;
        i11 = (i12 & 4096) != 0 ? 0 : i11;
        this.f95319a = str;
        this.f95320b = str2;
        this.f95321c = j7;
        this.f95322d = i7;
        this.f95323e = j8;
        this.f95324f = str3;
        this.f95325g = str4;
        this.h = i8;
        this.f95326i = str5;
        this.f95327j = j9;
        this.f95328k = i9;
        this.f95329l = i10;
        this.f95330m = i11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Upper)) {
            return false;
        }
        Upper upper = (Upper) obj;
        return Intrinsics.areEqual(this.f95319a, upper.f95319a) && Intrinsics.areEqual(this.f95320b, upper.f95320b) && this.f95321c == upper.f95321c && this.f95322d == upper.f95322d && this.f95323e == upper.f95323e && Intrinsics.areEqual(this.f95324f, upper.f95324f) && Intrinsics.areEqual(this.f95325g, upper.f95325g) && this.h == upper.h && Intrinsics.areEqual(this.f95326i, upper.f95326i) && this.f95327j == upper.f95327j && this.f95328k == upper.f95328k && this.f95329l == upper.f95329l && this.f95330m == upper.f95330m;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f95330m) + I.a(this.f95329l, I.a(this.f95328k, C3554n0.a(E.a(I.a(this.h, E.a(E.a(C3554n0.a(I.a(this.f95322d, C3554n0.a(E.a(this.f95319a.hashCode() * 31, 31, this.f95320b), 31, this.f95321c), 31), 31, this.f95323e), 31, this.f95324f), 31, this.f95325g), 31), 31, this.f95326i), 31, this.f95327j), 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Upper(displayName=");
        sb.append(this.f95319a);
        sb.append(", face=");
        sb.append(this.f95320b);
        sb.append(", fans=");
        sb.append(this.f95321c);
        sb.append(", followed=");
        sb.append(this.f95322d);
        sb.append(", mid=");
        sb.append(this.f95323e);
        sb.append(", name=");
        sb.append(this.f95324f);
        sb.append(", officialDesc=");
        sb.append(this.f95325g);
        sb.append(", officialRole=");
        sb.append(this.h);
        sb.append(", officialTitle=");
        sb.append(this.f95326i);
        sb.append(", vipDueDate=");
        sb.append(this.f95327j);
        sb.append(", vipPayType=");
        sb.append(this.f95328k);
        sb.append(", vipStatue=");
        sb.append(this.f95329l);
        sb.append(", vipType=");
        return C4277b.a(this.f95330m, ")", sb);
    }
}
