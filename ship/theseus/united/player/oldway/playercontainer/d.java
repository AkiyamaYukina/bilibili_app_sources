package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import com.bilibili.playerbizcommonv2.service.ai.PlayerAiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/d.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.PageScope")
@DaggerGenerated
@QualifierMetadata
public final class d implements Factory<com.bilibili.playerbizcommonv2.service.ai.a> {
    public static com.bilibili.playerbizcommonv2.service.ai.a a(PlayerContainer playerContainer) {
        PlayerServiceManager.Client client = new PlayerServiceManager.Client();
        return (com.bilibili.playerbizcommonv2.service.ai.a) Preconditions.checkNotNullFromProvides((com.bilibili.playerbizcommonv2.service.ai.a) c.a(PlayerServiceManager.ServiceDescriptor.Companion, PlayerAiService.class, playerContainer.getPlayerServiceManager(), client, false));
    }
}
