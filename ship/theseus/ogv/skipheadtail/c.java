package com.bilibili.ship.theseus.ogv.skipheadtail;

import com.bilibili.ship.theseus.ogv.skipheadtail.SkippingOpEdService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/skipheadtail/c.class */
public final class c implements PlayerToast.MessageClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SkippingOpEdService f94541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SkippingOpEdService.a f94542b;

    public c(SkippingOpEdService skippingOpEdService, SkippingOpEdService.a aVar) {
        this.f94541a = skippingOpEdService;
        this.f94542b = aVar;
    }

    public final void onActionWithCollapse(int i7, boolean z6) {
        SkippingOpEdService.a aVar = this.f94542b;
        SkippingOpEdService skippingOpEdService = this.f94541a;
        skippingOpEdService.c(aVar);
        PageReportService.g(skippingOpEdService.f94520g, "pgc.pgc-video-detail.firstskip-click.3.click", null, 6);
    }

    public final void onDismiss() {
    }
}
