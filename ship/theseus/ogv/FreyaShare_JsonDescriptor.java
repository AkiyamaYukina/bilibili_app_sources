package com.bilibili.ship.theseus.ogv;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/FreyaShare_JsonDescriptor.class */
public final class FreyaShare_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91228a = {new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("token", (String[]) null, String.class, (Class) null, 1)};

    public FreyaShare_JsonDescriptor() {
        super(FreyaShare.class, f91228a);
    }

    public final Object constructWith(Object[] objArr) {
        return new FreyaShare((String) objArr[0], (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        FreyaShare freyaShare = (FreyaShare) obj;
        if (i7 == 0) {
            return freyaShare.f91226a;
        }
        if (i7 != 1) {
            return null;
        }
        return freyaShare.f91227b;
    }
}
