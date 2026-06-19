package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityDeliveryResult;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/b.class */
public final class b implements PlayerToast.MessageClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvActivityDeliveryResult.PlayAreaToast f91505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f91506b;

    public b(OgvActivityDeliveryResult.PlayAreaToast playAreaToast, c cVar) {
        this.f91505a = playAreaToast;
        this.f91506b = cVar;
    }

    public final void onActionWithCollapse(int i7, boolean z6) {
        String str;
        RouteRequest routeRequest;
        OgvActivityDeliveryResult.PlayAreaToast playAreaToast = this.f91505a;
        OgvActivityDeliveryResult.Button button = playAreaToast.f91356b;
        ActivityDialogActionType activityDialogActionType = button.f91352b;
        ActivityDialogActionType activityDialogActionType2 = ActivityDialogActionType.OPEN_WITH_ROUTE;
        c cVar = this.f91506b;
        if (activityDialogActionType == activityDialogActionType2 && (str = button.f91353c) != null && (routeRequest = RouteRequestKt.toRouteRequest(str)) != null) {
            Qj0.g.c(cVar.f91510d, routeRequest);
        }
        PageReportService.g(cVar.f91511e, "united.player-video-detail.ogv-free-toast.rules.click", playAreaToast.f91357c, 4);
    }

    public final void onDismiss() {
    }
}
