package com.bilibili.ogv.pub.community;

import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/community/BangumiBadgeInfo_JsonDescriptor.class */
public final class BangumiBadgeInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71495a = {new PojoPropertyDescriptor("text", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("text_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 14), new PojoPropertyDescriptor("text_size", (String[]) null, Integer.TYPE, (Class) null, 7), new PojoPropertyDescriptor("bg_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 14), new PojoPropertyDescriptor("bg_color_night", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 14), new PojoPropertyDescriptor("img", (String[]) null, String.class, (Class) null, 6)};

    public BangumiBadgeInfo_JsonDescriptor() {
        super(BangumiBadgeInfo.class, f71495a);
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
        Integer num = (Integer) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        Integer num2 = (Integer) obj3;
        if (num2 != null) {
            iIntValue = num2.intValue();
        }
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        Integer num3 = (Integer) obj4;
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        Integer num4 = (Integer) obj5;
        Object obj6 = objArr[5];
        if (obj6 == null) {
            i11 |= 32;
        }
        return new BangumiBadgeInfo(str, num, iIntValue, num3, num4, (String) obj6, i11);
    }

    public final Object get(Object obj, int i7) {
        BangumiBadgeInfo bangumiBadgeInfo = (BangumiBadgeInfo) obj;
        if (i7 == 0) {
            return bangumiBadgeInfo.f71489a;
        }
        if (i7 == 1) {
            return bangumiBadgeInfo.f71490b;
        }
        if (i7 == 2) {
            return Integer.valueOf(bangumiBadgeInfo.a());
        }
        if (i7 == 3) {
            return bangumiBadgeInfo.f71492d;
        }
        if (i7 == 4) {
            return bangumiBadgeInfo.f71493e;
        }
        if (i7 != 5) {
            return null;
        }
        return bangumiBadgeInfo.f71494f;
    }
}
