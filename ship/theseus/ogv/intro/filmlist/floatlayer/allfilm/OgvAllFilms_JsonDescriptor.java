package com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/allfilm/OgvAllFilms_JsonDescriptor.class */
public final class OgvAllFilms_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f92717a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("is_favorite", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("seasons", (String[]) null, Types.parameterizedType(List.class, new Type[]{FilmInLayer.class}), (Class) null, 21), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 5)};

    public OgvAllFilms_JsonDescriptor() {
        super(OgvAllFilms.class, f92717a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        String str = (String) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new OgvAllFilms(zBooleanValue, str, (Map) objArr[3], (List) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        OgvAllFilms ogvAllFilms = (OgvAllFilms) obj;
        if (i7 == 0) {
            return ogvAllFilms.f92694a;
        }
        if (i7 == 1) {
            return Boolean.valueOf(ogvAllFilms.f92695b);
        }
        if (i7 == 2) {
            return ogvAllFilms.a();
        }
        if (i7 != 3) {
            return null;
        }
        return ogvAllFilms.f92697d;
    }
}
