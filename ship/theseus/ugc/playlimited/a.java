package com.bilibili.ship.theseus.ugc.playlimited;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.ugc.play.schedule.UGCEpisodeListRepository;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import com.bilibili.ship.theseus.united.page.charge.ChargeRepository;
import com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.playingarea.i;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.G;
import com.bilibili.ship.theseus.united.page.restrictionlayer.InterfaceC6388m;
import com.bilibili.ship.theseus.united.page.tab.u;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playlimited/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final G f98368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final i f98369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final h f98370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f98371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final EpisodeExtraInfoRepository f98372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lifecycle f98373g;

    @NotNull
    public final ChargeRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final InterfaceC6388m f98374i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f98375j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f98376k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final UGCPlaybackRepository f98377l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final UGCEpisodeListRepository f98378m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final u f98379n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final PageReportService f98380o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f98381p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f98382q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final C8043a f98383r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final PageAdRepository f98384s;

    @Inject
    public a(@NotNull CoroutineScope coroutineScope, @NotNull G g7, @NotNull i iVar, @NotNull h hVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository, @NotNull Lifecycle lifecycle, @NotNull ChargeRepository chargeRepository, @NotNull InterfaceC6388m interfaceC6388m, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull UGCPlaybackRepository uGCPlaybackRepository, @NotNull UGCEpisodeListRepository uGCEpisodeListRepository, @NotNull u uVar, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar2, @NotNull C8043a c8043a, @NotNull PageAdRepository pageAdRepository) {
        this.f98367a = coroutineScope;
        this.f98368b = g7;
        this.f98369c = iVar;
        this.f98370d = hVar;
        this.f98371e = aVar;
        this.f98372f = episodeExtraInfoRepository;
        this.f98373g = lifecycle;
        this.h = chargeRepository;
        this.f98374i = interfaceC6388m;
        this.f98375j = theseusFloatLayerService;
        this.f98376k = cVar;
        this.f98377l = uGCPlaybackRepository;
        this.f98378m = uGCEpisodeListRepository;
        this.f98379n = uVar;
        this.f98380o = pageReportService;
        this.f98381p = dVar;
        this.f98382q = aVar2;
        this.f98383r = c8043a;
        this.f98384s = pageAdRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new UGCEpisodeRestrictionLayerService$collectVideoCompletion$1(this, null), 3, (Object) null);
    }
}
