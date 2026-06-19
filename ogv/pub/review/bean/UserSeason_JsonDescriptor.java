package com.bilibili.ogv.pub.review.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/UserSeason_JsonDescriptor.class */
public final class UserSeason_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71770a = {new PojoPropertyDescriptor("last_ep_id", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("last_ep_index", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("last_time", (String[]) null, Long.class, (Class) null, 6), new PojoPropertyDescriptor("last_index_show", (String[]) null, String.class, (Class) null, 6)};

    public UserSeason_JsonDescriptor() {
        super(UserSeason.class, f71770a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
        String str = (String) obj;
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        String str2 = (String) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        Long l7 = (Long) obj3;
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        return new UserSeason(str, str2, l7, (String) obj4, i10);
    }

    public final Object get(Object obj, int i7) {
        UserSeason userSeason = (UserSeason) obj;
        if (i7 == 0) {
            return userSeason.c();
        }
        if (i7 == 1) {
            return userSeason.a();
        }
        if (i7 == 2) {
            return userSeason.b();
        }
        if (i7 != 3) {
            return null;
        }
        return userSeason.f71769d;
    }
}
