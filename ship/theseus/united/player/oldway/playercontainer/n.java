package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import com.bilibili.playerbizcommon.features.headset.PlayerHeadsetService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/n.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.PageScope")
@DaggerGenerated
@QualifierMetadata
public final class n implements Factory<PlayerHeadsetService> {
    public static PlayerHeadsetService a(PlayerContainer playerContainer) {
        PlayerServiceManager.Client client = new PlayerServiceManager.Client();
        return (PlayerHeadsetService) Preconditions.checkNotNullFromProvides((PlayerHeadsetService) c.a(PlayerServiceManager.ServiceDescriptor.Companion, PlayerHeadsetService.class, playerContainer.getPlayerServiceManager(), client, false));
    }
}
