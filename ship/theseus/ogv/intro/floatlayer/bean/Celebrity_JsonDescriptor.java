package com.bilibili.ship.theseus.ogv.intro.floatlayer.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/bean/Celebrity_JsonDescriptor.class */
public final class Celebrity_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f92838a = {new PojoPropertyDescriptor("id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("role", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("avatar", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("short_desc", (String[]) null, String.class, (Class) null, 5)};

    public Celebrity_JsonDescriptor() {
        super(Celebrity.class, f92838a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        return new Celebrity(l7 == null ? 0L : l7.longValue(), (String) objArr[1], (String) objArr[2], (String) objArr[3], (String) objArr[4]);
    }

    public final Object get(Object obj, int i7) {
        Celebrity celebrity = (Celebrity) obj;
        if (i7 == 0) {
            return Long.valueOf(celebrity.f92833a);
        }
        if (i7 == 1) {
            return celebrity.f92834b;
        }
        if (i7 == 2) {
            return celebrity.f92835c;
        }
        if (i7 == 3) {
            return celebrity.f92836d;
        }
        if (i7 != 4) {
            return null;
        }
        return celebrity.f92837e;
    }
}
