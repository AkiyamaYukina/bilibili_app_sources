package com.bilibili.ship.theseus.ogv.intro.livereserve;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ogv.intro.livereserve.OgvLiveReserveVo;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/livereserve/OgvLiveReserveVo_JsonDescriptor.class */
public final class OgvLiveReserveVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93296a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("reserve_id", (String[]) null, Long.TYPE, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("icon", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("night_icon", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor5 = new PojoPropertyDescriptor("click_button", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor6 = new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 5);
        Class cls = Boolean.TYPE;
        f93296a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, pojoPropertyDescriptor5, pojoPropertyDescriptor6, new PojoPropertyDescriptor("follow_video_is_reserve_live", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("reserve_status", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("toast", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("active_type", new String[]{"action_type"}, OgvLiveReserveVo.JumpType.class, (Class) null, 7), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 5), new PojoPropertyDescriptor("live_status", (String[]) null, cls, (Class) null, 5)};
    }

    public OgvLiveReserveVo_JsonDescriptor() {
        super(OgvLiveReserveVo.class, f93296a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        String str5 = (String) objArr[5];
        Boolean bool = (Boolean) objArr[6];
        boolean zBooleanValue2 = bool == null ? false : bool.booleanValue();
        Boolean bool2 = (Boolean) objArr[7];
        boolean zBooleanValue3 = bool2 == null ? false : bool2.booleanValue();
        String str6 = (String) objArr[8];
        Object obj = objArr[9];
        int i7 = obj == null ? 512 : 0;
        OgvLiveReserveVo.JumpType jumpType = (OgvLiveReserveVo.JumpType) obj;
        Map map = (Map) objArr[10];
        Boolean bool3 = (Boolean) objArr[11];
        if (bool3 != null) {
            zBooleanValue = bool3.booleanValue();
        }
        return new OgvLiveReserveVo(jLongValue, str, str2, str3, str4, str5, zBooleanValue2, zBooleanValue3, str6, jumpType, map, zBooleanValue, i7);
    }

    public final Object get(Object obj, int i7) {
        OgvLiveReserveVo ogvLiveReserveVo = (OgvLiveReserveVo) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(ogvLiveReserveVo.f93285a);
            case 1:
                return ogvLiveReserveVo.f93286b;
            case 2:
                return ogvLiveReserveVo.f93287c;
            case 3:
                return ogvLiveReserveVo.f93288d;
            case 4:
                return ogvLiveReserveVo.b();
            case 5:
                return ogvLiveReserveVo.f93290f;
            case 6:
                return Boolean.valueOf(ogvLiveReserveVo.f93291g);
            case 7:
                return Boolean.valueOf(ogvLiveReserveVo.d());
            case 8:
                return ogvLiveReserveVo.e();
            case 9:
                return ogvLiveReserveVo.a();
            case 10:
                return ogvLiveReserveVo.f93294k;
            case 11:
                return Boolean.valueOf(ogvLiveReserveVo.c());
            default:
                return null;
        }
    }
}
