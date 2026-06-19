package com.bilibili.ship.theseus.playlist.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/OgvInfo_JsonDescriptor.class */
public final class OgvInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f95259a;

    static {
        Class cls = Long.TYPE;
        f95259a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("aid", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("cid", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("season_id", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("epid", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("dimension", (String[]) null, VideoDimension.class, (Class) null, 6)};
    }

    public OgvInfo_JsonDescriptor() {
        super(OgvInfo.class, f95259a);
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
        Long l10 = (Long) obj4;
        long jLongValue4 = l10 == null ? 0L : l10.longValue();
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        return new OgvInfo(jLongValue, jLongValue2, jLongValue3, jLongValue4, (VideoDimension) obj5, i11);
    }

    public final Object get(Object obj, int i7) {
        OgvInfo ogvInfo = (OgvInfo) obj;
        if (i7 == 0) {
            return Long.valueOf(ogvInfo.f95254a);
        }
        if (i7 == 1) {
            return Long.valueOf(ogvInfo.f95255b);
        }
        if (i7 == 2) {
            return Long.valueOf(ogvInfo.f95256c);
        }
        if (i7 == 3) {
            return Long.valueOf(ogvInfo.f95257d);
        }
        if (i7 != 4) {
            return null;
        }
        return ogvInfo.f95258e;
    }
}
