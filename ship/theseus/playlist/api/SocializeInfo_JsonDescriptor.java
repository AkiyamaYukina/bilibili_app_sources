package com.bilibili.ship.theseus.playlist.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/SocializeInfo_JsonDescriptor.class */
public final class SocializeInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f95318a;

    static {
        Class cls = Integer.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("coin", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("collect", (String[]) null, cls, (Class) null, 7);
        Class cls2 = Long.TYPE;
        f95318a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, new PojoPropertyDescriptor("danmaku", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("play", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("play_switch", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("reply", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("share", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("thumb_down", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("thumb_up", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("view_text_1", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("vt", (String[]) null, cls, (Class) null, 7)};
    }

    public SocializeInfo_JsonDescriptor() {
        super(SocializeInfo.class, f95318a);
    }

    public final Object constructWith(Object[] objArr) {
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Integer num = (Integer) obj;
        int iIntValue = num == null ? 0 : num.intValue();
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        Integer num2 = (Integer) obj2;
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        Long l7 = (Long) obj3;
        long jLongValue = 0;
        long jLongValue2 = l7 == null ? 0L : l7.longValue();
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        Long l8 = (Long) obj4;
        if (l8 != null) {
            jLongValue = l8.longValue();
        }
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        Integer num3 = (Integer) obj5;
        int iIntValue3 = num3 == null ? 0 : num3.intValue();
        Object obj6 = objArr[5];
        int i12 = i11;
        if (obj6 == null) {
            i12 = i11 | 32;
        }
        Integer num4 = (Integer) obj6;
        int iIntValue4 = num4 == null ? 0 : num4.intValue();
        Object obj7 = objArr[6];
        int i13 = i12;
        if (obj7 == null) {
            i13 = i12 | 64;
        }
        Integer num5 = (Integer) obj7;
        int iIntValue5 = num5 == null ? 0 : num5.intValue();
        Object obj8 = objArr[7];
        int i14 = i13;
        if (obj8 == null) {
            i14 = i13 | 128;
        }
        Integer num6 = (Integer) obj8;
        int iIntValue6 = num6 == null ? 0 : num6.intValue();
        Object obj9 = objArr[8];
        int i15 = i14;
        if (obj9 == null) {
            i15 = i14 | 256;
        }
        Integer num7 = (Integer) obj9;
        int iIntValue7 = num7 == null ? 0 : num7.intValue();
        Object obj10 = objArr[9];
        int i16 = i15;
        if (obj10 == null) {
            i16 = i15 | 512;
        }
        String str = (String) obj10;
        Object obj11 = objArr[10];
        int i17 = i16;
        if (obj11 == null) {
            i17 = i16 | 1024;
        }
        Integer num8 = (Integer) obj11;
        return new SocializeInfo(iIntValue, iIntValue2, jLongValue2, jLongValue, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, str, num8 == null ? 0 : num8.intValue(), i17);
    }

    public final Object get(Object obj, int i7) {
        SocializeInfo socializeInfo = (SocializeInfo) obj;
        switch (i7) {
            case 0:
                return Integer.valueOf(socializeInfo.f95308a);
            case 1:
                return Integer.valueOf(socializeInfo.f95309b);
            case 2:
                return Long.valueOf(socializeInfo.f95310c);
            case 3:
                return Long.valueOf(socializeInfo.f95311d);
            case 4:
                return Integer.valueOf(socializeInfo.b());
            case 5:
                return Integer.valueOf(socializeInfo.f95313f);
            case 6:
                return Integer.valueOf(socializeInfo.f95314g);
            case 7:
                return Integer.valueOf(socializeInfo.h);
            case 8:
                return Integer.valueOf(socializeInfo.f95315i);
            case 9:
                return socializeInfo.c();
            case 10:
                return Integer.valueOf(socializeInfo.f95317k);
            default:
                return null;
        }
    }
}
