package com.bilibili.ship.theseus.ogv.pay.sponsor;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/sponsor/SponsorPoint_JsonDescriptor.class */
public final class SponsorPoint_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94227a = {new PojoPropertyDescriptor("point", (String[]) null, String.class, (Class) null, 1)};

    public SponsorPoint_JsonDescriptor() {
        super(SponsorPoint.class, f94227a);
    }

    public final Object constructWith(Object[] objArr) {
        return new SponsorPoint((String) objArr[0]);
    }

    public final Object get(Object obj, int i7) {
        SponsorPoint sponsorPoint = (SponsorPoint) obj;
        if (i7 != 0) {
            return null;
        }
        return sponsorPoint.f94226a;
    }
}
