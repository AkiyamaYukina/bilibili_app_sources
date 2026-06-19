package com.bilibili.ogv.pub.review.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.live.streaming.source.TextSource;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/UserReview_JsonDescriptor.class */
public final class UserReview_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71765a;

    static {
        Class cls = Long.TYPE;
        f71765a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("review_id", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor(TextSource.CFG_CONTENT, (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("mtime", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("user_rating", (String[]) null, SimpleRating.class, (Class) null, 6), new PojoPropertyDescriptor("is_coin", (String[]) null, Boolean.TYPE, (Class) null, 7), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("reviewType", (String[]) null, Integer.TYPE, (Class) null, 3)};
    }

    public UserReview_JsonDescriptor() {
        super(UserReview.class, f71765a);
    }

    public final Object constructWith(Object[] objArr) {
        UserReview userReview = new UserReview();
        Object obj = objArr[0];
        if (obj != null) {
            userReview.f71758a = ((Long) obj).longValue();
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            userReview.f71759b = (String) obj2;
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            userReview.f71760c = (String) obj3;
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            userReview.f71761d = ((Long) obj4).longValue();
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            userReview.f71762e = (SimpleRating) obj5;
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            userReview.f71763f = ((Boolean) obj6).booleanValue();
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            userReview.f71764g = (String) obj7;
        }
        Object obj8 = objArr[7];
        if (obj8 != null) {
            userReview.h = ((Integer) obj8).intValue();
        }
        return userReview;
    }

    public final Object get(Object obj, int i7) {
        UserReview userReview = (UserReview) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(userReview.f71758a);
            case 1:
                return userReview.f71759b;
            case 2:
                return userReview.f71760c;
            case 3:
                return Long.valueOf(userReview.f71761d);
            case 4:
                return userReview.f71762e;
            case 5:
                return Boolean.valueOf(userReview.f71763f);
            case 6:
                return userReview.f71764g;
            case 7:
                return Integer.valueOf(userReview.h);
            default:
                return null;
        }
    }
}
