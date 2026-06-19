package com.bilibili.ship.theseus.ogv.pay.sponsor;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogv.pub.sponsor.BangumiPendant;
import com.bilibili.ogv.pub.sponsor.BangumiSponsorEvent;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/sponsor/BangumiSponsorRankSummary_JsonDescriptor.class */
public final class BangumiSponsorRankSummary_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94215a;

    static {
        Class cls = Integer.TYPE;
        f94215a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("week", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("total", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("point_activity", (String[]) null, BangumiSponsorEvent.class, (Class) null, 5), new PojoPropertyDescriptor("mine", (String[]) null, BangumiSponsorMineRank.class, (Class) null, 5), new PojoPropertyDescriptor("rank_list", (String[]) null, Types.parameterizedType(List.class, new Type[]{BangumiSponsorRankUser.class}), (Class) null, 21), new PojoPropertyDescriptor("pendants", (String[]) null, Types.parameterizedType(List.class, new Type[]{BangumiPendant.class}), (Class) null, 17), new PojoPropertyDescriptor("threshold", (String[]) null, Types.parameterizedType(List.class, new Type[]{BangumiThreshold.class}), (Class) null, 21)};
    }

    public BangumiSponsorRankSummary_JsonDescriptor() {
        super(BangumiSponsorRankSummary.class, f94215a);
    }

    public final Object constructWith(Object[] objArr) {
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Integer num = (Integer) obj;
        int iIntValue = num == null ? 0 : num.intValue();
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        Integer num2 = (Integer) obj2;
        return new BangumiSponsorRankSummary(iIntValue, num2 == null ? 0 : num2.intValue(), (BangumiSponsorEvent) objArr[2], (BangumiSponsorMineRank) objArr[3], (List) objArr[4], (List) objArr[5], (List) objArr[6], i8);
    }

    public final Object get(Object obj, int i7) {
        int iF;
        BangumiSponsorRankSummary bangumiSponsorRankSummary = (BangumiSponsorRankSummary) obj;
        switch (i7) {
            case 0:
                iF = bangumiSponsorRankSummary.f();
                break;
            case 1:
                iF = bangumiSponsorRankSummary.e();
                break;
            case 2:
                return bangumiSponsorRankSummary.c();
            case 3:
                return bangumiSponsorRankSummary.b();
            case 4:
                return bangumiSponsorRankSummary.a();
            case 5:
                return bangumiSponsorRankSummary.f94213f;
            case 6:
                return bangumiSponsorRankSummary.d();
            default:
                return null;
        }
        return Integer.valueOf(iF);
    }
}
