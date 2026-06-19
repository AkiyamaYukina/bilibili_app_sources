package com.bilibili.ship.theseus.ogv.season;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.pub.season.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/OgvSeasonInfo_JsonDescriptor.class */
public final class OgvSeasonInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94486a = {new PojoPropertyDescriptor("season_id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("season_type", (String[]) null, a.class, (Class) null, 5), new PojoPropertyDescriptor("show_season_type", (String[]) null, a.class, (Class) null, 5), new PojoPropertyDescriptor("rights", (String[]) null, OgvSeasonRights.class, (Class) null, 5), new PojoPropertyDescriptor("season_title", (String[]) null, String.class, (Class) null, 5)};

    public OgvSeasonInfo_JsonDescriptor() {
        super(OgvSeasonInfo.class, f94486a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        return new OgvSeasonInfo(l7 == null ? 0L : l7.longValue(), (a) objArr[1], (a) objArr[2], (OgvSeasonRights) objArr[3], (String) objArr[4]);
    }

    public final Object get(Object obj, int i7) {
        OgvSeasonInfo ogvSeasonInfo = (OgvSeasonInfo) obj;
        if (i7 == 0) {
            return Long.valueOf(ogvSeasonInfo.f94481a);
        }
        if (i7 == 1) {
            return ogvSeasonInfo.f94482b;
        }
        if (i7 == 2) {
            return ogvSeasonInfo.a();
        }
        if (i7 == 3) {
            return ogvSeasonInfo.f94484d;
        }
        if (i7 != 4) {
            return null;
        }
        return ogvSeasonInfo.f94485e;
    }
}
