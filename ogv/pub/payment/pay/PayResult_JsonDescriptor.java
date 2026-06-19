package com.bilibili.ogv.pub.payment.pay;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/pay/PayResult_JsonDescriptor.class */
public final class PayResult_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71553a = {new PojoPropertyDescriptor("state", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("expire_time_text", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("pay_pendant_activity", (String[]) null, PayActivities.class, (Class) null, 4)};

    public PayResult_JsonDescriptor() {
        super(PayResult.class, f71553a);
    }

    public final Object constructWith(Object[] objArr) {
        return new PayResult((String) objArr[0], (String) objArr[1], (PayActivities) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        PayResult payResult = (PayResult) obj;
        if (i7 == 0) {
            return payResult.f71550a;
        }
        if (i7 == 1) {
            return payResult.b();
        }
        if (i7 != 2) {
            return null;
        }
        return payResult.a();
    }
}
