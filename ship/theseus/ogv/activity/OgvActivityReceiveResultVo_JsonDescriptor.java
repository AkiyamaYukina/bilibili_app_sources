package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityReceiveResultVo_JsonDescriptor.class */
public final class OgvActivityReceiveResultVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91383a = {new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("text", (String[]) null, String.class, (Class) null, 1)};

    public OgvActivityReceiveResultVo_JsonDescriptor() {
        super(OgvActivityReceiveResultVo.class, f91383a);
    }

    public final Object constructWith(Object[] objArr) {
        return new OgvActivityReceiveResultVo((String) objArr[0], (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        OgvActivityReceiveResultVo ogvActivityReceiveResultVo = (OgvActivityReceiveResultVo) obj;
        if (i7 == 0) {
            return ogvActivityReceiveResultVo.f91381a;
        }
        if (i7 != 1) {
            return null;
        }
        return ogvActivityReceiveResultVo.f91382b;
    }
}
