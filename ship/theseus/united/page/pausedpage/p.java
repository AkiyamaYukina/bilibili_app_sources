package com.bilibili.ship.theseus.united.page.pausedpage;

import com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/p.class */
public final class p implements com.bilibili.playerbizcommonv2.widget.seek.v3.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PausedPageService f102221a;

    public p(PausedPageService pausedPageService) {
        this.f102221a = pausedPageService;
    }

    @Override // com.bilibili.playerbizcommonv2.widget.seek.v3.q
    public final void a() {
        this.f102221a.r(AdPausedPageTriggerReason.DRAG_PLAYER);
    }
}
