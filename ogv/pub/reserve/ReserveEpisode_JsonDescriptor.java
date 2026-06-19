package com.bilibili.ogv.pub.reserve;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/ReserveEpisode_JsonDescriptor.class */
public final class ReserveEpisode_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71638a;

    static {
        Class cls = Long.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("aid", (String[]) null, cls, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("cid", (String[]) null, cls, (Class) null, 5);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5);
        Class cls2 = Integer.TYPE;
        f71638a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, new PojoPropertyDescriptor("ep_index", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("section_index", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("long_title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("from", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("dimension", (String[]) null, Dimension.class, (Class) null, 4), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("bvid", (String[]) null, String.class, (Class) null, 5)};
    }

    public ReserveEpisode_JsonDescriptor() {
        super(ReserveEpisode.class, f71638a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        String str = (String) objArr[1];
        Long l8 = (Long) objArr[2];
        long jLongValue2 = l8 == null ? 0L : l8.longValue();
        String str2 = (String) objArr[3];
        Object obj = objArr[4];
        char c7 = obj == null ? (char) 16 : (char) 0;
        Integer num = (Integer) obj;
        int iIntValue = num == null ? 0 : num.intValue();
        Object obj2 = objArr[5];
        int i7 = c7;
        if (obj2 == null) {
            i7 = c7 | ' ';
        }
        Integer num2 = (Integer) obj2;
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        String str3 = (String) objArr[6];
        String str4 = (String) objArr[7];
        Dimension dimension = (Dimension) objArr[8];
        String str5 = (String) objArr[9];
        String str6 = (String) objArr[10];
        if ((i7 & 16) != 0) {
            iIntValue = 0;
        }
        if ((i7 & 32) != 0) {
            iIntValue2 = 0;
        }
        return new ReserveEpisode(jLongValue, str, jLongValue2, str2, iIntValue, iIntValue2, str3, str4, dimension, str5, str6);
    }

    public final Object get(Object obj, int i7) {
        ReserveEpisode reserveEpisode = (ReserveEpisode) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(reserveEpisode.a());
            case 1:
                return reserveEpisode.f71629b;
            case 2:
                return Long.valueOf(reserveEpisode.f71630c);
            case 3:
                return reserveEpisode.f71631d;
            case 4:
                return Integer.valueOf(reserveEpisode.f71632e);
            case 5:
                return Integer.valueOf(reserveEpisode.f71633f);
            case 6:
                return reserveEpisode.f71634g;
            case 7:
                return reserveEpisode.h;
            case 8:
                return reserveEpisode.f71635i;
            case 9:
                return reserveEpisode.f71636j;
            case 10:
                return reserveEpisode.f71637k;
            default:
                return null;
        }
    }
}
