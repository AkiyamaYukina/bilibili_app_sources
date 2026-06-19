package com.bilibili.ship.theseus.ogv.intro.reservereminder;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ogv.intro.reservereminder.OgvReserveReminderVo;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/reservereminder/OgvReserveReminderVo_JsonDescriptor.class */
public final class OgvReserveReminderVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93407a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("icon", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("button_text", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("calendar_info", (String[]) null, OgvReserveReminderVo.CalendarInfo.class, (Class) null, 4);
        Class cls = Boolean.TYPE;
        f93407a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, new PojoPropertyDescriptor("follow_video_is_reserve_broadcast", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 7), new PojoPropertyDescriptor("countdown_text", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("refresh_when_countdown_end", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("current_time", (String[]) null, Long.TYPE, (Class) null, 7)};
    }

    public OgvReserveReminderVo_JsonDescriptor() {
        super(OgvReserveReminderVo.class, f93407a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        OgvReserveReminderVo.CalendarInfo calendarInfo = (OgvReserveReminderVo.CalendarInfo) objArr[3];
        Object obj = objArr[4];
        int i7 = obj == null ? 16 : 0;
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue2 = bool == null ? false : bool.booleanValue();
        Object obj2 = objArr[5];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 32;
        }
        Map map = (Map) obj2;
        String str4 = (String) objArr[6];
        Object obj3 = objArr[7];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 128;
        }
        Boolean bool2 = (Boolean) obj3;
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        }
        Object obj4 = objArr[8];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 256;
        }
        Long l7 = (Long) obj4;
        return new OgvReserveReminderVo(str, str2, str3, calendarInfo, zBooleanValue2, map, str4, zBooleanValue, l7 == null ? 0L : l7.longValue(), i10);
    }

    public final Object get(Object obj, int i7) {
        OgvReserveReminderVo ogvReserveReminderVo = (OgvReserveReminderVo) obj;
        switch (i7) {
            case 0:
                return ogvReserveReminderVo.f93393a;
            case 1:
                return ogvReserveReminderVo.f93394b;
            case 2:
                return ogvReserveReminderVo.f93395c;
            case 3:
                return ogvReserveReminderVo.f93396d;
            case 4:
                return Boolean.valueOf(ogvReserveReminderVo.f93397e);
            case 5:
                return ogvReserveReminderVo.f93398f;
            case 6:
                return ogvReserveReminderVo.f93399g;
            case 7:
                return Boolean.valueOf(ogvReserveReminderVo.h);
            case 8:
                return Long.valueOf(ogvReserveReminderVo.f93400i);
            default:
                return null;
        }
    }
}
