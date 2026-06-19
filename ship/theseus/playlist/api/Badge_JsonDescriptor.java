package com.bilibili.ship.theseus.playlist.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/Badge_JsonDescriptor.class */
public final class Badge_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f95196a = {new PojoPropertyDescriptor("text", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("bg_style", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("img", (String[]) null, String.class, (Class) null, 5)};

    public Badge_JsonDescriptor() {
        super(Badge.class, f95196a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        String str = (String) objArr[0];
        Integer num = (Integer) objArr[1];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new Badge(str, iIntValue, (String) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        Badge badge = (Badge) obj;
        if (i7 == 0) {
            return badge.c();
        }
        if (i7 == 1) {
            return Integer.valueOf(badge.a());
        }
        if (i7 != 2) {
            return null;
        }
        return badge.b();
    }
}
