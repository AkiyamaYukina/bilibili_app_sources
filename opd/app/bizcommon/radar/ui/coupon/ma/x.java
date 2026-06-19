package com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/ma/x.class */
@StabilityInferred(parameters = 0)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f74396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f74397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f74398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f74399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f74400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f74401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<String> f74402g;

    @NotNull
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final a f74403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final List<j> f74404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final b f74405k;

    public x() {
        this("", "", "", "", "", "", CollectionsKt.emptyList(), "", new a(0), CollectionsKt.emptyList(), new b(0));
    }

    public x(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<String> list, @NotNull String str7, @NotNull a aVar, @NotNull List<j> list2, @NotNull b bVar) {
        this.f74396a = str;
        this.f74397b = str2;
        this.f74398c = str3;
        this.f74399d = str4;
        this.f74400e = str5;
        this.f74401f = str6;
        this.f74402g = list;
        this.h = str7;
        this.f74403i = aVar;
        this.f74404j = list2;
        this.f74405k = bVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.areEqual(this.f74396a, xVar.f74396a) && Intrinsics.areEqual(this.f74397b, xVar.f74397b) && Intrinsics.areEqual(this.f74398c, xVar.f74398c) && Intrinsics.areEqual(this.f74399d, xVar.f74399d) && Intrinsics.areEqual(this.f74400e, xVar.f74400e) && Intrinsics.areEqual(this.f74401f, xVar.f74401f) && Intrinsics.areEqual(this.f74402g, xVar.f74402g) && Intrinsics.areEqual(this.h, xVar.h) && Intrinsics.areEqual(this.f74403i, xVar.f74403i) && Intrinsics.areEqual(this.f74404j, xVar.f74404j) && Intrinsics.areEqual(this.f74405k, xVar.f74405k);
    }

    public final int hashCode() {
        return this.f74405k.hashCode() + e0.a((this.f74403i.hashCode() + E.a(e0.a(E.a(E.a(E.a(E.a(E.a(this.f74396a.hashCode() * 31, 31, this.f74397b), 31, this.f74398c), 31, this.f74399d), 31, this.f74400e), 31, this.f74401f), 31, this.f74402g), 31, this.h)) * 31, 31, this.f74404j);
    }

    @NotNull
    public final String toString() {
        List<String> list = this.f74402g;
        List<j> list2 = this.f74404j;
        StringBuilder sb = new StringBuilder("RadarMaCouponUiModel(actionType=");
        sb.append(this.f74396a);
        sb.append(", jumpUrl=");
        sb.append(this.f74397b);
        sb.append(", jumpAction=");
        sb.append(this.f74398c);
        sb.append(", titleImageUrl=");
        sb.append(this.f74399d);
        sb.append(", backgroundImageUrl=");
        sb.append(this.f74400e);
        sb.append(", actionImageUrl=");
        M6.f.a(this.f74401f, ", couponIds=", ", amountColor=", sb, list);
        sb.append(this.h);
        sb.append(", amountInfo=");
        sb.append(this.f74403i);
        sb.append(", detailItems=");
        sb.append(list2);
        sb.append(", bubbleData=");
        sb.append(this.f74405k);
        sb.append(")");
        return sb.toString();
    }
}
