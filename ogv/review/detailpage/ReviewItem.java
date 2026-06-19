package com.bilibili.ogv.review.detailpage;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ogv.review.data.ReviewType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/ReviewItem.class */
@StabilityInferred(parameters = 0)
@Bson
public final class ReviewItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f72287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ReviewLikeStat f72288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f72289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ReviewType f72290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Author f72291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f72292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f72293g;
    public final long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f72294i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f72295j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f72296k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final String f72297l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient long f72298m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public transient ExposureEntry f72299n;

    public ReviewItem(long j7, @NotNull ReviewLikeStat reviewLikeStat, @Nullable String str, @NotNull ReviewType reviewType, @Nullable Author author, @NotNull String str2, long j8, long j9, int i7, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        this.f72287a = j7;
        this.f72288b = reviewLikeStat;
        this.f72289c = str;
        this.f72290d = reviewType;
        this.f72291e = author;
        this.f72292f = str2;
        this.f72293g = j8;
        this.h = j9;
        this.f72294i = i7;
        this.f72295j = str3;
        this.f72296k = str4;
        this.f72297l = str5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewItem)) {
            return false;
        }
        ReviewItem reviewItem = (ReviewItem) obj;
        return this.f72287a == reviewItem.f72287a && Intrinsics.areEqual(this.f72288b, reviewItem.f72288b) && Intrinsics.areEqual(this.f72289c, reviewItem.f72289c) && this.f72290d == reviewItem.f72290d && Intrinsics.areEqual(this.f72291e, reviewItem.f72291e) && Intrinsics.areEqual(this.f72292f, reviewItem.f72292f) && this.f72293g == reviewItem.f72293g && this.h == reviewItem.h && this.f72294i == reviewItem.f72294i && Intrinsics.areEqual(this.f72295j, reviewItem.f72295j) && Intrinsics.areEqual(this.f72296k, reviewItem.f72296k) && Intrinsics.areEqual(this.f72297l, reviewItem.f72297l);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f72287a);
        int iHashCode2 = this.f72288b.hashCode();
        int iHashCode3 = 0;
        String str = this.f72289c;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = this.f72290d.hashCode();
        Author author = this.f72291e;
        if (author != null) {
            iHashCode3 = author.hashCode();
        }
        return this.f72297l.hashCode() + E.a(E.a(I.a(this.f72294i, C3554n0.a(C3554n0.a(E.a((((iHashCode5 + ((((iHashCode2 + (iHashCode * 31)) * 31) + iHashCode4) * 31)) * 31) + iHashCode3) * 31, 31, this.f72292f), 31, this.f72293g), 31, this.h), 31), 31, this.f72295j), 31, this.f72296k);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewItem(oid=");
        sb.append(this.f72287a);
        sb.append(", stat=");
        sb.append(this.f72288b);
        sb.append(", progress=");
        sb.append(this.f72289c);
        sb.append(", type=");
        sb.append(this.f72290d);
        sb.append(", author=");
        sb.append(this.f72291e);
        sb.append(", pushTimeStr=");
        sb.append(this.f72292f);
        sb.append(", pushTime=");
        sb.append(this.f72293g);
        sb.append(", reviewId=");
        sb.append(this.h);
        sb.append(", score=");
        sb.append(this.f72294i);
        sb.append(", title=");
        sb.append(this.f72295j);
        sb.append(", content=");
        sb.append(this.f72296k);
        sb.append(", url=");
        return C8770a.a(sb, this.f72297l, ")");
    }
}
