package com.bilibili.ship.theseus.ogv.season;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/Publish_JsonDescriptor.class */
public final class Publish_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94506a;

    static {
        Class cls = Boolean.TYPE;
        f94506a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("is_finish", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("is_started", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("update_info_desc", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("pub_time_show", (String[]) null, String.class, (Class) null, 4)};
    }

    public Publish_JsonDescriptor() {
        super(Publish.class, f94506a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Boolean bool = (Boolean) objArr[0];
        boolean zBooleanValue2 = bool == null ? false : bool.booleanValue();
        Boolean bool2 = (Boolean) objArr[1];
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        }
        return new Publish((String) objArr[2], (String) objArr[3], zBooleanValue2, zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        Publish publish = (Publish) obj;
        if (i7 == 0) {
            return Boolean.valueOf(publish.f94502a);
        }
        if (i7 == 1) {
            return Boolean.valueOf(publish.f94503b);
        }
        if (i7 == 2) {
            return publish.b();
        }
        if (i7 != 3) {
            return null;
        }
        return publish.a();
    }
}
