package com.bilibili.ogvcommon.play.vo.base;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/base/ImageVo_JsonDescriptor.class */
public final class ImageVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73343a = {new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 1)};

    public ImageVo_JsonDescriptor() {
        super(ImageVo.class, f73343a);
    }

    public final Object constructWith(Object[] objArr) {
        return new ImageVo((String) objArr[0]);
    }

    public final Object get(Object obj, int i7) {
        ImageVo imageVo = (ImageVo) obj;
        if (i7 != 0) {
            return null;
        }
        return imageVo.f73342a;
    }
}
