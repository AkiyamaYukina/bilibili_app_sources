package com.bilibili.ogv.misc.follow.api.entity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/Areas_JsonDescriptor.class */
public final class Areas_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69107a = {new PojoPropertyDescriptor("id", (String[]) null, Long.TYPE, (Class) null, 3), new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 2)};

    public Areas_JsonDescriptor() {
        super(Areas.class, f69107a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
        Long l7 = (Long) obj;
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        return new Areas(jLongValue, (String) obj2, i8);
    }

    public final Object get(Object obj, int i7) {
        Areas areas = (Areas) obj;
        if (i7 == 0) {
            return Long.valueOf(areas.f69105a);
        }
        if (i7 != 1) {
            return null;
        }
        return areas.f69106b;
    }
}
