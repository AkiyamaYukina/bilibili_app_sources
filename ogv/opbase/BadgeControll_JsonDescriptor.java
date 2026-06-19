package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/BadgeControll_JsonDescriptor.class */
public final class BadgeControll_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69666a = {new PojoPropertyDescriptor("type", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("data", (String[]) null, NewestTime.class, (Class) null, 4)};

    public BadgeControll_JsonDescriptor() {
        super(BadgeControll.class, f69666a);
    }

    public final Object constructWith(Object[] objArr) {
        return new BadgeControll((String) objArr[0], (NewestTime) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        BadgeControll badgeControll = (BadgeControll) obj;
        if (i7 == 0) {
            return badgeControll.f69664a;
        }
        if (i7 != 1) {
            return null;
        }
        return badgeControll.a();
    }
}
