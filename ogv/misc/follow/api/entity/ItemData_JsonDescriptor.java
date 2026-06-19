package com.bilibili.ogv.misc.follow.api.entity;

import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogvcommon.bangumibadge.BangumiBadgeInfo;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/ItemData_JsonDescriptor.class */
public final class ItemData_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69142a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("season_id", (String[]) null, Long.TYPE, (Class) null, 7);
        Class cls = Integer.TYPE;
        f69142a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, new PojoPropertyDescriptor("season_type", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("season_type_name", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("badge", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("badge_type", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("badge_info", (String[]) null, BangumiBadgeInfo.class, (Class) null, 6), new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("square_cover", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("areas", (String[]) null, Types.parameterizedType(List.class, new Type[]{Areas.class}), (Class) null, 7), new PojoPropertyDescriptor("new_ep", (String[]) null, NewEp.class, (Class) null, 6), new PojoPropertyDescriptor(NotificationCompat.CATEGORY_PROGRESS, (String[]) null, Progress.class, (Class) null, 2), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("movable", (String[]) null, Boolean.TYPE, (Class) null, 3)};
    }

    public ItemData_JsonDescriptor() {
        super(ItemData.class, f69142a);
    }

    public final Object constructWith(Object[] objArr) {
        ItemData itemData = new ItemData();
        Object obj = objArr[0];
        if (obj != null) {
            itemData.r(((Long) obj).longValue());
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            itemData.s(((Integer) obj2).intValue());
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            itemData.u((String) obj3);
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            itemData.f69130d = (String) obj4;
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            itemData.f69131e = (String) obj5;
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            itemData.o(((Integer) obj6).intValue());
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            itemData.w((BangumiBadgeInfo) obj7);
        }
        Object obj8 = objArr[7];
        if (obj8 != null) {
            itemData.h = (String) obj8;
        }
        Object obj9 = objArr[8];
        if (obj9 != null) {
            itemData.v((String) obj9);
        }
        Object obj10 = objArr[9];
        if (obj10 != null) {
            itemData.n((List) obj10);
        }
        Object obj11 = objArr[10];
        if (obj11 != null) {
            itemData.q((NewEp) obj11);
        }
        Object obj12 = objArr[11];
        if (obj12 != null) {
            itemData.f69137l = (Progress) obj12;
        }
        Object obj13 = objArr[12];
        if (obj13 != null) {
            itemData.f69138m = (String) obj13;
        }
        Object obj14 = objArr[13];
        if (obj14 != null) {
            itemData.f69139n = ((Boolean) obj14).booleanValue();
        }
        return itemData;
    }

    public final Object get(Object obj, int i7) {
        ItemData itemData = (ItemData) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(itemData.d());
            case 1:
                return Integer.valueOf(itemData.h());
            case 2:
                return itemData.i();
            case 3:
                return itemData.f69130d;
            case 4:
                return itemData.f69131e;
            case 5:
                return Integer.valueOf(itemData.b());
            case 6:
                return itemData.m();
            case 7:
                return itemData.h;
            case 8:
                return itemData.j();
            case 9:
                return itemData.a();
            case 10:
                return itemData.c();
            case 11:
                return itemData.f69137l;
            case 12:
                return itemData.f69138m;
            case 13:
                return Boolean.valueOf(itemData.f69139n);
            default:
                return null;
        }
    }
}
