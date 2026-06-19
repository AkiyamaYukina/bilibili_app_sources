package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/g0.class */
@StabilityInferred(parameters = 1)
public final class C6315g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f101208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f101210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f101211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f101212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f101213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f101214g;

    @NotNull
    public final String h;

    public C6315g0(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        this.f101208a = str;
        this.f101209b = str2;
        this.f101210c = str3;
        this.f101211d = str4;
        this.f101212e = str5;
        this.f101213f = str6;
        this.f101214g = str7;
        this.h = str8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6315g0)) {
            return false;
        }
        C6315g0 c6315g0 = (C6315g0) obj;
        return Intrinsics.areEqual(this.f101208a, c6315g0.f101208a) && Intrinsics.areEqual(this.f101209b, c6315g0.f101209b) && Intrinsics.areEqual(this.f101210c, c6315g0.f101210c) && Intrinsics.areEqual(this.f101211d, c6315g0.f101211d) && Intrinsics.areEqual(this.f101212e, c6315g0.f101212e) && Intrinsics.areEqual(this.f101213f, c6315g0.f101213f) && Intrinsics.areEqual(this.f101214g, c6315g0.f101214g) && Intrinsics.areEqual(this.h, c6315g0.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + I.E.a(I.E.a(I.E.a(I.E.a(I.E.a(I.E.a(this.f101208a.hashCode() * 31, 31, this.f101209b), 31, this.f101210c), 31, this.f101211d), 31, this.f101212e), 31, this.f101213f), 31, this.f101214g);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RankInfo(iconUrlNight=");
        sb.append(this.f101208a);
        sb.append(", iconUrlDay=");
        sb.append(this.f101209b);
        sb.append(", bkgNightColor=");
        sb.append(this.f101210c);
        sb.append(", bkgDayColor=");
        sb.append(this.f101211d);
        sb.append(", fontNightColor=");
        sb.append(this.f101212e);
        sb.append(", fontDayColor=");
        sb.append(this.f101213f);
        sb.append(", rankContent=");
        sb.append(this.f101214g);
        sb.append(", rankLink=");
        return C8770a.a(sb, this.h, ")");
    }
}
