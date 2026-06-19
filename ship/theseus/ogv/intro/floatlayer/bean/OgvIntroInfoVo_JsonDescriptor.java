package com.bilibili.ship.theseus.ogv.intro.floatlayer.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ogv.playviewextra.OgvBadgeInfo;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/bean/OgvIntroInfoVo_JsonDescriptor.class */
public final class OgvIntroInfoVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f92864a;

    static {
        Class cls = Long.TYPE;
        f92864a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("season_id", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("media_type", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("media_id", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("media_title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("season_title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("type_name", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("areas", (String[]) null, Types.parameterizedType(List.class, new Type[]{Area.class}), (Class) null, 21), new PojoPropertyDescriptor("publish", (String[]) null, Publish.class, (Class) null, 5), new PojoPropertyDescriptor("media_badge_info", (String[]) null, OgvBadgeInfo.class, (Class) null, 4), new PojoPropertyDescriptor("alias", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("origin_name", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("styles", (String[]) null, Types.parameterizedType(List.class, new Type[]{Style.class}), (Class) null, 21), new PojoPropertyDescriptor("celebrity", (String[]) null, Types.parameterizedType(List.class, new Type[]{Celebrity.class}), (Class) null, 21), new PojoPropertyDescriptor("actor", (String[]) null, Actor.class, (Class) null, 4), new PojoPropertyDescriptor("staff", (String[]) null, Staff.class, (Class) null, 4), new PojoPropertyDescriptor("evaluate", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("rating", (String[]) null, Rating.class, (Class) null, 5)};
    }

    public OgvIntroInfoVo_JsonDescriptor() {
        super(OgvIntroInfoVo.class, f92864a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Integer num = (Integer) objArr[1];
        if (num != null) {
            iIntValue = num.intValue();
        }
        Long l8 = (Long) objArr[2];
        return new OgvIntroInfoVo(jLongValue, iIntValue, l8 == null ? 0L : l8.longValue(), (String) objArr[3], (String) objArr[4], (String) objArr[5], (String) objArr[6], (List) objArr[7], (Publish) objArr[8], (OgvBadgeInfo) objArr[9], (String) objArr[10], (String) objArr[11], (List) objArr[12], (List) objArr[13], (Actor) objArr[14], (Staff) objArr[15], (String) objArr[16], (Rating) objArr[17]);
    }

    public final Object get(Object obj, int i7) {
        OgvIntroInfoVo ogvIntroInfoVo = (OgvIntroInfoVo) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(ogvIntroInfoVo.f92847a);
            case 1:
                return Integer.valueOf(ogvIntroInfoVo.f92848b);
            case 2:
                return Long.valueOf(ogvIntroInfoVo.f92849c);
            case 3:
                return ogvIntroInfoVo.f92850d;
            case 4:
                return ogvIntroInfoVo.f92851e;
            case 5:
                return ogvIntroInfoVo.f92852f;
            case 6:
                return ogvIntroInfoVo.f92853g;
            case 7:
                return ogvIntroInfoVo.h;
            case 8:
                return ogvIntroInfoVo.f92854i;
            case 9:
                return ogvIntroInfoVo.f92855j;
            case 10:
                return ogvIntroInfoVo.f92856k;
            case 11:
                return ogvIntroInfoVo.f92857l;
            case 12:
                return ogvIntroInfoVo.f92858m;
            case 13:
                return ogvIntroInfoVo.a();
            case 14:
                return ogvIntroInfoVo.f92860o;
            case 15:
                return ogvIntroInfoVo.f92861p;
            case 16:
                return ogvIntroInfoVo.f92862q;
            case 17:
                return ogvIntroInfoVo.f92863r;
            default:
                return null;
        }
    }
}
