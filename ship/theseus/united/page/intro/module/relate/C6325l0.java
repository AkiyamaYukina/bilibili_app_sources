package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.view.StatData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/l0.class */
@StabilityInferred(parameters = 0)
public final class C6325l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f101279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.pub.season.a f101280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final C6311e0 f101281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StatData f101282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final C6317h0 f101283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final C6302a f101284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final C6302a f101285g;

    public C6325l0(long j7, @NotNull com.bilibili.ogv.pub.season.a aVar, @Nullable C6311e0 c6311e0, @NotNull StatData statData, @Nullable C6317h0 c6317h0, @Nullable C6302a c6302a, @Nullable C6302a c6302a2) {
        this.f101279a = j7;
        this.f101280b = aVar;
        this.f101281c = c6311e0;
        this.f101282d = statData;
        this.f101283e = c6317h0;
        this.f101284f = c6302a;
        this.f101285g = c6302a2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6325l0)) {
            return false;
        }
        C6325l0 c6325l0 = (C6325l0) obj;
        return this.f101279a == c6325l0.f101279a && Intrinsics.areEqual(this.f101280b, c6325l0.f101280b) && Intrinsics.areEqual(this.f101281c, c6325l0.f101281c) && Intrinsics.areEqual(this.f101282d, c6325l0.f101282d) && Intrinsics.areEqual(this.f101283e, c6325l0.f101283e) && Intrinsics.areEqual(this.f101284f, c6325l0.f101284f) && Intrinsics.areEqual(this.f101285g, c6325l0.f101285g);
    }

    public final int hashCode() {
        int iA = androidx.compose.animation.core.I.a(this.f101280b.f71782a, Long.hashCode(this.f101279a) * 31, 31);
        int iHashCode = 0;
        C6311e0 c6311e0 = this.f101281c;
        int iHashCode2 = c6311e0 == null ? 0 : c6311e0.hashCode();
        int iHashCode3 = this.f101282d.hashCode();
        C6317h0 c6317h0 = this.f101283e;
        int iHashCode4 = c6317h0 == null ? 0 : c6317h0.hashCode();
        C6302a c6302a = this.f101284f;
        int iHashCode5 = c6302a == null ? 0 : c6302a.hashCode();
        C6302a c6302a2 = this.f101285g;
        if (c6302a2 != null) {
            iHashCode = c6302a2.hashCode();
        }
        return ((((((iHashCode3 + ((iA + iHashCode2) * 31)) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "RelateBangumiCard(seasonId=" + this.f101279a + ", seasonType=" + this.f101280b + ", newEp=" + this.f101281c + ", stat=" + this.f101282d + ", rating=" + this.f101283e + ", rcmdReason=" + this.f101284f + ", badgeInfo=" + this.f101285g + ")";
    }
}
