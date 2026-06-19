package com.bilibili.ship.theseus.playlist.di.episode.ugc;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.playlist.E;
import com.bilibili.ship.theseus.playlist.t;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/ugc/g.class */
@StabilityInferred(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final G f95555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final i f95556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final h f95557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f95558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final EpisodeExtraInfoRepository f95559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ChargeRepository f95560g;

    @NotNull
    public final InterfaceC6388m h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f95561i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final t f95562j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f95563k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final E f95564l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lifecycle f95565m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final u f95566n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final PageReportService f95567o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f95568p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f95569q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final C8043a f95570r;

    @Inject
    public g(@NotNull CoroutineScope coroutineScope, @NotNull G g7, @NotNull i iVar, @NotNull h hVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository, @NotNull ChargeRepository chargeRepository, @NotNull InterfaceC6388m interfaceC6388m, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull t tVar, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull E e7, @NotNull Lifecycle lifecycle, @NotNull u uVar, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar2, @NotNull C8043a c8043a) {
        this.f95554a = coroutineScope;
        this.f95555b = g7;
        this.f95556c = iVar;
        this.f95557d = hVar;
        this.f95558e = aVar;
        this.f95559f = episodeExtraInfoRepository;
        this.f95560g = chargeRepository;
        this.h = interfaceC6388m;
        this.f95561i = theseusFloatLayerService;
        this.f95562j = tVar;
        this.f95563k = cVar;
        this.f95564l = e7;
        this.f95565m = lifecycle;
        this.f95566n = uVar;
        this.f95567o = pageReportService;
        this.f95568p = dVar;
        this.f95569q = aVar2;
        this.f95570r = c8043a;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistUGCRestrictionLayerDriver$collectVideoCompletion$1(this, null), 3, (Object) null);
    }
}
