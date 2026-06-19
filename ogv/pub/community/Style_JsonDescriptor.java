package com.bilibili.ogv.pub.community;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/community/Style_JsonDescriptor.class */
public final class Style_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71538a = {new PojoPropertyDescriptor("id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 5)};

    public Style_JsonDescriptor() {
        super(Style.class, f71538a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        return new Style(l7 == null ? 0L : l7.longValue(), (String) objArr[1], (String) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        Style style = (Style) obj;
        if (i7 == 0) {
            return Long.valueOf(style.f71535a);
        }
        if (i7 == 1) {
            return style.f71536b;
        }
        if (i7 != 2) {
            return null;
        }
        return style.f71537c;
    }
}
