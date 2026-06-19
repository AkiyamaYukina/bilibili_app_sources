package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/HomeRecommendPage_JsonDescriptor.class */
public final class HomeRecommendPage_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69844a = {new PojoPropertyDescriptor("modules", (String[]) null, Types.parameterizedType(List.class, new Type[]{RecommendModule.class}), (Class) null, 21), new PojoPropertyDescriptor("style", (String[]) null, BannerStyle.class, (Class) null, 4), new PojoPropertyDescriptor("feed", (String[]) null, RecommendFeed.class, (Class) null, 4), new PojoPropertyDescriptor("animate", (String[]) null, InComing.class, (Class) null, 4), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("has_next", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("next_cursor", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 4), new PojoPropertyDescriptor("jump_module_id", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("header", (String[]) null, PageHeader.class, (Class) null, 4), new PojoPropertyDescriptor("tip", (String[]) null, UGCGuideTip.class, (Class) null, 4)};

    public HomeRecommendPage_JsonDescriptor() {
        super(HomeRecommendPage.class, f69844a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        List list = (List) objArr[0];
        BannerStyle bannerStyle = (BannerStyle) objArr[1];
        RecommendFeed recommendFeed = (RecommendFeed) objArr[2];
        InComing inComing = (InComing) objArr[3];
        String str = (String) objArr[4];
        Boolean bool = (Boolean) objArr[5];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new HomeRecommendPage(list, bannerStyle, recommendFeed, inComing, str, zBooleanValue, (String) objArr[6], (Map) objArr[7], (String) objArr[8], (PageHeader) objArr[9], (UGCGuideTip) objArr[10]);
    }

    public final Object get(Object obj, int i7) {
        HomeRecommendPage homeRecommendPage = (HomeRecommendPage) obj;
        switch (i7) {
            case 0:
                return homeRecommendPage.f69834a;
            case 1:
                return homeRecommendPage.a();
            case 2:
                return homeRecommendPage.f69836c;
            case 3:
                return homeRecommendPage.b();
            case 4:
                return homeRecommendPage.f69838e;
            case 5:
                return Boolean.valueOf(homeRecommendPage.f69839f);
            case 6:
                return homeRecommendPage.f69840g;
            case 7:
                return homeRecommendPage.h;
            case 8:
                return homeRecommendPage.c();
            case 9:
                return homeRecommendPage.d();
            case 10:
                return homeRecommendPage.f69843k;
            default:
                return null;
        }
    }
}
