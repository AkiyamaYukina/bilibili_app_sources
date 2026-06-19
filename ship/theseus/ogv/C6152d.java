package com.bilibili.ship.theseus.ogv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/d.class */
@StabilityInferred(parameters = 0)
public final class C6152d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final EpisodeExtraInfoRepository f91826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.dubbing.q f91827b;

    @Inject
    public C6152d(@NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository, @NotNull com.bilibili.ship.theseus.ogv.dubbing.q qVar) {
        this.f91826a = episodeExtraInfoRepository;
        this.f91827b = qVar;
    }
}
