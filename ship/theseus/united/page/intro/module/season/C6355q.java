package com.bilibili.ship.theseus.united.page.intro.module.season;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6302a;
import com.bilibili.ship.theseus.united.page.view.StatInfoData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/q.class */
@StabilityInferred(parameters = 0)
public final class C6355q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f101681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f101682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f101683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f101684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f101685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f101686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f101687g;
    public final long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Av0.a f101688i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final List<Av0.a> f101689j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final StatInfoData f101690k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final StatInfoData f101691l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final C6302a f101692m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.c f101693n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final BusinessType f101694o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final C6339a f101695p;

    public C6355q() {
        throw null;
    }

    public C6355q(long j7, long j8, long j9, String str, String str2, String str3, double d7, long j10, Av0.a aVar, List list, StatInfoData statInfoData, StatInfoData statInfoData2, C6302a c6302a, com.bilibili.ship.theseus.united.page.view.c cVar, BusinessType businessType, C6339a c6339a) {
        this.f101681a = j7;
        this.f101682b = j8;
        this.f101683c = j9;
        this.f101684d = str;
        this.f101685e = str2;
        this.f101686f = str3;
        this.f101687g = d7;
        this.h = j10;
        this.f101688i = aVar;
        this.f101689j = list;
        this.f101690k = statInfoData;
        this.f101691l = statInfoData2;
        this.f101692m = c6302a;
        this.f101693n = cVar;
        this.f101694o = businessType;
        this.f101695p = c6339a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6355q)) {
            return false;
        }
        C6355q c6355q = (C6355q) obj;
        return this.f101681a == c6355q.f101681a && this.f101682b == c6355q.f101682b && this.f101683c == c6355q.f101683c && Intrinsics.areEqual(this.f101684d, c6355q.f101684d) && Intrinsics.areEqual(this.f101685e, c6355q.f101685e) && Intrinsics.areEqual(this.f101686f, c6355q.f101686f) && Double.compare(this.f101687g, c6355q.f101687g) == 0 && Duration.equals-impl0(this.h, c6355q.h) && Intrinsics.areEqual(this.f101688i, c6355q.f101688i) && Intrinsics.areEqual(this.f101689j, c6355q.f101689j) && Intrinsics.areEqual(this.f101690k, c6355q.f101690k) && Intrinsics.areEqual(this.f101691l, c6355q.f101691l) && Intrinsics.areEqual(this.f101692m, c6355q.f101692m) && Intrinsics.areEqual(this.f101693n, c6355q.f101693n) && this.f101694o == c6355q.f101694o && Intrinsics.areEqual(this.f101695p, c6355q.f101695p);
    }

    public final int hashCode() {
        int iA = e0.a((this.f101688i.hashCode() + RQ.l.a(androidx.compose.ui.graphics.colorspace.A.a(this.f101687g, I.E.a(I.E.a(I.E.a(C3554n0.a(C3554n0.a(Long.hashCode(this.f101681a) * 31, 31, this.f101682b), 31, this.f101683c), 31, this.f101684d), 31, this.f101685e), 31, this.f101686f), 31), 31, this.h)) * 31, 31, this.f101689j);
        int iHashCode = this.f101690k.hashCode();
        int iHashCode2 = this.f101691l.hashCode();
        int iHashCode3 = this.f101692m.hashCode();
        int iHashCode4 = this.f101693n.hashCode();
        int iHashCode5 = 0;
        BusinessType businessType = this.f101694o;
        int iHashCode6 = businessType == null ? 0 : businessType.hashCode();
        C6339a c6339a = this.f101695p;
        if (c6339a != null) {
            iHashCode5 = c6339a.hashCode();
        }
        return ((((iHashCode4 + ((iHashCode3 + ((iHashCode2 + ((iHashCode + iA) * 31)) * 31)) * 31)) * 31) + iHashCode6) * 31) + iHashCode5;
    }

    @NotNull
    public final String toString() {
        return "UnitedSeasonEpisode(id=" + this.f101681a + ", avid=" + this.f101682b + ", cid=" + this.f101683c + ", title=" + this.f101684d + ", cover=" + this.f101685e + ", intro=" + this.f101686f + ", historyProgress=" + this.f101687g + ", duration=" + Duration.toString-impl(this.h) + ", unitedEpisode=" + this.f101688i + ", unitedEpisodes=" + this.f101689j + ", vt=" + this.f101690k + ", danmaku=" + this.f101691l + ", badgeInfo=" + this.f101692m + ", author=" + this.f101693n + ", bizType=" + this.f101694o + ", downloadInfo=" + this.f101695p + ")";
    }
}
