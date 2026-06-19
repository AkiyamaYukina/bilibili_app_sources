package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.ui.text.font.C4496a;
import com.bilibili.player.tangram.basic.c;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/q0.class */
public final class q0 implements PlayerToast.MessageClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f103932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ref.ObjectRef<PlayerToast> f103933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TheseusPlayerVipQualityTrialService f103934c;

    public q0(int i7, Ref.ObjectRef<PlayerToast> objectRef, TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService) {
        this.f103932a = i7;
        this.f103933b = objectRef;
        this.f103934c = theseusPlayerVipQualityTrialService;
    }

    public final void onActionWithCollapse(int i7, boolean z6) {
        int i8 = this.f103932a;
        defpackage.a.b("[theseus-united-TheseusPlayerVipQualityTrialService$showSponsorStartToast$3-onActionWithCollapse] ", C4496a.a("SponsorQuality: start toast clicked, switch to qn=", String.valueOf(i8)), "TheseusPlayerVipQualityTrialService$showSponsorStartToast$3-onActionWithCollapse");
        PlayerToast playerToast = (PlayerToast) this.f103933b.element;
        TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService = this.f103934c;
        if (playerToast != null) {
            theseusPlayerVipQualityTrialService.f103818d.dismissToast(playerToast);
        }
        Mn.z zVar = theseusPlayerVipQualityTrialService.f103828o;
        if (zVar != null) {
            ((TheseusPlayerQualityService) zVar.b).e(new c.b(i8));
            Unit unit = Unit.INSTANCE;
        }
        theseusPlayerVipQualityTrialService.f103819e.report(new NeuronsEvents.b("player.player.toast-vip-qn-switch-btn.click.player", (Map) null));
    }

    public final void onDismiss() {
    }
}
