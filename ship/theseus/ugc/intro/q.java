package com.bilibili.ship.theseus.ugc.intro;

import com.bapis.bilibili.app.viewunite.common.ActivityStarRail;
import com.bapis.bilibili.app.viewunite.common.StarRail;
import com.bilibili.ship.theseus.ugc.intro.mhy.UgcStarRailService;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/q.class */
public final /* synthetic */ class q implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UgcStarRailService f97140a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        ActivityStarRail activityStarRail = mVar.f124400a.getActivityStarRail();
        String pic = activityStarRail.getPic();
        List<StarRail> picGalleryList = activityStarRail.getPicGalleryList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(picGalleryList, 10));
        for (StarRail starRail : picGalleryList) {
            arrayList.add(new com.bilibili.ship.theseus.ugc.intro.mhy.b(starRail.getSeasonId(), starRail.getAid(), starRail.getPic1(), starRail.getPic2(), starRail.getCid(), starRail.getOpenTime(), starRail.getPic3(), starRail.getPic4(), starRail.getStatus(), starRail.getPic5()));
        }
        mVar.a(this.f97140a.a(new com.bilibili.ship.theseus.ugc.intro.mhy.a(pic, arrayList)));
    }
}
