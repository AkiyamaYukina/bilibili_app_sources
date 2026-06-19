package com.bilibili.ogv.pub.review.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.pub.review.bean.ReviewPublishInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewPublishInfo_PublishReview_JsonDescriptor.class */
public final class ReviewPublishInfo_PublishReview_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71734a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("score", (String[]) null, Integer.TYPE, (Class) null, 3);
        Class cls = Boolean.TYPE;
        f71734a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, new PojoPropertyDescriptor("is_open", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("is_coin", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("short_review", (String[]) null, UserReview.class, (Class) null, 6), new PojoPropertyDescriptor("long_review", (String[]) null, UserReview.class, (Class) null, 6)};
    }

    public ReviewPublishInfo_PublishReview_JsonDescriptor() {
        super(ReviewPublishInfo.PublishReview.class, f71734a);
    }

    public final Object constructWith(Object[] objArr) {
        ReviewPublishInfo.PublishReview publishReview = new ReviewPublishInfo.PublishReview();
        Object obj = objArr[0];
        if (obj != null) {
            publishReview.f71728a = ((Integer) obj).intValue();
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            publishReview.f71729b = ((Boolean) obj2).booleanValue();
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            publishReview.f71730c = ((Boolean) obj3).booleanValue();
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            publishReview.f71731d = (UserReview) obj4;
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            publishReview.f71732e = (UserReview) obj5;
        }
        return publishReview;
    }

    public final Object get(Object obj, int i7) {
        ReviewPublishInfo.PublishReview publishReview = (ReviewPublishInfo.PublishReview) obj;
        if (i7 == 0) {
            return Integer.valueOf(publishReview.f71728a);
        }
        if (i7 == 1) {
            return Boolean.valueOf(publishReview.f71729b);
        }
        if (i7 == 2) {
            return Boolean.valueOf(publishReview.f71730c);
        }
        if (i7 == 3) {
            return publishReview.f71731d;
        }
        if (i7 != 4) {
            return null;
        }
        return publishReview.f71732e;
    }
}
