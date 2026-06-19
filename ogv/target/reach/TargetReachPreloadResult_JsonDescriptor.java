package com.bilibili.ogv.target.reach;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/target/reach/TargetReachPreloadResult_JsonDescriptor.class */
public final class TargetReachPreloadResult_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73136a = {new PojoPropertyDescriptor("push_id", (String[]) null, String.class, (Class) null, 5)};

    public TargetReachPreloadResult_JsonDescriptor() {
        super(TargetReachPreloadResult.class, f73136a);
    }

    public final Object constructWith(Object[] objArr) {
        return new TargetReachPreloadResult((String) objArr[0]);
    }

    public final Object get(Object obj, int i7) {
        TargetReachPreloadResult targetReachPreloadResult = (TargetReachPreloadResult) obj;
        if (i7 != 0) {
            return null;
        }
        return targetReachPreloadResult.f73135a;
    }
}
