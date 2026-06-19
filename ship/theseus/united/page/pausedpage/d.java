package com.bilibili.ship.theseus.united.page.pausedpage;

import com.bilibili.app.gemini.ugc.feature.E;
import com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/d.class */
public final class d implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PausedPageService f102205a;

    public d(PausedPageService pausedPageService) {
        this.f102205a = pausedPageService;
    }

    public final void onClick() {
        this.f102205a.r(AdPausedPageTriggerReason.CLICK_BGM);
    }
}
