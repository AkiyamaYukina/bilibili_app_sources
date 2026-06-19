package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/T.class */
@StabilityInferred(parameters = 0)
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f103758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f103760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f103761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TheseusPlayerQualityService f103762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageReportService f103763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f103764g;

    @Inject
    public T(@NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull CoroutineScope coroutineScope, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull BackActionRepository backActionRepository, @NotNull TheseusPlayerQualityService theseusPlayerQualityService, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar) {
        this.f103758a = hVar;
        this.f103759b = coroutineScope;
        this.f103760c = theseusFloatLayerService;
        this.f103761d = backActionRepository;
        this.f103762e = theseusPlayerQualityService;
        this.f103763f = pageReportService;
        this.f103764g = cVar;
    }
}
