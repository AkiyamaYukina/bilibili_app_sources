package com.bilibili.ship.theseus.ogv.intro.section.service;

import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection;
import com.bilibili.ship.theseus.ogv.intro.section.ui.c;
import com.bilibili.ship.theseus.ogv.intro.section.ui.s;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$buildMergedTitlesVm$1.class */
final /* synthetic */ class OgvPreviewSectionMergedUIComponentService$buildMergedTitlesVm$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public OgvPreviewSectionMergedUIComponentService$buildMergedTitlesVm$1(Object obj) {
        super(0, obj, OgvPreviewSectionMergedUIComponentService.class, "openMergedTitlesLayer", "openMergedTitlesLayer()V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m9078invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m9078invoke() {
        MutableStateFlow MutableStateFlow;
        OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService = (OgvPreviewSectionMergedUIComponentService) ((CallableReference) this).receiver;
        ogvPreviewSectionMergedUIComponentService.getClass();
        s.a aVar = new s.a(new OgvPreviewSectionMergedUIComponentService$buildMergedTitlesVm$1(ogvPreviewSectionMergedUIComponentService));
        EpisodeSection episodeSection = (EpisodeSection) ogvPreviewSectionMergedUIComponentService.f93758l.getValue();
        if (episodeSection != null) {
            e eVar = ogvPreviewSectionMergedUIComponentService.f93748a;
            eVar.getClass();
            MutableStateFlow = StateFlowKt.MutableStateFlow(eVar.b(ogvPreviewSectionMergedUIComponentService.f93749b, episodeSection.h, episodeSection.f93531j, episodeSection.f93534m, true));
        } else {
            MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        }
        c.a aVar2 = new c.a();
        PageReportService.g(ogvPreviewSectionMergedUIComponentService.h, "united.player-video-detail.section.more.click", null, 6);
        BuildersKt.launch$default(ogvPreviewSectionMergedUIComponentService.f93752e, (CoroutineContext) null, (CoroutineStart) null, new OgvPreviewSectionMergedUIComponentService$openMergedTitlesLayer$1(ogvPreviewSectionMergedUIComponentService, aVar, MutableStateFlow, aVar2, null), 3, (Object) null);
    }
}
