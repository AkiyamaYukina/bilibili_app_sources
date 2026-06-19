package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import com.bilibili.playerbizcommon.gesture.GestureService;
import com.bilibili.playerbizcommon.gesture.IGestureService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/l.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.PageScope")
@DaggerGenerated
@QualifierMetadata
public final class l implements Factory<IGestureService> {
    public static IGestureService a(PlayerContainer playerContainer) {
        PlayerServiceManager.Client client = new PlayerServiceManager.Client();
        return (IGestureService) Preconditions.checkNotNullFromProvides((IGestureService) c.a(PlayerServiceManager.ServiceDescriptor.Companion, GestureService.class, playerContainer.getPlayerServiceManager(), client, false));
    }
}
