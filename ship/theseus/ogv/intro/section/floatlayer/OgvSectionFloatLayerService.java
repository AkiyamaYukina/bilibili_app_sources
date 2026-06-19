package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection;
import com.bilibili.ship.theseus.ogv.intro.section.bean.MoreLeft;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.h;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.o;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.u;
import com.bilibili.ship.theseus.ogv.intro.section.ui.u;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSectionFloatLayerService.class */
@StabilityInferred(parameters = 0)
public final class OgvSectionFloatLayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f93619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Gu0.a f93620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.intro.section.service.d f93621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.intro.section.service.e f93622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final OgvSeason f93623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f93624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PageReportService f93625g;

    @NotNull
    public final CoroutineScope h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f93626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f93627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f93628k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f93629l = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    @Inject
    public OgvSectionFloatLayerService(@NotNull Context context, @NotNull Gu0.a aVar, @NotNull com.bilibili.ship.theseus.ogv.intro.section.service.d dVar, @NotNull com.bilibili.ship.theseus.ogv.intro.section.service.e eVar, @NotNull OgvSeason ogvSeason, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull PageReportService pageReportService, @NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2) {
        this.f93619a = context;
        this.f93620b = aVar;
        this.f93621c = dVar;
        this.f93622d = eVar;
        this.f93623e = ogvSeason;
        this.f93624f = ogvCurrentEpisodeRepository;
        this.f93625g = pageReportService;
        this.h = coroutineScope;
        this.f93626i = gVar;
        this.f93627j = theseusFloatLayerService;
        this.f93628k = aVar2;
    }

    public static final h a(OgvSectionFloatLayerService ogvSectionFloatLayerService, Function0 function0, String str, MoreLeft moreLeft, int i7, o.b bVar, u.a aVar, h.a aVar2, com.bilibili.ship.theseus.ogv.intro.section.ui.u uVar) {
        ogvSectionFloatLayerService.getClass();
        aVar2.f93670d = str;
        aVar2.f93671e = moreLeft.f93542a;
        aVar.f93723a.setValue(moreLeft.f93543b);
        aVar2.m();
        if (bVar.f93700j) {
            bVar.f93700j = false;
            bVar.notifyPropertyChanged(657);
        }
        aVar2.n(bVar.f93695d);
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        List list = listCreateListBuilder;
        OgvCurrentEpisodeRepository$special$$inlined$map$1 ogvCurrentEpisodeRepository$special$$inlined$map$1 = ogvSectionFloatLayerService.f93624f.f92119v;
        com.bilibili.ship.theseus.united.page.screensize.a aVar3 = ogvSectionFloatLayerService.f93628k;
        list.add(new o(bVar, uVar, ogvCurrentEpisodeRepository$special$$inlined$map$1, aVar3.f102939c, function0));
        list.add(new u(aVar, aVar3.f102939c));
        return new h(aVar2, i7, CollectionsKt.build(listCreateListBuilder), function0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService r14, long r15, com.bilibili.ship.theseus.ogv.intro.section.floatlayer.o.b r17, com.bilibili.ship.theseus.ogv.intro.section.floatlayer.h.a r18, com.bilibili.ship.theseus.ogv.intro.section.floatlayer.u.a r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 875
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService.b(com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService, long, com.bilibili.ship.theseus.ogv.intro.section.floatlayer.o$b, com.bilibili.ship.theseus.ogv.intro.section.floatlayer.h$a, com.bilibili.ship.theseus.ogv.intro.section.floatlayer.u$a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void c(EpisodeSection episodeSection, List<EpisodeSection> list, String str, String str2, v vVar, o.b bVar, h.a aVar) {
        ArrayList arrayList = new ArrayList();
        if (episodeSection.h.isEmpty()) {
            Context context = this.f93619a;
            bVar.n(true);
            String string = context.getString(2131851626);
            if (!Intrinsics.areEqual(string, bVar.f93699i)) {
                bVar.f93699i = string;
                bVar.notifyPropertyChanged(195);
            }
            bVar.f93705o = false;
        } else {
            bVar.o(false);
            aVar.n(false);
            if (!StringsKt.isBlank(str2)) {
                arrayList.add(new c(str2));
            }
            arrayList.addAll(this.f93622d.b(vVar, episodeSection.h, episodeSection.f93531j, episodeSection.f93534m, true));
            String string2 = str;
            if (str.length() == 0) {
                string2 = this.f93619a.getString(2131848941);
            }
            arrayList.add(new b(string2));
            for (EpisodeSection episodeSection2 : list) {
                com.bilibili.ship.theseus.ogv.intro.section.service.e eVar = this.f93622d;
                eVar.getClass();
                arrayList.addAll(eVar.b(vVar, episodeSection2.h, episodeSection2.f93531j, episodeSection2.f93534m, true));
            }
        }
        bVar.f93692a.setValue(arrayList);
    }

    public final void d(EpisodeSection episodeSection, String str, v vVar, o.b bVar, h.a aVar) {
        ArrayList arrayList = new ArrayList();
        if (episodeSection.h.isEmpty()) {
            Context context = this.f93619a;
            bVar.n(true);
            String string = context.getString(2131851626);
            if (!Intrinsics.areEqual(string, bVar.f93699i)) {
                bVar.f93699i = string;
                bVar.notifyPropertyChanged(195);
            }
            bVar.f93705o = false;
        } else {
            bVar.o(episodeSection.d());
            aVar.n(bVar.f93695d);
            if (!StringsKt.isBlank(str)) {
                arrayList.add(new c(str));
            }
            com.bilibili.ship.theseus.ogv.intro.section.service.e eVar = this.f93622d;
            eVar.getClass();
            arrayList.addAll(eVar.b(vVar, episodeSection.h, episodeSection.f93531j, episodeSection.f93534m, true));
            String str2 = episodeSection.f93526d;
            if (!StringsKt.isBlank(str2)) {
                arrayList.add(new a(str2));
            }
        }
        bVar.f93692a.setValue(arrayList);
    }

    public final void e(@NotNull final Hu0.b bVar, boolean z6) {
        com.bilibili.ship.theseus.ogv.intro.section.ui.u uVarA;
        OgvSeason ogvSeason = this.f93623e;
        boolean zC = ogvSeason.b().c();
        o.b bVar2 = new o.b();
        long j7 = ogvSeason.f94449a;
        bVar2.f93701k = j7;
        this.f93620b.getClass();
        this.f93629l.setValue(Boolean.valueOf(Gu0.a.o(j7)));
        bVar2.q(bVar.f8792b.h.isEmpty() ? this.f93619a.getString(2131851649) : this.f93619a.getString(2131846730, String.valueOf(bVar.f8792b.h.size())));
        bVar2.o(bVar.f8793c.f8801c && !zC);
        boolean z7 = !bVar.f8791a.isEmpty();
        if (z7 != bVar2.f93698g) {
            bVar2.f93698g = z7;
            bVar2.notifyPropertyChanged(532);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (bVar2.f93698g) {
            u.c cVar = new u.c();
            objectRef.element = cVar;
            uVarA = this.f93621c.a(bVar.f8791a, ogvSeason, cVar);
        } else {
            uVarA = null;
        }
        BuildersKt.launch$default(this.h, (CoroutineContext) null, (CoroutineStart) null, new OgvSectionFloatLayerService$showFeatureOrMergePreviewSectionFloatLayer$1(this, bVar2, bVar, z6, new u.a(), new h.a(this.f93619a, bVar2, new Function1(this, bVar) { // from class: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvSectionFloatLayerService f93680a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Hu0.b f93681b;

            {
                this.f93680a = this;
                this.f93681b = bVar;
            }

            public final Object invoke(Object obj) {
                ((Integer) obj).getClass();
                PageReportService.g(this.f93680a.f93625g, "united.player-video-detail.calendar.button.click", this.f93681b.f8792b.f93532k, 4);
                return Unit.INSTANCE;
            }
        }), uVarA, zC, objectRef, null), 3, (Object) null);
    }

    public final void f(@NotNull Hu0.c cVar, boolean z6) {
        o.b bVar = new o.b();
        Context context = this.f93619a;
        Hu0.d dVar = cVar.f8797a;
        EpisodeSection episodeSection = cVar.f8798b;
        bVar.q(context.getString(2131854820, dVar.f8800b, String.valueOf(episodeSection.h.size())));
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f93622d.b(this.f93623e, episodeSection.h, episodeSection.f93531j, episodeSection.f93534m, true));
        String str = episodeSection.f93526d;
        if (!StringsKt.isBlank(str)) {
            arrayList.add(new a(str));
        }
        BuildersKt.launch$default(this.h, (CoroutineContext) null, (CoroutineStart) null, new OgvSectionFloatLayerService$showPreviewSectionFloatLayer$1(this, bVar, cVar, z6, new u.a(), new h.a(this.f93619a, bVar, new U60.c(1, this, cVar)), arrayList, null), 3, (Object) null);
    }
}
