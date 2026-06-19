package com.bilibili.tgwt.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.tgwt.api.MovieCardListVo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/api/MovieCardListVo_Item_Rating_JsonDescriptor.class */
public final class MovieCardListVo_Item_Rating_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f110862a = {new PojoPropertyDescriptor("score", (String[]) null, Float.TYPE, (Class) null, 3), new PojoPropertyDescriptor("count", (String[]) null, Integer.TYPE, (Class) null, 3)};

    public MovieCardListVo_Item_Rating_JsonDescriptor() {
        super(MovieCardListVo.Item.Rating.class, f110862a);
    }

    public final Object constructWith(Object[] objArr) {
        MovieCardListVo.Item.Rating rating = new MovieCardListVo.Item.Rating();
        Object obj = objArr[0];
        if (obj != null) {
            rating.f110851a = ((Float) obj).floatValue();
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            rating.f110852b = ((Integer) obj2).intValue();
        }
        return rating;
    }

    public final Object get(Object obj, int i7) {
        MovieCardListVo.Item.Rating rating = (MovieCardListVo.Item.Rating) obj;
        if (i7 == 0) {
            return Float.valueOf(rating.f110851a);
        }
        if (i7 != 1) {
            return null;
        }
        return Integer.valueOf(rating.f110852b);
    }
}
