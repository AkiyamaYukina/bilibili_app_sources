package com.bilibili.ogv.pub.sponsor;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.live.streaming.source.TextSource;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/sponsor/BangumiSponsorEvent_JsonDescriptor.class */
public final class BangumiSponsorEvent_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71790a = {new PojoPropertyDescriptor("tip", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor(TextSource.CFG_CONTENT, (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 1)};

    public BangumiSponsorEvent_JsonDescriptor() {
        super(BangumiSponsorEvent.class, f71790a);
    }

    public final Object constructWith(Object[] objArr) {
        return new BangumiSponsorEvent((String) objArr[0], (String) objArr[1], (String) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        BangumiSponsorEvent bangumiSponsorEvent = (BangumiSponsorEvent) obj;
        if (i7 == 0) {
            return bangumiSponsorEvent.f71787a;
        }
        if (i7 == 1) {
            return bangumiSponsorEvent.f71788b;
        }
        if (i7 != 2) {
            return null;
        }
        return bangumiSponsorEvent.f71789c;
    }
}
