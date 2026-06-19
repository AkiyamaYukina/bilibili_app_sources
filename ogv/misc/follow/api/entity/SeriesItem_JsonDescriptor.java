package com.bilibili.ogv.misc.follow.api.entity;

import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogvcommon.bangumibadge.BangumiBadgeInfo;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/SeriesItem_JsonDescriptor.class */
public final class SeriesItem_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69159a;

    static {
        Class cls = Boolean.TYPE;
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("can_watch", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("follow", (String[]) null, cls, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("series", (String[]) null, Series.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("season_id", (String[]) null, Long.TYPE, (Class) null, 7);
        Class cls2 = Integer.TYPE;
        f69159a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, new PojoPropertyDescriptor("season_type", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("season_type_name", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("badge", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("badge_type", (String[]) null, cls2, (Class) null, 7), new PojoPropertyDescriptor("badge_info", (String[]) null, BangumiBadgeInfo.class, (Class) null, 6), new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("square_cover", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("areas", (String[]) null, Types.parameterizedType(List.class, new Type[]{Areas.class}), (Class) null, 7), new PojoPropertyDescriptor("new_ep", (String[]) null, NewEp.class, (Class) null, 6), new PojoPropertyDescriptor(NotificationCompat.CATEGORY_PROGRESS, (String[]) null, Progress.class, (Class) null, 2), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("movable", (String[]) null, cls, (Class) null, 3)};
    }

    public SeriesItem_JsonDescriptor() {
        super(SeriesItem.class, f69159a);
    }

    public final Object constructWith(Object[] objArr) {
        SeriesItem seriesItem = new SeriesItem();
        Object obj = objArr[0];
        if (obj != null) {
            seriesItem.D(((Boolean) obj).booleanValue());
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            seriesItem.F(((Boolean) obj2).booleanValue());
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            seriesItem.G((Series) obj3);
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            seriesItem.r(((Long) obj4).longValue());
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            seriesItem.s(((Integer) obj5).intValue());
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            seriesItem.u((String) obj6);
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            seriesItem.f69130d = (String) obj7;
        }
        Object obj8 = objArr[7];
        if (obj8 != null) {
            seriesItem.f69131e = (String) obj8;
        }
        Object obj9 = objArr[8];
        if (obj9 != null) {
            seriesItem.o(((Integer) obj9).intValue());
        }
        Object obj10 = objArr[9];
        if (obj10 != null) {
            seriesItem.w((BangumiBadgeInfo) obj10);
        }
        Object obj11 = objArr[10];
        if (obj11 != null) {
            seriesItem.h = (String) obj11;
        }
        Object obj12 = objArr[11];
        if (obj12 != null) {
            seriesItem.v((String) obj12);
        }
        Object obj13 = objArr[12];
        if (obj13 != null) {
            seriesItem.n((List) obj13);
        }
        Object obj14 = objArr[13];
        if (obj14 != null) {
            seriesItem.q((NewEp) obj14);
        }
        Object obj15 = objArr[14];
        if (obj15 != null) {
            seriesItem.f69137l = (Progress) obj15;
        }
        Object obj16 = objArr[15];
        if (obj16 != null) {
            seriesItem.f69138m = (String) obj16;
        }
        Object obj17 = objArr[16];
        if (obj17 != null) {
            seriesItem.f69139n = ((Boolean) obj17).booleanValue();
        }
        return seriesItem;
    }

    public final Object get(Object obj, int i7) {
        SeriesItem seriesItem = (SeriesItem) obj;
        switch (i7) {
            case 0:
                return Boolean.valueOf(seriesItem.z());
            case 1:
                return Boolean.valueOf(seriesItem.A());
            case 2:
                return seriesItem.B();
            case 3:
                return Long.valueOf(seriesItem.d());
            case 4:
                return Integer.valueOf(seriesItem.h());
            case 5:
                return seriesItem.i();
            case 6:
                return seriesItem.f69130d;
            case 7:
                return seriesItem.f69131e;
            case 8:
                return Integer.valueOf(seriesItem.b());
            case 9:
                return seriesItem.m();
            case 10:
                return seriesItem.h;
            case 11:
                return seriesItem.j();
            case 12:
                return seriesItem.a();
            case 13:
                return seriesItem.c();
            case 14:
                return seriesItem.f69137l;
            case 15:
                return seriesItem.f69138m;
            case 16:
                return Boolean.valueOf(seriesItem.f69139n);
            default:
                return null;
        }
    }
}
