package com.bilibili.ship.theseus.playlist;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/s.class */
@StabilityInferred(parameters = 0)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f95835a;

    @Inject
    public s(@NotNull PlaylistRepository playlistRepository, @NotNull IPlayerCoreService iPlayerCoreService) {
        this.f95835a = iPlayerCoreService;
        if (playlistRepository.f95092O) {
            iPlayerCoreService.setProjectionScreenAvailable(false);
        }
    }
}
