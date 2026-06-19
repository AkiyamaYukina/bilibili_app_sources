package com.bilibili.tgwt.square;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/HomeRecommendPage_JsonDescriptor.class */
public final class HomeRecommendPage_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f112034a = {new PojoPropertyDescriptor("modules", (String[]) null, Types.parameterizedType(List.class, new Type[]{RecommendModule.class}), (Class) null, 21), new PojoPropertyDescriptor("feed", (String[]) null, RecommendFeed.class, (Class) null, 4), new PojoPropertyDescriptor("header", (String[]) null, PageHeader.class, (Class) null, 4)};

    public HomeRecommendPage_JsonDescriptor() {
        super(HomeRecommendPage.class, f112034a);
    }

    public final Object constructWith(Object[] objArr) {
        return new HomeRecommendPage((List) objArr[0], (RecommendFeed) objArr[1], (PageHeader) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        HomeRecommendPage homeRecommendPage = (HomeRecommendPage) obj;
        if (i7 == 0) {
            return homeRecommendPage.f112031a;
        }
        if (i7 == 1) {
            return homeRecommendPage.f112032b;
        }
        if (i7 != 2) {
            return null;
        }
        return homeRecommendPage.a();
    }
}
