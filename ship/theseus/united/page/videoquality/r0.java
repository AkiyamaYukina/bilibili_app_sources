package com.bilibili.ship.theseus.united.page.videoquality;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Ref;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/r0.class */
public final class r0 implements PlayerToast.MessageClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef<PlayerToast> f103936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TheseusPlayerVipQualityTrialService f103937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sk.a f103938c;

    public r0(Ref.ObjectRef<PlayerToast> objectRef, TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService, sk.a aVar) {
        this.f103936a = objectRef;
        this.f103937b = theseusPlayerVipQualityTrialService;
        this.f103938c = aVar;
    }

    public final void onActionWithCollapse(int i7, boolean z6) {
        PlayerToast playerToast = (PlayerToast) this.f103936a.element;
        TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService = this.f103937b;
        if (playerToast != null) {
            theseusPlayerVipQualityTrialService.f103818d.dismissToast(playerToast);
        }
        BuyVipScene buyVipScene = BuyVipScene.SPONSOR_TRIAL_END_TOAST_ACTION;
        String str = this.f103938c.b;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        theseusPlayerVipQualityTrialService.h(buyVipScene, str2, MapsKt.emptyMap(), theseusPlayerVipQualityTrialService.f103821g.x());
        theseusPlayerVipQualityTrialService.f103819e.report(new NeuronsEvents.b("player.player.toast-vip-qn-end-pay-btn.click.player", (Map) null));
    }

    public final void onDismiss() {
        this.f103937b.j();
    }
}
