package com.bilibili.ogv.pub.review.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.live.streaming.source.TextSource;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ShortReview_JsonDescriptor.class */
public final class ShortReview_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71755a = {new PojoPropertyDescriptor("review_id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("score", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor(TextSource.CFG_CONTENT, (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("author", (String[]) null, ReviewAuthor.class, (Class) null, 5)};

    public ShortReview_JsonDescriptor() {
        super(ShortReview.class, f71755a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Integer num = (Integer) objArr[1];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new ShortReview(jLongValue, iIntValue, (String) objArr[2], (ReviewAuthor) objArr[3]);
    }

    public final Object get(Object obj, int i7) {
        ShortReview shortReview = (ShortReview) obj;
        if (i7 == 0) {
            return Long.valueOf(shortReview.f71751a);
        }
        if (i7 == 1) {
            return Integer.valueOf(shortReview.f71752b);
        }
        if (i7 == 2) {
            return shortReview.f71753c;
        }
        if (i7 != 3) {
            return null;
        }
        return shortReview.f71754d;
    }
}
