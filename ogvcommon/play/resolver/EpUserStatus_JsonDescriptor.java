package com.bilibili.ogvcommon.play.resolver;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/EpUserStatus_JsonDescriptor.class */
public final class EpUserStatus_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73207a;

    static {
        Class cls = Boolean.TYPE;
        f73207a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("payCheck", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("sponsored", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("watchProgress", (String[]) null, SeasonWatchProgress.class, (Class) null, 1)};
    }

    public EpUserStatus_JsonDescriptor() {
        super(EpUserStatus.class, f73207a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Boolean bool = (Boolean) objArr[0];
        boolean zBooleanValue2 = bool == null ? false : bool.booleanValue();
        Boolean bool2 = (Boolean) objArr[1];
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        }
        return new EpUserStatus(zBooleanValue2, zBooleanValue, (SeasonWatchProgress) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        EpUserStatus epUserStatus = (EpUserStatus) obj;
        if (i7 == 0) {
            return Boolean.valueOf(epUserStatus.f73204a);
        }
        if (i7 == 1) {
            return Boolean.valueOf(epUserStatus.f73205b);
        }
        if (i7 != 2) {
            return null;
        }
        return epUserStatus.f73206c;
    }
}
