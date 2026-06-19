package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/RecommendFeed_JsonDescriptor.class */
public final class RecommendFeed_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69890a = {new PojoPropertyDescriptor("type", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("cursor", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("fall_wid", (String[]) null, Types.parameterizedType(List.class, new Type[]{Long.class}), (Class) null, 21), new PojoPropertyDescriptor("has_next", (String[]) null, Boolean.TYPE, (Class) null, 5)};

    public RecommendFeed_JsonDescriptor() {
        super(RecommendFeed.class, f69890a);
    }

    public final Object constructWith(Object[] objArr) {
        String str = (String) objArr[0];
        Long l7 = (Long) objArr[1];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        List list = (List) objArr[2];
        Boolean bool = (Boolean) objArr[3];
        return new RecommendFeed(jLongValue, str, list, bool == null ? false : bool.booleanValue());
    }

    public final Object get(Object obj, int i7) {
        RecommendFeed recommendFeed = (RecommendFeed) obj;
        if (i7 == 0) {
            return recommendFeed.f69886a;
        }
        if (i7 == 1) {
            return Long.valueOf(recommendFeed.f69887b);
        }
        if (i7 == 2) {
            return recommendFeed.a();
        }
        if (i7 != 3) {
            return null;
        }
        return Boolean.valueOf(recommendFeed.f69889d);
    }
}
