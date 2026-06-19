package com.bilibili.module.vip.combine;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/VipPrivilege_JsonDescriptor.class */
public final class VipPrivilege_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f66172a = {new PojoPropertyDescriptor("privilege", (String[]) null, VipPaymentTips.class, (Class) null, 5)};

    public VipPrivilege_JsonDescriptor() {
        super(VipPrivilege.class, f66172a);
    }

    public final Object constructWith(Object[] objArr) {
        return new VipPrivilege((VipPaymentTips) objArr[0]);
    }

    public final Object get(Object obj, int i7) {
        VipPrivilege vipPrivilege = (VipPrivilege) obj;
        if (i7 != 0) {
            return null;
        }
        return vipPrivilege.f66167a;
    }
}
