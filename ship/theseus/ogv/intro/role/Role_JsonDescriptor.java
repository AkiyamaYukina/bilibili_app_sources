package com.bilibili.ship.theseus.ogv.intro.role;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.lib.accountinfo.model.OfficialVerify;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/Role_JsonDescriptor.class */
public final class Role_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93441a;

    static {
        Class cls = Long.TYPE;
        f93441a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("id", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor(EditCustomizeSticker.TAG_MID, (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("avatar", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("desc", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("is_follow", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("official", (String[]) null, OfficialVerify.class, (Class) null, 4), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 0), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 1)};
    }

    public Role_JsonDescriptor() {
        super(Role.class, f93441a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Long l8 = (Long) objArr[1];
        long jLongValue2 = l8 == null ? 0L : l8.longValue();
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        String str3 = (String) objArr[4];
        Boolean bool = (Boolean) objArr[5];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new Role(jLongValue, jLongValue2, str, str2, str3, zBooleanValue, (OfficialVerify) objArr[6], (String) objArr[7], (Map) objArr[8]);
    }

    public final Object get(Object obj, int i7) {
        Role role = (Role) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(role.f93428a);
            case 1:
                return Long.valueOf(role.f93429b);
            case 2:
                return role.f93430c;
            case 3:
                return role.f93431d;
            case 4:
                return role.a();
            case 5:
                return Boolean.valueOf(role.b());
            case 6:
                return role.c();
            case 7:
                return role.h;
            case 8:
                return role.f93435i;
            default:
                return null;
        }
    }
}
