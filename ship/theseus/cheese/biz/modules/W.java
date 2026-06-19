package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.pugvanymodel.Courseware;
import com.bapis.bilibili.app.viewunite.pugvanymodel.Episode;
import com.bapis.bilibili.app.viewunite.pugvanymodel.SeasonSection;
import com.bapis.bilibili.app.viewunite.pugvanymodel.SectionInfo;
import com.bapis.bilibili.app.viewunite.pugvanymodel.ViewPugvAny;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C6979B;
import eu0.C6986e;
import eu0.C6988g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/W.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class W implements Factory<List<C6979B>> {
    public static List<C6979B> a(@Nullable ViewPugvAny viewPugvAny) {
        SectionInfo sectionInfo;
        ArrayList arrayList = new ArrayList();
        if (viewPugvAny != null && (sectionInfo = viewPugvAny.getSectionInfo()) != null) {
            List<SeasonSection> sectionsList = sectionInfo.getSectionsList();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sectionsList, 10));
            for (SeasonSection seasonSection : sectionsList) {
                long sectionId = seasonSection.getSectionId();
                String title = seasonSection.getTitle();
                int typeValue = seasonSection.getTypeValue();
                List coursewaresList = seasonSection.getCoursewaresList();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(coursewaresList, 10));
                Iterator it = coursewaresList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(C6988g.b((Courseware) it.next()));
                }
                List episodesList = seasonSection.getEpisodesList();
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(episodesList, 10));
                Iterator it2 = episodesList.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(C6986e.c((Episode) it2.next(), 0L, ""));
                }
                arrayList2.add(new C6979B(typeValue, sectionId, title, arrayList3, arrayList4));
            }
            arrayList.addAll(arrayList2);
        }
        return (List) Preconditions.checkNotNullFromProvides(arrayList);
    }
}
