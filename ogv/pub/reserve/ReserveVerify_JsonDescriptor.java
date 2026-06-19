package com.bilibili.ogv.pub.reserve;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/ReserveVerify_JsonDescriptor.class */
public final class ReserveVerify_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71646a;

    static {
        Class cls = Long.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("id", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("index", (String[]) null, String.class, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor5 = new PojoPropertyDescriptor("season_title", (String[]) null, String.class, (Class) null, 7);
        Class cls2 = Integer.TYPE;
        f71646a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, pojoPropertyDescriptor5, new PojoPropertyDescriptor("is_reserve", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("pub_time", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("is_online", (String[]) null, cls2, (Class) null, 7)};
    }

    public ReserveVerify_JsonDescriptor() {
        super(ReserveVerify.class, f71646a);
    }

    public final Object constructWith(Object[] objArr) {
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Long l7 = (Long) obj;
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        String str = (String) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        String str2 = (String) obj3;
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        String str3 = (String) obj4;
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        String str4 = (String) obj5;
        Object obj6 = objArr[5];
        int i12 = i11;
        if (obj6 == null) {
            i12 = i11 | 32;
        }
        Integer num = (Integer) obj6;
        int iIntValue = num == null ? 0 : num.intValue();
        Object obj7 = objArr[6];
        int i13 = i12;
        if (obj7 == null) {
            i13 = i12 | 64;
        }
        Long l8 = (Long) obj7;
        long jLongValue2 = l8 == null ? 0L : l8.longValue();
        Object obj8 = objArr[7];
        int i14 = obj8 == null ? i13 | 128 : i13;
        Integer num2 = (Integer) obj8;
        return new ReserveVerify(jLongValue, str, str2, str3, str4, iIntValue, jLongValue2, num2 == null ? 0 : num2.intValue(), i14);
    }

    public final Object get(Object obj, int i7) {
        ReserveVerify reserveVerify = (ReserveVerify) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(reserveVerify.b());
            case 1:
                return reserveVerify.a();
            case 2:
                return reserveVerify.f();
            case 3:
                return reserveVerify.c();
            case 4:
                return reserveVerify.e();
            case 5:
                return Integer.valueOf(reserveVerify.h());
            case 6:
                return Long.valueOf(reserveVerify.d());
            case 7:
                return Integer.valueOf(reserveVerify.g());
            default:
                return null;
        }
    }
}
