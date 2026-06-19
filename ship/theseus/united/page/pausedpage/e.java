package com.bilibili.ship.theseus.united.page.pausedpage;

import com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/e.class */
public final class e implements com.bilibili.app.gemini.player.widget.story.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PausedPageService f102206a;

    public e(PausedPageService pausedPageService) {
        this.f102206a = pausedPageService;
    }

    public final void onClick() {
        this.f102206a.r(AdPausedPageTriggerReason.CLICK_PLAYER_STORY);
    }
}
