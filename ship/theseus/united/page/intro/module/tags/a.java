package com.bilibili.ship.theseus.united.page.intro.module.tags;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f101930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f101932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f101933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f101934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f101935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f101936g;

    @NotNull
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f101937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f101938j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f101939k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final String f101940l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final String f101941m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final String f101942n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final b f101943o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f101944p;

    public a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull b bVar, @NotNull Map<String, String> map) {
        this.f101930a = str;
        this.f101931b = str2;
        this.f101932c = str3;
        this.f101933d = str4;
        this.f101934e = str5;
        this.f101935f = str6;
        this.f101936g = str7;
        this.h = str8;
        this.f101937i = str9;
        this.f101938j = str10;
        this.f101939k = str11;
        this.f101940l = str12;
        this.f101941m = str13;
        this.f101942n = str14;
        this.f101943o = bVar;
        this.f101944p = map;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f101930a, aVar.f101930a) && Intrinsics.areEqual(this.f101931b, aVar.f101931b) && Intrinsics.areEqual(this.f101932c, aVar.f101932c) && Intrinsics.areEqual(this.f101933d, aVar.f101933d) && Intrinsics.areEqual(this.f101934e, aVar.f101934e) && Intrinsics.areEqual(this.f101935f, aVar.f101935f) && Intrinsics.areEqual(this.f101936g, aVar.f101936g) && Intrinsics.areEqual(this.h, aVar.h) && Intrinsics.areEqual(this.f101937i, aVar.f101937i) && Intrinsics.areEqual(this.f101938j, aVar.f101938j) && Intrinsics.areEqual(this.f101939k, aVar.f101939k) && Intrinsics.areEqual(this.f101940l, aVar.f101940l) && Intrinsics.areEqual(this.f101941m, aVar.f101941m) && Intrinsics.areEqual(this.f101942n, aVar.f101942n) && Intrinsics.areEqual(this.f101943o, aVar.f101943o) && Intrinsics.areEqual(this.f101944p, aVar.f101944p);
    }

    public final int hashCode() {
        int iA = E.a(E.a(E.a(E.a(E.a(E.a(E.a(E.a(E.a(E.a(E.a(E.a(E.a(this.f101930a.hashCode() * 31, 31, this.f101931b), 31, this.f101932c), 31, this.f101933d), 31, this.f101934e), 31, this.f101935f), 31, this.f101936g), 31, this.h), 31, this.f101937i), 31, this.f101938j), 31, this.f101939k), 31, this.f101940l), 31, this.f101941m), 31, this.f101942n);
        return this.f101944p.hashCode() + ((this.f101943o.hashCode() + iA) * 31);
    }

    @NotNull
    public final String toString() {
        return "Cell(icon=" + this.f101930a + ", iconNight=" + this.f101931b + ", text=" + this.f101932c + ", textColor=" + this.f101933d + ", textColorNight=" + this.f101934e + ", jumpUrl=" + this.f101935f + ", cellType=" + this.f101936g + ", cellBgColor=" + this.h + ", cellBgColorNight=" + this.f101937i + ", param=" + this.f101938j + ", pageTitle=" + this.f101939k + ", jumpType=" + this.f101940l + ", endIcon=" + this.f101941m + ", endIconNight=" + this.f101942n + ", cellFluid=" + this.f101943o + ", reportMap=" + this.f101944p + ")";
    }
}
