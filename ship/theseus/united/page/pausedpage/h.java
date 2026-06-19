package com.bilibili.ship.theseus.united.page.pausedpage;

import com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/h.class */
public final class h implements com.bilibili.app.gemini.player.widget.watchpoint.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PausedPageService f102209a;

    public h(PausedPageService pausedPageService) {
        this.f102209a = pausedPageService;
    }

    public final void onClick() {
        this.f102209a.r(AdPausedPageTriggerReason.CLICK_WATCHPOINT);
    }
}
