package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsData_JsonDescriptor.class */
public final class InteractiveSettingsData_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f99781a = {new PojoPropertyDescriptor("interaction_management_v2", (String[]) null, InteractionManagementV2.class, (Class) null, 4)};

    public InteractiveSettingsData_JsonDescriptor() {
        super(InteractiveSettingsData.class, f99781a);
    }

    public final Object constructWith(Object[] objArr) {
        return new InteractiveSettingsData((InteractionManagementV2) objArr[0]);
    }

    public final Object get(Object obj, int i7) {
        InteractiveSettingsData interactiveSettingsData = (InteractiveSettingsData) obj;
        if (i7 != 0) {
            return null;
        }
        return interactiveSettingsData.b();
    }
}
