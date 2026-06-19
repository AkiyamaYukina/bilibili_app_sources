package com.bilibili.ship.theseus.ugc.miniplayer;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.ugc.episode.c;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
import com.bilibili.ship.theseus.united.page.miniplayer.b;
import com.bilibili.ship.theseus.united.page.miniplayer.f;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import ev0.j;
import java.util.List;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/miniplayer/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlayerContainer f97972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final h f97973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f97974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final b f97975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<C6353o> f97976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<Av0.a> f97977g;

    @NotNull
    public final j h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final f f97978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final PageReportService f97979j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final C7893a f97980k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final C8043a f97981l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f97982m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonDetailRepository f97983n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final c f97984o;

    @Inject
    public a(@NotNull CoroutineScope coroutineScope, @NotNull PlayerContainer playerContainer, @NotNull h hVar, @NotNull ComponentActivity componentActivity, @NotNull b bVar, @NotNull List list, @NotNull List list2, @NotNull j jVar, @NotNull f fVar, @NotNull PageReportService pageReportService, @NotNull C7893a c7893a, @NotNull C8043a c8043a, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull UnitedSeasonDetailRepository unitedSeasonDetailRepository, @NotNull c cVar) {
        this.f97971a = coroutineScope;
        this.f97972b = playerContainer;
        this.f97973c = hVar;
        this.f97974d = componentActivity;
        this.f97975e = bVar;
        this.f97976f = list;
        this.f97977g = list2;
        this.h = jVar;
        this.f97978i = fVar;
        this.f97979j = pageReportService;
        this.f97980k = c7893a;
        this.f97981l = c8043a;
        this.f97982m = iPlayerCoreService;
        this.f97983n = unitedSeasonDetailRepository;
        this.f97984o = cVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new UGCMiniPlayerService$1(this, null), 3, (Object) null);
    }
}
