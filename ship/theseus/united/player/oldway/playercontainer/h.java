package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import com.bilibili.playerbizcommonv2.danmaku.postpanel.DanmakuTimerService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/h.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.PageScope")
@DaggerGenerated
@QualifierMetadata
public final class h implements Factory<DanmakuTimerService> {
    public static DanmakuTimerService a(PlayerContainer playerContainer) {
        PlayerServiceManager.Client client = new PlayerServiceManager.Client();
        return (DanmakuTimerService) Preconditions.checkNotNullFromProvides((DanmakuTimerService) c.a(PlayerServiceManager.ServiceDescriptor.Companion, DanmakuTimerService.class, playerContainer.getPlayerServiceManager(), client, false));
    }
}
