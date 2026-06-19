package com.bilibili.ogv.review.data;

import androidx.annotation.Nullable;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogv.pub.review.bean.ReviewAuthor;
import com.bilibili.ogv.pub.review.bean.ReviewMediaBase;
import com.bilibili.ogv.pub.review.bean.SimpleRating;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/data/ReviewLongDetail.class */
@Bson
public final class ReviewLongDetail {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("review_id")
    public long f72215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("title")
    public String f72216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("author")
    @Nullable
    public ReviewAuthor f72217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("user_rating")
    @Nullable
    public SimpleRating f72218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("media")
    @Nullable
    public ReviewMediaBase f72219e;
}
