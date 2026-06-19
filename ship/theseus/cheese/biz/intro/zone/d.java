package com.bilibili.ship.theseus.cheese.biz.intro.zone;

import I.E;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/d.class */
@StabilityInferred(parameters = 1)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f90316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f90317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f90318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f90319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f90320e;

    public d(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i7) {
        this.f90316a = str;
        this.f90317b = str2;
        this.f90318c = str3;
        this.f90319d = str4;
        this.f90320e = i7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f90316a, dVar.f90316a) && Intrinsics.areEqual(this.f90317b, dVar.f90317b) && Intrinsics.areEqual(this.f90318c, dVar.f90318c) && Intrinsics.areEqual(this.f90319d, dVar.f90319d) && this.f90320e == dVar.f90320e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90320e) + E.a(E.a(E.a(this.f90316a.hashCode() * 31, 31, this.f90317b), 31, this.f90318c), 31, this.f90319d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PugvZoneItem(icon=");
        sb.append(this.f90316a);
        sb.append(", link=");
        sb.append(this.f90317b);
        sb.append(", title=");
        sb.append(this.f90318c);
        sb.append(", subtitle=");
        sb.append(this.f90319d);
        sb.append(", type=");
        return C4277b.a(this.f90320e, ")", sb);
    }
}
