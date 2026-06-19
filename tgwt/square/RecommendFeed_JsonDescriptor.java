package com.bilibili.tgwt.square;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/RecommendFeed_JsonDescriptor.class */
public final class RecommendFeed_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f112081a = {new PojoPropertyDescriptor("cursor", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("fall_wid", (String[]) null, Types.parameterizedType(List.class, new Type[]{Long.class}), (Class) null, 21), new PojoPropertyDescriptor("has_next", (String[]) null, Boolean.TYPE, (Class) null, 5)};

    public RecommendFeed_JsonDescriptor() {
        super(RecommendFeed.class, f112081a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        List list = (List) objArr[1];
        Boolean bool = (Boolean) objArr[2];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new RecommendFeed(jLongValue, zBooleanValue, list);
    }

    public final Object get(Object obj, int i7) {
        RecommendFeed recommendFeed = (RecommendFeed) obj;
        if (i7 == 0) {
            return Long.valueOf(recommendFeed.f112078a);
        }
        if (i7 == 1) {
            return recommendFeed.a();
        }
        if (i7 != 2) {
            return null;
        }
        return Boolean.valueOf(recommendFeed.f112080c);
    }
}
