package com.bilibili.ship.theseus.united.page.weblayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.player.feature.zoom.ZoomContainerService;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/B.class */
@StabilityInferred(parameters = 0)
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final WebFloatLayerService f104130a;

    @Inject
    public B(@NotNull ZoomContainerService zoomContainerService, @NotNull WebFloatLayerService webFloatLayerService) {
        this.f104130a = webFloatLayerService;
        zoomContainerService.p = new com.bilibili.ad.adview.pegasus.holders.card41.e(this, 2);
    }
}
