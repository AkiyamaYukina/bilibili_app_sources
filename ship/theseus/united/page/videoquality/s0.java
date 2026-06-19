package com.bilibili.ship.theseus.united.page.videoquality;

import java.util.Map;
import kotlin.collections.MapsKt;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/s0.class */
public final class s0 implements PlayerToast.MessageClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TheseusPlayerVipQualityTrialService f103941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sk.a f103942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vk.e f103943c;

    public s0(TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService, sk.a aVar, vk.e eVar) {
        this.f103941a = theseusPlayerVipQualityTrialService;
        this.f103942b = aVar;
        this.f103943c = eVar;
    }

    public final void onActionWithCollapse(int i7, boolean z6) {
        BuyVipScene buyVipScene = BuyVipScene.TRIAL_END_TOAST_ACTION;
        sk.a aVar = this.f103942b;
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
        TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService = this.f103941a;
        theseusPlayerVipQualityTrialService.h(buyVipScene, str2, mapEmptyMap, theseusPlayerVipQualityTrialService.f103821g.x());
        int i8 = this.f103943c.i;
        theseusPlayerVipQualityTrialService.f103819e.report(new NeuronsEvents.b(vk.f.a(i8, 1) ? "player.player.aiqn-free-toast-pay-btn.click.player" : vk.f.a(i8, 2) ? "player.player.toast-vip-qn-trysee-end.click.player" : "player.player.qn-free-toast.pay-btn-click.player", theseusPlayerVipQualityTrialService.f103820f.a()));
    }

    public final void onDismiss() {
        this.f103941a.j();
    }
}
