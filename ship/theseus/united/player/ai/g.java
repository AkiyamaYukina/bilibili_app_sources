package com.bilibili.ship.theseus.united.player.ai;

import com.bilibili.lib.media.resource.Languages;
import com.bilibili.playerbizcommonv2.utils.p;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Map;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/g.class */
public final class g implements PlayerToast.MessageClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnitedAiService f104376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, String> f104377b;

    public g(UnitedAiService unitedAiService, Map<String, String> map) {
        this.f104376a = unitedAiService;
        this.f104377b = map;
    }

    public final void onActionWithCollapse(int i7, boolean z6) {
        UnitedAiService unitedAiService = this.f104376a;
        unitedAiService.f104341d.N();
        Languages languagesE0 = unitedAiService.f104341d.e0();
        p.i(languagesE0 != null ? languagesE0.c() : null, unitedAiService.f104346j.getScreenModeType(), unitedAiService.f104343f);
        PageReportService.g(unitedAiService.f104347k, "player.player.toast-ai-up-dub.click.player", this.f104377b, 4);
    }

    public final void onDismiss() {
    }
}
