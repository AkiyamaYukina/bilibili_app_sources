package com.bilibili.tgwt.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogvcommon.bangumibadge.BangumiBadgeInfo;
import com.bilibili.tgwt.api.MovieCardListVo;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/api/MovieCardListVo_Item_JsonDescriptor.class */
public final class MovieCardListVo_Item_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f110861a = {new PojoPropertyDescriptor("season_id", (String[]) null, Integer.TYPE, (Class) null, 7), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("badge_info", (String[]) null, BangumiBadgeInfo.class, (Class) null, 6), new PojoPropertyDescriptor("rating", (String[]) null, MovieCardListVo.Item.Rating.class, (Class) null, 2), new PojoPropertyDescriptor("styles", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("eps", (String[]) null, Types.parameterizedType(List.class, new Type[]{MovieCardListVo.Item.EP.class}), (Class) null, 2), new PojoPropertyDescriptor("time_length_show", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("actors", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("search_info", (String[]) null, MovieCardListVo.Item.SearchInfo.class, (Class) null, 6)};

    public MovieCardListVo_Item_JsonDescriptor() {
        super(MovieCardListVo.Item.class, f110861a);
    }

    public final Object constructWith(Object[] objArr) {
        MovieCardListVo.Item item = new MovieCardListVo.Item();
        Object obj = objArr[0];
        if (obj != null) {
            item.g(((Integer) obj).intValue());
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            item.f110839b = (String) obj2;
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            item.f110840c = (String) obj3;
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            item.e((BangumiBadgeInfo) obj4);
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            item.f110842e = (MovieCardListVo.Item.Rating) obj5;
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            item.f110843f = (String) obj6;
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            item.f110844g = (String) obj7;
        }
        Object obj8 = objArr[7];
        if (obj8 != null) {
            item.h = (List) obj8;
        }
        Object obj9 = objArr[8];
        if (obj9 != null) {
            item.h((String) obj9);
        }
        Object obj10 = objArr[9];
        if (obj10 != null) {
            item.f110846j = (String) obj10;
        }
        Object obj11 = objArr[10];
        if (obj11 != null) {
            item.f((MovieCardListVo.Item.SearchInfo) obj11);
        }
        return item;
    }

    public final Object get(Object obj, int i7) {
        MovieCardListVo.Item item = (MovieCardListVo.Item) obj;
        switch (i7) {
            case 0:
                return Integer.valueOf(item.c());
            case 1:
                return item.f110839b;
            case 2:
                return item.f110840c;
            case 3:
                return item.a();
            case 4:
                return item.f110842e;
            case 5:
                return item.f110843f;
            case 6:
                return item.f110844g;
            case 7:
                return item.h;
            case 8:
                return item.d();
            case 9:
                return item.f110846j;
            case 10:
                return item.b();
            default:
                return null;
        }
    }
}
