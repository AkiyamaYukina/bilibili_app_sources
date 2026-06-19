package com.bilibili.ship.theseus.playlist.di.media;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;
import tv.danmaku.videoplayer.core.videoview.AspectRatio;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/media/a.class */
@StabilityInferred(parameters = 1)
public final class a {
    @Inject
    public a(@NotNull IRenderContainerService iRenderContainerService) {
        iRenderContainerService.setAspectRatio(AspectRatio.RATIO_ADJUST_CONTENT);
    }
}
