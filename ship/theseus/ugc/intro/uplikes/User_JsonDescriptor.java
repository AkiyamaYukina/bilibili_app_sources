package com.bilibili.ship.theseus.ugc.intro.uplikes;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/User_JsonDescriptor.class */
public final class User_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f97699a;

    static {
        Class cls = Long.TYPE;
        f97699a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor(EditCustomizeSticker.TAG_MID, (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("face", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("follower", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("is_attention", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("is_interrelation", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("is_follow", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("interact_desc", (String[]) null, String.class, (Class) null, 7)};
    }

    public User_JsonDescriptor() {
        super(User.class, f97699a);
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
        String str = (String) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        String str2 = (String) obj3;
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        Long l8 = (Long) obj4;
        long jLongValue2 = l8 == null ? 0L : l8.longValue();
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        Long l9 = (Long) obj5;
        long jLongValue3 = l9 == null ? 0L : l9.longValue();
        Object obj6 = objArr[5];
        int i12 = i11;
        if (obj6 == null) {
            i12 = i11 | 32;
        }
        Long l10 = (Long) obj6;
        long jLongValue4 = l10 == null ? 0L : l10.longValue();
        Object obj7 = objArr[6];
        int i13 = i12;
        if (obj7 == null) {
            i13 = i12 | 64;
        }
        Long l11 = (Long) obj7;
        long jLongValue5 = l11 == null ? 0L : l11.longValue();
        Object obj8 = objArr[7];
        int i14 = i13;
        if (obj8 == null) {
            i14 = i13 | 128;
        }
        return new User(jLongValue, jLongValue2, jLongValue3, jLongValue4, str, str2, (String) obj8, jLongValue5, i14);
    }

    public final Object get(Object obj, int i7) {
        User user = (User) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(user.f97689a);
            case 1:
                return user.f97690b;
            case 2:
                return user.f97691c;
            case 3:
                return Long.valueOf(user.f97692d);
            case 4:
                return Long.valueOf(user.f97693e);
            case 5:
                return Long.valueOf(user.f97694f);
            case 6:
                return Long.valueOf(user.f97695g);
            case 7:
                return user.h;
            default:
                return null;
        }
    }
}
