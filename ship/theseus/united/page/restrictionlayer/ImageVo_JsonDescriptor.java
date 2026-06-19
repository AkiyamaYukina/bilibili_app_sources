package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/ImageVo_JsonDescriptor.class */
public final class ImageVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102564a = {new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 1)};

    public ImageVo_JsonDescriptor() {
        super(ImageVo.class, f102564a);
    }

    public final Object constructWith(Object[] objArr) {
        return new ImageVo((String) objArr[0]);
    }

    public final Object get(Object obj, int i7) {
        ImageVo imageVo = (ImageVo) obj;
        if (i7 != 0) {
            return null;
        }
        return imageVo.f102563a;
    }
}
