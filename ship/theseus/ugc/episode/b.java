package com.bilibili.ship.theseus.ugc.episode;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.ugc.play.schedule.UGCEpisodeListRepository;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateRepository;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/episode/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f96902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f96903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DetailRelateRepository f96904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final UGCPlaybackRepository f96905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final UGCEpisodeListRepository f96906e;

    @Inject
    public b(@NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull DetailRelateRepository detailRelateRepository, @NotNull UGCPlaybackRepository uGCPlaybackRepository, @NotNull UGCEpisodeListRepository uGCEpisodeListRepository) {
        this.f96902a = pageBackgroundPlayRepository;
        this.f96903b = cVar;
        this.f96904c = detailRelateRepository;
        this.f96905d = uGCPlaybackRepository;
        this.f96906e = uGCEpisodeListRepository;
    }
}
