package com.bilibili.ogv.pub.payment.pay;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/pay/PayActivities_JsonDescriptor.class */
public final class PayActivities_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71549a = {new PojoPropertyDescriptor("id", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("pendants", (String[]) null, Types.parameterizedType(List.class, new Type[]{PendantInfo.class}), (Class) null, 19)};

    public PayActivities_JsonDescriptor() {
        super(PayActivities.class, f71549a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        String str = (String) objArr[0];
        Object obj = objArr[1];
        if (obj == null) {
            i7 = 2;
        }
        return new PayActivities(i7, str, (List) obj);
    }

    public final Object get(Object obj, int i7) {
        PayActivities payActivities = (PayActivities) obj;
        if (i7 == 0) {
            return payActivities.f71547a;
        }
        if (i7 != 1) {
            return null;
        }
        return payActivities.f71548b;
    }
}
