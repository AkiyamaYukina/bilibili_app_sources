package com.bilibili.ship.theseus.ogv.playviewextra;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playviewextra/EpUserStatus_JsonDescriptor.class */
public final class EpUserStatus_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94346a;

    static {
        Class cls = Boolean.TYPE;
        f94346a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("pay_check", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("sponsored", new String[]{"sponsor"}, cls, (Class) null, 5), new PojoPropertyDescriptor("can_watch_reason", (String[]) null, String.class, (Class) null, 5)};
    }

    public EpUserStatus_JsonDescriptor() {
        super(EpUserStatus.class, f94346a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Boolean bool = (Boolean) objArr[0];
        boolean zBooleanValue2 = bool == null ? false : bool.booleanValue();
        Boolean bool2 = (Boolean) objArr[1];
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        }
        return new EpUserStatus((String) objArr[2], zBooleanValue2, zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        EpUserStatus epUserStatus = (EpUserStatus) obj;
        if (i7 == 0) {
            return Boolean.valueOf(epUserStatus.f94343a);
        }
        if (i7 == 1) {
            return Boolean.valueOf(epUserStatus.a());
        }
        if (i7 != 2) {
            return null;
        }
        return epUserStatus.f94345c;
    }
}
