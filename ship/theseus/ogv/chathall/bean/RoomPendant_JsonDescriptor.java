package com.bilibili.ship.theseus.ogv.chathall.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/bean/RoomPendant_JsonDescriptor.class */
public final class RoomPendant_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91747a = {new PojoPropertyDescriptor("img_url", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 4)};

    public RoomPendant_JsonDescriptor() {
        super(RoomPendant.class, f91747a);
    }

    public final Object constructWith(Object[] objArr) {
        return new RoomPendant((String) objArr[0], (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        RoomPendant roomPendant = (RoomPendant) obj;
        if (i7 == 0) {
            return roomPendant.a();
        }
        if (i7 != 1) {
            return null;
        }
        return roomPendant.b();
    }
}
