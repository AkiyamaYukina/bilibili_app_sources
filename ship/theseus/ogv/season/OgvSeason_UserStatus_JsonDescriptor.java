package com.bilibili.ship.theseus.ogv.season;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.community.follow.FollowSeasonStatus;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/OgvSeason_UserStatus_JsonDescriptor.class */
public final class OgvSeason_UserStatus_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94501a;

    static {
        Class cls = Boolean.TYPE;
        f94501a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("follow", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("follow_status", (String[]) null, FollowSeasonStatus.class, (Class) null, 7), new PojoPropertyDescriptor("pay", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("sponsor", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("vip", (String[]) null, cls, (Class) null, 5)};
    }

    public OgvSeason_UserStatus_JsonDescriptor() {
        super(OgvSeason.UserStatus.class, f94501a);
    }

    public final Object constructWith(Object[] objArr) {
        Boolean bool = (Boolean) objArr[0];
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        Object obj = objArr[1];
        int i7 = obj == null ? 2 : 0;
        FollowSeasonStatus followSeasonStatus = (FollowSeasonStatus) obj;
        Boolean bool2 = (Boolean) objArr[2];
        boolean zBooleanValue2 = bool2 == null ? false : bool2.booleanValue();
        Boolean bool3 = (Boolean) objArr[3];
        boolean zBooleanValue3 = bool3 == null ? false : bool3.booleanValue();
        Boolean bool4 = (Boolean) objArr[4];
        return new OgvSeason.UserStatus(zBooleanValue, followSeasonStatus, zBooleanValue2, zBooleanValue3, bool4 == null ? false : bool4.booleanValue(), i7);
    }

    public final Object get(Object obj, int i7) {
        boolean zA;
        OgvSeason.UserStatus userStatus = (OgvSeason.UserStatus) obj;
        if (i7 == 0) {
            return Boolean.valueOf(userStatus.f94476a);
        }
        if (i7 == 1) {
            return userStatus.f94477b;
        }
        if (i7 == 2) {
            zA = userStatus.a();
        } else if (i7 == 3) {
            zA = userStatus.b();
        } else {
            if (i7 != 4) {
                return null;
            }
            zA = userStatus.c();
        }
        return Boolean.valueOf(zA);
    }
}
