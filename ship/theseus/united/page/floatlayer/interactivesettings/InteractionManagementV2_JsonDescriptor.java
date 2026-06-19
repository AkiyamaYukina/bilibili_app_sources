package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractionManagementV2_JsonDescriptor.class */
public final class InteractionManagementV2_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f99771a = {new PojoPropertyDescriptor("can_show", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("interaction_list", (String[]) null, Types.parameterizedType(List.class, new Type[]{InteractionSection.class}), (Class) null, 23)};

    public InteractionManagementV2_JsonDescriptor() {
        super(InteractionManagementV2.class, f99771a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Boolean bool = (Boolean) objArr[0];
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        Object obj = objArr[1];
        if (obj == null) {
            i7 = 2;
        }
        return new InteractionManagementV2(i7, (List) obj, zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        InteractionManagementV2 interactionManagementV2 = (InteractionManagementV2) obj;
        if (i7 == 0) {
            return Boolean.valueOf(interactionManagementV2.a());
        }
        if (i7 != 1) {
            return null;
        }
        return interactionManagementV2.b();
    }
}
