package com.bilibili.ship.theseus.united.page.intro.module.season;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonActivity_JsonDescriptor.class */
public final class UnitedSeasonActivity_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f101521a;

    static {
        Class cls = Integer.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("type", (String[]) null, cls, (Class) null, 5);
        Class cls2 = Long.TYPE;
        f101521a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, new PojoPropertyDescriptor("oid", (String[]) null, cls2, (Class) null, 5), new PojoPropertyDescriptor("activity_id", (String[]) null, cls2, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("intro", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("day_count", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("user_count", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("join_deadline", (String[]) null, cls2, (Class) null, 5), new PojoPropertyDescriptor("activity_deadline", (String[]) null, cls2, (Class) null, 5), new PojoPropertyDescriptor("checkin_view_time", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("new_activity", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("user_activity", (String[]) null, UnitedSeasonUserActivity.class, (Class) null, 5), new PojoPropertyDescriptor("season_show", (String[]) null, UnitedActivitySeasonShow.class, (Class) null, 5)};
    }

    public UnitedSeasonActivity_JsonDescriptor() {
        super(UnitedSeasonActivity.class, f101521a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Integer num = (Integer) objArr[0];
        int iIntValue = num == null ? 0 : num.intValue();
        Long l7 = (Long) objArr[1];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Long l8 = (Long) objArr[2];
        long jLongValue2 = l8 == null ? 0L : l8.longValue();
        String str = (String) objArr[3];
        String str2 = (String) objArr[4];
        Integer num2 = (Integer) objArr[5];
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        Integer num3 = (Integer) objArr[6];
        int iIntValue3 = num3 == null ? 0 : num3.intValue();
        Long l9 = (Long) objArr[7];
        long jLongValue3 = l9 == null ? 0L : l9.longValue();
        Long l10 = (Long) objArr[8];
        long jLongValue4 = l10 == null ? 0L : l10.longValue();
        Integer num4 = (Integer) objArr[9];
        int iIntValue4 = num4 == null ? 0 : num4.intValue();
        Boolean bool = (Boolean) objArr[10];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new UnitedSeasonActivity(iIntValue, jLongValue, jLongValue2, str, str2, iIntValue2, iIntValue3, jLongValue3, jLongValue4, iIntValue4, zBooleanValue, (UnitedSeasonUserActivity) objArr[11], (UnitedActivitySeasonShow) objArr[12]);
    }

    public final Object get(Object obj, int i7) {
        UnitedSeasonActivity unitedSeasonActivity = (UnitedSeasonActivity) obj;
        switch (i7) {
            case 0:
                return Integer.valueOf(unitedSeasonActivity.k());
            case 1:
                return Long.valueOf(unitedSeasonActivity.h());
            case 2:
                return Long.valueOf(unitedSeasonActivity.b());
            case 3:
                return unitedSeasonActivity.j();
            case 4:
                return unitedSeasonActivity.e();
            case 5:
                return Integer.valueOf(unitedSeasonActivity.d());
            case 6:
                return Integer.valueOf(unitedSeasonActivity.m());
            case 7:
                return Long.valueOf(unitedSeasonActivity.f());
            case 8:
                return Long.valueOf(unitedSeasonActivity.a());
            case 9:
                return Integer.valueOf(unitedSeasonActivity.c());
            case 10:
                return Boolean.valueOf(unitedSeasonActivity.g());
            case 11:
                return unitedSeasonActivity.l();
            case 12:
                return unitedSeasonActivity.i();
            default:
                return null;
        }
    }
}
