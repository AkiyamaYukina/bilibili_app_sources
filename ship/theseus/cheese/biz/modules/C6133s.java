package com.bilibili.ship.theseus.cheese.biz.modules;

import android.content.Context;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.playerbizcommonv2.utils.i;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.view.d;
import java.util.HashMap;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/s.class */
public final class C6133s implements com.bilibili.ship.theseus.united.page.intro.module.owner.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.ship.theseus.united.page.view.d f90414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PageReportService f90415b;

    public C6133s(com.bilibili.ship.theseus.united.page.view.d dVar, PageReportService pageReportService) {
        this.f90414a = dVar;
        this.f90415b = pageReportService;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.owner.a
    public final void a() {
        String str;
        com.bilibili.ship.theseus.united.page.view.d dVar = this.f90414a;
        d.a aVar = (d.a) dVar.f104057d.getValue();
        if (aVar == null || (str = aVar.f104060c) == null) {
            return;
        }
        BLRouter.routeTo$default(RouteRequestKt.toRouteRequest(str), (Context) null, 2, (Object) null);
        HashMap map = new HashMap();
        map.put("head_status", dVar.e() != null ? "1" : "2");
        map.put("area", "1");
        PageReportService.g(this.f90415b, "united.player-video-detail.up-information.head.click", map, 4);
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.owner.a
    public final void b() {
        String str;
        com.bilibili.ship.theseus.united.page.view.d dVar = this.f90414a;
        d.a aVar = (d.a) dVar.f104057d.getValue();
        if (aVar == null || (str = aVar.f104062e) == null) {
            return;
        }
        BLRouter.routeTo$default(RouteRequestKt.toRouteRequest(str), (Context) null, 2, (Object) null);
        HashMap map = new HashMap();
        map.put("head_status", dVar.e() != null ? "1" : "2");
        map.put("area", "2");
        PageReportService.g(this.f90415b, "united.player-video-detail.up-information.head.click", map, 4);
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.owner.a
    public final i.c c() {
        return null;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.owner.a
    public final String getCount() {
        d.a aVar = (d.a) this.f90414a.f104057d.getValue();
        return aVar != null ? aVar.f104065i : null;
    }
}
