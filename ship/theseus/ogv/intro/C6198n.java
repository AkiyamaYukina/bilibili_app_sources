package com.bilibili.ship.theseus.ogv.intro;

import com.bapis.bilibili.app.viewunite.common.Module;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.intro.section.bean.SectionType;
import com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewEpisodeUIComponentService;
import com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/n.class */
public final /* synthetic */ class C6198n implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvSeason f93326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f93327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f93328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OgvPreviewSectionMergedUIComponentService f93329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OgvPreviewEpisodeUIComponentService f93330e;

    public /* synthetic */ C6198n(OgvSeason ogvSeason, List list, List list2, OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService, OgvPreviewEpisodeUIComponentService ogvPreviewEpisodeUIComponentService) {
        this.f93326a = ogvSeason;
        this.f93327b = list;
        this.f93328c = list2;
        this.f93329d = ogvPreviewSectionMergedUIComponentService;
        this.f93330e = ogvPreviewEpisodeUIComponentService;
    }

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        Object next;
        List<OgvEpisode> list;
        List<Hu0.c> list2;
        List list3 = this.f93327b;
        List<Hu0.c> list4 = this.f93328c;
        OgvSeason ogvSeason = this.f93326a;
        boolean zD = ogvSeason.b().d();
        List list5 = list3;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list5) {
            EpisodeSection episodeSection = (EpisodeSection) obj;
            if (Hu0.a.a(episodeSection.f93531j) && episodeSection.c().isEmpty()) {
                arrayList.add(obj);
            }
        }
        if (zD && (arrayList.size() > 1 || ((list2 = list4) != null && !list2.isEmpty()))) {
            OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService = this.f93329d;
            if (ogvPreviewSectionMergedUIComponentService.f93757k) {
                return;
            }
            mVar.a(ogvPreviewSectionMergedUIComponentService.b(arrayList, list4));
            ogvPreviewSectionMergedUIComponentService.f93757k = true;
            return;
        }
        Module module = mVar.f124400a;
        Hu0.c cVarA = z.a(module.getSectionData());
        if (module.getSectionData().getEpisodeIdsList().isEmpty()) {
            Iterator it = list5.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((EpisodeSection) next).f93531j == SectionType.FEATURE) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            EpisodeSection episodeSection2 = (EpisodeSection) next;
            List<OgvEpisode> list6 = episodeSection2 != null ? episodeSection2.h : null;
            if (!ogvSeason.b().c() || !Hu0.a.a(cVarA.f8798b.f93531j) || (list = list6) == null || list.isEmpty()) {
                mVar.a(this.f93330e.a(cVarA));
            }
        }
    }
}
