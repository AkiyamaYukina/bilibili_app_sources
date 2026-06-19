package com.bilibili.ogv.pub.community;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/community/Actor_JsonDescriptor.class */
public final class Actor_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71485a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("info", (String[]) null, String.class, (Class) null, 5)};

    public Actor_JsonDescriptor() {
        super(Actor.class, f71485a);
    }

    public final Object constructWith(Object[] objArr) {
        return new Actor((String) objArr[0], (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        Actor actor = (Actor) obj;
        if (i7 == 0) {
            return actor.f71483a;
        }
        if (i7 != 1) {
            return null;
        }
        return actor.f71484b;
    }
}
