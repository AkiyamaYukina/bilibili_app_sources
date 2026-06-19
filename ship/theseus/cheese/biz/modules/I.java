package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.pugvanymodel.CatalogueInfo;
import com.bapis.bilibili.app.viewunite.pugvanymodel.CatalogueLiveInfo;
import com.bapis.bilibili.app.viewunite.pugvanymodel.SeasonCatalogue;
import com.bapis.bilibili.app.viewunite.pugvanymodel.ViewPugvAny;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C6983b;
import eu0.C6997p;
import eu0.C7006y;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/I.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class I implements Factory<C6983b> {
    public static C6983b a(@Nullable ViewPugvAny viewPugvAny) {
        C6983b c6983b;
        CatalogueInfo catalogueInfo;
        if (viewPugvAny == null || (catalogueInfo = viewPugvAny.getCatalogueInfo()) == null) {
            c6983b = new C6983b(CollectionsKt.emptyList(), new C6997p(0L, "", "", "", 0), "");
        } else {
            List<SeasonCatalogue> cataloguesList = catalogueInfo.getCataloguesList();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(cataloguesList, 10));
            for (SeasonCatalogue seasonCatalogue : cataloguesList) {
                arrayList.add(new C7006y(seasonCatalogue.getTitle(), seasonCatalogue.getIndex(), seasonCatalogue.getStartEpIndex(), seasonCatalogue.getEndEpIndex()));
            }
            CatalogueLiveInfo catalogueLiveInfo = catalogueInfo.getCatalogueLiveInfo();
            c6983b = new C6983b(arrayList, new C6997p(catalogueLiveInfo.getEpisodeId(), catalogueLiveInfo.getTitle(), catalogueLiveInfo.getSubtitle(), catalogueLiveInfo.getButtonText(), catalogueLiveInfo.getStatusValue()), catalogueInfo.getCatalogueUpdateText());
        }
        return (C6983b) Preconditions.checkNotNullFromProvides(c6983b);
    }
}
