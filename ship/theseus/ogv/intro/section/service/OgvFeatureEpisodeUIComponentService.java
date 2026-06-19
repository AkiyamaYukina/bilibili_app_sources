package com.bilibili.ship.theseus.ogv.intro.section.service;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.bplus.followinglist.opus.manager.y;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ship.theseus.ogv.C6153e;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpBgInfo;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService;
import com.bilibili.ship.theseus.ogv.intro.section.ui.n;
import com.bilibili.ship.theseus.ogv.intro.section.ui.p;
import com.bilibili.ship.theseus.ogv.intro.section.ui.u;
import com.bilibili.ship.theseus.ogv.intro.section.ui.v;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.ogv.x;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvFeatureEpisodeUIComponentService.class */
@StabilityInferred(parameters = 0)
public final class OgvFeatureEpisodeUIComponentService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d f93730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final h f93731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final e f93732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final x f93733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final OgvSectionFloatLayerService f93734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final OgvSeason f93735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C6153e f93736g;

    @NotNull
    public final PageReportService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final wv0.a f93737i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f93738j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Context f93739k;

    @Inject
    public OgvFeatureEpisodeUIComponentService(@NotNull d dVar, @NotNull h hVar, @NotNull e eVar, @Nullable x xVar, @NotNull OgvSectionFloatLayerService ogvSectionFloatLayerService, @NotNull OgvSeason ogvSeason, @NotNull C6153e c6153e, @NotNull PageReportService pageReportService, @NotNull wv0.a aVar, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull Context context) {
        this.f93730a = dVar;
        this.f93731b = hVar;
        this.f93732c = eVar;
        this.f93733d = xVar;
        this.f93734e = ogvSectionFloatLayerService;
        this.f93735f = ogvSeason;
        this.f93736g = c6153e;
        this.h = pageReportService;
        this.f93737i = aVar;
        this.f93738j = introContentSizeRepository;
        this.f93739k = context;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public final RunningUIComponent a(@NotNull final Hu0.b bVar) throws NoWhenBranchMatchedException {
        RunningUIComponent runningUIComponentA;
        u uVarA;
        ArrayList arrayList = new ArrayList();
        boolean zIsEmpty = bVar.f8794d.isEmpty();
        EpisodeSection episodeSection = bVar.f8792b;
        e eVar = this.f93732c;
        OgvSeason ogvSeason = this.f93735f;
        if (zIsEmpty || !ogvSeason.b().c() || episodeSection.h.isEmpty()) {
            runningUIComponentA = e.a(eVar, ogvSeason, episodeSection);
        } else {
            List<EpisodeSection> list = bVar.f8794d;
            List<Hu0.c> list2 = bVar.f8796f;
            eVar.getClass();
            List<OgvEpisode> list3 = episodeSection.h;
            EpBgInfo epBgInfo = episodeSection.f93534m;
            OgvSeason ogvSeason2 = this.f93735f;
            List<UIComponent<?>> listB = eVar.b(ogvSeason2, list3, episodeSection.f93531j, epBgInfo, false);
            DataBindingComponent dataBindingComponent = new DataBindingComponent();
            n.a aVar = new n.a();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listB);
            arrayList2.add(dataBindingComponent);
            List<Hu0.c> list4 = list2;
            ArrayList arrayList3 = arrayList2;
            n.a aVar2 = aVar;
            if (list4 != null) {
                if (!list4.isEmpty()) {
                    Iterator<Hu0.c> it = list2.iterator();
                    while (true) {
                        arrayList3 = arrayList2;
                        aVar2 = aVar;
                        if (!it.hasNext()) {
                            break;
                        }
                        EpisodeSection episodeSection2 = it.next().f8798b;
                        arrayList2.addAll(eVar.b(ogvSeason2, episodeSection2.h, episodeSection2.f93531j, episodeSection2.f93534m, false));
                    }
                } else {
                    arrayList3 = arrayList2;
                    aVar2 = aVar;
                }
            }
            for (EpisodeSection episodeSection3 : (ArrayList) list) {
                arrayList3.addAll(eVar.b(ogvSeason2, episodeSection3.h, episodeSection3.f93531j, episodeSection3.f93534m, false));
            }
            runningUIComponentA = new RunningUIComponent(new n(aVar2, arrayList3), 0, new OgvSectionEpisodeListUIComponentService$buildFeatureAndPreviewMergedUIComponent$1(eVar, arrayList3, aVar2, null), 2);
        }
        final h hVar = this.f93731b;
        hVar.getClass();
        com.bilibili.gripper.container.bwebview.n nVar = new com.bilibili.gripper.container.bwebview.n(1, bVar, hVar);
        f fVar = new f(0, hVar, bVar);
        aC.j jVar = new aC.j(1, hVar, bVar);
        Function0 function0 = new Function0(hVar, bVar) { // from class: com.bilibili.ship.theseus.ogv.intro.section.service.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final h f93793a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Hu0.b f93794b;

            {
                this.f93793a = hVar;
                this.f93794b = bVar;
            }

            public final Object invoke() {
                PageReportService.i(this.f93793a.f93798d, "united.player-video-detail.choose-episode.more.show", this.f93794b.f8792b.f93532k, 4);
                return Unit.INSTANCE;
            }
        };
        y yVar = com.bilibili.ship.theseus.united.report.a.f104837a;
        v.a aVar3 = new v.a(nVar, fVar, jVar, new ExposureEntry(yVar, function0), new ExposureEntry(yVar, new aC.l(1, hVar, bVar)));
        Hu0.d dVar = bVar.f8793c;
        String str = aVar3.f93898f;
        String str2 = dVar.f8800b;
        if (!Intrinsics.areEqual(str2, str)) {
            aVar3.f93898f = str2;
            aVar3.notifyPropertyChanged(655);
        }
        String str3 = aVar3.f93899g;
        String str4 = dVar.f8799a;
        if (!Intrinsics.areEqual(str4, str3)) {
            aVar3.f93899g = str4;
            aVar3.notifyPropertyChanged(374);
        }
        boolean z6 = str4.length() > 0;
        if (z6 != aVar3.h) {
            aVar3.h = z6;
            aVar3.notifyPropertyChanged(375);
        }
        boolean z7 = !StringsKt.isBlank(episodeSection.b().f93542a);
        if (z7 != aVar3.f93901j) {
            aVar3.f93901j = z7;
            aVar3.notifyPropertyChanged(83);
        }
        boolean z8 = aVar3.f93900i;
        boolean z9 = dVar.f8801c;
        if (z9 != z8) {
            aVar3.f93900i = z9;
            aVar3.notifyPropertyChanged(478);
        }
        if (true != aVar3.f93902k) {
            aVar3.f93902k = true;
            aVar3.notifyPropertyChanged(17);
        }
        String string = hVar.f93800f.getString(2131840046);
        if (!Intrinsics.areEqual(string, aVar3.f93904m)) {
            aVar3.f93904m = string;
            aVar3.notifyPropertyChanged(373);
        }
        v vVar = new v(aVar3);
        RunningUIComponent runningUIComponent = new RunningUIComponent(vVar, 0, new OgvSectionTitleUIComponentService$buildFeatureSectionTitleUIComponent$1(hVar, aVar3, null), 2);
        arrayList.add(vVar);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (bVar.f8791a.isEmpty()) {
            uVarA = null;
        } else {
            u.c cVar = new u.c();
            objectRef.element = cVar;
            uVarA = this.f93730a.a(bVar.f8791a, ogvSeason, cVar);
        }
        if (uVarA != null) {
            arrayList.add(uVarA);
        }
        arrayList.add(runningUIComponentA.a);
        return new RunningUIComponent(new p(arrayList, new ExposureEntry(yVar, new aC.b(1, this, bVar))), 0, new OgvFeatureEpisodeUIComponentService$create$1(uVarA, runningUIComponent, runningUIComponentA, bVar, this, objectRef, null), 2);
    }
}
