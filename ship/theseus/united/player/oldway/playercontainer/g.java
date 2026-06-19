package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import com.bilibili.playerbizcommonv2.service.DanmakuInputWindowService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/g.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.PageScope")
@DaggerGenerated
@QualifierMetadata
public final class g implements Factory<DanmakuInputWindowService> {
    public static DanmakuInputWindowService a(PlayerContainer playerContainer) {
        PlayerServiceManager.Client client = new PlayerServiceManager.Client();
        return (DanmakuInputWindowService) Preconditions.checkNotNullFromProvides((DanmakuInputWindowService) c.a(PlayerServiceManager.ServiceDescriptor.Companion, DanmakuInputWindowService.class, playerContainer.getPlayerServiceManager(), client, false));
    }
}
