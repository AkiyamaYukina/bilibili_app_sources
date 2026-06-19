package com.bilibili.ship.theseus.united.page.intro.module.season;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/o.class */
@StabilityInferred(parameters = 0)
public final class C6353o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f101669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f101671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f101672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonType f101673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f101674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f101675g;

    @NotNull
    public final List<Z> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f101676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final r f101677j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public UnitedSeasonActivity f101678k;

    public C6353o(long j7, @NotNull String str, @NotNull String str2, long j8, @NotNull UnitedSeasonType unitedSeasonType, @NotNull String str3, @NotNull String str4, @NotNull List<Z> list, @Nullable String str5, @Nullable r rVar, @Nullable UnitedSeasonActivity unitedSeasonActivity) {
        this.f101669a = j7;
        this.f101670b = str;
        this.f101671c = str2;
        this.f101672d = j8;
        this.f101673e = unitedSeasonType;
        this.f101674f = str3;
        this.f101675g = str4;
        this.h = list;
        this.f101676i = str5;
        this.f101677j = rVar;
        this.f101678k = unitedSeasonActivity;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6353o)) {
            return false;
        }
        C6353o c6353o = (C6353o) obj;
        return this.f101669a == c6353o.f101669a && Intrinsics.areEqual(this.f101670b, c6353o.f101670b) && Intrinsics.areEqual(this.f101671c, c6353o.f101671c) && this.f101672d == c6353o.f101672d && this.f101673e == c6353o.f101673e && Intrinsics.areEqual(this.f101674f, c6353o.f101674f) && Intrinsics.areEqual(this.f101675g, c6353o.f101675g) && Intrinsics.areEqual(this.h, c6353o.h) && Intrinsics.areEqual(this.f101676i, c6353o.f101676i) && Intrinsics.areEqual(this.f101677j, c6353o.f101677j) && Intrinsics.areEqual(this.f101678k, c6353o.f101678k);
    }

    public final int hashCode() {
        int iA = e0.a(I.E.a(I.E.a((this.f101673e.hashCode() + C3554n0.a(I.E.a(I.E.a(Long.hashCode(this.f101669a) * 31, 31, this.f101670b), 31, this.f101671c), 31, this.f101672d)) * 31, 31, this.f101674f), 31, this.f101675g), 31, this.h);
        int iHashCode = 0;
        String str = this.f101676i;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        r rVar = this.f101677j;
        int iHashCode3 = rVar == null ? 0 : rVar.hashCode();
        UnitedSeasonActivity unitedSeasonActivity = this.f101678k;
        if (unitedSeasonActivity != null) {
            iHashCode = unitedSeasonActivity.hashCode();
        }
        return ((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        List<Z> list = this.h;
        UnitedSeasonActivity unitedSeasonActivity = this.f101678k;
        StringBuilder sb = new StringBuilder("UnitedSeasonData(id=");
        sb.append(this.f101669a);
        sb.append(", title=");
        sb.append(this.f101670b);
        sb.append(", cover=");
        sb.append(this.f101671c);
        sb.append(", count=");
        sb.append(this.f101672d);
        sb.append(", type=");
        sb.append(this.f101673e);
        sb.append(", modelTitle=");
        sb.append(this.f101674f);
        sb.append(", panelTitle=");
        M6.f.a(this.f101675g, ", sections=", ", ability=", sb, list);
        sb.append(this.f101676i);
        sb.append(", head=");
        sb.append(this.f101677j);
        sb.append(", activity=");
        sb.append(unitedSeasonActivity);
        sb.append(")");
        return sb.toString();
    }
}
