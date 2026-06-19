package com.bilibili.ship.theseus.ogv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.intro.livereserve.OgvLiveReserveVo;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection;
import com.bilibili.ship.theseus.ogv.pay.sponsor.BangumiSponsorRankSummary;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/B.class */
@StabilityInferred(parameters = 0)
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<EpisodeSection> f91208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final BangumiSponsorRankSummary f91209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Lu0.a f91210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<Hu0.c> f91211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final OgvLiveReserveVo f91212e;

    public B(@NotNull List<EpisodeSection> list, @Nullable BangumiSponsorRankSummary bangumiSponsorRankSummary, @Nullable Lu0.a aVar, @Nullable List<Hu0.c> list2, @Nullable OgvLiveReserveVo ogvLiveReserveVo) {
        this.f91208a = list;
        this.f91209b = bangumiSponsorRankSummary;
        this.f91210c = aVar;
        this.f91211d = list2;
        this.f91212e = ogvLiveReserveVo;
    }
}
