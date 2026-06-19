package com.bilibili.ogv.misc.roledetail.roledetailapi;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.misc.roledetail.roledetailapi.PersonRelateContentVo;
import com.bilibili.ogvcommon.bangumibadge.BangumiBadgeInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/roledetailapi/PersonRelateContentVo_Season_JsonDescriptor.class */
public final class PersonRelateContentVo_Season_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69289a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 2);
        Class cls = Integer.TYPE;
        f69289a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, new PojoPropertyDescriptor("season_id", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("badge_info", (String[]) null, BangumiBadgeInfo.class, (Class) null, 6), new PojoPropertyDescriptor("index_show", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("season_type", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("order", (String[]) null, String.class, (Class) null, 2)};
    }

    public PersonRelateContentVo_Season_JsonDescriptor() {
        super(PersonRelateContentVo.Season.class, f69289a);
    }

    public final Object constructWith(Object[] objArr) {
        PersonRelateContentVo.Season season = new PersonRelateContentVo.Season();
        Object obj = objArr[0];
        if (obj != null) {
            season.f69281a = (String) obj;
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            season.g(((Integer) obj2).intValue());
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            season.f69283c = (String) obj3;
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            season.f69284d = (String) obj4;
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            season.e((BangumiBadgeInfo) obj5);
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            season.f((String) obj6);
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            season.h(((Integer) obj7).intValue());
        }
        Object obj8 = objArr[7];
        if (obj8 != null) {
            season.h = (String) obj8;
        }
        return season;
    }

    public final Object get(Object obj, int i7) {
        int iC;
        PersonRelateContentVo.Season season = (PersonRelateContentVo.Season) obj;
        switch (i7) {
            case 0:
                return season.f69281a;
            case 1:
                iC = season.c();
                break;
            case 2:
                return season.f69283c;
            case 3:
                return season.f69284d;
            case 4:
                return season.a();
            case 5:
                return season.b();
            case 6:
                iC = season.d();
                break;
            case 7:
                return season.h;
            default:
                return null;
        }
        return Integer.valueOf(iC);
    }
}
