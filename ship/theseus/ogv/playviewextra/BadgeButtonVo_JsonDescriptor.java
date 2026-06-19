package com.bilibili.ship.theseus.ogv.playviewextra;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playviewextra/BadgeButtonVo_JsonDescriptor.class */
public final class BadgeButtonVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94342a = {new PojoPropertyDescriptor("action_type", (String[]) null, String.class, (Class) null, 4)};

    public BadgeButtonVo_JsonDescriptor() {
        super(BadgeButtonVo.class, f94342a);
    }

    public final Object constructWith(Object[] objArr) {
        return new BadgeButtonVo((String) objArr[0]);
    }

    public final Object get(Object obj, int i7) {
        BadgeButtonVo badgeButtonVo = (BadgeButtonVo) obj;
        if (i7 != 0) {
            return null;
        }
        return badgeButtonVo.a();
    }
}
