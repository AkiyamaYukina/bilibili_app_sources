package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.playercontainer.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/a.class */
public final class C6454a implements PlayerToast.MessageClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BadNetworkTipService f104772a;

    public C6454a(BadNetworkTipService badNetworkTipService) {
        this.f104772a = badNetworkTipService;
    }

    public final void onActionWithCollapse(int i7, boolean z6) {
        BadNetworkTipService badNetworkTipService = this.f104772a;
        badNetworkTipService.f104735e.report(new NeuronsEvents.NormalEvent("player.player.toast-networkslow.click.player", new String[]{"interaction", "2"}));
        badNetworkTipService.getClass();
        badNetworkTipService.f104734d.showToast(new PlayerToast.Builder().toastItemType(17).setExtraString("extra_title", badNetworkTipService.f104732b.getString(2131833824)).duration(2000L).location(32).build());
        BuildersKt.launch$default(badNetworkTipService.f104737g, (CoroutineContext) null, (CoroutineStart) null, new BadNetworkTipService$switchToAutoQuality$1(badNetworkTipService, null), 3, (Object) null);
    }

    public final void onDismiss() {
        this.f104772a.f104735e.report(new NeuronsEvents.NormalEvent("player.player.toast-networkslow.click.player", new String[]{"interaction", "1"}));
    }
}
