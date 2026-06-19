package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/ModuleAttr_JsonDescriptor.class */
public final class ModuleAttr_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69861a;

    static {
        Class cls = Boolean.TYPE;
        f69861a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("random", (String[]) null, cls, (Class) null, 3), new PojoPropertyDescriptor("header", (String[]) null, cls, (Class) null, 3), new PojoPropertyDescriptor("follow", (String[]) null, cls, (Class) null, 3), new PojoPropertyDescriptor("show_timeline", (String[]) null, cls, (Class) null, 3)};
    }

    public ModuleAttr_JsonDescriptor() {
        super(ModuleAttr.class, f69861a);
    }

    public final Object constructWith(Object[] objArr) {
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        Boolean bool2 = (Boolean) obj2;
        boolean zBooleanValue2 = bool2 == null ? false : bool2.booleanValue();
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        Boolean bool3 = (Boolean) obj3;
        boolean zBooleanValue3 = bool3 == null ? false : bool3.booleanValue();
        Object obj4 = objArr[3];
        if (obj4 == null) {
            i9 |= 8;
        }
        Boolean bool4 = (Boolean) obj4;
        return new ModuleAttr(i9, zBooleanValue, zBooleanValue2, zBooleanValue3, bool4 == null ? false : bool4.booleanValue());
    }

    public final Object get(Object obj, int i7) {
        ModuleAttr moduleAttr = (ModuleAttr) obj;
        if (i7 == 0) {
            return Boolean.valueOf(moduleAttr.f69857a);
        }
        if (i7 == 1) {
            return Boolean.valueOf(moduleAttr.f69858b);
        }
        if (i7 == 2) {
            return Boolean.valueOf(moduleAttr.f69859c);
        }
        if (i7 != 3) {
            return null;
        }
        return Boolean.valueOf(moduleAttr.f69860d);
    }
}
