package com.bilibili.module.vip.combine;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/VipPrivilegeButton_JsonDescriptor.class */
public final class VipPrivilegeButton_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f66171a = {new PojoPropertyDescriptor("text", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("action_type", (String[]) null, VipActionType.class, (Class) null, 7), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 4)};

    public VipPrivilegeButton_JsonDescriptor() {
        super(VipPrivilegeButton.class, f66171a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        String str = (String) objArr[0];
        Object obj = objArr[1];
        if (obj == null) {
            i7 = 2;
        }
        return new VipPrivilegeButton(str, (VipActionType) obj, (String) objArr[2], i7);
    }

    public final Object get(Object obj, int i7) {
        VipPrivilegeButton vipPrivilegeButton = (VipPrivilegeButton) obj;
        if (i7 == 0) {
            return vipPrivilegeButton.f66168a;
        }
        if (i7 == 1) {
            return vipPrivilegeButton.f66169b;
        }
        if (i7 != 2) {
            return null;
        }
        return vipPrivilegeButton.f66170c;
    }
}
