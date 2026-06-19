package com.bilibili.ogv.pub.payment.pay;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/pay/PendantInfo_JsonDescriptor.class */
public final class PendantInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71557a = {new PojoPropertyDescriptor("pid", (String[]) null, String.class, (Class) null, 0), new PojoPropertyDescriptor("name", (String[]) null, String.class, (Class) null, 0), new PojoPropertyDescriptor("image", (String[]) null, String.class, (Class) null, 0)};

    public PendantInfo_JsonDescriptor() {
        super(PendantInfo.class, f71557a);
    }

    public final Object constructWith(Object[] objArr) {
        return new PendantInfo((String) objArr[0], (String) objArr[1], (String) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        PendantInfo pendantInfo = (PendantInfo) obj;
        if (i7 == 0) {
            return pendantInfo.f71554a;
        }
        if (i7 == 1) {
            return pendantInfo.f71555b;
        }
        if (i7 != 2) {
            return null;
        }
        return pendantInfo.f71556c;
    }
}
