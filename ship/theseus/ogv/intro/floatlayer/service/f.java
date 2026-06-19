package com.bilibili.ship.theseus.ogv.intro.floatlayer.service;

import com.bilibili.ship.theseus.ogv.intro.floatlayer.uicomponent.c;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/f.class */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.b f92999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f93000b;

    public /* synthetic */ f(c.b bVar, i iVar) {
        this.f92999a = bVar;
        this.f93000b = iVar;
    }

    public final Object invoke(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        c.b bVar = this.f92999a;
        i iVar = this.f93000b;
        if (iIntValue == 0 && !bVar.f93036l) {
            bVar.f93036l = true;
            PageReportService.i(iVar.f93008f, "united.player-video-detail.info-detail-page.0.show", null, 6);
        }
        if (iIntValue == 1 && !bVar.f93037m) {
            bVar.f93037m = true;
            PageReportService.i(iVar.f93008f, "united.player-video-detail.info-comment-page.0.show", null, 6);
        }
        return Unit.INSTANCE;
    }
}
