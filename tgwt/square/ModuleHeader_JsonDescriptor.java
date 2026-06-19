package com.bilibili.tgwt.square;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/ModuleHeader_JsonDescriptor.class */
public final class ModuleHeader_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f112043a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 2)};

    public ModuleHeader_JsonDescriptor() {
        super(ModuleHeader.class, f112043a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
        String str = (String) obj;
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        return new ModuleHeader(str, (String) obj2, i8);
    }

    public final Object get(Object obj, int i7) {
        ModuleHeader moduleHeader = (ModuleHeader) obj;
        if (i7 == 0) {
            return moduleHeader.f112041a;
        }
        if (i7 != 1) {
            return null;
        }
        return moduleHeader.f112042b;
    }
}
