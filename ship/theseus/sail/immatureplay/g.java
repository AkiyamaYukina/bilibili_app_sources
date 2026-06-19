package com.bilibili.ship.theseus.sail.immatureplay;

import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.player.mediaplay.q;
import javax.inject.Inject;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.PlayerParamsV2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/sail/immatureplay/g.class */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PageAdRepository f96206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C8043a f96207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final q f96208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PlayerParamsV2 f96209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C7893a f96210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f96211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final wv0.a f96212g;

    @NotNull
    public final PageReportService h;

    @Inject
    public g(@NotNull PageAdRepository pageAdRepository, @NotNull C8043a c8043a, @NotNull q qVar, @NotNull PlayerParamsV2 playerParamsV2, @NotNull C7893a c7893a, @NotNull h hVar, @NotNull wv0.a aVar, @NotNull PageReportService pageReportService) {
        this.f96206a = pageAdRepository;
        this.f96207b = c8043a;
        this.f96208c = qVar;
        this.f96209d = playerParamsV2;
        this.f96210e = c7893a;
        this.f96211f = hVar;
        this.f96212g = aVar;
        this.h = pageReportService;
    }
}
