package com.bilibili.ship.theseus.ogv.intro.section.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/MoreLeft_JsonDescriptor.class */
public final class MoreLeft_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93544a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 5)};

    public MoreLeft_JsonDescriptor() {
        super(MoreLeft.class, f93544a);
    }

    public final Object constructWith(Object[] objArr) {
        return new MoreLeft((String) objArr[0], (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        MoreLeft moreLeft = (MoreLeft) obj;
        if (i7 == 0) {
            return moreLeft.f93542a;
        }
        if (i7 != 1) {
            return null;
        }
        return moreLeft.f93543b;
    }
}
