package com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist;

import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.ship.theseus.ogv.intro.filmlist.Film;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/morefilmlist/h.class */
public final class h implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvMoreFilmsLayerService f92798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Film f92799b;

    public h(OgvMoreFilmsLayerService ogvMoreFilmsLayerService, Film film) {
        this.f92798a = ogvMoreFilmsLayerService;
        this.f92799b = film;
    }

    public final Object invoke() {
        OgvMoreFilmsLayerService ogvMoreFilmsLayerService = this.f92798a;
        PageReportService pageReportService = ogvMoreFilmsLayerService.f92756b;
        Film film = this.f92799b;
        PageReportService.g(pageReportService, "united.player-video-detail.playlist-more.card.click", film.f92668g, 4);
        BLRouter.routeTo(new RouteRequest.Builder(film.f92667f).build(), ogvMoreFilmsLayerService.f92755a);
        return Unit.INSTANCE;
    }
}
