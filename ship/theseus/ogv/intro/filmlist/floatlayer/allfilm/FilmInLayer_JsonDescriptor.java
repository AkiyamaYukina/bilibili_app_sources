package com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm;

import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/allfilm/FilmInLayer_JsonDescriptor.class */
public final class FilmInLayer_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f92693a = {new PojoPropertyDescriptor("season_id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("follow", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("rating_score", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("rank_label", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor(Constant.IN_KEY_REASON, (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("styles", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 5)};

    public FilmInLayer_JsonDescriptor() {
        super(FilmInLayer.class, f92693a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        Boolean bool = (Boolean) objArr[3];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new FilmInLayer(jLongValue, str, str2, zBooleanValue, (String) objArr[4], (String) objArr[5], (String) objArr[6], (String) objArr[7], (String) objArr[8], (Map) objArr[9]);
    }

    public final Object get(Object obj, int i7) {
        FilmInLayer filmInLayer = (FilmInLayer) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(filmInLayer.f92684a);
            case 1:
                return filmInLayer.f92685b;
            case 2:
                return filmInLayer.f92686c;
            case 3:
                return Boolean.valueOf(filmInLayer.f92687d);
            case 4:
                return filmInLayer.f92688e;
            case 5:
                return filmInLayer.f92689f;
            case 6:
                return filmInLayer.f92690g;
            case 7:
                return filmInLayer.h;
            case 8:
                return filmInLayer.f92691i;
            case 9:
                return filmInLayer.f92692j;
            default:
                return null;
        }
    }
}
