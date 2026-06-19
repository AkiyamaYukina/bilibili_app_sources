package com.bilibili.ship.theseus.united.page.pausedpage;

import com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/i.class */
public final class i implements com.bilibili.app.gemini.player.widget.watchpoint.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PausedPageService f102210a;

    public i(PausedPageService pausedPageService) {
        this.f102210a = pausedPageService;
    }

    public final void onClick() {
        this.f102210a.r(AdPausedPageTriggerReason.CLICK_WATCHPOINT);
    }
}
