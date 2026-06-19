package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsNewComponent;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$createStaffs$state$1.class */
public final class StaffsService$createStaffs$state$1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StaffsService f101860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6369f f101861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ref.LongRef f101862c;

    public StaffsService$createStaffs$state$1(StaffsService staffsService, C6369f c6369f, Ref.LongRef longRef) {
        this.f101860a = staffsService;
        this.f101861b = c6369f;
        this.f101862c = longRef;
    }

    public final void a(Staff staff, StaffsNewComponent.StaffArea staffArea) {
        StaffsService staffsService = this.f101860a;
        staffsService.f(staff, staffArea);
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("area", staffArea == StaffsNewComponent.StaffArea.HEAD ? "1" : "2");
        mapCreateMapBuilder.put("page_area", "1");
        Unit unit = Unit.INSTANCE;
        PageReportService.g(staffsService.f101844n, "united.player-video-detail.up-joint-submission.head.click", MapsKt.build(mapCreateMapBuilder), 4);
    }

    public final void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Ref.LongRef longRef = this.f101862c;
        if (jCurrentTimeMillis - longRef.element < 500) {
            return;
        }
        longRef.element = jCurrentTimeMillis;
        HashMap map = new HashMap();
        StaffsService staffsService = this.f101860a;
        map.putAll(staffsService.f101844n.a(null));
        map.put("spmid", staffsService.f101839i.a().f123880b);
        PageReportService.i(staffsService.f101844n, "united.player-video-detail.up-joint-submission.panel.show", map, 4);
        BuildersKt.launch$default(staffsService.f101833b, (CoroutineContext) null, (CoroutineStart) null, new StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1(staffsService, null), 3, (Object) null);
    }
}
