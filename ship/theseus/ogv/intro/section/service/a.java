package com.bilibili.ship.theseus.ogv.intro.section.service;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f93776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvPreviewEpisodeUIComponentService f93777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Gu0.a f93778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final OgvSeason f93779d;

    @Inject
    public a(@NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull OgvPreviewEpisodeUIComponentService ogvPreviewEpisodeUIComponentService, @NotNull Gu0.a aVar, @NotNull OgvSeason ogvSeason) {
        this.f93776a = ogvCurrentEpisodeRepository;
        this.f93777b = ogvPreviewEpisodeUIComponentService;
        this.f93778c = aVar;
        this.f93779d = ogvSeason;
    }
}
