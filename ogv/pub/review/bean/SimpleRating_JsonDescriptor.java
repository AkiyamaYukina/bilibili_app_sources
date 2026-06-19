package com.bilibili.ogv.pub.review.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/SimpleRating_JsonDescriptor.class */
public final class SimpleRating_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71757a = {new PojoPropertyDescriptor("score", (String[]) null, Integer.TYPE, (Class) null, 3)};

    public SimpleRating_JsonDescriptor() {
        super(SimpleRating.class, f71757a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Integer num = (Integer) obj;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new SimpleRating(iIntValue, i7);
    }

    public final Object get(Object obj, int i7) {
        SimpleRating simpleRating = (SimpleRating) obj;
        if (i7 != 0) {
            return null;
        }
        return Integer.valueOf(simpleRating.f71756a);
    }
}
