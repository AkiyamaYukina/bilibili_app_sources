package com.bilibili.ship.theseus.ugc.intro;

import com.bapis.bilibili.app.viewunite.common.DescV2;
import com.bapis.bilibili.app.viewunite.common.Neutral;
import com.bapis.bilibili.app.viewunite.common.Rank;
import com.bapis.bilibili.app.viewunite.common.Tag;
import com.bapis.bilibili.app.viewunite.common.UgcIntroduction;
import com.bapis.bilibili.app.viewunite.common.ViewMaterial;
import com.bilibili.ship.theseus.ugc.intro.ugcheadline.C6265a;
import com.bilibili.ship.theseus.ugc.intro.ugcheadline.DescType;
import com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService;
import com.bilibili.ship.theseus.ugc.intro.ugcheadline.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/i.class */
public final /* synthetic */ class i implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UgcHeadlineService f97013a;

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        UgcIntroduction ugcIntroduction = mVar.f124400a.getUgcIntroduction();
        List<Tag> tagsList = ugcIntroduction.getTagsList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tagsList, 10));
        for (Tag tag : tagsList) {
            arrayList.add(new com.bilibili.ship.theseus.ugc.intro.ugcheadline.g(tag.getTagId(), tag.getName(), tag.getUri(), tag.getTagType()));
        }
        String score = ugcIntroduction.hasRating() ? ugcIntroduction.getRating().getScore() : "";
        List bgmList = ugcIntroduction.getBgmList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(bgmList, 10));
        Iterator it = bgmList.iterator();
        while (it.hasNext()) {
            arrayList2.add(com.bilibili.ship.theseus.ugc.intro.ugcheadline.o.a((ViewMaterial) it.next()));
        }
        List stickerList = ugcIntroduction.getStickerList();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(stickerList, 10));
        Iterator it2 = stickerList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(com.bilibili.ship.theseus.ugc.intro.ugcheadline.o.a((ViewMaterial) it2.next()));
        }
        List videoSourceList = ugcIntroduction.getVideoSourceList();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(videoSourceList, 10));
        Iterator it3 = videoSourceList.iterator();
        while (it3.hasNext()) {
            arrayList4.add(com.bilibili.ship.theseus.ugc.intro.ugcheadline.o.a((ViewMaterial) it3.next()).f97232c);
        }
        long pubdate = ugcIntroduction.getPubdate();
        List<DescV2> descList = ugcIntroduction.getDescList();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(descList, 10));
        for (DescV2 descV2 : descList) {
            String text = descV2.getText();
            int i7 = o.a.f97370a[descV2.getType().ordinal()];
            arrayList5.add(new C6265a(text, i7 != 1 ? i7 != 2 ? DescType.DescTypeUnknown : DescType.DescTypeText : DescType.DescTypeAt, descV2.getUri(), descV2.getRid(), descV2.getNeedHighlight(), descV2.getReportMap()));
        }
        Rank rank = ugcIntroduction.getRank();
        com.bilibili.ship.theseus.ugc.intro.ugcheadline.f fVar = new com.bilibili.ship.theseus.ugc.intro.ugcheadline.f(rank.getIcon(), rank.getIconNight(), rank.getText());
        Neutral neutral = ugcIntroduction.getNeutral();
        mVar.a(this.f97013a.b(new com.bilibili.ship.theseus.ugc.intro.ugcheadline.c(arrayList, score, arrayList2, arrayList3, arrayList4, pubdate, arrayList5, fVar, new com.bilibili.ship.theseus.ugc.intro.ugcheadline.e(neutral.getIcon(), neutral.getTitle()))));
    }
}
