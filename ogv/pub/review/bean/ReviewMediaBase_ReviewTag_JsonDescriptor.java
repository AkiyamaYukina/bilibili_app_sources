package com.bilibili.ogv.pub.review.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.pub.review.bean.ReviewMediaBase;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewMediaBase_ReviewTag_JsonDescriptor.class */
public final class ReviewMediaBase_ReviewTag_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71722a = {new PojoPropertyDescriptor("id", (String[]) null, Integer.TYPE, (Class) null, 7), new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 6)};

    public ReviewMediaBase_ReviewTag_JsonDescriptor() {
        super(ReviewMediaBase.ReviewTag.class, f71722a);
    }

    public final Object constructWith(Object[] objArr) {
        ReviewMediaBase.ReviewTag reviewTag = new ReviewMediaBase.ReviewTag();
        Object obj = objArr[0];
        if (obj != null) {
            reviewTag.f71717a = ((Integer) obj).intValue();
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            reviewTag.f71718b = (String) obj2;
        }
        return reviewTag;
    }

    public final Object get(Object obj, int i7) {
        ReviewMediaBase.ReviewTag reviewTag = (ReviewMediaBase.ReviewTag) obj;
        if (i7 == 0) {
            return Integer.valueOf(reviewTag.f71717a);
        }
        if (i7 != 1) {
            return null;
        }
        return reviewTag.f71718b;
    }
}
