package com.bilibili.ogv.misc.follow.api.entity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/NewEp_JsonDescriptor.class */
public final class NewEp_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69146a = {new PojoPropertyDescriptor("id", (String[]) null, Long.TYPE, (Class) null, 3), new PojoPropertyDescriptor("index_show", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("is_new", (String[]) null, Boolean.TYPE, (Class) null, 7)};

    public NewEp_JsonDescriptor() {
        super(NewEp.class, f69146a);
    }

    public final Object constructWith(Object[] objArr) {
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Long l7 = (Long) obj;
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        String str = (String) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        Boolean bool = (Boolean) obj3;
        return new NewEp(jLongValue, i9, str, bool == null ? false : bool.booleanValue());
    }

    public final Object get(Object obj, int i7) {
        NewEp newEp = (NewEp) obj;
        if (i7 == 0) {
            return Long.valueOf(newEp.f69143a);
        }
        if (i7 == 1) {
            return newEp.a();
        }
        if (i7 != 2) {
            return null;
        }
        return Boolean.valueOf(newEp.b());
    }
}
