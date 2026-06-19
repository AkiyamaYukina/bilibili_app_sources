package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/y0.class */
@StabilityInferred(parameters = 0)
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f103985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f103986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IReporterService f103988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f103989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f103990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TheseusPlayerQualityService f103991g;

    @Inject
    public y0(@NotNull IPlayerCoreService iPlayerCoreService, @NotNull IControlContainerService iControlContainerService, @NotNull CoroutineScope coroutineScope, @NotNull IReporterService iReporterService, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull TheseusPlayerQualityService theseusPlayerQualityService) {
        this.f103985a = iPlayerCoreService;
        this.f103986b = iControlContainerService;
        this.f103987c = coroutineScope;
        this.f103988d = iReporterService;
        this.f103989e = absFunctionWidgetService;
        this.f103990f = hVar;
        this.f103991g = theseusPlayerQualityService;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r10, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r11, int r12) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.y0.a(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }
}
