package com.bilibili.ship.theseus.cheese.biz.intro.series;

import Qj0.g;
import android.content.Context;
import androidx.compose.foundation.text.selection.C3751q;
import androidx.compose.runtime.internal.StabilityInferred;
import au0.C4911a;
import com.bapis.bilibili.playershared.BizType;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import eu0.C6985d;
import ev0.InterfaceC7008a;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/series/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f90101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final wv0.a f90102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f90103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C4911a f90104d;

    @Inject
    public c(@NotNull Context context, @NotNull wv0.a aVar, @NotNull CheesePlayRepository cheesePlayRepository, @NotNull C4911a c4911a) {
        this.f90101a = context;
        this.f90102b = aVar;
        this.f90103c = cheesePlayRepository;
        this.f90104d = c4911a;
    }

    public final void a(@NotNull C6985d c6985d) {
        if (!this.f90102b.a()) {
            CheesePlayRepository.e(this.f90103c, c6985d.f117510e, c6985d.f117511f, 0, 12);
            return;
        }
        RouteRequest.Builder builder = new RouteRequest.Builder(C3751q.a(c6985d.f117521q, "bilibili://cheese/season/ep/"));
        C4911a c4911a = this.f90104d;
        g.b(builder, "csource", c4911a.f54238b);
        g.b(builder, "bsource", c4911a.f54239c);
        g.b(builder, MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_MSOURCE, c4911a.f54240d);
        g.b(builder, "scene_tag", c4911a.f54241e);
        g.b(builder, "scene_mark", c4911a.f54242f);
        g.b(builder, "search_id", c4911a.f54243g);
        g.b(builder, "search_query", c4911a.h);
        RouteRequest routeRequestBuild = builder.build();
        BLog.d("switchEpisode isFromPlaylist request: " + routeRequestBuild);
        BLRouter.routeTo(routeRequestBuild, this.f90101a);
    }

    public final void b(long j7) {
        if (!this.f90102b.a()) {
            CheesePlayRepository cheesePlayRepository = this.f90103c;
            C4911a c4911a = cheesePlayRepository.f90677f;
            com.bilibili.ship.theseus.united.bean.b bVar = new com.bilibili.ship.theseus.united.bean.b(Long.valueOf(j7), (Long) null, (Long) null, c4911a.f54239c, c4911a.f54238b, (String) null, c4911a.f54241e, c4911a.f54242f, c4911a.f54243g, c4911a.h, String.valueOf(BizType.BIZ_TYPE_PUGV.ordinal()), 2086);
            InterfaceC7008a.C1258a c1258a = new InterfaceC7008a.C1258a(0L, null, 0L, c4911a.f54245j, c4911a.f54247l, null, c4911a.f54248m, null, null, null, null, null, 0L, false, 0, false, 65447);
            c1258a.m10991setTagpIAwiHE(com.bilibili.ship.theseus.united.bean.c.f98751a.a, bVar);
            InterfaceC7008a.c(cheesePlayRepository.f90685o, c1258a, null, null, null, false, 0, 30);
            return;
        }
        RouteRequest.Builder builder = new RouteRequest.Builder(C3751q.a(j7, "bilibili://cheese/season/"));
        g.b(builder, "season_id", String.valueOf(j7));
        C4911a c4911a2 = this.f90104d;
        g.b(builder, "csource", c4911a2.f54238b);
        g.b(builder, "bsource", c4911a2.f54239c);
        g.b(builder, MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_MSOURCE, c4911a2.f54240d);
        g.b(builder, "scene_tag", c4911a2.f54241e);
        g.b(builder, "scene_mark", c4911a2.f54242f);
        g.b(builder, "search_id", c4911a2.f54243g);
        g.b(builder, "search_query", c4911a2.h);
        RouteRequest routeRequestBuild = builder.build();
        BLog.d("switchSeason isFromPlaylist request: " + routeRequestBuild);
        BLRouter.routeTo(routeRequestBuild, this.f90101a);
    }
}
