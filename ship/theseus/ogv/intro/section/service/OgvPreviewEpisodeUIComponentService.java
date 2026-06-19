package com.bilibili.ship.theseus.ogv.intro.section.service;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ad.adview.search.inline.card155.O;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.biligame.ui.feed.dialog.backguide.N;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection;
import com.bilibili.ship.theseus.ogv.intro.section.ui.q;
import com.bilibili.ship.theseus.ogv.intro.section.ui.v;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewEpisodeUIComponentService.class */
@StabilityInferred(parameters = 0)
public final class OgvPreviewEpisodeUIComponentService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final h f93744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final e f93745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvSeason f93746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageReportService f93747d;

    @Inject
    public OgvPreviewEpisodeUIComponentService(@NotNull h hVar, @NotNull e eVar, @NotNull OgvSeason ogvSeason, @NotNull PageReportService pageReportService) {
        this.f93744a = hVar;
        this.f93745b = eVar;
        this.f93746c = ogvSeason;
        this.f93747d = pageReportService;
    }

    @NotNull
    public final RunningUIComponent a(@NotNull Hu0.c cVar) {
        ArrayList arrayList = new ArrayList();
        RunningUIComponent runningUIComponentA = e.a(this.f93745b, this.f93746c, cVar.f8798b);
        h hVar = this.f93744a;
        hVar.getClass();
        v.a aVar = new v.a(new aC.f(2, cVar, hVar), Vj0.a.f25555a, new N(1, hVar, cVar), null, null);
        Hu0.d dVar = cVar.f8797a;
        String str = aVar.f93898f;
        String str2 = dVar.f8800b;
        if (!Intrinsics.areEqual(str2, str)) {
            aVar.f93898f = str2;
            aVar.notifyPropertyChanged(655);
        }
        String str3 = aVar.f93899g;
        String str4 = dVar.f8799a;
        if (!Intrinsics.areEqual(str4, str3)) {
            aVar.f93899g = str4;
            aVar.notifyPropertyChanged(374);
        }
        boolean z6 = str4.length() > 0;
        if (z6 != aVar.h) {
            aVar.h = z6;
            aVar.notifyPropertyChanged(375);
        }
        EpisodeSection episodeSection = cVar.f8798b;
        boolean z7 = !StringsKt.isBlank(episodeSection.b().f93542a);
        if (z7 != aVar.f93901j) {
            aVar.f93901j = z7;
            aVar.notifyPropertyChanged(83);
        }
        boolean zIsEmpty = true ^ episodeSection.h.isEmpty();
        if (zIsEmpty != aVar.f93902k) {
            aVar.f93902k = zIsEmpty;
            aVar.notifyPropertyChanged(17);
        }
        StringBuilder sbA = C0.d.a(hVar.f93800f.getString(2131840049), ", ");
        sbA.append(episodeSection.f93531j);
        String string = sbA.toString();
        if (!Intrinsics.areEqual(string, aVar.f93904m)) {
            aVar.f93904m = string;
            aVar.notifyPropertyChanged(373);
        }
        v vVar = new v(aVar);
        RunningUIComponent runningUIComponent = new RunningUIComponent(vVar, 0, new OgvSectionTitleUIComponentService$buildPreviewSectionTitleUIComponent$1(hVar, aVar, null), 2);
        arrayList.add(vVar);
        arrayList.add(runningUIComponentA.a);
        return new RunningUIComponent(new q(arrayList, episodeSection.f93527e, new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new O(2, this, cVar))), 0, new OgvPreviewEpisodeUIComponentService$create$1(runningUIComponent, runningUIComponentA, null), 2);
    }
}
