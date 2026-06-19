package com.bilibili.ship.theseus.united.page.intro.module.season;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonUserActivity_JsonDescriptor.class */
public final class UnitedSeasonUserActivity_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f101631a;

    static {
        Class cls = Integer.TYPE;
        f101631a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("user_state", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("last_checkin_date", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("checkin_today", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("user_day_count", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("user_view_time", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("portrait", (String[]) null, String.class, (Class) null, 5)};
    }

    public UnitedSeasonUserActivity_JsonDescriptor() {
        super(UnitedSeasonUserActivity.class, f101631a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Integer num = (Integer) objArr[0];
        int iIntValue2 = num == null ? 0 : num.intValue();
        Long l7 = (Long) objArr[1];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Integer num2 = (Integer) objArr[2];
        int iIntValue3 = num2 == null ? 0 : num2.intValue();
        Integer num3 = (Integer) objArr[3];
        int iIntValue4 = num3 == null ? 0 : num3.intValue();
        Integer num4 = (Integer) objArr[4];
        if (num4 != null) {
            iIntValue = num4.intValue();
        }
        return new UnitedSeasonUserActivity((String) objArr[5], iIntValue2, iIntValue3, iIntValue4, iIntValue, jLongValue);
    }

    public final Object get(Object obj, int i7) {
        UnitedSeasonUserActivity unitedSeasonUserActivity = (UnitedSeasonUserActivity) obj;
        if (i7 == 0) {
            return Integer.valueOf(unitedSeasonUserActivity.e());
        }
        if (i7 == 1) {
            return Long.valueOf(unitedSeasonUserActivity.b());
        }
        if (i7 == 2) {
            return Integer.valueOf(unitedSeasonUserActivity.a());
        }
        if (i7 == 3) {
            return Integer.valueOf(unitedSeasonUserActivity.d());
        }
        if (i7 == 4) {
            return Integer.valueOf(unitedSeasonUserActivity.f());
        }
        if (i7 != 5) {
            return null;
        }
        return unitedSeasonUserActivity.c();
    }
}
