package com.bilibili.ship.theseus.ogv.pay;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ogv.pay.PopWinVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/PopWinVo_JsonDescriptor.class */
public final class PopWinVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94180a = {new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("title", (String[]) null, TextVo.class, (Class) null, 2), new PojoPropertyDescriptor("desc", (String[]) null, TextVo.class, (Class) null, 6), new PojoPropertyDescriptor("coupons", (String[]) null, Types.parameterizedType(List.class, new Type[]{DialogCoupon.class}), (Class) null, 17), new PojoPropertyDescriptor("buttons", (String[]) null, Types.parameterizedType(List.class, new Type[]{TextVo.class}), (Class) null, 17), new PojoPropertyDescriptor("bottom_text", (String[]) null, TextVo.class, (Class) null, 6), new PojoPropertyDescriptor("pop_type", (String[]) null, PopWinVo.Type.class, (Class) null, 7), new PojoPropertyDescriptor("report", (String[]) null, ReportVo.class, (Class) null, 2)};

    public PopWinVo_JsonDescriptor() {
        super(PopWinVo.class, f94180a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
        String str = (String) obj;
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        TextVo textVo = (TextVo) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        TextVo textVo2 = (TextVo) obj3;
        List list = (List) objArr[3];
        List list2 = (List) objArr[4];
        Object obj4 = objArr[5];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 32;
        }
        TextVo textVo3 = (TextVo) obj4;
        Object obj5 = objArr[6];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 64;
        }
        PopWinVo.Type type = (PopWinVo.Type) obj5;
        Object obj6 = objArr[7];
        int i12 = i11;
        if (obj6 == null) {
            i12 = i11 | 128;
        }
        return new PopWinVo(str, textVo, textVo2, list, list2, textVo3, type, (ReportVo) obj6, i12);
    }

    public final Object get(Object obj, int i7) {
        PopWinVo popWinVo = (PopWinVo) obj;
        switch (i7) {
            case 0:
                return popWinVo.f94173a;
            case 1:
                return popWinVo.f94174b;
            case 2:
                return popWinVo.c();
            case 3:
                return popWinVo.f94176d;
            case 4:
                return popWinVo.f94177e;
            case 5:
                return popWinVo.a();
            case 6:
                return popWinVo.b();
            case 7:
                return popWinVo.h;
            default:
                return null;
        }
    }
}
