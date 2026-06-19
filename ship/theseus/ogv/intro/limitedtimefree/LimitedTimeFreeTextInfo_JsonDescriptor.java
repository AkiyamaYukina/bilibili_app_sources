package com.bilibili.ship.theseus.ogv.intro.limitedtimefree;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/limitedtimefree/LimitedTimeFreeTextInfo_JsonDescriptor.class */
public final class LimitedTimeFreeTextInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93231a = {new PojoPropertyDescriptor("code", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("text", (String[]) null, String.class, (Class) null, 5)};

    public LimitedTimeFreeTextInfo_JsonDescriptor() {
        super(LimitedTimeFreeTextInfo.class, f93231a);
    }

    public final Object constructWith(Object[] objArr) {
        return new LimitedTimeFreeTextInfo((String) objArr[0], (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        LimitedTimeFreeTextInfo limitedTimeFreeTextInfo = (LimitedTimeFreeTextInfo) obj;
        if (i7 == 0) {
            return limitedTimeFreeTextInfo.f93229a;
        }
        if (i7 != 1) {
            return null;
        }
        return limitedTimeFreeTextInfo.f93230b;
    }
}
