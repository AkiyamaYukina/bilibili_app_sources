package com.bilibili.ship.theseus.ogv.intro.followup;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/VipInfo_JsonDescriptor.class */
public final class VipInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93068a = {new PojoPropertyDescriptor("is_vip", (String[]) null, Boolean.TYPE, (Class) null, 5)};

    public VipInfo_JsonDescriptor() {
        super(VipInfo.class, f93068a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Boolean bool = (Boolean) objArr[0];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new VipInfo(zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        VipInfo vipInfo = (VipInfo) obj;
        if (i7 != 0) {
            return null;
        }
        return Boolean.valueOf(vipInfo.f93067a);
    }
}
