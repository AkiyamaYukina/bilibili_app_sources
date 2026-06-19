package com.bilibili.ship.theseus.ogv.intro.floatlayer.service;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/i.class */
@StabilityInferred(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f93003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FragmentManager f93004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f93005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final b f93006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final c f93007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageReportService f93008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final OgvSeason f93009g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f93010i;

    @Inject
    public i(@NotNull CoroutineScope coroutineScope, @NotNull FragmentManager fragmentManager, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull b bVar, @NotNull c cVar, @NotNull PageReportService pageReportService, @NotNull OgvSeason ogvSeason, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f93003a = coroutineScope;
        this.f93004b = fragmentManager;
        this.f93005c = theseusFloatLayerService;
        this.f93006d = bVar;
        this.f93007e = cVar;
        this.f93008f = pageReportService;
        this.f93009g = ogvSeason;
        this.h = gVar;
        this.f93010i = introContentSizeRepository;
    }

    public static void a(i iVar) {
        iVar.getClass();
        BuildersKt.launch$default(iVar.f93003a, (CoroutineContext) null, (CoroutineStart) null, new ShowOgvInfoAndReviewLayer$invoke$1(iVar, 0, null), 3, (Object) null);
    }
}
