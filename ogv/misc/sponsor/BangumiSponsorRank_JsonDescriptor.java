package com.bilibili.ogv.misc.sponsor;

import com.bilibili.bangumi.data.page.sponsor.BangumiSponsorMineRank;
import com.bilibili.bangumi.data.page.sponsor.BangumiSponsorRankUser;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/BangumiSponsorRank_JsonDescriptor.class */
public final class BangumiSponsorRank_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69355a = {new PojoPropertyDescriptor("users", (String[]) null, Integer.TYPE, (Class) null, 3), new PojoPropertyDescriptor("mine", (String[]) null, BangumiSponsorMineRank.class, (Class) null, 6), new PojoPropertyDescriptor("list", (String[]) null, Types.parameterizedType(List.class, new Type[]{BangumiSponsorRankUser.class}), (Class) null, 2)};

    public BangumiSponsorRank_JsonDescriptor() {
        super(BangumiSponsorRank.class, f69355a);
    }

    public final Object constructWith(Object[] objArr) {
        BangumiSponsorRank bangumiSponsorRank = new BangumiSponsorRank();
        Object obj = objArr[0];
        if (obj != null) {
            bangumiSponsorRank.f69333a = ((Integer) obj).intValue();
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            bangumiSponsorRank.f69334b = (BangumiSponsorMineRank) obj2;
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            bangumiSponsorRank.f69335c = (List) obj3;
        }
        return bangumiSponsorRank;
    }

    public final Object get(Object obj, int i7) {
        BangumiSponsorRank bangumiSponsorRank = (BangumiSponsorRank) obj;
        if (i7 == 0) {
            return Integer.valueOf(bangumiSponsorRank.f69333a);
        }
        if (i7 == 1) {
            return bangumiSponsorRank.f69334b;
        }
        if (i7 != 2) {
            return null;
        }
        return bangumiSponsorRank.f69335c;
    }
}
