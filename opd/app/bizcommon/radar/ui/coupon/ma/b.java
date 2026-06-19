package com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma;

import I.E;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/ma/b.class */
@StabilityInferred(parameters = 1)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f74333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f74334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f74335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f74336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f74337e;

    public b() {
        this(0);
    }

    public /* synthetic */ b(int i7) {
        this(0L, "", "", "", "");
    }

    public b(long j7, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.f74333a = str;
        this.f74334b = str2;
        this.f74335c = str3;
        this.f74336d = j7;
        this.f74337e = str4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f74333a, bVar.f74333a) && Intrinsics.areEqual(this.f74334b, bVar.f74334b) && Intrinsics.areEqual(this.f74335c, bVar.f74335c) && this.f74336d == bVar.f74336d && Intrinsics.areEqual(this.f74337e, bVar.f74337e);
    }

    public final int hashCode() {
        return this.f74337e.hashCode() + C3554n0.a(E.a(E.a(this.f74333a.hashCode() * 31, 31, this.f74334b), 31, this.f74335c), 31, this.f74336d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RadarMaCouponBubbleData(frontText=");
        sb.append(this.f74333a);
        sb.append(", highlightText=");
        sb.append(this.f74334b);
        sb.append(", backText=");
        sb.append(this.f74335c);
        sb.append(", leftTimeMs=");
        sb.append(this.f74336d);
        sb.append(", btnBgUrl=");
        return C8770a.a(sb, this.f74337e, ")");
    }
}
