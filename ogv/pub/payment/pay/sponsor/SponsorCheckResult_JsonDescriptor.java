package com.bilibili.ogv.pub.payment.pay.sponsor;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogv.pub.sponsor.BangumiPendant;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/pay/sponsor/SponsorCheckResult_JsonDescriptor.class */
public final class SponsorCheckResult_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71583a;

    static {
        Class cls = Integer.TYPE;
        f71583a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("exp", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("point", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("days", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("days_text", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("state", (String[]) null, String.class, (Class) null, 0), new PojoPropertyDescriptor("pendants", (String[]) null, Types.parameterizedType(List.class, new Type[]{BangumiPendant.class}), (Class) null, 17), new PojoPropertyDescriptor("vip_point_activity", (String[]) null, VipPointActivities.class, (Class) null, 4)};
    }

    public SponsorCheckResult_JsonDescriptor() {
        super(SponsorCheckResult.class, f71583a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Integer num = (Integer) objArr[0];
        int iIntValue2 = num == null ? 0 : num.intValue();
        Integer num2 = (Integer) objArr[1];
        int iIntValue3 = num2 == null ? 0 : num2.intValue();
        Integer num3 = (Integer) objArr[2];
        if (num3 != null) {
            iIntValue = num3.intValue();
        }
        return new SponsorCheckResult(iIntValue2, iIntValue3, iIntValue, (String) objArr[3], (String) objArr[4], (List) objArr[5], (VipPointActivities) objArr[6]);
    }

    public final Object get(Object obj, int i7) {
        SponsorCheckResult sponsorCheckResult = (SponsorCheckResult) obj;
        switch (i7) {
            case 0:
                return Integer.valueOf(sponsorCheckResult.f71575a);
            case 1:
                return Integer.valueOf(sponsorCheckResult.f71576b);
            case 2:
                return Integer.valueOf(sponsorCheckResult.f71577c);
            case 3:
                return sponsorCheckResult.a();
            case 4:
                return sponsorCheckResult.f71579e;
            case 5:
                return sponsorCheckResult.f71580f;
            case 6:
                return sponsorCheckResult.b();
            default:
                return null;
        }
    }
}
