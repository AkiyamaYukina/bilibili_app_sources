package com.bilibili.ship.theseus.ogv.pay;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/DialogCoupon_JsonDescriptor.class */
public final class DialogCoupon_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94151a = {new PojoPropertyDescriptor("coupon_token", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("type", (String[]) null, Long.class, (Class) null, 2), new PojoPropertyDescriptor("otype", (String[]) null, Long.class, (Class) null, 6), new PojoPropertyDescriptor("value", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("use_desc", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("desc", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("pay_button_text", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("pay_button_text_line_through", (String[]) null, String.class, (Class) null, 6)};

    public DialogCoupon_JsonDescriptor() {
        super(DialogCoupon.class, f94151a);
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
        Long l7 = (Long) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        Long l8 = (Long) obj3;
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        String str2 = (String) obj4;
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        String str3 = (String) obj5;
        Object obj6 = objArr[5];
        int i12 = i11;
        if (obj6 == null) {
            i12 = i11 | 32;
        }
        String str4 = (String) obj6;
        Object obj7 = objArr[6];
        int i13 = i12;
        if (obj7 == null) {
            i13 = i12 | 64;
        }
        String str5 = (String) obj7;
        Object obj8 = objArr[7];
        int i14 = i13;
        if (obj8 == null) {
            i14 = i13 | 128;
        }
        String str6 = (String) obj8;
        Object obj9 = objArr[8];
        int i15 = i14;
        if (obj9 == null) {
            i15 = i14 | 256;
        }
        return new DialogCoupon(str, l7, l8, str2, str3, str4, str5, str6, (String) obj9, i15);
    }

    public final Object get(Object obj, int i7) {
        DialogCoupon dialogCoupon = (DialogCoupon) obj;
        switch (i7) {
            case 0:
                return dialogCoupon.a();
            case 1:
                return dialogCoupon.f94143b;
            case 2:
                return dialogCoupon.b();
            case 3:
                return dialogCoupon.f94145d;
            case 4:
                return dialogCoupon.e();
            case 5:
                return dialogCoupon.f94147f;
            case 6:
                return dialogCoupon.f94148g;
            case 7:
                return dialogCoupon.c();
            case 8:
                return dialogCoupon.d();
            default:
                return null;
        }
    }
}
