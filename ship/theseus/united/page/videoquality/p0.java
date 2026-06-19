package com.bilibili.ship.theseus.united.page.videoquality;

import java.util.Map;
import kotlin.collections.MapsKt;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/p0.class */
public final class p0 implements PlayerToast.MessageClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TheseusPlayerVipQualityTrialService f103929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sk.a f103930b;

    public p0(TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService, sk.a aVar) {
        this.f103929a = theseusPlayerVipQualityTrialService;
        this.f103930b = aVar;
    }

    public final void onActionWithCollapse(int i7, boolean z6) {
        BLog.i("TheseusPlayerVipQualityTrialService$buildTrialStartToast$1-onActionWithCollapse", "[theseus-united-TheseusPlayerVipQualityTrialService$buildTrialStartToast$1-onActionWithCollapse] trial go to buy vip");
        BuyVipScene buyVipScene = BuyVipScene.TRIAL_START_TOAST_ACTION;
        sk.a aVar = this.f103930b;
        String str = aVar.b;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        Map<String, String> map = aVar.c;
        Map<String, String> mapEmptyMap = map;
        if (map == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService = this.f103929a;
        theseusPlayerVipQualityTrialService.h(buyVipScene, str2, mapEmptyMap, theseusPlayerVipQualityTrialService.f103821g.x());
        vk.e eVarE = theseusPlayerVipQualityTrialService.e();
        vk.f fVar = eVarE != null ? new vk.f(eVarE.i) : null;
        theseusPlayerVipQualityTrialService.f103819e.report(new NeuronsEvents.b(fVar == null ? false : vk.f.a(fVar.a, 1) ? "player.player.aiqn-free-toast-pay-btn.click.player" : "player.player.qn-free-toast.pay-btn-click.player", theseusPlayerVipQualityTrialService.f103820f.a()));
    }

    public final void onDismiss() {
    }
}
