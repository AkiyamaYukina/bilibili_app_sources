package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/BadgeInfo_JsonDescriptor.class */
public final class BadgeInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69672a = {new PojoPropertyDescriptor("info_badge", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("night_color", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("day_color", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("badge_night_color", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("badge_day_color", (String[]) null, String.class, (Class) null, 5)};

    public BadgeInfo_JsonDescriptor() {
        super(BadgeInfo.class, f69672a);
    }

    public final Object constructWith(Object[] objArr) {
        return new BadgeInfo((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (String) objArr[4]);
    }

    public final Object get(Object obj, int i7) {
        BadgeInfo badgeInfo = (BadgeInfo) obj;
        if (i7 == 0) {
            return badgeInfo.a();
        }
        if (i7 == 1) {
            return badgeInfo.f69668b;
        }
        if (i7 == 2) {
            return badgeInfo.f69669c;
        }
        if (i7 == 3) {
            return badgeInfo.f69670d;
        }
        if (i7 != 4) {
            return null;
        }
        return badgeInfo.f69671e;
    }
}
