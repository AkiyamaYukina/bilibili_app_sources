package com.bilibili.ship.theseus.ogv.intro.floatlayer.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/bean/Actor_JsonDescriptor.class */
public final class Actor_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f92829a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("info", (String[]) null, String.class, (Class) null, 5)};

    public Actor_JsonDescriptor() {
        super(Actor.class, f92829a);
    }

    public final Object constructWith(Object[] objArr) {
        return new Actor((String) objArr[0], (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        Actor actor = (Actor) obj;
        if (i7 == 0) {
            return actor.f92827a;
        }
        if (i7 != 1) {
            return null;
        }
        return actor.f92828b;
    }
}
