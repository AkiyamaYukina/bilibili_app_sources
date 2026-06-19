package com.bilibili.ship.theseus.ogv.intro.role;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/RoleGroup_JsonDescriptor.class */
public final class RoleGroup_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93438a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("characters", (String[]) null, Types.parameterizedType(List.class, new Type[]{Role.class}), (Class) null, 21)};

    public RoleGroup_JsonDescriptor() {
        super(RoleGroup.class, f93438a);
    }

    public final Object constructWith(Object[] objArr) {
        return new RoleGroup((String) objArr[0], (List) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        RoleGroup roleGroup = (RoleGroup) obj;
        if (i7 == 0) {
            return roleGroup.f93436a;
        }
        if (i7 != 1) {
            return null;
        }
        return roleGroup.a();
    }
}
