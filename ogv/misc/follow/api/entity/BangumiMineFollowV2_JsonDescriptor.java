package com.bilibili.ogv.misc.follow.api.entity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/BangumiMineFollowV2_JsonDescriptor.class */
public final class BangumiMineFollowV2_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69122a = {new PojoPropertyDescriptor("has_next", (String[]) null, Boolean.TYPE, (Class) null, 7), new PojoPropertyDescriptor("vip_tip", (String[]) null, Types.parameterizedType(List.class, new Type[]{BangumiMineFollowNotice.class}), (Class) null, 23), new PojoPropertyDescriptor("watched", (String[]) null, Types.parameterizedType(List.class, new Type[]{ItemData.class}), (Class) null, 23), new PojoPropertyDescriptor("series", (String[]) null, Types.parameterizedType(List.class, new Type[]{SeriesItem.class}), (Class) null, 23), new PojoPropertyDescriptor("want", (String[]) null, Types.parameterizedType(List.class, new Type[]{ItemData.class}), (Class) null, 23), new PojoPropertyDescriptor("follow_list", (String[]) null, Types.parameterizedType(List.class, new Type[]{ItemData.class}), (Class) null, 23)};

    public BangumiMineFollowV2_JsonDescriptor() {
        super(BangumiMineFollowV2.class, f69122a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        List list = (List) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        List list2 = (List) obj3;
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        List list3 = (List) obj4;
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        List list4 = (List) obj5;
        Object obj6 = objArr[5];
        if (obj6 == null) {
            i11 |= 32;
        }
        return new BangumiMineFollowV2(zBooleanValue, list, list2, list3, list4, (List) obj6, i11);
    }

    public final Object get(Object obj, int i7) {
        BangumiMineFollowV2 bangumiMineFollowV2 = (BangumiMineFollowV2) obj;
        if (i7 == 0) {
            return Boolean.valueOf(bangumiMineFollowV2.b());
        }
        if (i7 == 1) {
            return bangumiMineFollowV2.d();
        }
        if (i7 == 2) {
            return bangumiMineFollowV2.f();
        }
        if (i7 == 3) {
            return bangumiMineFollowV2.c();
        }
        if (i7 == 4) {
            return bangumiMineFollowV2.e();
        }
        if (i7 != 5) {
            return null;
        }
        return bangumiMineFollowV2.a();
    }
}
