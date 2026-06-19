package com.bilibili.ogv.review.detailpage;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/ReviewLikeStat_JsonDescriptor.class */
public final class ReviewLikeStat_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f72303a = {new PojoPropertyDescriptor("likes", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("liked", (String[]) null, Boolean.TYPE, (Class) null, 5)};

    public ReviewLikeStat_JsonDescriptor() {
        super(ReviewLikeStat.class, f72303a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Boolean bool = (Boolean) objArr[1];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new ReviewLikeStat(jLongValue, zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        ReviewLikeStat reviewLikeStat = (ReviewLikeStat) obj;
        if (i7 == 0) {
            return Long.valueOf(reviewLikeStat.f72301a);
        }
        if (i7 != 1) {
            return null;
        }
        return Boolean.valueOf(reviewLikeStat.f72302b);
    }
}
