package com.bilibili.ship.theseus.ogv.intro.role;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/RoleGroups_JsonDescriptor.class */
public final class RoleGroups_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93440a = {new PojoPropertyDescriptor("groups", (String[]) null, Types.parameterizedType(List.class, new Type[]{RoleGroup.class}), (Class) null, 17)};

    public RoleGroups_JsonDescriptor() {
        super(RoleGroups.class, f93440a);
    }

    public final Object constructWith(Object[] objArr) {
        return new RoleGroups((List) objArr[0]);
    }

    public final Object get(Object obj, int i7) {
        RoleGroups roleGroups = (RoleGroups) obj;
        if (i7 != 0) {
            return null;
        }
        return roleGroups.f93439a;
    }
}
