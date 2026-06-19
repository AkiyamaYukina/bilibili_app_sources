package com.bilibili.ogv.pub.review.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.pub.review.bean.ReviewMediaBase;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewMediaBase_ReviewArea_JsonDescriptor.class */
public final class ReviewMediaBase_ReviewArea_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71720a = {new PojoPropertyDescriptor("id", (String[]) null, Integer.TYPE, (Class) null, 7), new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 6)};

    public ReviewMediaBase_ReviewArea_JsonDescriptor() {
        super(ReviewMediaBase.ReviewArea.class, f71720a);
    }

    public final Object constructWith(Object[] objArr) {
        ReviewMediaBase.ReviewArea reviewArea = new ReviewMediaBase.ReviewArea();
        Object obj = objArr[0];
        if (obj != null) {
            reviewArea.f71714a = ((Integer) obj).intValue();
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            reviewArea.f71715b = (String) obj2;
        }
        return reviewArea;
    }

    public final Object get(Object obj, int i7) {
        ReviewMediaBase.ReviewArea reviewArea = (ReviewMediaBase.ReviewArea) obj;
        if (i7 == 0) {
            return Integer.valueOf(reviewArea.f71714a);
        }
        if (i7 != 1) {
            return null;
        }
        return reviewArea.f71715b;
    }
}
