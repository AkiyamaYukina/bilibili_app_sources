package com.bilibili.ship.theseus.ogv.intro.floatlayer.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/bean/Rating_JsonDescriptor.class */
public final class Rating_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f92899a = {new PojoPropertyDescriptor("score", (String[]) null, Float.TYPE, (Class) null, 5), new PojoPropertyDescriptor("count", (String[]) null, String.class, (Class) null, 5)};

    public Rating_JsonDescriptor() {
        super(Rating.class, f92899a);
    }

    public final Object constructWith(Object[] objArr) {
        Float f7 = (Float) objArr[0];
        return new Rating(f7 == null ? 0.0f : f7.floatValue(), (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        Rating rating = (Rating) obj;
        if (i7 == 0) {
            return Float.valueOf(rating.f92897a);
        }
        if (i7 != 1) {
            return null;
        }
        return rating.f92898b;
    }
}
