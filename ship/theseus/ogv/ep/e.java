package com.bilibili.ship.theseus.ogv.ep;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.ogv.endpage.OgvEndPageService;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import com.bilibili.ship.theseus.united.page.playingarea.g;
import com.bilibili.ship.theseus.united.page.playingarea.i;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f92166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final h f92167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PageNestedScrollFusionRepository f92168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.continuousplay.a f92169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final OgvRestrictionLayerDriver f92170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final OgvEndPageService f92171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final i f92172g;

    @NotNull
    public final g h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final OgvEpisode f92173i;

    @Inject
    public e(@NotNull CoroutineScope coroutineScope, @NotNull h hVar, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository, @NotNull com.bilibili.ship.theseus.ogv.continuousplay.a aVar, @NotNull OgvRestrictionLayerDriver ogvRestrictionLayerDriver, @NotNull OgvEndPageService ogvEndPageService, @NotNull i iVar, @NotNull g gVar, @NotNull OgvEpisode ogvEpisode) {
        this.f92166a = coroutineScope;
        this.f92167b = hVar;
        this.f92168c = pageNestedScrollFusionRepository;
        this.f92169d = aVar;
        this.f92170e = ogvRestrictionLayerDriver;
        this.f92171f = ogvEndPageService;
        this.f92172g = iVar;
        this.h = gVar;
        this.f92173i = ogvEpisode;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new OgvPlayerBizService$collectVideoCompletion$1(this, null), 3, (Object) null);
    }
}
