package com.bilibili.ship.theseus.ogv.pay.sponsor;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/sponsor/BangumiThreshold_JsonDescriptor.class */
public final class BangumiThreshold_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94223a = {new PojoPropertyDescriptor("bp", (String[]) null, Integer.TYPE, (Class) null, 3), new PojoPropertyDescriptor("days_text", (String[]) null, String.class, (Class) null, 6)};

    public BangumiThreshold_JsonDescriptor() {
        super(BangumiThreshold.class, f94223a);
    }

    public final Object constructWith(Object[] objArr) {
        BangumiThreshold bangumiThreshold = new BangumiThreshold();
        Object obj = objArr[0];
        if (obj != null) {
            bangumiThreshold.f94221a = ((Integer) obj).intValue();
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            bangumiThreshold.b((String) obj2);
        }
        return bangumiThreshold;
    }

    public final Object get(Object obj, int i7) {
        BangumiThreshold bangumiThreshold = (BangumiThreshold) obj;
        if (i7 == 0) {
            return Integer.valueOf(bangumiThreshold.f94221a);
        }
        if (i7 != 1) {
            return null;
        }
        return bangumiThreshold.a();
    }
}
