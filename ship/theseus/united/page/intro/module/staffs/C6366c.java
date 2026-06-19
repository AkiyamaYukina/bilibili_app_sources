package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsNewComponent;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import mv0.C8043a;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/c.class */
public final class C6366c implements InterfaceC6364a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C8043a f101863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bilibili.ship.theseus.united.page.view.a f101864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PageReportService f101865c;

    public C6366c(C8043a c8043a, com.bilibili.ship.theseus.united.page.view.a aVar, PageReportService pageReportService) {
        this.f101863a = c8043a;
        this.f101864b = aVar;
        this.f101865c = pageReportService;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.staffs.InterfaceC6364a
    public final void a(long j7, String str, StaffsNewComponent.StaffArea staffArea) {
        sh1.e.a(FoundationAlias.getFapp(), str, j7, this.f101863a.a().f123879a, this.f101864b.b());
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("area", staffArea == StaffsNewComponent.StaffArea.HEAD ? "1" : "2");
        mapCreateMapBuilder.put("page_area", "2");
        Unit unit = Unit.INSTANCE;
        PageReportService.g(this.f101865c, "united.player-video-detail.up-joint-submission.head.click", MapsKt.build(mapCreateMapBuilder), 4);
    }
}
