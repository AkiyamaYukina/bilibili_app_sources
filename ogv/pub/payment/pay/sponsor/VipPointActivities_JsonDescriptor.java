package com.bilibili.ogv.pub.payment.pay.sponsor;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/pay/sponsor/VipPointActivities_JsonDescriptor.class */
public final class VipPointActivities_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71587a = {new PojoPropertyDescriptor("activity_tip", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("activity_content", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("activity_link", (String[]) null, String.class, (Class) null, 4)};

    public VipPointActivities_JsonDescriptor() {
        super(VipPointActivities.class, f71587a);
    }

    public final Object constructWith(Object[] objArr) {
        return new VipPointActivities((String) objArr[0], (String) objArr[1], (String) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        VipPointActivities vipPointActivities = (VipPointActivities) obj;
        if (i7 == 0) {
            return vipPointActivities.c();
        }
        if (i7 == 1) {
            return vipPointActivities.a();
        }
        if (i7 != 2) {
            return null;
        }
        return vipPointActivities.b();
    }
}
