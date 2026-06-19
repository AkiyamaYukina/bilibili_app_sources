package com.bilibili.ship.theseus.playlist.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/PugvInfo_JsonDescriptor.class */
public final class PugvInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f95297a;

    static {
        Class cls = Long.TYPE;
        f95297a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("aid", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("cid", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("season_id", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("epid", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("dimension", (String[]) null, VideoDimension.class, (Class) null, 6), new PojoPropertyDescriptor("csource", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 6)};
    }

    public PugvInfo_JsonDescriptor() {
        super(PugvInfo.class, f95297a);
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
        VideoDimension videoDimension = (VideoDimension) obj5;
        Object obj6 = objArr[5];
        int i12 = i11;
        if (obj6 == null) {
            i12 = i11 | 32;
        }
        String str = (String) obj6;
        Object obj7 = objArr[6];
        int i13 = i12;
        if (obj7 == null) {
            i13 = i12 | 64;
        }
        return new PugvInfo(jLongValue, jLongValue2, jLongValue3, jLongValue4, videoDimension, str, (String) obj7, i13);
    }

    public final Object get(Object obj, int i7) {
        PugvInfo pugvInfo = (PugvInfo) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(pugvInfo.f95290a);
            case 1:
                return Long.valueOf(pugvInfo.f95291b);
            case 2:
                return Long.valueOf(pugvInfo.f95292c);
            case 3:
                return Long.valueOf(pugvInfo.f95293d);
            case 4:
                return pugvInfo.f95294e;
            case 5:
                return pugvInfo.f95295f;
            case 6:
                return pugvInfo.f95296g;
            default:
                return null;
        }
    }
}
