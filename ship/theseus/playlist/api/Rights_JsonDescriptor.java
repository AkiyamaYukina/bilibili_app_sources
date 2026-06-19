package com.bilibili.ship.theseus.playlist.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.opd.app.bizcommon.hybridruntime.KFCHybridV2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/Rights_JsonDescriptor.class */
public final class Rights_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f95307a;

    static {
        Class cls = Integer.TYPE;
        f95307a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("autoplay", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("bp", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor(KFCHybridV2.Configuration.MALL_DOWNLOAD_DOMAIN, (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("elec", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("movie", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("no_reprint", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("pay", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("ugc_pay", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("ugc_pay_preview", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("no_background", (String[]) null, cls, (Class) null, 7)};
    }

    public Rights_JsonDescriptor() {
        super(Rights.class, f95307a);
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
        Integer num3 = (Integer) obj3;
        int iIntValue3 = num3 == null ? 0 : num3.intValue();
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        Integer num4 = (Integer) obj4;
        int iIntValue4 = num4 == null ? 0 : num4.intValue();
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        Integer num5 = (Integer) obj5;
        int iIntValue5 = num5 == null ? 0 : num5.intValue();
        Object obj6 = objArr[5];
        int i12 = i11;
        if (obj6 == null) {
            i12 = i11 | 32;
        }
        Integer num6 = (Integer) obj6;
        int iIntValue6 = num6 == null ? 0 : num6.intValue();
        Object obj7 = objArr[6];
        int i13 = i12;
        if (obj7 == null) {
            i13 = i12 | 64;
        }
        Integer num7 = (Integer) obj7;
        int iIntValue7 = num7 == null ? 0 : num7.intValue();
        Object obj8 = objArr[7];
        int i14 = i13;
        if (obj8 == null) {
            i14 = i13 | 128;
        }
        Integer num8 = (Integer) obj8;
        int iIntValue8 = num8 == null ? 0 : num8.intValue();
        Object obj9 = objArr[8];
        int i15 = i14;
        if (obj9 == null) {
            i15 = i14 | 256;
        }
        Integer num9 = (Integer) obj9;
        int iIntValue9 = num9 == null ? 0 : num9.intValue();
        Object obj10 = objArr[9];
        int i16 = i15;
        if (obj10 == null) {
            i16 = i15 | 512;
        }
        Integer num10 = (Integer) obj10;
        return new Rights(iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, iIntValue8, iIntValue9, num10 == null ? 0 : num10.intValue(), i16);
    }

    public final Object get(Object obj, int i7) {
        int iA;
        Rights rights = (Rights) obj;
        switch (i7) {
            case 0:
                iA = rights.a();
                break;
            case 1:
                iA = rights.b();
                break;
            case 2:
                iA = rights.d();
                break;
            case 3:
                iA = rights.c();
                break;
            case 4:
                iA = rights.e();
                break;
            case 5:
                iA = rights.g();
                break;
            case 6:
                iA = rights.h();
                break;
            case 7:
                iA = rights.j();
                break;
            case 8:
                iA = rights.i();
                break;
            case 9:
                iA = rights.f();
                break;
            default:
                return null;
        }
        return Integer.valueOf(iA);
    }
}
