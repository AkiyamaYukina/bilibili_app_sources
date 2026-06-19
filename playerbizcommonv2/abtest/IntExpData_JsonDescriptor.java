package com.bilibili.playerbizcommonv2.abtest;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/abtest/IntExpData_JsonDescriptor.class */
public final class IntExpData_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f80811a = {new PojoPropertyDescriptor("data", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("success", (String[]) null, Boolean.TYPE, (Class) null, 5)};

    public IntExpData_JsonDescriptor() {
        super(IntExpData.class, f80811a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Integer num = (Integer) objArr[0];
        int iIntValue = num == null ? 0 : num.intValue();
        Boolean bool = (Boolean) objArr[1];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new IntExpData(iIntValue, zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        IntExpData intExpData = (IntExpData) obj;
        if (i7 == 0) {
            return Integer.valueOf(intExpData.a());
        }
        if (i7 != 1) {
            return null;
        }
        return Boolean.valueOf(intExpData.b());
    }
}
