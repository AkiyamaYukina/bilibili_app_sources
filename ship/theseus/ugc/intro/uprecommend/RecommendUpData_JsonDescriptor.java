package com.bilibili.ship.theseus.ugc.intro.uprecommend;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpData_JsonDescriptor.class */
public final class RecommendUpData_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f97785a = {new PojoPropertyDescriptor("param", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("items", (String[]) null, Types.parameterizedType(List.class, new Type[]{RecommendUp.class}), (Class) null, 23)};

    public RecommendUpData_JsonDescriptor() {
        super(RecommendUpData.class, f97785a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        Object obj = objArr[2];
        if (obj == null) {
            i7 = 4;
        }
        return new RecommendUpData(i7, str, (List) obj, str2);
    }

    public final Object get(Object obj, int i7) {
        RecommendUpData recommendUpData = (RecommendUpData) obj;
        if (i7 == 0) {
            return recommendUpData.b();
        }
        if (i7 == 1) {
            return recommendUpData.c();
        }
        if (i7 != 2) {
            return null;
        }
        return recommendUpData.a();
    }
}
