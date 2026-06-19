package com.bilibili.ship.theseus.ogv.castscreen;

import android.content.Context;
import com.bilibili.lib.projection.commonburid.CastContentType;
import com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.ogv.season.SeasonMode;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import mv0.C8043a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/castscreen/a.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata({"com.bilibili.ship.theseus.united.page.castscreen.CastScreenItems"})
public final class a implements Factory<List<ProjectionItemData>> {
    public static List<ProjectionItemData> a(Context context, Gu0.a aVar, OgvSeason ogvSeason, C8043a c8043a) {
        List<EpisodeSection> list = aVar.f7439f;
        ArrayList arrayList = new ArrayList();
        List<EpisodeSection> list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            for (OgvEpisode ogvEpisode : ((EpisodeSection) it.next()).h) {
                long jA = ogvEpisode.a();
                long j7 = ogvSeason.f94449a;
                String str = c8043a.a().f123881c;
                String str2 = c8043a.a().f123880b;
                arrayList.add(new ProjectionItemData(2, jA, "", ogvEpisode.f93561g, ogvEpisode.f93555a, j7, 0L, str, str2, vl0.b.f128291a.b(context, ogvSeason.f94462o == SeasonMode.SINGLE_EPISODE, ogvSeason.f94453e, ogvSeason.c(), ogvEpisode.f93563j, ogvEpisode.f93564k), "bilibili://pgc/season/ep/" + ogvEpisode.f93555a, 1, 0, 0L, 0L, 0, 0, 0, null, CastContentType.CastContentTypePGC));
            }
            arrayList2.add(Unit.INSTANCE);
        }
        return (List) Preconditions.checkNotNullFromProvides(arrayList);
    }
}
