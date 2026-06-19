package com.bilibili.ogv.misc.seasonlist;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/seasonlist/BangumiBrief_JsonDescriptor.class */
public final class BangumiBrief_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69303a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 2);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("newest_ep_index", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("season_id", (String[]) null, String.class, (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor4 = new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 2);
        Class cls = Integer.TYPE;
        f69303a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, pojoPropertyDescriptor4, new PojoPropertyDescriptor("watching_count", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("is_started", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("favourites", (String[]) null, cls, (Class) null, 3), new PojoPropertyDescriptor("follow", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("is_finish", (String[]) null, Boolean.TYPE, (Class) null, 7), new PojoPropertyDescriptor("badge", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("season_status", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("total_count", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 2)};
    }

    public BangumiBrief_JsonDescriptor() {
        super(BangumiBrief.class, f69303a);
    }

    public final Object constructWith(Object[] objArr) {
        BangumiBrief bangumiBrief = new BangumiBrief();
        Object obj = objArr[0];
        if (obj != null) {
            bangumiBrief.f69291a = (String) obj;
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            bangumiBrief.f69292b = (String) obj2;
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            bangumiBrief.f69293c = (String) obj3;
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            bangumiBrief.f69294d = (String) obj4;
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            bangumiBrief.f69295e = ((Integer) obj5).intValue();
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            bangumiBrief.f69296f = ((Integer) obj6).intValue();
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            bangumiBrief.f69297g = ((Integer) obj7).intValue();
        }
        Object obj8 = objArr[7];
        if (obj8 != null) {
            bangumiBrief.h = ((Integer) obj8).intValue();
        }
        Object obj9 = objArr[8];
        if (obj9 != null) {
            bangumiBrief.f69298i = ((Boolean) obj9).booleanValue();
        }
        Object obj10 = objArr[9];
        if (obj10 != null) {
            bangumiBrief.f69299j = (String) obj10;
        }
        Object obj11 = objArr[10];
        if (obj11 != null) {
            bangumiBrief.f69300k = ((Integer) obj11).intValue();
        }
        Object obj12 = objArr[11];
        if (obj12 != null) {
            bangumiBrief.f69301l = (String) obj12;
        }
        Object obj13 = objArr[12];
        if (obj13 != null) {
            bangumiBrief.f69302m = (String) obj13;
        }
        return bangumiBrief;
    }

    public final Object get(Object obj, int i7) {
        BangumiBrief bangumiBrief = (BangumiBrief) obj;
        switch (i7) {
            case 0:
                return bangumiBrief.f69291a;
            case 1:
                return bangumiBrief.f69292b;
            case 2:
                return bangumiBrief.f69293c;
            case 3:
                return bangumiBrief.f69294d;
            case 4:
                return Integer.valueOf(bangumiBrief.f69295e);
            case 5:
                return Integer.valueOf(bangumiBrief.f69296f);
            case 6:
                return Integer.valueOf(bangumiBrief.f69297g);
            case 7:
                return Integer.valueOf(bangumiBrief.h);
            case 8:
                return Boolean.valueOf(bangumiBrief.f69298i);
            case 9:
                return bangumiBrief.f69299j;
            case 10:
                return Integer.valueOf(bangumiBrief.f69300k);
            case 11:
                return bangumiBrief.f69301l;
            case 12:
                return bangumiBrief.f69302m;
            default:
                return null;
        }
    }
}
