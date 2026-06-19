package com.bilibili.ogv.pub.review.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/MediaRating_JsonDescriptor.class */
public final class MediaRating_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71697a = {new PojoPropertyDescriptor("score", (String[]) null, Float.TYPE, (Class) null, 7), new PojoPropertyDescriptor("count", (String[]) null, Integer.TYPE, (Class) null, 7)};

    public MediaRating_JsonDescriptor() {
        super(MediaRating.class, f71697a);
    }

    public final Object constructWith(Object[] objArr) {
        MediaRating mediaRating = new MediaRating();
        Object obj = objArr[0];
        if (obj != null) {
            mediaRating.f71695a = ((Float) obj).floatValue();
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            mediaRating.f71696b = ((Integer) obj2).intValue();
        }
        return mediaRating;
    }

    public final Object get(Object obj, int i7) {
        MediaRating mediaRating = (MediaRating) obj;
        if (i7 == 0) {
            return Float.valueOf(mediaRating.f71695a);
        }
        if (i7 != 1) {
            return null;
        }
        return Integer.valueOf(mediaRating.f71696b);
    }
}
