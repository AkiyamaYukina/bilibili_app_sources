package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import I.E;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C4665g;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f97314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f97315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f97316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f97317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f97318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f97319g;

    @NotNull
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Map<String, String> f97320i;

    public d(int i7, @NotNull String str, @NotNull String str2, @NotNull String str3, long j7, long j8, @NotNull String str4, @NotNull String str5, @Nullable Map<String, String> map) {
        this.f97313a = i7;
        this.f97314b = str;
        this.f97315c = str2;
        this.f97316d = str3;
        this.f97317e = j7;
        this.f97318f = j8;
        this.f97319g = str4;
        this.h = str5;
        this.f97320i = map;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f97313a == dVar.f97313a && Intrinsics.areEqual(this.f97314b, dVar.f97314b) && Intrinsics.areEqual(this.f97315c, dVar.f97315c) && Intrinsics.areEqual(this.f97316d, dVar.f97316d) && this.f97317e == dVar.f97317e && this.f97318f == dVar.f97318f && Intrinsics.areEqual(this.f97319g, dVar.f97319g) && Intrinsics.areEqual(this.h, dVar.h) && Intrinsics.areEqual(this.f97320i, dVar.f97320i);
    }

    public final int hashCode() {
        int iA = E.a(E.a(C3554n0.a(C3554n0.a(E.a(E.a(E.a(Integer.hashCode(this.f97313a) * 31, 31, this.f97314b), 31, this.f97315c), 31, this.f97316d), 31, this.f97317e), 31, this.f97318f), 31, this.f97319g), 31, this.h);
        Map<String, String> map = this.f97320i;
        return iA + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public final String toString() {
        Map<String, String> map = this.f97320i;
        StringBuilder sb = new StringBuilder("Label(type=");
        sb.append(this.f97313a);
        sb.append(", url=");
        sb.append(this.f97314b);
        sb.append(", icon=");
        sb.append(this.f97315c);
        sb.append(", iconNight=");
        sb.append(this.f97316d);
        sb.append(", iconWidth=");
        sb.append(this.f97317e);
        sb.append(", iconHeight=");
        sb.append(this.f97318f);
        sb.append(", lottie=");
        sb.append(this.f97319g);
        sb.append(", lottieNight=");
        return C4665g.a(sb, this.h, ", reportParams=", map, ")");
    }
}
