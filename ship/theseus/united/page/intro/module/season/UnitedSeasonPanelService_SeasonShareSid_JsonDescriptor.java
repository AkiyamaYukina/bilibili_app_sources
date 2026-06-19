package com.bilibili.ship.theseus.united.page.intro.module.season;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService_SeasonShareSid_JsonDescriptor.class */
public final class UnitedSeasonPanelService_SeasonShareSid_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f101613a;

    static {
        Class cls = Long.TYPE;
        f101613a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("cid", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("season_id", (String[]) null, cls, (Class) null, 5)};
    }

    public UnitedSeasonPanelService_SeasonShareSid_JsonDescriptor() {
        super(UnitedSeasonPanelService.SeasonShareSid.class, f101613a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        long jLongValue = 0;
        long jLongValue2 = l7 == null ? 0L : l7.longValue();
        Long l8 = (Long) objArr[1];
        if (l8 != null) {
            jLongValue = l8.longValue();
        }
        return new UnitedSeasonPanelService.SeasonShareSid(jLongValue2, jLongValue);
    }

    public final Object get(Object obj, int i7) {
        UnitedSeasonPanelService.SeasonShareSid seasonShareSid = (UnitedSeasonPanelService.SeasonShareSid) obj;
        if (i7 == 0) {
            return Long.valueOf(seasonShareSid.f101611a);
        }
        if (i7 != 1) {
            return null;
        }
        return Long.valueOf(seasonShareSid.f101612b);
    }
}
