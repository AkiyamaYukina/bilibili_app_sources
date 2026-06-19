package com.bilibili.tgwt.square;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogvcommon.bangumibadge.BangumiBadgeInfo;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/CommonCard_JsonDescriptor.class */
public final class CommonCard_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f112030a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("desc", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("badge_info", (String[]) null, BangumiBadgeInfo.class, (Class) null, 6), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 6), new PojoPropertyDescriptor("item_type", (String[]) null, Integer.TYPE, (Class) null, 7), new PojoPropertyDescriptor("small_cover", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("room_info", (String[]) null, RoomInfo.class, (Class) null, 6), new PojoPropertyDescriptor("wait_room", (String[]) null, WaitRoom.class, (Class) null, 6), new PojoPropertyDescriptor("room_card", (String[]) null, HotRoom.class, (Class) null, 6)};

    public CommonCard_JsonDescriptor() {
        super(CommonCard.class, f112030a);
    }

    public final Object constructWith(Object[] objArr) {
        CommonCard commonCard = new CommonCard();
        Object obj = objArr[0];
        if (obj != null) {
            commonCard.f112019a = (String) obj;
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            commonCard.f112020b = (String) obj2;
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            commonCard.f112021c = (String) obj3;
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            commonCard.d((BangumiBadgeInfo) obj4);
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            commonCard.f112023e = (String) obj5;
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            commonCard.f112024f = (Map) obj6;
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            commonCard.f112025g = ((Integer) obj7).intValue();
        }
        Object obj8 = objArr[7];
        if (obj8 != null) {
            commonCard.h = (String) obj8;
        }
        Object obj9 = objArr[8];
        if (obj9 != null) {
            commonCard.f112027j = (RoomInfo) obj9;
        }
        Object obj10 = objArr[9];
        if (obj10 != null) {
            commonCard.f112028k = (WaitRoom) obj10;
        }
        Object obj11 = objArr[10];
        if (obj11 != null) {
            commonCard.c((HotRoom) obj11);
        }
        return commonCard;
    }

    public final Object get(Object obj, int i7) {
        CommonCard commonCard = (CommonCard) obj;
        switch (i7) {
            case 0:
                return commonCard.f112019a;
            case 1:
                return commonCard.f112020b;
            case 2:
                return commonCard.f112021c;
            case 3:
                return commonCard.b();
            case 4:
                return commonCard.f112023e;
            case 5:
                return commonCard.f112024f;
            case 6:
                return Integer.valueOf(commonCard.f112025g);
            case 7:
                return commonCard.h;
            case 8:
                return commonCard.f112027j;
            case 9:
                return commonCard.f112028k;
            case 10:
                return commonCard.a();
            default:
                return null;
        }
    }
}
