package com.bilibili.ship.theseus.ogv.intro.role;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/RolesData_JsonDescriptor.class */
public final class RolesData_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93446a = {new PojoPropertyDescriptor("characters", (String[]) null, RoleGroups.class, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("more", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 1)};

    public RolesData_JsonDescriptor() {
        super(RolesData.class, f93446a);
    }

    public final Object constructWith(Object[] objArr) {
        return new RolesData((RoleGroups) objArr[0], (String) objArr[1], (String) objArr[2], (Map) objArr[3]);
    }

    public final Object get(Object obj, int i7) {
        RolesData rolesData = (RolesData) obj;
        if (i7 == 0) {
            return rolesData.a();
        }
        if (i7 == 1) {
            return rolesData.f93443b;
        }
        if (i7 == 2) {
            return rolesData.f93444c;
        }
        if (i7 != 3) {
            return null;
        }
        return rolesData.f93445d;
    }
}
