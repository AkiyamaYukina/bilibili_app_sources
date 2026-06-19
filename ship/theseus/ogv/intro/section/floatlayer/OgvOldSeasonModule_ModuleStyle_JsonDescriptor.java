package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvOldSeasonModule;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvOldSeasonModule_ModuleStyle_JsonDescriptor.class */
public final class OgvOldSeasonModule_ModuleStyle_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93616a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("desc", (String[]) null, String.class, (Class) null, 0);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("day_color", (String[]) null, String.class, (Class) null, 4);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("night_color", (String[]) null, String.class, (Class) null, 4);
        Class cls = Boolean.TYPE;
        f93616a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, new PojoPropertyDescriptor("line", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("hidden", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("show_pages", (String[]) null, Types.parameterizedType(List.class, new Type[]{String.class}), (Class) null, 21)};
    }

    public OgvOldSeasonModule_ModuleStyle_JsonDescriptor() {
        super(OgvOldSeasonModule.ModuleStyle.class, f93616a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        Boolean bool = (Boolean) objArr[3];
        boolean zBooleanValue2 = bool == null ? false : bool.booleanValue();
        Boolean bool2 = (Boolean) objArr[4];
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        }
        return new OgvOldSeasonModule.ModuleStyle(str, str2, str3, (List) objArr[5], zBooleanValue2, zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        OgvOldSeasonModule.ModuleStyle moduleStyle = (OgvOldSeasonModule.ModuleStyle) obj;
        if (i7 == 0) {
            return moduleStyle.f93607a;
        }
        if (i7 == 1) {
            return moduleStyle.a();
        }
        if (i7 == 2) {
            return moduleStyle.c();
        }
        if (i7 == 3) {
            return Boolean.valueOf(moduleStyle.b());
        }
        if (i7 == 4) {
            return Boolean.valueOf(moduleStyle.f93611e);
        }
        if (i7 != 5) {
            return null;
        }
        return moduleStyle.d();
    }
}
