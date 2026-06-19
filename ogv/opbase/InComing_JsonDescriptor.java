package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/InComing_JsonDescriptor.class */
public final class InComing_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69852a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("dynamic", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("image", (String[]) null, String.class, (Class) null, 5);
        Class cls = Integer.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("show_times", (String[]) null, cls, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("type", (String[]) null, cls, (Class) null, 5);
        Class cls2 = Long.TYPE;
        f69852a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, new PojoPropertyDescriptor("tab_id", (String[]) null, cls2, (Class) null, 5), new PojoPropertyDescriptor("module_id", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("item_id", (String[]) null, cls2, (Class) null, 5), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 5)};
    }

    public InComing_JsonDescriptor() {
        super(InComing.class, f69852a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        Integer num = (Integer) objArr[2];
        int iIntValue2 = num == null ? 0 : num.intValue();
        Integer num2 = (Integer) objArr[3];
        if (num2 != null) {
            iIntValue = num2.intValue();
        }
        Long l7 = (Long) objArr[4];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        String str3 = (String) objArr[5];
        Long l8 = (Long) objArr[6];
        return new InComing(jLongValue, iIntValue2, iIntValue, l8 == null ? 0L : l8.longValue(), str, str2, str3, (String) objArr[7]);
    }

    public final Object get(Object obj, int i7) {
        InComing inComing = (InComing) obj;
        switch (i7) {
            case 0:
                return inComing.f69845a;
            case 1:
                return inComing.f69846b;
            case 2:
                return Integer.valueOf(inComing.f69847c);
            case 3:
                return Integer.valueOf(inComing.f69848d);
            case 4:
                return Long.valueOf(inComing.f69849e);
            case 5:
                return inComing.f69850f;
            case 6:
                return Long.valueOf(inComing.f69851g);
            case 7:
                return inComing.h;
            default:
                return null;
        }
    }
}
