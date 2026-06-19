package com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/ma/j.class */
@StabilityInferred(parameters = 1)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f74353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f74354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f74355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f74356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f74357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f74358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f74359g;

    @NotNull
    public final String h;

    public j() {
        this("", "", "", "", "", "", "", "");
    }

    public j(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        this.f74353a = str;
        this.f74354b = str2;
        this.f74355c = str3;
        this.f74356d = str4;
        this.f74357e = str5;
        this.f74358f = str6;
        this.f74359g = str7;
        this.h = str8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f74353a, jVar.f74353a) && Intrinsics.areEqual(this.f74354b, jVar.f74354b) && Intrinsics.areEqual(this.f74355c, jVar.f74355c) && Intrinsics.areEqual(this.f74356d, jVar.f74356d) && Intrinsics.areEqual(this.f74357e, jVar.f74357e) && Intrinsics.areEqual(this.f74358f, jVar.f74358f) && Intrinsics.areEqual(this.f74359g, jVar.f74359g) && Intrinsics.areEqual(this.h, jVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + E.a(E.a(E.a(E.a(E.a(E.a(this.f74353a.hashCode() * 31, 31, this.f74354b), 31, this.f74355c), 31, this.f74356d), 31, this.f74357e), 31, this.f74358f), 31, this.f74359g);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RadarMaCouponDetailItem(backgroundImageUrl=");
        sb.append(this.f74353a);
        sb.append(", amountPrefixText=");
        sb.append(this.f74354b);
        sb.append(", amountValueText=");
        sb.append(this.f74355c);
        sb.append(", amountSuffixText=");
        sb.append(this.f74356d);
        sb.append(", amountDescText=");
        sb.append(this.f74357e);
        sb.append(", titleText=");
        sb.append(this.f74358f);
        sb.append(", validTimeText=");
        sb.append(this.f74359g);
        sb.append(", descText=");
        return C8770a.a(sb, this.h, ")");
    }
}
