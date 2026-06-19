package com.bilibili.ship.theseus.ogv.intro.section.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/StatNumber_JsonDescriptor.class */
public final class StatNumber_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93588a = {new PojoPropertyDescriptor("value", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("text", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("icon", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("pure_text", (String[]) null, String.class, (Class) null, 5)};

    public StatNumber_JsonDescriptor() {
        super(StatNumber.class, f93588a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        String str = (String) objArr[1];
        Object obj = objArr[2];
        if (obj == null) {
            i7 = 4;
        }
        return new StatNumber(jLongValue, str, (String) obj, (String) objArr[3], i7);
    }

    public final Object get(Object obj, int i7) {
        StatNumber statNumber = (StatNumber) obj;
        if (i7 == 0) {
            return Long.valueOf(statNumber.f93584a);
        }
        if (i7 == 1) {
            return statNumber.f93585b;
        }
        if (i7 == 2) {
            return statNumber.f93586c;
        }
        if (i7 != 3) {
            return null;
        }
        return statNumber.f93587d;
    }
}
