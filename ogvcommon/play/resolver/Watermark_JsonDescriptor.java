package com.bilibili.ogvcommon.play.resolver;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/Watermark_JsonDescriptor.class */
public final class Watermark_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73253a = {new PojoPropertyDescriptor("icon", (String[]) null, String.class, (Class) null, 0), new PojoPropertyDescriptor("text", (String[]) null, String.class, (Class) null, 1)};

    public Watermark_JsonDescriptor() {
        super(Watermark.class, f73253a);
    }

    public final Object constructWith(Object[] objArr) {
        return new Watermark((String) objArr[0], (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        Watermark watermark = (Watermark) obj;
        if (i7 == 0) {
            return watermark.f73251a;
        }
        if (i7 != 1) {
            return null;
        }
        return watermark.f73252b;
    }
}
