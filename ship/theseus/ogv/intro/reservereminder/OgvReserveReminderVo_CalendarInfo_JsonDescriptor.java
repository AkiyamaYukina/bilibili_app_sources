package com.bilibili.ship.theseus.ogv.intro.reservereminder;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.ogv.intro.reservereminder.OgvReserveReminderVo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/reservereminder/OgvReserveReminderVo_CalendarInfo_JsonDescriptor.class */
public final class OgvReserveReminderVo_CalendarInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93406a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5);
        Class cls = Long.TYPE;
        f93406a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, new PojoPropertyDescriptor("start_ts", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("end_ts", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("description", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("business_id", (String[]) null, String.class, (Class) null, 5)};
    }

    public OgvReserveReminderVo_CalendarInfo_JsonDescriptor() {
        super(OgvReserveReminderVo.CalendarInfo.class, f93406a);
    }

    public final Object constructWith(Object[] objArr) {
        String str = (String) objArr[0];
        Long l7 = (Long) objArr[1];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Long l8 = (Long) objArr[2];
        return new OgvReserveReminderVo.CalendarInfo(jLongValue, l8 == null ? 0L : l8.longValue(), str, (String) objArr[3], (String) objArr[4]);
    }

    public final Object get(Object obj, int i7) {
        OgvReserveReminderVo.CalendarInfo calendarInfo = (OgvReserveReminderVo.CalendarInfo) obj;
        if (i7 == 0) {
            return calendarInfo.f93401a;
        }
        if (i7 == 1) {
            return Long.valueOf(calendarInfo.f93402b);
        }
        if (i7 == 2) {
            return Long.valueOf(calendarInfo.f93403c);
        }
        if (i7 == 3) {
            return calendarInfo.f93404d;
        }
        if (i7 != 4) {
            return null;
        }
        return calendarInfo.f93405e;
    }
}
