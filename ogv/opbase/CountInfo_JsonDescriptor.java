package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/CountInfo_JsonDescriptor.class */
public final class CountInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69822a;

    static {
        Class cls = Long.TYPE;
        f69822a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("view", (String[]) null, cls, (Class) null, 3), new PojoPropertyDescriptor("danmaku", (String[]) null, cls, (Class) null, 3), new PojoPropertyDescriptor(IVideoLikeRouteService.ACTION_LIKE, (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("follow_view", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("follow", (String[]) null, cls, (Class) null, 3)};
    }

    public CountInfo_JsonDescriptor() {
        super(CountInfo.class, f69822a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
        Long l7 = (Long) obj;
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        Long l8 = (Long) obj2;
        long jLongValue2 = l8 == null ? 0L : l8.longValue();
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        Long l9 = (Long) obj3;
        long jLongValue3 = l9 == null ? 0L : l9.longValue();
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        String str = (String) obj4;
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        Long l10 = (Long) obj5;
        return new CountInfo(jLongValue, jLongValue2, str, jLongValue3, i11, l10 == null ? 0L : l10.longValue());
    }

    public final Object get(Object obj, int i7) {
        CountInfo countInfo = (CountInfo) obj;
        if (i7 == 0) {
            return Long.valueOf(countInfo.f69817a);
        }
        if (i7 == 1) {
            return Long.valueOf(countInfo.f69818b);
        }
        if (i7 == 2) {
            return Long.valueOf(countInfo.b());
        }
        if (i7 == 3) {
            return countInfo.a();
        }
        if (i7 != 4) {
            return null;
        }
        return Long.valueOf(countInfo.f69821e);
    }
}
