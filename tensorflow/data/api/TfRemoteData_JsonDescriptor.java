package com.bilibili.tensorflow.data.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/data/api/TfRemoteData_JsonDescriptor.class */
public final class TfRemoteData_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f110712a = {new PojoPropertyDescriptor("start_time", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("vip_pay_type", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("vip_info", (String[]) null, VipFeatureData.class, (Class) null, 5)};

    public TfRemoteData_JsonDescriptor() {
        super(TfRemoteData.class, f110712a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Integer num = (Integer) objArr[1];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new TfRemoteData(jLongValue, iIntValue, (VipFeatureData) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        TfRemoteData tfRemoteData = (TfRemoteData) obj;
        if (i7 == 0) {
            return Long.valueOf(tfRemoteData.f110709a);
        }
        if (i7 == 1) {
            return Integer.valueOf(tfRemoteData.f110710b);
        }
        if (i7 != 2) {
            return null;
        }
        return tfRemoteData.f110711c;
    }
}
