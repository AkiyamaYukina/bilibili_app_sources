package com.bilibili.ship.theseus.ogv.intro.filmlist;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/Film_JsonDescriptor.class */
public final class Film_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f92669a = {new PojoPropertyDescriptor("season_id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("subtitle", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("score", new String[]{"rating_score"}, String.class, (Class) null, 5), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 5)};

    public Film_JsonDescriptor() {
        super(Film.class, f92669a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        return new Film(l7 == null ? 0L : l7.longValue(), (String) objArr[1], (String) objArr[2], (String) objArr[3], (String) objArr[4], (String) objArr[5], (Map) objArr[6]);
    }

    public final Object get(Object obj, int i7) {
        Film film = (Film) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(film.f92662a);
            case 1:
                return film.f92663b;
            case 2:
                return film.f92664c;
            case 3:
                return film.f92665d;
            case 4:
                return film.a();
            case 5:
                return film.f92667f;
            case 6:
                return film.f92668g;
            default:
                return null;
        }
    }
}
