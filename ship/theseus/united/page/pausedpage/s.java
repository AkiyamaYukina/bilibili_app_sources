package com.bilibili.ship.theseus.united.page.pausedpage;

import com.bilibili.gripper.api.ad.biz.videodetail.IAdPanelListener;
import com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/s.class */
public final class s implements IAdPanelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PausedPageService f102226a;

    public s(PausedPageService pausedPageService) {
        this.f102226a = pausedPageService;
    }

    public final void onPanelDismiss(boolean z6) {
        PausedPageService pausedPageService = this.f102226a;
        pausedPageService.f102170y = null;
        pausedPageService.f102137C = false;
        pausedPageService.f102138D = null;
        PlayerToast playerToast = pausedPageService.f102169x;
        if (playerToast != null) {
            pausedPageService.f102164s.dismissToast(playerToast);
        }
        pausedPageService.f102169x = null;
        pausedPageService.z(PausedPageService.FlowState.IDLE);
    }
}
