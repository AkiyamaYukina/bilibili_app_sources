package com.bilibili.ogv.misc.follow.api.entity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/Series_JsonDescriptor.class */
public final class Series_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69160a = {new PojoPropertyDescriptor("count", (String[]) null, Integer.TYPE, (Class) null, 3), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("list", (String[]) null, Types.parameterizedType(List.class, new Type[]{SeriesItem.class}), (Class) null, 7)};

    public Series_JsonDescriptor() {
        super(Series.class, f69160a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Integer num = (Integer) obj;
        if (num != null) {
            iIntValue = num.intValue();
        }
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        String str = (String) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        return new Series(str, (List) obj3, iIntValue, i9);
    }

    public final Object get(Object obj, int i7) {
        Series series = (Series) obj;
        if (i7 == 0) {
            return Integer.valueOf(series.f69151a);
        }
        if (i7 == 1) {
            return series.f69152b;
        }
        if (i7 != 2) {
            return null;
        }
        return series.a();
    }
}
