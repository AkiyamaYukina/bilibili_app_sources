package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.lib.accountinfo.model.OfficialVerify;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import xg0.C8973c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/Staff_JsonDescriptor.class */
public final class Staff_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f101799a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor(EditCustomizeSticker.TAG_MID, (String[]) null, Long.TYPE, (Class) null, 5);
        Class cls = Integer.TYPE;
        f101799a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, new PojoPropertyDescriptor("attention", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("face", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("official", (String[]) null, OfficialVerify.class, (Class) null, 5), new PojoPropertyDescriptor("vip", (String[]) null, VipUserInfo.class, (Class) null, 5), new PojoPropertyDescriptor("label_style", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("fans", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("name_render", (String[]) null, C8973c.class, (Class) null, 6)};
    }

    public Staff_JsonDescriptor() {
        super(Staff.class, f101799a);
    }

    public final Object constructWith(Object[] objArr) {
        char c7 = 0;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Integer num = (Integer) objArr[1];
        int iIntValue = num == null ? 0 : num.intValue();
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        String str3 = (String) objArr[4];
        OfficialVerify officialVerify = (OfficialVerify) objArr[5];
        VipUserInfo vipUserInfo = (VipUserInfo) objArr[6];
        Integer num2 = (Integer) objArr[7];
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        String str4 = (String) objArr[8];
        Object obj = objArr[9];
        if (obj == null) {
            c7 = 512;
        }
        C8973c c8973c = (C8973c) obj;
        if ((c7 & 512) != 0) {
            c8973c = null;
        }
        return new Staff(jLongValue, iIntValue, str, str2, str3, officialVerify, vipUserInfo, iIntValue2, str4, c8973c);
    }

    public final Object get(Object obj, int i7) {
        Staff staff = (Staff) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(staff.f101786a);
            case 1:
                return Integer.valueOf(staff.f101787b);
            case 2:
                return staff.f101788c;
            case 3:
                return staff.f101789d;
            case 4:
                return staff.f101790e;
            case 5:
                return staff.a();
            case 6:
                return staff.f101792g;
            case 7:
                return Integer.valueOf(staff.h);
            case 8:
                return staff.f101793i;
            case 9:
                return staff.f101794j;
            default:
                return null;
        }
    }
}
