package com.bilibili.ship.theseus.ogv.season;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.ogv.intro.section.bean.StatNumber;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/OgvSeasonStat_JsonDescriptor.class */
public final class OgvSeasonStat_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94497a = {new PojoPropertyDescriptor("followers", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("play_data", (String[]) null, StatNumber.class, (Class) null, 5)};

    public OgvSeasonStat_JsonDescriptor() {
        super(OgvSeasonStat.class, f94497a);
    }

    public final Object constructWith(Object[] objArr) {
        return new OgvSeasonStat((String) objArr[0], (StatNumber) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        OgvSeasonStat ogvSeasonStat = (OgvSeasonStat) obj;
        if (i7 == 0) {
            return ogvSeasonStat.f94495a;
        }
        if (i7 != 1) {
            return null;
        }
        return ogvSeasonStat.a();
    }
}
