package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/CheeseAttendanceShareMaterial_JsonDescriptor.class */
public final class CheeseAttendanceShareMaterial_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f89270a = {new PojoPropertyDescriptor("avatar", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("img", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("logo", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor(NotificationCompat.CATEGORY_PROGRESS, (String[]) null, Integer.TYPE, (Class) null, 7), new PojoPropertyDescriptor("qr_code", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("text", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 7)};

    public CheeseAttendanceShareMaterial_JsonDescriptor() {
        super(CheeseAttendanceShareMaterial.class, f89270a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
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
        Integer num = (Integer) obj4;
        if (num != null) {
            iIntValue = num.intValue();
        }
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
        String str5 = (String) obj6;
        Object obj7 = objArr[6];
        int i13 = i12;
        if (obj7 == null) {
            i13 = i12 | 64;
        }
        return new CheeseAttendanceShareMaterial(str, iIntValue, i13, str2, str3, str4, str5, (String) obj7);
    }

    public final Object get(Object obj, int i7) {
        CheeseAttendanceShareMaterial cheeseAttendanceShareMaterial = (CheeseAttendanceShareMaterial) obj;
        switch (i7) {
            case 0:
                return cheeseAttendanceShareMaterial.a();
            case 1:
                return cheeseAttendanceShareMaterial.b();
            case 2:
                return cheeseAttendanceShareMaterial.c();
            case 3:
                return Integer.valueOf(cheeseAttendanceShareMaterial.d());
            case 4:
                return cheeseAttendanceShareMaterial.e();
            case 5:
                return cheeseAttendanceShareMaterial.f();
            case 6:
                return cheeseAttendanceShareMaterial.g();
            default:
                return null;
        }
    }
}
