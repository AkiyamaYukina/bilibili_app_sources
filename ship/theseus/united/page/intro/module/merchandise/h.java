package com.bilibili.ship.theseus.united.page.intro.module.merchandise;

import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.gripper.api.ad.biz.videodetail.IAdPanelListener;
import com.bilibili.gripper.api.ad.biz.videodetail.IPanelData;
import com.bilibili.gripper.api.ad.biz.videodetail.merchandise.AdMerchandiseBridge;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/h.class */
public final class h implements AdMerchandiseBridge.IMerchandisePanelCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SourceContent f100588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MerchandiseService f100589b;

    public h(MerchandiseService merchandiseService) {
        this.f100589b = merchandiseService;
        d dVar = merchandiseService.f100561l;
        d dVar2 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchandiseData");
            dVar2 = null;
        }
        List<c> list = dVar2.f100579c;
        SourceContent sourceContent = null;
        if (list != null) {
            c cVar = (c) CollectionsKt.firstOrNull(list);
            sourceContent = null;
            if (cVar != null) {
                sourceContent = cVar.f100576e;
            }
        }
        this.f100588a = sourceContent;
    }

    public final void dismissPanel() {
        this.f100589b.dismissPanel();
    }

    public final SourceContent getMerchandiseAdInfo() {
        return this.f100588a;
    }

    public final boolean isPanelShowing() {
        return this.f100589b.isPanelShowing();
    }

    public final Object onMerchandisePanelButtonClick(Map<String, String> map, Continuation<? super Unit> continuation) {
        MerchandiseService merchandiseService = this.f100589b;
        PageReportService.g(merchandiseService.f100552b, "united.player-video-detail.mall-float.mall-card.click", MapsKt.plus(merchandiseService.c(), map), 4);
        return Unit.INSTANCE;
    }

    public final Object onMerchandisePanelCardClick(Map<String, String> map, Continuation<? super Unit> continuation) {
        MerchandiseService merchandiseService = this.f100589b;
        PageReportService.g(merchandiseService.f100552b, "united.player-video-detail.mall-float.mall-card.click", MapsKt.plus(merchandiseService.c(), map), 4);
        return Unit.INSTANCE;
    }

    public final Object onMerchandisePanelCardShow(Map<String, String> map, Continuation<? super Unit> continuation) {
        MerchandiseService merchandiseService = this.f100589b;
        PageReportService.i(merchandiseService.f100552b, "united.player-video-detail.mall-float.mall-card.show", MapsKt.plus(merchandiseService.c(), map), 4);
        return Unit.INSTANCE;
    }

    public final Object onMerchandisePanelWindowClick(Continuation<? super Unit> continuation) {
        MerchandiseService merchandiseService = this.f100589b;
        PageReportService.g(merchandiseService.f100552b, "united.player-video-detail.mall-float.to-window.click", MapsKt.plus(merchandiseService.c(), merchandiseService.d()), 4);
        return Unit.INSTANCE;
    }

    public final <T extends IPanelData> void showPanel(int i7, T t7, IAdPanelListener iAdPanelListener) {
        this.f100589b.showPanel(i7, t7, iAdPanelListener);
    }
}
