package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/i.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.PageScope")
@DaggerGenerated
@QualifierMetadata
public final class i implements Factory<Er0.a> {
    public static Er0.a a(PlayerContainer playerContainer) {
        PlayerServiceManager.Client client = new PlayerServiceManager.Client();
        return (Er0.a) Preconditions.checkNotNullFromProvides((Er0.a) c.a(PlayerServiceManager.ServiceDescriptor.Companion, Er0.a.class, playerContainer.getPlayerServiceManager(), client, false));
    }
}
