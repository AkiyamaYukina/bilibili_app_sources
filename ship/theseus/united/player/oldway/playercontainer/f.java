package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import com.bilibili.playerbizcommon.features.background.BackgroundPlayService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/f.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.PageScope")
@DaggerGenerated
@QualifierMetadata
public final class f implements Factory<BackgroundPlayService> {
    public static BackgroundPlayService a(PlayerContainer playerContainer) {
        PlayerServiceManager.Client client = new PlayerServiceManager.Client();
        return (BackgroundPlayService) Preconditions.checkNotNullFromProvides((BackgroundPlayService) c.a(PlayerServiceManager.ServiceDescriptor.Companion, BackgroundPlayService.class, playerContainer.getPlayerServiceManager(), client, false));
    }
}
