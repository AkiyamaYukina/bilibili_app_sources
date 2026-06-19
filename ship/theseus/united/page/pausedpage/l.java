package com.bilibili.ship.theseus.united.page.pausedpage;

import com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason;
import com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/l.class */
public final class l implements com.bilibili.playerbizcommonv2.widget.base.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PausedPageService f102213a;

    public l(PausedPageService pausedPageService) {
        this.f102213a = pausedPageService;
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.d
    public final void a() {
        PausedPageService.o(this.f102213a, PausedPageService.PauseTriggerSource.WIDGET);
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.d
    public final void b() {
        this.f102213a.r(AdPausedPageTriggerReason.RESUME_PLAY);
    }
}
