package com.bilibili.tgwt.square;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/ModuleAttr_JsonDescriptor.class */
public final class ModuleAttr_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f112040a = {new PojoPropertyDescriptor("header", (String[]) null, Boolean.TYPE, (Class) null, 3)};

    public ModuleAttr_JsonDescriptor() {
        super(ModuleAttr.class, f112040a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new ModuleAttr(zBooleanValue, i7);
    }

    public final Object get(Object obj, int i7) {
        ModuleAttr moduleAttr = (ModuleAttr) obj;
        if (i7 != 0) {
            return null;
        }
        return Boolean.valueOf(moduleAttr.f112039a);
    }
}
