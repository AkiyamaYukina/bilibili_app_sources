package com.bilibili.ship.theseus.ogv;

import com.bapis.bilibili.app.viewunite.common.Module;
import com.bapis.bilibili.app.viewunite.common.ModuleType;
import com.bapis.bilibili.app.viewunite.common.OgvSeasons;
import com.bapis.bilibili.app.viewunite.common.SerialSeason;
import com.bapis.bilibili.app.viewunite.v1.IntroductionTab;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.ogv.intro.livereserve.OgvLiveReserveVo;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.pay.sponsor.BangumiSponsorRankSummary;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.ogv.season.OgvSeasonInfo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/J.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class J implements Factory<B> {
    public static B a(@Nullable IntroductionTab introductionTab, OgvSeason ogvSeason) {
        Object obj;
        Lu0.a aVar;
        Object obj2;
        List modulesList;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (introductionTab == null || (modulesList = introductionTab.getModulesList()) == null) {
            obj = null;
            aVar = null;
            obj2 = null;
        } else {
            Iterator it = modulesList.iterator();
            Object json = null;
            Lu0.a aVar2 = null;
            Object json2 = null;
            while (true) {
                obj = json;
                aVar = aVar2;
                obj2 = json2;
                if (it.hasNext()) {
                    Module module = (Module) it.next();
                    ModuleType type = module.getType();
                    switch (type == null ? -1 : C.f91213a[type.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            EpisodeSection episodeSection = (EpisodeSection) JsonUtilKt.parseJson(Pj0.e.a(module.getSectionData()), new D().getType());
                            int i7 = 0;
                            for (Object obj3 : episodeSection.h) {
                                if (i7 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                OgvEpisode ogvEpisode = (OgvEpisode) obj3;
                                ogvEpisode.f93553I = i7;
                                ogvEpisode.f93554J = episodeSection.f93527e;
                                i7++;
                            }
                            arrayList.add(episodeSection);
                            if (!module.getSectionData().getEpisodeIdsList().isEmpty()) {
                                arrayList2.add(com.bilibili.ship.theseus.ogv.intro.z.a(module.getSectionData()));
                            }
                            break;
                        case 5:
                            json = JsonUtilKt.parseJson(Pj0.e.a(module.getSponsor()), new E().getType());
                            break;
                        case 6:
                            OgvSeasons ogvSeasons = module.getOgvSeasons();
                            String title = ogvSeasons.getTitle();
                            List serialSeasonList = ogvSeasons.getSerialSeasonList();
                            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(serialSeasonList, 10));
                            Iterator it2 = serialSeasonList.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add((OgvSeasonInfo) JsonUtilKt.parseJson(Pj0.e.a((SerialSeason) it2.next()), new G().getType()));
                            }
                            aVar2 = new Lu0.a(title, arrayList3, ogvSeason.f94449a);
                            break;
                        case 7:
                            json2 = JsonUtilKt.parseJson(Pj0.e.a(module.getOgvLiveReserve()), new F().getType());
                            break;
                    }
                }
            }
        }
        return (B) Preconditions.checkNotNullFromProvides(new B(arrayList, (BangumiSponsorRankSummary) obj, aVar, !arrayList2.isEmpty() ? arrayList2 : null, (OgvLiveReserveVo) obj2));
    }
}
