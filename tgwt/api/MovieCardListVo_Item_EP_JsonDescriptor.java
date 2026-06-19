package com.bilibili.tgwt.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.tgwt.api.MovieCardListVo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/api/MovieCardListVo_Item_EP_JsonDescriptor.class */
public final class MovieCardListVo_Item_EP_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f110860a = {new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("ep_id", (String[]) null, Integer.TYPE, (Class) null, 7)};

    public MovieCardListVo_Item_EP_JsonDescriptor() {
        super(MovieCardListVo.Item.EP.class, f110860a);
    }

    public final Object constructWith(Object[] objArr) {
        MovieCardListVo.Item.EP ep = new MovieCardListVo.Item.EP();
        Object obj = objArr[0];
        if (obj != null) {
            ep.f110848a = (String) obj;
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            ep.f110849b = (String) obj2;
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            ep.b(((Integer) obj3).intValue());
        }
        return ep;
    }

    public final Object get(Object obj, int i7) {
        MovieCardListVo.Item.EP ep = (MovieCardListVo.Item.EP) obj;
        if (i7 == 0) {
            return ep.f110848a;
        }
        if (i7 == 1) {
            return ep.f110849b;
        }
        if (i7 != 2) {
            return null;
        }
        return Integer.valueOf(ep.a());
    }
}
