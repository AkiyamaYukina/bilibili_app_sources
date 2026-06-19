package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/UpInfo_JsonDescriptor.class */
public final class UpInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69955a = {new PojoPropertyDescriptor("up_name", (String[]) null, String.class, (Class) null, 4)};

    public UpInfo_JsonDescriptor() {
        super(UpInfo.class, f69955a);
    }

    public final Object constructWith(Object[] objArr) {
        return new UpInfo((String) objArr[0]);
    }

    public final Object get(Object obj, int i7) {
        UpInfo upInfo = (UpInfo) obj;
        if (i7 != 0) {
            return null;
        }
        return upInfo.f69954a;
    }
}
