package com.bilibili.ogv.review.data;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.pub.review.bean.ReviewAuthor;
import com.bilibili.ogv.pub.review.bean.ReviewMediaBase;
import com.bilibili.ogv.pub.review.bean.SimpleRating;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/data/ReviewLongDetail_JsonDescriptor.class */
public final class ReviewLongDetail_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f72220a = {new PojoPropertyDescriptor("review_id", (String[]) null, Long.TYPE, (Class) null, 7), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("author", (String[]) null, ReviewAuthor.class, (Class) null, 6), new PojoPropertyDescriptor("user_rating", (String[]) null, SimpleRating.class, (Class) null, 6), new PojoPropertyDescriptor("media", (String[]) null, ReviewMediaBase.class, (Class) null, 6)};

    public ReviewLongDetail_JsonDescriptor() {
        super(ReviewLongDetail.class, f72220a);
    }

    public final Object constructWith(Object[] objArr) {
        ReviewLongDetail reviewLongDetail = new ReviewLongDetail();
        Object obj = objArr[0];
        if (obj != null) {
            reviewLongDetail.f72215a = ((Long) obj).longValue();
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            reviewLongDetail.f72216b = (String) obj2;
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            reviewLongDetail.f72217c = (ReviewAuthor) obj3;
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            reviewLongDetail.f72218d = (SimpleRating) obj4;
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            reviewLongDetail.f72219e = (ReviewMediaBase) obj5;
        }
        return reviewLongDetail;
    }

    public final Object get(Object obj, int i7) {
        ReviewLongDetail reviewLongDetail = (ReviewLongDetail) obj;
        if (i7 == 0) {
            return Long.valueOf(reviewLongDetail.f72215a);
        }
        if (i7 == 1) {
            return reviewLongDetail.f72216b;
        }
        if (i7 == 2) {
            return reviewLongDetail.f72217c;
        }
        if (i7 == 3) {
            return reviewLongDetail.f72218d;
        }
        if (i7 != 4) {
            return null;
        }
        return reviewLongDetail.f72219e;
    }
}
