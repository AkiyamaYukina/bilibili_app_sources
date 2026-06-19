package com.bilibili.playerbizcommonv2.utils;

import I.E;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/y.class */
@StabilityInferred(parameters = 1)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f81963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f81964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Long f81965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Long f81966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Integer f81967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f81968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f81969g;

    @Nullable
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f81970i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final String f81971j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final String f81972k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final Long f81973l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final Long f81974m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final Long f81975n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final Long f81976o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final String f81977p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final String f81978q;

    public y(long j7, long j8, @Nullable Long l7, @Nullable Long l8, @Nullable Integer num, @NotNull String str, long j9, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Long l9, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable String str6, @Nullable String str7) {
        this.f81963a = j7;
        this.f81964b = j8;
        this.f81965c = l7;
        this.f81966d = l8;
        this.f81967e = num;
        this.f81968f = str;
        this.f81969g = j9;
        this.h = str2;
        this.f81970i = str3;
        this.f81971j = str4;
        this.f81972k = str5;
        this.f81973l = l9;
        this.f81974m = l10;
        this.f81975n = l11;
        this.f81976o = l12;
        this.f81977p = str6;
        this.f81978q = str7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        yVar.getClass();
        return Intrinsics.areEqual("vendor_oppo_xiaobu_memory", "vendor_oppo_xiaobu_memory") && Intrinsics.areEqual("b3Blbl9hcHBfZnJvbV90eXBlPWRlZXBsaW5rJm9wZW5fYXBwX2FkZGl0aW9uPXsiYnNvdXJjZSI6InZlbmRvcl9vcHBvX3hpYW9idV9tZW1vcnkifQ==", "b3Blbl9hcHBfZnJvbV90eXBlPWRlZXBsaW5rJm9wZW5fYXBwX2FkZGl0aW9uPXsiYnNvdXJjZSI6InZlbmRvcl9vcHBvX3hpYW9idV9tZW1vcnkifQ==") && this.f81963a == yVar.f81963a && this.f81964b == yVar.f81964b && Intrinsics.areEqual(this.f81965c, yVar.f81965c) && Intrinsics.areEqual(this.f81966d, yVar.f81966d) && Intrinsics.areEqual(this.f81967e, yVar.f81967e) && Intrinsics.areEqual(this.f81968f, yVar.f81968f) && this.f81969g == yVar.f81969g && Intrinsics.areEqual(this.h, yVar.h) && Intrinsics.areEqual(this.f81970i, yVar.f81970i) && Intrinsics.areEqual(this.f81971j, yVar.f81971j) && Intrinsics.areEqual(this.f81972k, yVar.f81972k) && Intrinsics.areEqual(this.f81973l, yVar.f81973l) && Intrinsics.areEqual(this.f81974m, yVar.f81974m) && Intrinsics.areEqual(this.f81975n, yVar.f81975n) && Intrinsics.areEqual(this.f81976o, yVar.f81976o) && Intrinsics.areEqual(this.f81977p, yVar.f81977p) && Intrinsics.areEqual(this.f81978q, yVar.f81978q);
    }

    public final int hashCode() {
        int iA = C3554n0.a(C3554n0.a(-372894261, 31, this.f81963a), 31, this.f81964b);
        int iHashCode = 0;
        Long l7 = this.f81965c;
        int iHashCode2 = l7 == null ? 0 : l7.hashCode();
        Long l8 = this.f81966d;
        int iHashCode3 = l8 == null ? 0 : l8.hashCode();
        Integer num = this.f81967e;
        int iA2 = C3554n0.a(E.a((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + (num == null ? 0 : num.hashCode())) * 31, 31, this.f81968f), 31, this.f81969g);
        String str = this.h;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.f81970i;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f81971j;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f81972k;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        Long l9 = this.f81973l;
        int iHashCode8 = l9 == null ? 0 : l9.hashCode();
        Long l10 = this.f81974m;
        int iHashCode9 = l10 == null ? 0 : l10.hashCode();
        Long l11 = this.f81975n;
        int iHashCode10 = l11 == null ? 0 : l11.hashCode();
        Long l12 = this.f81976o;
        int iHashCode11 = l12 == null ? 0 : l12.hashCode();
        String str5 = this.f81977p;
        int iHashCode12 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.f81978q;
        if (str6 != null) {
            iHashCode = str6.hashCode();
        }
        return ((((((((((((((((((iA2 + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoURIConstructData(bSource=vendor_oppo_xiaobu_memory, h5Awaken=b3Blbl9hcHBfZnJvbV90eXBlPWRlZXBsaW5rJm9wZW5fYXBwX2FkZGl0aW9uPXsiYnNvdXJjZSI6InZlbmRvcl9vcHBvX3hpYW9idV9tZW1vcnkifQ==, aid=");
        sb.append(this.f81963a);
        sb.append(", cid=");
        sb.append(this.f81964b);
        sb.append(", seasonId=");
        sb.append(this.f81965c);
        sb.append(", epId=");
        sb.append(this.f81966d);
        sb.append(", page=");
        sb.append(this.f81967e);
        sb.append(", pageType=");
        sb.append(this.f81968f);
        sb.append(", progressMs=");
        sb.append(this.f81969g);
        sb.append(", shareUrl=");
        sb.append(this.h);
        sb.append(", spmid=");
        sb.append(this.f81970i);
        sb.append(", title=");
        sb.append(this.f81971j);
        sb.append(", description=");
        sb.append(this.f81972k);
        sb.append(", playCount=");
        sb.append(this.f81973l);
        sb.append(", likeCount=");
        sb.append(this.f81974m);
        sb.append(", collectCount=");
        sb.append(this.f81975n);
        sb.append(", shareCount=");
        sb.append(this.f81976o);
        sb.append(", userName=");
        sb.append(this.f81977p);
        sb.append(", fans=");
        return C8770a.a(sb, this.f81978q, ")");
    }
}
