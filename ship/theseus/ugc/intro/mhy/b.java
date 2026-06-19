package com.bilibili.ship.theseus.ugc.intro.mhy;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/mhy/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f97084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f97085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f97086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f97087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f97088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f97089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f97090g;

    @NotNull
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f97091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f97092j;

    public b(long j7, long j8, @NotNull String str, @NotNull String str2, long j9, long j10, @NotNull String str3, @NotNull String str4, int i7, @NotNull String str5) {
        this.f97084a = j7;
        this.f97085b = j8;
        this.f97086c = j9;
        this.f97087d = j10;
        this.f97088e = i7;
        this.f97089f = str;
        this.f97090g = str2;
        this.h = str3;
        this.f97091i = str4;
        this.f97092j = str5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f97084a == bVar.f97084a && this.f97085b == bVar.f97085b && this.f97086c == bVar.f97086c && this.f97087d == bVar.f97087d && this.f97088e == bVar.f97088e && Intrinsics.areEqual(this.f97089f, bVar.f97089f) && Intrinsics.areEqual(this.f97090g, bVar.f97090g) && Intrinsics.areEqual(this.h, bVar.h) && Intrinsics.areEqual(this.f97091i, bVar.f97091i) && Intrinsics.areEqual(this.f97092j, bVar.f97092j);
    }

    public final int hashCode() {
        return this.f97092j.hashCode() + E.a(E.a(E.a(E.a(I.a(this.f97088e, C3554n0.a(C3554n0.a(C3554n0.a(Long.hashCode(this.f97084a) * 31, 31, this.f97085b), 31, this.f97086c), 31, this.f97087d), 31), 31, this.f97089f), 31, this.f97090g), 31, this.h), 31, this.f97091i);
    }

    @NotNull
    public final String toString() {
        int i7 = this.f97088e;
        StringBuilder sb = new StringBuilder("StarRail(seasonId=");
        sb.append(this.f97084a);
        sb.append(", avid=");
        sb.append(this.f97085b);
        sb.append(", cid=");
        sb.append(this.f97086c);
        sb.append(", openTime=");
        G.a(i7, this.f97087d, ", status=", sb);
        sb.append(", lockImage=");
        sb.append(this.f97089f);
        sb.append(", unlockAndSelectedImage=");
        sb.append(this.f97090g);
        sb.append(", endUnlockAndSelectedImage=");
        sb.append(this.h);
        sb.append(", unlockImage=");
        sb.append(this.f97091i);
        sb.append(", endUnlockImage=");
        return C8770a.a(sb, this.f97092j, ")");
    }
}
