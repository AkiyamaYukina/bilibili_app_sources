package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.common.PugvSeries;
import com.bapis.bilibili.app.viewunite.common.PugvSeriesItem;
import com.bilibili.ship.theseus.cheese.biz.intro.series.CheeseSeriesService;
import eu0.C6984c;
import eu0.C7004w;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/i.class */
public final /* synthetic */ class C6124i implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheeseSeriesService f90404a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        PugvSeries pugvSeries = mVar.f124400a.getPugvSeries();
        C7004w c7004wA = C6984c.a(pugvSeries.getNav());
        List<PugvSeriesItem> contentsList = pugvSeries.getContentsList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contentsList, 10));
        for (PugvSeriesItem pugvSeriesItem : contentsList) {
            long seasonId = pugvSeriesItem.getSeasonId();
            boolean selected = pugvSeriesItem.getSelected();
            boolean gray = pugvSeriesItem.getGray();
            arrayList.add(new com.bilibili.ship.theseus.cheese.biz.intro.series.e(pugvSeriesItem.getStateValue(), seasonId, pugvSeriesItem.getContent(), pugvSeriesItem.getLabel(), selected, gray));
        }
        mVar.a(this.f90404a.a(new com.bilibili.ship.theseus.cheese.biz.intro.series.d(c7004wA, arrayList)));
    }
}
