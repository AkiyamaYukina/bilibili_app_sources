package com.bilibili.ship.theseus.ogv.intro.floatlayer.bean;

import I.E;
import M6.f;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bilibili.bson.common.Bson;
import com.bilibili.ship.theseus.ogv.playviewextra.OgvBadgeInfo;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/bean/OgvIntroInfoVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OgvIntroInfoVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f92847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f92849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f92850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f92851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f92852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f92853g;

    @NotNull
    public final List<Area> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Publish f92854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final OgvBadgeInfo f92855j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f92856k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final String f92857l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final List<Style> f92858m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SerializedName("celebrity")
    @NotNull
    private final List<Celebrity> f92859n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final Actor f92860o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final Staff f92861p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final String f92862q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Rating f92863r;

    public OgvIntroInfoVo(long j7, int i7, long j8, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<Area> list, @NotNull Publish publish, @Nullable OgvBadgeInfo ogvBadgeInfo, @NotNull String str5, @NotNull String str6, @NotNull List<Style> list2, @NotNull List<Celebrity> list3, @Nullable Actor actor, @Nullable Staff staff, @NotNull String str7, @NotNull Rating rating) {
        this.f92847a = j7;
        this.f92848b = i7;
        this.f92849c = j8;
        this.f92850d = str;
        this.f92851e = str2;
        this.f92852f = str3;
        this.f92853g = str4;
        this.h = list;
        this.f92854i = publish;
        this.f92855j = ogvBadgeInfo;
        this.f92856k = str5;
        this.f92857l = str6;
        this.f92858m = list2;
        this.f92859n = list3;
        this.f92860o = actor;
        this.f92861p = staff;
        this.f92862q = str7;
        this.f92863r = rating;
    }

    @NotNull
    public final List<Celebrity> a() {
        return this.f92859n;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvIntroInfoVo)) {
            return false;
        }
        OgvIntroInfoVo ogvIntroInfoVo = (OgvIntroInfoVo) obj;
        return this.f92847a == ogvIntroInfoVo.f92847a && this.f92848b == ogvIntroInfoVo.f92848b && this.f92849c == ogvIntroInfoVo.f92849c && Intrinsics.areEqual(this.f92850d, ogvIntroInfoVo.f92850d) && Intrinsics.areEqual(this.f92851e, ogvIntroInfoVo.f92851e) && Intrinsics.areEqual(this.f92852f, ogvIntroInfoVo.f92852f) && Intrinsics.areEqual(this.f92853g, ogvIntroInfoVo.f92853g) && Intrinsics.areEqual(this.h, ogvIntroInfoVo.h) && Intrinsics.areEqual(this.f92854i, ogvIntroInfoVo.f92854i) && Intrinsics.areEqual(this.f92855j, ogvIntroInfoVo.f92855j) && Intrinsics.areEqual(this.f92856k, ogvIntroInfoVo.f92856k) && Intrinsics.areEqual(this.f92857l, ogvIntroInfoVo.f92857l) && Intrinsics.areEqual(this.f92858m, ogvIntroInfoVo.f92858m) && Intrinsics.areEqual(this.f92859n, ogvIntroInfoVo.f92859n) && Intrinsics.areEqual(this.f92860o, ogvIntroInfoVo.f92860o) && Intrinsics.areEqual(this.f92861p, ogvIntroInfoVo.f92861p) && Intrinsics.areEqual(this.f92862q, ogvIntroInfoVo.f92862q) && Intrinsics.areEqual(this.f92863r, ogvIntroInfoVo.f92863r);
    }

    public final int hashCode() {
        int iA = e0.a(E.a(E.a(E.a(E.a(C3554n0.a(I.a(this.f92848b, Long.hashCode(this.f92847a) * 31, 31), 31, this.f92849c), 31, this.f92850d), 31, this.f92851e), 31, this.f92852f), 31, this.f92853g), 31, this.h);
        int iHashCode = this.f92854i.hashCode();
        int iHashCode2 = 0;
        OgvBadgeInfo ogvBadgeInfo = this.f92855j;
        int iA2 = e0.a(e0.a(E.a(E.a((((iHashCode + iA) * 31) + (ogvBadgeInfo == null ? 0 : ogvBadgeInfo.hashCode())) * 31, 31, this.f92856k), 31, this.f92857l), 31, this.f92858m), 31, this.f92859n);
        Actor actor = this.f92860o;
        int iHashCode3 = actor == null ? 0 : actor.hashCode();
        Staff staff = this.f92861p;
        if (staff != null) {
            iHashCode2 = staff.hashCode();
        }
        return this.f92863r.hashCode() + E.a((((iA2 + iHashCode3) * 31) + iHashCode2) * 31, 31, this.f92862q);
    }

    @NotNull
    public final String toString() {
        List<Area> list = this.h;
        List<Style> list2 = this.f92858m;
        List<Celebrity> list3 = this.f92859n;
        StringBuilder sb = new StringBuilder("OgvIntroInfoVo(seasonId=");
        sb.append(this.f92847a);
        sb.append(", mediaType=");
        sb.append(this.f92848b);
        sb.append(", mediaId=");
        sb.append(this.f92849c);
        sb.append(", cover=");
        sb.append(this.f92850d);
        sb.append(", mediaTitle=");
        sb.append(this.f92851e);
        sb.append(", seasonTitle=");
        sb.append(this.f92852f);
        sb.append(", typeName=");
        f.a(this.f92853g, ", areas=", ", publish=", sb, list);
        sb.append(this.f92854i);
        sb.append(", mediaBadgeInfo=");
        sb.append(this.f92855j);
        sb.append(", alias=");
        sb.append(this.f92856k);
        sb.append(", originName=");
        f.a(this.f92857l, ", styles=", ", celebrities=", sb, list2);
        sb.append(list3);
        sb.append(", actor=");
        sb.append(this.f92860o);
        sb.append(", staff=");
        sb.append(this.f92861p);
        sb.append(", evaluate=");
        sb.append(this.f92862q);
        sb.append(", rating=");
        sb.append(this.f92863r);
        sb.append(")");
        return sb.toString();
    }
}
