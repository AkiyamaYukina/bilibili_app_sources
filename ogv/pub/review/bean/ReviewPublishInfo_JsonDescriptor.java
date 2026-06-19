package com.bilibili.ogv.pub.review.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.pub.review.bean.ReviewPublishInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewPublishInfo_JsonDescriptor.class */
public final class ReviewPublishInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71733a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("media", (String[]) null, ReviewMediaBase.class, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("review", (String[]) null, ReviewPublishInfo.PublishReview.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("userReview", (String[]) null, UserReview.class, (Class) null, 2);
        Class cls = Boolean.TYPE;
        f71733a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, new PojoPropertyDescriptor("toBeEdit", (String[]) null, cls, (Class) null, 3), new PojoPropertyDescriptor("shareToFeed", (String[]) null, cls, (Class) null, 3)};
    }

    public ReviewPublishInfo_JsonDescriptor() {
        super(ReviewPublishInfo.class, f71733a);
    }

    public final Object constructWith(Object[] objArr) {
        ReviewPublishInfo reviewPublishInfo = new ReviewPublishInfo();
        Object obj = objArr[0];
        if (obj != null) {
            reviewPublishInfo.f71723a = (ReviewMediaBase) obj;
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            reviewPublishInfo.f71724b = (ReviewPublishInfo.PublishReview) obj2;
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            reviewPublishInfo.f71725c = (UserReview) obj3;
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            reviewPublishInfo.f71726d = ((Boolean) obj4).booleanValue();
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            reviewPublishInfo.f71727e = ((Boolean) obj5).booleanValue();
        }
        return reviewPublishInfo;
    }

    public final Object get(Object obj, int i7) {
        boolean z6;
        ReviewPublishInfo reviewPublishInfo = (ReviewPublishInfo) obj;
        if (i7 == 0) {
            return reviewPublishInfo.f71723a;
        }
        if (i7 == 1) {
            return reviewPublishInfo.f71724b;
        }
        if (i7 == 2) {
            return reviewPublishInfo.f71725c;
        }
        if (i7 == 3) {
            z6 = reviewPublishInfo.f71726d;
        } else {
            if (i7 != 4) {
                return null;
            }
            z6 = reviewPublishInfo.f71727e;
        }
        return Boolean.valueOf(z6);
    }
}
