package com.bilibili.ogv.pub.reserve;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/Dimension_JsonDescriptor.class */
public final class Dimension_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71627a;

    static {
        Class cls = Integer.TYPE;
        f71627a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("width", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("height", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("rotate", (String[]) null, Boolean.TYPE, (Class) null, 1)};
    }

    public Dimension_JsonDescriptor() {
        super(Dimension.class, f71627a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Integer num = (Integer) objArr[0];
        int iIntValue = num == null ? 0 : num.intValue();
        Integer num2 = (Integer) objArr[1];
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        Boolean bool = (Boolean) objArr[2];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new Dimension(iIntValue, iIntValue2, zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        Dimension dimension = (Dimension) obj;
        if (i7 == 0) {
            return Integer.valueOf(dimension.f71624a);
        }
        if (i7 == 1) {
            return Integer.valueOf(dimension.f71625b);
        }
        if (i7 != 2) {
            return null;
        }
        return Boolean.valueOf(dimension.f71626c);
    }
}
