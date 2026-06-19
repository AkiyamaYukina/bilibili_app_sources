package com.bilibili.playerbizcommonv2.abtest;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/abtest/StringExpData_JsonDescriptor.class */
public final class StringExpData_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f80814a = {new PojoPropertyDescriptor("data", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("success", (String[]) null, Boolean.TYPE, (Class) null, 5)};

    public StringExpData_JsonDescriptor() {
        super(StringExpData.class, f80814a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        String str = (String) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new StringExpData(str, zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        StringExpData stringExpData = (StringExpData) obj;
        if (i7 == 0) {
            return stringExpData.a();
        }
        if (i7 != 1) {
            return null;
        }
        return Boolean.valueOf(stringExpData.b());
    }
}
