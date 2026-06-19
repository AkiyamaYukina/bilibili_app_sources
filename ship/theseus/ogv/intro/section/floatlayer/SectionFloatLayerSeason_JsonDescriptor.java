package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ogv.season.NewestEp;
import com.bilibili.ship.theseus.ogv.season.OgvSeasonRights;
import com.bilibili.ship.theseus.ogv.season.OgvSeasonStat;
import com.bilibili.ship.theseus.ogv.season.Publish;
import com.bilibili.ship.theseus.ogv.season.TestSwitch;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/SectionFloatLayerSeason_JsonDescriptor.class */
public final class SectionFloatLayerSeason_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93646a = {new PojoPropertyDescriptor("modules", (String[]) null, Types.parameterizedType(List.class, new Type[]{OgvOldSeasonModule.class}), (Class) null, 21), new PojoPropertyDescriptor("rights", (String[]) null, OgvSeasonRights.class, (Class) null, 5), new PojoPropertyDescriptor("publish", (String[]) null, Publish.class, (Class) null, 5), new PojoPropertyDescriptor("new_ep", (String[]) null, NewestEp.class, (Class) null, 4), new PojoPropertyDescriptor("test_switch", (String[]) null, TestSwitch.class, (Class) null, 5), new PojoPropertyDescriptor("stat", (String[]) null, OgvSeasonStat.class, (Class) null, 5), new PojoPropertyDescriptor("season_id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("displayed_season_type", (String[]) null, com.bilibili.ogv.pub.season.a.class, (Class) null, 5)};

    public SectionFloatLayerSeason_JsonDescriptor() {
        super(SectionFloatLayerSeason.class, f93646a);
    }

    public final Object constructWith(Object[] objArr) {
        List list = (List) objArr[0];
        OgvSeasonRights ogvSeasonRights = (OgvSeasonRights) objArr[1];
        Publish publish = (Publish) objArr[2];
        NewestEp newestEp = (NewestEp) objArr[3];
        TestSwitch testSwitch = (TestSwitch) objArr[4];
        OgvSeasonStat ogvSeasonStat = (OgvSeasonStat) objArr[5];
        Long l7 = (Long) objArr[6];
        return new SectionFloatLayerSeason(list, ogvSeasonRights, publish, newestEp, testSwitch, ogvSeasonStat, l7 == null ? 0L : l7.longValue(), (com.bilibili.ogv.pub.season.a) objArr[7]);
    }

    public final Object get(Object obj, int i7) {
        SectionFloatLayerSeason sectionFloatLayerSeason = (SectionFloatLayerSeason) obj;
        switch (i7) {
            case 0:
                return sectionFloatLayerSeason.f93639a;
            case 1:
                return sectionFloatLayerSeason.f93640b;
            case 2:
                return sectionFloatLayerSeason.f93641c;
            case 3:
                return sectionFloatLayerSeason.a();
            case 4:
                return sectionFloatLayerSeason.f93643e;
            case 5:
                return sectionFloatLayerSeason.f93644f;
            case 6:
                return Long.valueOf(sectionFloatLayerSeason.f93645g);
            case 7:
                return sectionFloatLayerSeason.h;
            default:
                return null;
        }
    }
}
