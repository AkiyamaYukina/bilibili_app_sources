package com.bilibili.module.vip.mall;

import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/PayResult_JsonDescriptor.class */
public final class PayResult_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f66205a;

    static {
        Class cls = Integer.TYPE;
        f66205a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("channelId", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("payStatus", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor(NotificationCompat.CATEGORY_MESSAGE, (String[]) null, String.class, (Class) null, 0), new PojoPropertyDescriptor("channelCode", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("channelResult", (String[]) null, String.class, (Class) null, 0)};
    }

    public PayResult_JsonDescriptor() {
        super(PayResult.class, f66205a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Integer num = (Integer) objArr[0];
        int iIntValue2 = num == null ? 0 : num.intValue();
        Integer num2 = (Integer) objArr[1];
        int iIntValue3 = num2 == null ? 0 : num2.intValue();
        String str = (String) objArr[2];
        Integer num3 = (Integer) objArr[3];
        if (num3 != null) {
            iIntValue = num3.intValue();
        }
        return new PayResult(iIntValue2, iIntValue3, str, iIntValue, (String) objArr[4]);
    }

    public final Object get(Object obj, int i7) {
        PayResult payResult = (PayResult) obj;
        if (i7 == 0) {
            return Integer.valueOf(payResult.f66200a);
        }
        if (i7 == 1) {
            return Integer.valueOf(payResult.f66201b);
        }
        if (i7 == 2) {
            return payResult.f66202c;
        }
        if (i7 == 3) {
            return Integer.valueOf(payResult.f66203d);
        }
        if (i7 != 4) {
            return null;
        }
        return payResult.f66204e;
    }
}
