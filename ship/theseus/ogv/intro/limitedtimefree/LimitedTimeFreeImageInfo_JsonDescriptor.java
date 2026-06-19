package com.bilibili.ship.theseus.ogv.intro.limitedtimefree;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/limitedtimefree/LimitedTimeFreeImageInfo_JsonDescriptor.class */
public final class LimitedTimeFreeImageInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93225a = {new PojoPropertyDescriptor("code", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 5)};

    public LimitedTimeFreeImageInfo_JsonDescriptor() {
        super(LimitedTimeFreeImageInfo.class, f93225a);
    }

    public final Object constructWith(Object[] objArr) {
        return new LimitedTimeFreeImageInfo((String) objArr[0], (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        LimitedTimeFreeImageInfo limitedTimeFreeImageInfo = (LimitedTimeFreeImageInfo) obj;
        if (i7 == 0) {
            return limitedTimeFreeImageInfo.f93223a;
        }
        if (i7 != 1) {
            return null;
        }
        return limitedTimeFreeImageInfo.f93224b;
    }
}
