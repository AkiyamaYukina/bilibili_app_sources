package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.pugvanymodel.Episode;
import com.bapis.bilibili.app.viewunite.pugvanymodel.SeasonSection;
import com.bapis.bilibili.app.viewunite.pugvanymodel.SectionInfo;
import com.bapis.bilibili.app.viewunite.pugvanymodel.ViewPugvAny;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C6985d;
import eu0.C6986e;
import eu0.C6987f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/O.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class O implements Factory<List<C6985d>> {
    public static List<C6985d> a(@Nullable ViewPugvAny viewPugvAny, C6987f c6987f) {
        SectionInfo sectionInfo;
        List sectionsList;
        ArrayList arrayList = new ArrayList();
        if (viewPugvAny != null && (sectionInfo = viewPugvAny.getSectionInfo()) != null && (sectionsList = sectionInfo.getSectionsList()) != null) {
            Iterator it = sectionsList.iterator();
            while (it.hasNext()) {
                List episodesList = ((SeasonSection) it.next()).getEpisodesList();
                if (episodesList != null) {
                    Iterator it2 = episodesList.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(C6986e.c((Episode) it2.next(), c6987f.f117531a, c6987f.f117535e));
                    }
                }
            }
        }
        return (List) Preconditions.checkNotNullFromProvides(arrayList);
    }
}
