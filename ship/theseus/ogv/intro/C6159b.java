package com.bilibili.ship.theseus.ogv.intro;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/b.class */
@StabilityInferred(parameters = 0)
public final class C6159b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OgvSeason f92319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.intro.floatlayer.service.i f92320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.online.a f92321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageReportService f92322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f92323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Context f92324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f92325g;

    @NotNull
    public final Gu0.a h;

    @Inject
    public C6159b(@NotNull OgvSeason ogvSeason, @NotNull com.bilibili.ship.theseus.ogv.intro.floatlayer.service.i iVar, @NotNull com.bilibili.ship.theseus.united.page.online.a aVar, @NotNull PageReportService pageReportService, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull Context context, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull Gu0.a aVar2) {
        this.f92319a = ogvSeason;
        this.f92320b = iVar;
        this.f92321c = aVar;
        this.f92322d = pageReportService;
        this.f92323e = introContentSizeRepository;
        this.f92324f = context;
        this.f92325g = ogvCurrentEpisodeRepository;
        this.h = aVar2;
    }
}
