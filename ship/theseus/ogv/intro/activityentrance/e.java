package com.bilibili.ship.theseus.ogv.intro.activityentrance;

import com.bilibili.lib.brouter.uri.Uri;
import com.bilibili.ship.theseus.ogv.vip.d;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kntr.base.router.Router;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/activityentrance/e.class */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvActivityEntranceUIComponentService f92317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityEntrance f92318b;

    public /* synthetic */ e(OgvActivityEntranceUIComponentService ogvActivityEntranceUIComponentService, ActivityEntrance activityEntrance) {
        this.f92317a = ogvActivityEntranceUIComponentService;
        this.f92318b = activityEntrance;
    }

    public final Object invoke() {
        OgvActivityEntranceUIComponentService ogvActivityEntranceUIComponentService = this.f92317a;
        PageReportService pageReportService = ogvActivityEntranceUIComponentService.f92302c;
        ActivityEntrance activityEntrance = this.f92318b;
        PageReportService.g(pageReportService, "united.player-video-detail.activeoperation.0.click", activityEntrance.f92298g, 4);
        ActivityEntranceType activityEntranceTypeB = activityEntrance.b();
        ActivityEntranceType activityEntranceType = ActivityEntranceType.VIP_CASHIER;
        Router router = ogvActivityEntranceUIComponentService.f92301b;
        if (activityEntranceTypeB == activityEntranceType) {
            router.launch(d.a.a(Uri.Companion.parse(activityEntrance.a()), "united.player-video-detail.activeoperation.0.click", null, activityEntrance.d()));
        } else {
            router.launch(Uri.Companion.parse(activityEntrance.a()));
        }
        return Unit.INSTANCE;
    }
}
