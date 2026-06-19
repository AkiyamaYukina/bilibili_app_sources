package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kntr.base.router.Router;
import kntr.common.router.UrisKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/k.class */
public final class k implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvIntroFloatingBallService f91602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OgvIntroFloatingBall f91603b;

    public k(OgvIntroFloatingBallService ogvIntroFloatingBallService, OgvIntroFloatingBall ogvIntroFloatingBall) {
        this.f91602a = ogvIntroFloatingBallService;
        this.f91603b = ogvIntroFloatingBall;
    }

    public final Object invoke() {
        OgvIntroFloatingBallService ogvIntroFloatingBallService = this.f91602a;
        Router router = ogvIntroFloatingBallService.f91436f;
        OgvIntroFloatingBall ogvIntroFloatingBall = this.f91603b;
        router.launch(UrisKt.toUri(ogvIntroFloatingBall.c()));
        PageReportService.g(ogvIntroFloatingBallService.f91435e, "united.player-video-detail.bottom-float.0.click", ogvIntroFloatingBall.f91430e, 4);
        return Unit.INSTANCE;
    }
}
