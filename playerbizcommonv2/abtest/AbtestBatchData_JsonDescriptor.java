package com.bilibili.playerbizcommonv2.abtest;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/abtest/AbtestBatchData_JsonDescriptor.class */
public final class AbtestBatchData_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f80801a = {new PojoPropertyDescriptor("ab_result", (String[]) null, AbtestBatchResult.class, (Class) null, 4)};

    public AbtestBatchData_JsonDescriptor() {
        super(AbtestBatchData.class, f80801a);
    }

    public final Object constructWith(Object[] objArr) {
        return new AbtestBatchData((AbtestBatchResult) objArr[0]);
    }

    public final Object get(Object obj, int i7) {
        AbtestBatchData abtestBatchData = (AbtestBatchData) obj;
        if (i7 != 0) {
            return null;
        }
        return abtestBatchData.a();
    }
}
