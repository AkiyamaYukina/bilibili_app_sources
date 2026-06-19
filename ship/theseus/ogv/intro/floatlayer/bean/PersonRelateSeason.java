package com.bilibili.ship.theseus.ogv.intro.floatlayer.bean;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.ship.theseus.ogv.playviewextra.OgvBadgeInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/bean/PersonRelateSeason.class */
@StabilityInferred(parameters = 1)
@Bson
public final class PersonRelateSeason {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f92877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f92879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f92880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f92881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f92882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f92883g;

    @Nullable
    public final OgvBadgeInfo h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f92884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f92885j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f92886k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final String f92887l;

    public PersonRelateSeason(String str, int i7, int i8, String str2, String str3, String str4, int i9, OgvBadgeInfo ogvBadgeInfo, String str5, boolean z6, int i10, String str6, int i11) {
        ogvBadgeInfo = (i11 & 128) != 0 ? null : ogvBadgeInfo;
        this.f92877a = str;
        this.f92878b = i7;
        this.f92879c = i8;
        this.f92880d = str2;
        this.f92881e = str3;
        this.f92882f = str4;
        this.f92883g = i9;
        this.h = ogvBadgeInfo;
        this.f92884i = str5;
        this.f92885j = z6;
        this.f92886k = i10;
        this.f92887l = str6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonRelateSeason)) {
            return false;
        }
        PersonRelateSeason personRelateSeason = (PersonRelateSeason) obj;
        return Intrinsics.areEqual(this.f92877a, personRelateSeason.f92877a) && this.f92878b == personRelateSeason.f92878b && this.f92879c == personRelateSeason.f92879c && Intrinsics.areEqual(this.f92880d, personRelateSeason.f92880d) && Intrinsics.areEqual(this.f92881e, personRelateSeason.f92881e) && Intrinsics.areEqual(this.f92882f, personRelateSeason.f92882f) && this.f92883g == personRelateSeason.f92883g && Intrinsics.areEqual(this.h, personRelateSeason.h) && Intrinsics.areEqual(this.f92884i, personRelateSeason.f92884i) && this.f92885j == personRelateSeason.f92885j && this.f92886k == personRelateSeason.f92886k && Intrinsics.areEqual(this.f92887l, personRelateSeason.f92887l);
    }

    public final int hashCode() {
        int iA = I.a(this.f92883g, E.a(E.a(E.a(I.a(this.f92879c, I.a(this.f92878b, this.f92877a.hashCode() * 31, 31), 31), 31, this.f92880d), 31, this.f92881e), 31, this.f92882f), 31);
        OgvBadgeInfo ogvBadgeInfo = this.h;
        return this.f92887l.hashCode() + I.a(this.f92886k, z.a(E.a((iA + (ogvBadgeInfo == null ? 0 : ogvBadgeInfo.hashCode())) * 31, 31, this.f92884i), 31, this.f92885j), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PersonRelateSeason(cover=");
        sb.append(this.f92877a);
        sb.append(", mediaId=");
        sb.append(this.f92878b);
        sb.append(", seasonId=");
        sb.append(this.f92879c);
        sb.append(", title=");
        sb.append(this.f92880d);
        sb.append(", link=");
        sb.append(this.f92881e);
        sb.append(", badge=");
        sb.append(this.f92882f);
        sb.append(", badgeType=");
        sb.append(this.f92883g);
        sb.append(", badgeInfo=");
        sb.append(this.h);
        sb.append(", indexShow=");
        sb.append(this.f92884i);
        sb.append(", isFinish=");
        sb.append(this.f92885j);
        sb.append(", seasonType=");
        sb.append(this.f92886k);
        sb.append(", order=");
        return C8770a.a(sb, this.f92887l, ")");
    }
}
