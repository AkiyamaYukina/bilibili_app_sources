package com.bilibili.ship.theseus.ugc.intro.uprecommend;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.intro.module.owner.r;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.CoroutineScope;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpService.class */
@StabilityInferred(parameters = 0)
public final class RecommendUpService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f97802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C7893a f97803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C8043a f97804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final RecommendUpRepository f97805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final r f97806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PageReportService f97807g;

    @NotNull
    public final rW0.a<IntroRecycleViewService> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f97808i;

    @Inject
    public RecommendUpService(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull C7893a c7893a, @NotNull C8043a c8043a, @NotNull RecommendUpRepository recommendUpRepository, @NotNull r rVar, @NotNull PageReportService pageReportService, @NotNull rW0.a<IntroRecycleViewService> aVar2, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f97801a = coroutineScope;
        this.f97802b = aVar;
        this.f97803c = c7893a;
        this.f97804d = c8043a;
        this.f97805e = recommendUpRepository;
        this.f97806f = rVar;
        this.f97807g = pageReportService;
        this.h = aVar2;
        this.f97808i = introContentSizeRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent.e a(com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpService r8, com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUp r9) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpService.a(com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpService, com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUp):com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent$e");
    }

    public static final void c(RecommendUpService recommendUpService, RecommendUp recommendUp, int i7) {
        RecommendUpRepository recommendUpRepository = recommendUpService.f97805e;
        recommendUpRepository.getClass();
        ArrayList<RecommendUp> arrayList = new ArrayList((List) recommendUpRepository.f97800g.getValue());
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (RecommendUp recommendUp2 : arrayList) {
            RecommendUp recommendUpA = recommendUp2;
            if (recommendUp2.i() == recommendUp.i()) {
                RecommendUpDescButton recommendUpDescButtonD = recommendUp.d();
                RecommendUpDescButton recommendUpDescButtonA = null;
                if (recommendUpDescButtonD != null) {
                    RecommendUpDescRelation recommendUpDescRelationB = recommendUp.d().b();
                    recommendUpDescButtonA = RecommendUpDescButton.a(recommendUpDescButtonD, recommendUpDescRelationB != null ? RecommendUpDescRelation.a(recommendUpDescRelationB, i7) : null);
                }
                recommendUpA = RecommendUp.a(recommendUp, recommendUpDescButtonA);
                recommendUpA.f97754i = recommendUp.f97754i;
                recommendUpA.h = recommendUp.h;
            }
            arrayList2.add(recommendUpA);
        }
        recommendUpRepository.f97799f.setValue(arrayList2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.app.gemini.ui.UIComponent, com.bilibili.ship.theseus.ugc.intro.b, java.lang.Object] */
    @NotNull
    public final RunningUIComponent b() {
        ?? obj = new Object();
        return new RunningUIComponent((UIComponent) obj, 0, new RecommendUpService$create$1(this, obj, null), 2);
    }
}
