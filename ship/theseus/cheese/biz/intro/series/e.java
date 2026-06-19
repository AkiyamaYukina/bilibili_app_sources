package com.bilibili.ship.theseus.cheese.biz.intro.series;

import I.E;
import androidx.compose.animation.z;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/series/e.class */
@StabilityInferred(parameters = 1)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f90107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f90108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f90109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f90110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f90111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f90112f;

    public e(int i7, long j7, @NotNull String str, @NotNull String str2, boolean z6, boolean z7) {
        this.f90107a = j7;
        this.f90108b = z6;
        this.f90109c = z7;
        this.f90110d = str;
        this.f90111e = str2;
        this.f90112f = i7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f90107a == eVar.f90107a && this.f90108b == eVar.f90108b && this.f90109c == eVar.f90109c && Intrinsics.areEqual(this.f90110d, eVar.f90110d) && Intrinsics.areEqual(this.f90111e, eVar.f90111e) && this.f90112f == eVar.f90112f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90112f) + E.a(E.a(z.a(z.a(Long.hashCode(this.f90107a) * 31, 31, this.f90108b), 31, this.f90109c), 31, this.f90110d), 31, this.f90111e);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PugvSeriesItem(seasonId=");
        sb.append(this.f90107a);
        sb.append(", selected=");
        sb.append(this.f90108b);
        sb.append(", gray=");
        sb.append(this.f90109c);
        sb.append(", content=");
        sb.append(this.f90110d);
        sb.append(", label=");
        sb.append(this.f90111e);
        sb.append(", state=");
        return C4277b.a(this.f90112f, ")", sb);
    }
}
