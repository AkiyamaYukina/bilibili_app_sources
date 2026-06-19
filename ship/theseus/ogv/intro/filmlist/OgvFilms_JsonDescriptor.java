package com.bilibili.ship.theseus.ogv.intro.filmlist;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/OgvFilms_JsonDescriptor.class */
public final class OgvFilms_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f92678a = {new PojoPropertyDescriptor("id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("upper", (String[]) null, Upper.class, (Class) null, 4), new PojoPropertyDescriptor("desc", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("more_title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("seasons", (String[]) null, Types.parameterizedType(List.class, new Type[]{Film.class}), (Class) null, 21), new PojoPropertyDescriptor("more_playlist", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("more_playlist_url", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 5)};

    public OgvFilms_JsonDescriptor() {
        super(OgvFilms.class, f92678a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        String str = (String) objArr[1];
        Upper upper = (Upper) objArr[2];
        String str2 = (String) objArr[3];
        String str3 = (String) objArr[4];
        List list = (List) objArr[5];
        Boolean bool = (Boolean) objArr[6];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new OgvFilms(jLongValue, str, upper, str2, str3, list, zBooleanValue, (String) objArr[7], (Map) objArr[8]);
    }

    public final Object get(Object obj, int i7) {
        OgvFilms ogvFilms = (OgvFilms) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(ogvFilms.a());
            case 1:
                return ogvFilms.f92671b;
            case 2:
                return ogvFilms.f92672c;
            case 3:
                return ogvFilms.f92673d;
            case 4:
                return ogvFilms.f92674e;
            case 5:
                return ogvFilms.b();
            case 6:
                return Boolean.valueOf(ogvFilms.c());
            case 7:
                return ogvFilms.d();
            case 8:
                return ogvFilms.f92677i;
            default:
                return null;
        }
    }
}
