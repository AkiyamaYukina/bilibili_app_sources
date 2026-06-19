package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/FollowInModule_JsonDescriptor.class */
public final class FollowInModule_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69833a;

    static {
        Class cls = Integer.TYPE;
        f69833a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("update", (String[]) null, cls, (Class) null, 1), new PojoPropertyDescriptor("count", (String[]) null, cls, (Class) null, 1)};
    }

    public FollowInModule_JsonDescriptor() {
        super(FollowInModule.class, f69833a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Integer num = (Integer) objArr[0];
        int iIntValue2 = num == null ? 0 : num.intValue();
        Integer num2 = (Integer) objArr[1];
        if (num2 != null) {
            iIntValue = num2.intValue();
        }
        return new FollowInModule(iIntValue2, iIntValue);
    }

    public final Object get(Object obj, int i7) {
        FollowInModule followInModule = (FollowInModule) obj;
        if (i7 == 0) {
            return Integer.valueOf(followInModule.f69831a);
        }
        if (i7 != 1) {
            return null;
        }
        return Integer.valueOf(followInModule.f69832b);
    }
}
