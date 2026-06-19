package com.bilibili.ship.theseus.united.page.pausedpage;

import com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/f.class */
public final class f implements com.bilibili.app.gemini.player.widget.story.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PausedPageService f102207a;

    public f(PausedPageService pausedPageService) {
        this.f102207a = pausedPageService;
    }

    public final void onClick() {
        this.f102207a.r(AdPausedPageTriggerReason.CLICK_PLAYER_FULLSCREEN);
    }
}
