package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/DeviceManagementAction_JsonDescriptor.class */
public final class DeviceManagementAction_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102526a = {new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 1)};

    public DeviceManagementAction_JsonDescriptor() {
        super(DeviceManagementAction.class, f102526a);
    }

    public final Object constructWith(Object[] objArr) {
        return new DeviceManagementAction((String) objArr[0]);
    }

    public final Object get(Object obj, int i7) {
        DeviceManagementAction deviceManagementAction = (DeviceManagementAction) obj;
        if (i7 != 0) {
            return null;
        }
        return deviceManagementAction.f102525a;
    }
}
