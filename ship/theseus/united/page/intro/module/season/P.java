package com.bilibili.ship.theseus.united.page.intro.module.season;

import android.content.Context;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.playset.widget.favorite.FavSnackBarUtil;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/P.class */
public final class P implements FavSnackBarUtil.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnitedSeasonPanelService f101499b;

    public P(String str, UnitedSeasonPanelService unitedSeasonPanelService) {
        this.f101498a = str;
        this.f101499b = unitedSeasonPanelService;
    }

    @Override // com.bilibili.playset.widget.favorite.FavSnackBarUtil.b
    public final void onClick() {
        String str = this.f101498a;
        BLog.i("UnitedSeasonPanelService$handleSubscribeResult$1-onClick", "[theseus-united-UnitedSeasonPanelService$handleSubscribeResult$1-onClick] " + "handleSubscribeResult onClick link: ".concat(str));
        BLRouter.routeTo$default(RouteRequestKt.toRouteRequest(str), (Context) null, 2, (Object) null);
        PageReportService.g(this.f101499b.f101602m, "united.player-video-detail.drama-float-bottom.snackbar.click", null, 6);
    }

    @Override // com.bilibili.playset.widget.favorite.FavSnackBarUtil.b
    public final void onDismiss() {
        BLog.i("UnitedSeasonPanelService$handleSubscribeResult$1-onDismiss", "[theseus-united-UnitedSeasonPanelService$handleSubscribeResult$1-onDismiss] handleSubscribeResult onDismiss");
    }

    @Override // com.bilibili.playset.widget.favorite.FavSnackBarUtil.b
    public final void onShow() {
        BLog.i("UnitedSeasonPanelService$handleSubscribeResult$1-onShow", "[theseus-united-UnitedSeasonPanelService$handleSubscribeResult$1-onShow] handleSubscribeResult onShow");
        PageReportService.i(this.f101499b.f101602m, "united.player-video-detail.drama-float-bottom.snackbar.show", null, 6);
    }
}
