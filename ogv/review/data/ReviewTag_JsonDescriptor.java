package com.bilibili.ogv.review.data;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/data/ReviewTag_JsonDescriptor.class */
public final class ReviewTag_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f72223a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("type", (String[]) null, ReviewType.class, (Class) null, 7)};

    public ReviewTag_JsonDescriptor() {
        super(ReviewTag.class, f72223a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        String str = (String) objArr[0];
        Object obj = objArr[1];
        if (obj == null) {
            i7 = 2;
        }
        return new ReviewTag(str, (ReviewType) obj, i7);
    }

    public final Object get(Object obj, int i7) {
        ReviewTag reviewTag = (ReviewTag) obj;
        if (i7 == 0) {
            return reviewTag.f72221a;
        }
        if (i7 != 1) {
            return null;
        }
        return reviewTag.f72222b;
    }
}
