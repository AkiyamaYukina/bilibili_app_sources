package com.bilibili.ogv.misc.follow.api.entity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/BangumiSeries_JsonDescriptor.class */
public final class BangumiSeries_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69124a = {new PojoPropertyDescriptor("list", (String[]) null, Types.parameterizedType(List.class, new Type[]{SeriesItem.class}), (Class) null, 3)};

    public BangumiSeries_JsonDescriptor() {
        super(BangumiSeries.class, f69124a);
    }

    public final Object constructWith(Object[] objArr) {
        BangumiSeries bangumiSeries = new BangumiSeries();
        Object obj = objArr[0];
        if (obj != null) {
            bangumiSeries.f69123a = (List) obj;
        }
        return bangumiSeries;
    }

    public final Object get(Object obj, int i7) {
        BangumiSeries bangumiSeries = (BangumiSeries) obj;
        if (i7 != 0) {
            return null;
        }
        return bangumiSeries.f69123a;
    }
}
