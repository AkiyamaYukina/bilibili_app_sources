package com.bilibili.ship.theseus.ogv.playercontainer;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import javax.inject.Inject;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/i.class */
@StabilityInferred(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f94321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f94322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Gu0.a f94323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final OgvSeason f94324d;

    @Inject
    public i(@NotNull Gu0.a aVar, @NotNull Context context, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull OgvSeason ogvSeason) {
        this.f94321a = context;
        this.f94322b = ogvCurrentEpisodeRepository;
        this.f94323c = aVar;
        this.f94324d = ogvSeason;
    }

    public final int a() {
        OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository = this.f94322b;
        OgvEpisode ogvEpisodeC = ogvCurrentEpisodeRepository.c();
        return ((ogvEpisodeC == null ? false : this.f94323c.n(ogvEpisodeC.f93555a)) && this.f94324d.b().f()) ? RangesKt.coerceAtMost(4, ogvCurrentEpisodeRepository.e().size()) : 1;
    }
}
