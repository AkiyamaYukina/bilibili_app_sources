package com.bilibili.ship.theseus.ogv.playviewextra;

import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playviewextra/OgvBadgeInfo_JsonDescriptor.class */
public final class OgvBadgeInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94354a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("text", (String[]) null, String.class, (Class) null, 5);
        Class cls = Integer.TYPE;
        f94354a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, new PojoPropertyDescriptor("text_color", (String[]) null, cls, StringIntColorTypeAdapter.class, 13), new PojoPropertyDescriptor("text_color_night", (String[]) null, cls, StringIntColorTypeAdapter.class, 13), new PojoPropertyDescriptor("bg_color", (String[]) null, cls, StringIntColorTypeAdapter.class, 13), new PojoPropertyDescriptor("bg_color_night", (String[]) null, cls, StringIntColorTypeAdapter.class, 13), new PojoPropertyDescriptor("border_color", (String[]) null, cls, StringIntColorTypeAdapter.class, 13), new PojoPropertyDescriptor("border_color_night", (String[]) null, cls, StringIntColorTypeAdapter.class, 13), new PojoPropertyDescriptor("img", (String[]) null, String.class, (Class) null, 5)};
    }

    public OgvBadgeInfo_JsonDescriptor() {
        super(OgvBadgeInfo.class, f94354a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        String str = (String) objArr[0];
        Integer num = (Integer) objArr[1];
        int iIntValue2 = num == null ? 0 : num.intValue();
        Integer num2 = (Integer) objArr[2];
        int iIntValue3 = num2 == null ? 0 : num2.intValue();
        Integer num3 = (Integer) objArr[3];
        int iIntValue4 = num3 == null ? 0 : num3.intValue();
        Integer num4 = (Integer) objArr[4];
        int iIntValue5 = num4 == null ? 0 : num4.intValue();
        Integer num5 = (Integer) objArr[5];
        int iIntValue6 = num5 == null ? 0 : num5.intValue();
        Integer num6 = (Integer) objArr[6];
        if (num6 != null) {
            iIntValue = num6.intValue();
        }
        return new OgvBadgeInfo(iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, str, iIntValue, (String) objArr[7]);
    }

    public final Object get(Object obj, int i7) {
        int iA;
        OgvBadgeInfo ogvBadgeInfo = (OgvBadgeInfo) obj;
        switch (i7) {
            case 0:
                return ogvBadgeInfo.f94347a;
            case 1:
                return Integer.valueOf(ogvBadgeInfo.f94348b);
            case 2:
                return Integer.valueOf(ogvBadgeInfo.f94349c);
            case 3:
                return Integer.valueOf(ogvBadgeInfo.f94350d);
            case 4:
                return Integer.valueOf(ogvBadgeInfo.f94351e);
            case 5:
                iA = ogvBadgeInfo.a();
                break;
            case 6:
                iA = ogvBadgeInfo.b();
                break;
            case 7:
                return ogvBadgeInfo.c();
            default:
                return null;
        }
        return Integer.valueOf(iA);
    }
}
