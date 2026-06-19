package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/ModuleHeader_JsonDescriptor.class */
public final class ModuleHeader_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69871a = {new PojoPropertyDescriptor("icon", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("is_expand", (String[]) null, Boolean.TYPE, (Class) null, 7), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 2)};

    public ModuleHeader_JsonDescriptor() {
        super(ModuleHeader.class, f69871a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        String str = (String) obj;
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        String str2 = (String) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        String str3 = (String) obj3;
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        Boolean bool = (Boolean) obj4;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        Object obj5 = objArr[4];
        if (obj5 == null) {
            i10 |= 16;
        }
        return new ModuleHeader(str, i10, str2, (Map) obj5, zBooleanValue, str3);
    }

    public final Object get(Object obj, int i7) {
        ModuleHeader moduleHeader = (ModuleHeader) obj;
        if (i7 == 0) {
            return moduleHeader.f69862a;
        }
        if (i7 == 1) {
            return moduleHeader.f69863b;
        }
        if (i7 == 2) {
            return moduleHeader.f69864c;
        }
        if (i7 == 3) {
            return Boolean.valueOf(moduleHeader.a());
        }
        if (i7 != 4) {
            return null;
        }
        return moduleHeader.f69866e;
    }
}
