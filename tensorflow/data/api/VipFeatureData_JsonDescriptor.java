package com.bilibili.tensorflow.data.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.SortedMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/data/api/VipFeatureData_JsonDescriptor.class */
public final class VipFeatureData_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f110715a = {new PojoPropertyDescriptor("version_name", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("value", (String[]) null, Types.parameterizedType(SortedMap.class, new Type[]{Integer.class, String.class}), (Class) null, 5)};

    public VipFeatureData_JsonDescriptor() {
        super(VipFeatureData.class, f110715a);
    }

    public final Object constructWith(Object[] objArr) {
        return new VipFeatureData((String) objArr[0], (SortedMap) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        VipFeatureData vipFeatureData = (VipFeatureData) obj;
        if (i7 == 0) {
            return vipFeatureData.f110713a;
        }
        if (i7 != 1) {
            return null;
        }
        return vipFeatureData.f110714b;
    }
}
