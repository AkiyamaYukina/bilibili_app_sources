package com.bilibili.ship.theseus.ogv.pay.sponsor;

import com.bilibili.biligame.api.call.KeySign;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/sponsor/BangumiSponsorRankUser_JsonDescriptor.class */
public final class BangumiSponsorRankUser_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94220a = {new PojoPropertyDescriptor(KeySign.UID, (String[]) null, Long.TYPE, (Class) null, 7), new PojoPropertyDescriptor("message", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("uname", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("face", (String[]) null, String.class, (Class) null, 6)};

    public BangumiSponsorRankUser_JsonDescriptor() {
        super(BangumiSponsorRankUser.class, f94220a);
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
        return new BangumiSponsorRankUser(jLongValue, str, str2, (String) obj4, i10);
    }

    public final Object get(Object obj, int i7) {
        BangumiSponsorRankUser bangumiSponsorRankUser = (BangumiSponsorRankUser) obj;
        if (i7 == 0) {
            return Long.valueOf(bangumiSponsorRankUser.b());
        }
        if (i7 == 1) {
            return bangumiSponsorRankUser.f94217b;
        }
        if (i7 == 2) {
            return bangumiSponsorRankUser.c();
        }
        if (i7 != 3) {
            return null;
        }
        return bangumiSponsorRankUser.a();
    }
}
