package com.bilibili.ship.theseus.ogv.endpage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OgvSeason f92073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvEpisode f92074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f92075c;

    @Inject
    public a(@NotNull OgvSeason ogvSeason, @NotNull OgvEpisode ogvEpisode, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar) {
        this.f92073a = ogvSeason;
        this.f92074b = ogvEpisode;
        this.f92075c = cVar;
    }

    public final void a(@NotNull Map<String, ? super String> map) {
        OgvSeason ogvSeason = this.f92073a;
        map.put("season_type", String.valueOf(ogvSeason.f94450b.f71782a));
        map.put("season_id", String.valueOf(ogvSeason.f94449a));
        OgvEpisode ogvEpisode = this.f92074b;
        map.put("epid", String.valueOf(ogvEpisode.f93555a));
        if (ogvEpisode.h()) {
            map.put("ep_type", "iv");
        }
        com.bilibili.ship.theseus.united.page.screenstate.c cVar = this.f92075c;
        c.a aVarH = cVar.h();
        boolean zAreEqual = Intrinsics.areEqual(cVar.f(), Boolean.TRUE);
        map.put("state", !aVarH.f102988b ? zAreEqual ? "3" : "1" : zAreEqual ? "4" : "2");
    }
}
