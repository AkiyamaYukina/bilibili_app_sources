package com.bilibili.ogv.review.detailpage;

import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/ReviewLikeStatus_JsonDescriptor.class */
public final class ReviewLikeStatus_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f72305a = {new PojoPropertyDescriptor(NotificationCompat.CATEGORY_STATUS, (String[]) null, String.class, (Class) null, 2)};

    public ReviewLikeStatus_JsonDescriptor() {
        super(ReviewLikeStatus.class, f72305a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
        return new ReviewLikeStatus((String) obj, i7);
    }

    public final Object get(Object obj, int i7) {
        ReviewLikeStatus reviewLikeStatus = (ReviewLikeStatus) obj;
        if (i7 != 0) {
            return null;
        }
        return reviewLikeStatus.f72304a;
    }
}
