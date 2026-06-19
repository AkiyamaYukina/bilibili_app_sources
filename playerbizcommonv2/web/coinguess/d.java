package com.bilibili.playerbizcommonv2.web.coinguess;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/coinguess/d.class */
@StabilityInferred(parameters = 1)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f82209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f82210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f82211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f82212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f82213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f82214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f82215g;

    @NotNull
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f82216i;

    public d(long j7, @NotNull String str, long j8, int i7, long j9, @NotNull String str2, long j10, @NotNull String str3, @NotNull String str4) {
        this.f82209a = j7;
        this.f82210b = str;
        this.f82211c = j8;
        this.f82212d = j9;
        this.f82213e = j10;
        this.f82214f = i7;
        this.f82215g = str2;
        this.h = str3;
        this.f82216i = str4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f82209a == dVar.f82209a && Intrinsics.areEqual(this.f82210b, dVar.f82210b) && this.f82211c == dVar.f82211c && this.f82212d == dVar.f82212d && this.f82213e == dVar.f82213e && this.f82214f == dVar.f82214f && Intrinsics.areEqual(this.f82215g, dVar.f82215g) && Intrinsics.areEqual(this.h, dVar.h) && Intrinsics.areEqual(this.f82216i, dVar.f82216i);
    }

    public final int hashCode() {
        return this.f82216i.hashCode() + E.a(E.a(I.a(this.f82214f, C3554n0.a(C3554n0.a(C3554n0.a(E.a(Long.hashCode(this.f82209a) * 31, 31, this.f82210b), 31, this.f82211c), 31, this.f82212d), 31, this.f82213e), 31), 31, this.f82215g), 31, this.h);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CoinGuessPublishInput(id=");
        sb.append(this.f82209a);
        sb.append(", idStr=");
        sb.append(this.f82210b);
        sb.append(", mid=");
        sb.append(this.f82211c);
        sb.append(", oid=");
        sb.append(this.f82212d);
        sb.append(", progress=");
        sb.append(this.f82213e);
        sb.append(", type=");
        sb.append(this.f82214f);
        sb.append(", command=");
        sb.append(this.f82215g);
        sb.append(", content=");
        sb.append(this.h);
        sb.append(", extra=");
        return C8770a.a(sb, this.f82216i, ")");
    }
}
