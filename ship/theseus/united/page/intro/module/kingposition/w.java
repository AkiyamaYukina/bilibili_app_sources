package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/w.class */
public final class w implements com.bilibili.paycoin.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KingPositionService f100487a;

    public w(KingPositionService kingPositionService) {
        this.f100487a = kingPositionService;
    }

    @Override // com.bilibili.paycoin.j
    public final void a(int i7, boolean z6) {
        PageReportService pageReportService = this.f100487a.f100389t;
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("coin_num", String.valueOf(i7));
        mapCreateMapBuilder.put("is_like", z6 ? "1" : "0");
        mapCreateMapBuilder.put("action_type", "coin");
        Unit unit = Unit.INSTANCE;
        PageReportService.g(pageReportService, "united.player-video-detail.user-aciton-coin-panel.all.click", MapsKt.build(mapCreateMapBuilder), 4);
    }

    @Override // com.bilibili.paycoin.j
    public final void b() {
        PageReportService pageReportService = this.f100487a.f100389t;
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("action_type", "close");
        Unit unit = Unit.INSTANCE;
        PageReportService.g(pageReportService, "united.player-video-detail.user-aciton-coin-panel.all.click", MapsKt.build(mapCreateMapBuilder), 4);
    }

    @Override // com.bilibili.paycoin.j
    public final void c() {
        PageReportService pageReportService = this.f100487a.f100389t;
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("action_type", "help");
        Unit unit = Unit.INSTANCE;
        PageReportService.g(pageReportService, "united.player-video-detail.user-aciton-coin-panel.all.click", MapsKt.build(mapCreateMapBuilder), 4);
    }

    @Override // com.bilibili.paycoin.j
    public final void d() {
        PageReportService pageReportService = this.f100487a.f100389t;
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("action_type", "switch");
        Unit unit = Unit.INSTANCE;
        PageReportService.g(pageReportService, "united.player-video-detail.user-aciton-coin-panel.all.click", MapsKt.build(mapCreateMapBuilder), 4);
    }
}
