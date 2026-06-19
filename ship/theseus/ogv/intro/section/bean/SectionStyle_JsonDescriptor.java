package com.bilibili.ship.theseus.ogv.intro.section.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/SectionStyle_JsonDescriptor.class */
public final class SectionStyle_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93583a;

    static {
        Class cls = Boolean.TYPE;
        f93583a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("hidden", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("line", (String[]) null, cls, (Class) null, 5)};
    }

    public SectionStyle_JsonDescriptor() {
        super(SectionStyle.class, f93583a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Boolean bool = (Boolean) objArr[0];
        boolean zBooleanValue2 = bool == null ? false : bool.booleanValue();
        Boolean bool2 = (Boolean) objArr[1];
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        }
        return new SectionStyle(zBooleanValue2, zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        SectionStyle sectionStyle = (SectionStyle) obj;
        if (i7 == 0) {
            return Boolean.valueOf(sectionStyle.f93581a);
        }
        if (i7 != 1) {
            return null;
        }
        return Boolean.valueOf(sectionStyle.f93582b);
    }
}
