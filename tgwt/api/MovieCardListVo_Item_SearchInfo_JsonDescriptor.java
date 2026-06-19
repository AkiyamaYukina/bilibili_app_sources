package com.bilibili.tgwt.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.tgwt.api.MovieCardListVo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/api/MovieCardListVo_Item_SearchInfo_JsonDescriptor.class */
public final class MovieCardListVo_Item_SearchInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f110863a = {new PojoPropertyDescriptor("season_id", (String[]) null, Integer.TYPE, (Class) null, 7), new PojoPropertyDescriptor("type", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("cv", (String[]) null, String.class, (Class) null, 2)};

    public MovieCardListVo_Item_SearchInfo_JsonDescriptor() {
        super(MovieCardListVo.Item.SearchInfo.class, f110863a);
    }

    public final Object constructWith(Object[] objArr) {
        MovieCardListVo.Item.SearchInfo searchInfo = new MovieCardListVo.Item.SearchInfo();
        Object obj = objArr[0];
        if (obj != null) {
            searchInfo.b(((Integer) obj).intValue());
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            searchInfo.f110854b = (String) obj2;
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            searchInfo.f110855c = (String) obj3;
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            searchInfo.f110856d = (String) obj4;
        }
        return searchInfo;
    }

    public final Object get(Object obj, int i7) {
        MovieCardListVo.Item.SearchInfo searchInfo = (MovieCardListVo.Item.SearchInfo) obj;
        if (i7 == 0) {
            return Integer.valueOf(searchInfo.a());
        }
        if (i7 == 1) {
            return searchInfo.f110854b;
        }
        if (i7 == 2) {
            return searchInfo.f110855c;
        }
        if (i7 != 3) {
            return null;
        }
        return searchInfo.f110856d;
    }
}
