package com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/ma/a.class */
@StabilityInferred(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f74329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f74330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f74331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f74332d;

    public a() {
        this(0);
    }

    public /* synthetic */ a(int i7) {
        this("", "", "", "");
    }

    public a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.f74329a = str;
        this.f74330b = str2;
        this.f74331c = str3;
        this.f74332d = str4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f74329a, aVar.f74329a) && Intrinsics.areEqual(this.f74330b, aVar.f74330b) && Intrinsics.areEqual(this.f74331c, aVar.f74331c) && Intrinsics.areEqual(this.f74332d, aVar.f74332d);
    }

    public final int hashCode() {
        return this.f74332d.hashCode() + E.a(E.a(this.f74329a.hashCode() * 31, 31, this.f74330b), 31, this.f74331c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RadarMaCouponAmountInfo(prefixText=");
        sb.append(this.f74329a);
        sb.append(", valueText=");
        sb.append(this.f74330b);
        sb.append(", suffixText=");
        sb.append(this.f74331c);
        sb.append(", descText=");
        return C8770a.a(sb, this.f74332d, ")");
    }
}
