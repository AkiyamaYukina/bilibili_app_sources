package com.bilibili.ship.theseus.playlist.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/Upper_JsonDescriptor.class */
public final class Upper_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f95331a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("display_name", (String[]) null, String.class, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("face", (String[]) null, String.class, (Class) null, 7);
        Class cls = Long.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("fans", (String[]) null, cls, (Class) null, 7);
        Class cls2 = Integer.TYPE;
        f95331a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, new PojoPropertyDescriptor("followed", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor(EditCustomizeSticker.TAG_MID, (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("official_desc", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("official_role", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("official_title", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("vip_due_date", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("vip_pay_type", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("vip_statue", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("vip_type", (String[]) null, cls2, (Class) null, 7)};
    }

    public Upper_JsonDescriptor() {
        super(Upper.class, f95331a);
    }

    public final Object constructWith(Object[] objArr) {
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
        Long l7 = (Long) obj3;
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        Integer num = (Integer) obj4;
        int iIntValue = num == null ? 0 : num.intValue();
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        Long l8 = (Long) obj5;
        long jLongValue2 = l8 == null ? 0L : l8.longValue();
        Object obj6 = objArr[5];
        int i12 = i11;
        if (obj6 == null) {
            i12 = i11 | 32;
        }
        String str3 = (String) obj6;
        Object obj7 = objArr[6];
        int i13 = i12;
        if (obj7 == null) {
            i13 = i12 | 64;
        }
        String str4 = (String) obj7;
        Object obj8 = objArr[7];
        int i14 = i13;
        if (obj8 == null) {
            i14 = i13 | 128;
        }
        Integer num2 = (Integer) obj8;
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        Object obj9 = objArr[8];
        int i15 = i14;
        if (obj9 == null) {
            i15 = i14 | 256;
        }
        String str5 = (String) obj9;
        Object obj10 = objArr[9];
        int i16 = i15;
        if (obj10 == null) {
            i16 = i15 | 512;
        }
        Long l9 = (Long) obj10;
        long jLongValue3 = l9 == null ? 0L : l9.longValue();
        Object obj11 = objArr[10];
        int i17 = i16;
        if (obj11 == null) {
            i17 = i16 | 1024;
        }
        Integer num3 = (Integer) obj11;
        int iIntValue3 = num3 == null ? 0 : num3.intValue();
        Object obj12 = objArr[11];
        int i18 = i17;
        if (obj12 == null) {
            i18 = i17 | 2048;
        }
        Integer num4 = (Integer) obj12;
        int iIntValue4 = num4 == null ? 0 : num4.intValue();
        Object obj13 = objArr[12];
        int i19 = i18;
        if (obj13 == null) {
            i19 = i18 | 4096;
        }
        Integer num5 = (Integer) obj13;
        return new Upper(str, str2, jLongValue, iIntValue, jLongValue2, str3, str4, iIntValue2, str5, jLongValue3, iIntValue3, iIntValue4, num5 == null ? 0 : num5.intValue(), i19);
    }

    public final Object get(Object obj, int i7) {
        Upper upper = (Upper) obj;
        switch (i7) {
            case 0:
                return upper.f95319a;
            case 1:
                return upper.f95320b;
            case 2:
                return Long.valueOf(upper.f95321c);
            case 3:
                return Integer.valueOf(upper.f95322d);
            case 4:
                return Long.valueOf(upper.f95323e);
            case 5:
                return upper.f95324f;
            case 6:
                return upper.f95325g;
            case 7:
                return Integer.valueOf(upper.h);
            case 8:
                return upper.f95326i;
            case 9:
                return Long.valueOf(upper.f95327j);
            case 10:
                return Integer.valueOf(upper.f95328k);
            case 11:
                return Integer.valueOf(upper.f95329l);
            case 12:
                return Integer.valueOf(upper.f95330m);
            default:
                return null;
        }
    }
}
