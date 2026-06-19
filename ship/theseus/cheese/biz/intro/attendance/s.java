package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/s.class */
@StabilityInferred(parameters = 1)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f89342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f89343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f89344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f89345d;

    public s(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.f89342a = str;
        this.f89343b = str2;
        this.f89344c = str3;
        this.f89345d = str4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.areEqual(this.f89342a, sVar.f89342a) && Intrinsics.areEqual("", "") && Intrinsics.areEqual(this.f89343b, sVar.f89343b) && Intrinsics.areEqual(this.f89344c, sVar.f89344c) && Intrinsics.areEqual(this.f89345d, sVar.f89345d);
    }

    public final int hashCode() {
        return this.f89345d.hashCode() + E.a(E.a(this.f89342a.hashCode() * 961, 31, this.f89343b), 31, this.f89344c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CheeseAttendanceShareParam(shareId=");
        sb.append(this.f89342a);
        sb.append(", shareOrigin=, sid=");
        sb.append(this.f89343b);
        sb.append(", spmid=");
        sb.append(this.f89344c);
        sb.append(", fromSpmid=");
        return C8770a.a(sb, this.f89345d, ")");
    }
}
