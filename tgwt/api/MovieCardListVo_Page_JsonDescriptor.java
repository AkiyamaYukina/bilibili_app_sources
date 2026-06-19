package com.bilibili.tgwt.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.tgwt.api.MovieCardListVo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/api/MovieCardListVo_Page_JsonDescriptor.class */
public final class MovieCardListVo_Page_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f110865a = {new PojoPropertyDescriptor("next", (String[]) null, Boolean.TYPE, (Class) null, 3), new PojoPropertyDescriptor("page_version", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor(TextSource.CFG_SIZE, (String[]) null, Integer.TYPE, (Class) null, 3)};

    public MovieCardListVo_Page_JsonDescriptor() {
        super(MovieCardListVo.Page.class, f110865a);
    }

    public final Object constructWith(Object[] objArr) {
        MovieCardListVo.Page page = new MovieCardListVo.Page();
        Object obj = objArr[0];
        if (obj != null) {
            page.f110857a = ((Boolean) obj).booleanValue();
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            page.b((String) obj2);
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            page.f110859c = ((Integer) obj3).intValue();
        }
        return page;
    }

    public final Object get(Object obj, int i7) {
        MovieCardListVo.Page page = (MovieCardListVo.Page) obj;
        if (i7 == 0) {
            return Boolean.valueOf(page.f110857a);
        }
        if (i7 == 1) {
            return page.a();
        }
        if (i7 != 2) {
            return null;
        }
        return Integer.valueOf(page.f110859c);
    }
}
