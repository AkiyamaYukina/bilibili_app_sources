package com.bilibili.ogv.review.detailpage;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/Vip_JsonDescriptor.class */
public final class Vip_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f72326a;

    static {
        Class cls = Integer.TYPE;
        f72326a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("vip_status", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("vip_type", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("theme_type", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("avatar_subscript_url", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("nickname_color", (String[]) null, String.class, (Class) null, 5)};
    }

    public Vip_JsonDescriptor() {
        super(Vip.class, f72326a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Integer num = (Integer) objArr[0];
        int iIntValue2 = num == null ? 0 : num.intValue();
        Integer num2 = (Integer) objArr[1];
        int iIntValue3 = num2 == null ? 0 : num2.intValue();
        Integer num3 = (Integer) objArr[2];
        if (num3 != null) {
            iIntValue = num3.intValue();
        }
        return new Vip(iIntValue2, iIntValue3, (String) objArr[3], iIntValue, (String) objArr[4]);
    }

    public final Object get(Object obj, int i7) {
        Vip vip = (Vip) obj;
        if (i7 == 0) {
            return Integer.valueOf(vip.f72313a);
        }
        if (i7 == 1) {
            return Integer.valueOf(vip.f72314b);
        }
        if (i7 == 2) {
            return Integer.valueOf(vip.f72315c);
        }
        if (i7 == 3) {
            return vip.f72316d;
        }
        if (i7 != 4) {
            return null;
        }
        return vip.f72317e;
    }
}
