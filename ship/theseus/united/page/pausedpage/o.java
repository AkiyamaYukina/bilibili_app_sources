package com.bilibili.ship.theseus.united.page.pausedpage;

import com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason;
import tv.danmaku.biliplayerv2.service.DraggingProgressObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/o.class */
public final class o implements DraggingProgressObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PausedPageService f102220a;

    public o(PausedPageService pausedPageService) {
        this.f102220a = pausedPageService;
    }

    public final void onDraggingByUserChanged(boolean z6) {
        if (z6) {
            this.f102220a.r(AdPausedPageTriggerReason.DRAG_PLAYER);
        }
    }

    public final void onDraggingProgressChanged(int i7, int i8) {
    }
}
