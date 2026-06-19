package com.bilibili.ogv.pub.review.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.pub.review.bean.ReviewMediaBase;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewMediaBase_ReviewParam_JsonDescriptor.class */
public final class ReviewMediaBase_ReviewParam_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71721a = {new PojoPropertyDescriptor("id", (String[]) null, Long.TYPE, (Class) null, 7)};

    public ReviewMediaBase_ReviewParam_JsonDescriptor() {
        super(ReviewMediaBase.ReviewParam.class, f71721a);
    }

    public final Object constructWith(Object[] objArr) {
        ReviewMediaBase.ReviewParam reviewParam = new ReviewMediaBase.ReviewParam();
        Object obj = objArr[0];
        if (obj != null) {
            reviewParam.f71716a = ((Long) obj).longValue();
        }
        return reviewParam;
    }

    public final Object get(Object obj, int i7) {
        ReviewMediaBase.ReviewParam reviewParam = (ReviewMediaBase.ReviewParam) obj;
        if (i7 != 0) {
            return null;
        }
        return Long.valueOf(reviewParam.f71716a);
    }
}
