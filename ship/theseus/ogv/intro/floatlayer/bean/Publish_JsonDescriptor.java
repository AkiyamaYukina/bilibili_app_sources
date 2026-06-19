package com.bilibili.ship.theseus.ogv.intro.floatlayer.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/bean/Publish_JsonDescriptor.class */
public final class Publish_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f92896a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("pub_time", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("pub_time_show", (String[]) null, String.class, (Class) null, 5);
        Class cls = Boolean.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("is_started", (String[]) null, cls, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("is_finish", (String[]) null, cls, (Class) null, 5);
        Class cls2 = Integer.TYPE;
        f92896a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, new PojoPropertyDescriptor("weekday", (String[]) null, cls2, (Class) null, 5), new PojoPropertyDescriptor("release_date_show", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("time_length_show", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("unknow_pub_date", (String[]) null, cls2, (Class) null, 5)};
    }

    public Publish_JsonDescriptor() {
        super(Publish.class, f92896a);
    }

    public final Object constructWith(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        Boolean bool = (Boolean) objArr[2];
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        Boolean bool2 = (Boolean) objArr[3];
        boolean zBooleanValue2 = bool2 == null ? false : bool2.booleanValue();
        Integer num = (Integer) objArr[4];
        int iIntValue = num == null ? 0 : num.intValue();
        String str3 = (String) objArr[5];
        String str4 = (String) objArr[6];
        Integer num2 = (Integer) objArr[7];
        return new Publish(iIntValue, num2 == null ? 0 : num2.intValue(), str, str2, str3, str4, zBooleanValue, zBooleanValue2);
    }

    public final Object get(Object obj, int i7) {
        Publish publish = (Publish) obj;
        switch (i7) {
            case 0:
                return publish.f92889a;
            case 1:
                return publish.f92890b;
            case 2:
                return Boolean.valueOf(publish.f92891c);
            case 3:
                return Boolean.valueOf(publish.f92892d);
            case 4:
                return Integer.valueOf(publish.f92893e);
            case 5:
                return publish.f92894f;
            case 6:
                return publish.f92895g;
            case 7:
                return Integer.valueOf(publish.h);
            default:
                return null;
        }
    }
}
