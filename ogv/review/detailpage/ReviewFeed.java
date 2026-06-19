package com.bilibili.ogv.review.detailpage;

import I.E;
import K7.L;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogv.pub.community.MediaInfo;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/ReviewFeed.class */
@StabilityInferred(parameters = 0)
@Bson
public final class ReviewFeed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f72280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MediaInfo f72281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f72282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f72283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<ReviewItem> f72284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("topItem")
    @Nullable
    private ReviewItem f72285f;

    public ReviewFeed() {
        throw null;
    }

    public ReviewFeed(int i7, MediaInfo mediaInfo, String str, boolean z6, List list, ReviewItem reviewItem, int i8) {
        list = (i8 & 16) != 0 ? new ArrayList() : list;
        reviewItem = (i8 & 32) != 0 ? null : reviewItem;
        this.f72280a = i7;
        this.f72281b = mediaInfo;
        this.f72282c = str;
        this.f72283d = z6;
        this.f72284e = list;
        this.f72285f = reviewItem;
    }

    @Nullable
    public final ReviewItem a() {
        return this.f72285f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewFeed)) {
            return false;
        }
        ReviewFeed reviewFeed = (ReviewFeed) obj;
        return this.f72280a == reviewFeed.f72280a && Intrinsics.areEqual(this.f72281b, reviewFeed.f72281b) && Intrinsics.areEqual(this.f72282c, reviewFeed.f72282c) && this.f72283d == reviewFeed.f72283d && Intrinsics.areEqual(this.f72284e, reviewFeed.f72284e) && Intrinsics.areEqual(this.f72285f, reviewFeed.f72285f);
    }

    public final int hashCode() {
        int iA = e0.a(z.a(E.a((this.f72281b.hashCode() + (Integer.hashCode(this.f72280a) * 31)) * 31, 31, this.f72282c), 31, this.f72283d), 31, this.f72284e);
        ReviewItem reviewItem = this.f72285f;
        return iA + (reviewItem == null ? 0 : reviewItem.hashCode());
    }

    @NotNull
    public final String toString() {
        List<ReviewItem> list = this.f72284e;
        ReviewItem reviewItem = this.f72285f;
        StringBuilder sb = new StringBuilder("ReviewFeed(id=");
        sb.append(this.f72280a);
        sb.append(", mediaInfo=");
        sb.append(this.f72281b);
        sb.append(", nextCursor=");
        sb.append(this.f72282c);
        sb.append(", hasNext=");
        L.b(sb, this.f72283d, ", modules=", list, ", topItem=");
        sb.append(reviewItem);
        sb.append(")");
        return sb.toString();
    }
}
