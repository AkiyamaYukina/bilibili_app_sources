package com.bilibili.ogv.pub.community;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/community/Area_JsonDescriptor.class */
public final class Area_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71488a = {new PojoPropertyDescriptor("id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 5)};

    public Area_JsonDescriptor() {
        super(Area.class, f71488a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        return new Area(l7 == null ? 0L : l7.longValue(), (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        Area area = (Area) obj;
        if (i7 == 0) {
            return Long.valueOf(area.f71486a);
        }
        if (i7 != 1) {
            return null;
        }
        return area.f71487b;
    }
}
