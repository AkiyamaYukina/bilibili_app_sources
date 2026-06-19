package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/e.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.PageScope")
@DaggerGenerated
@QualifierMetadata
public final class e implements Factory<Fr0.j> {
    public static Fr0.j a(PlayerContainer playerContainer) {
        PlayerServiceManager.Client client = new PlayerServiceManager.Client();
        return (Fr0.j) Preconditions.checkNotNullFromProvides((Fr0.j) c.a(PlayerServiceManager.ServiceDescriptor.Companion, Fr0.j.class, playerContainer.getPlayerServiceManager(), client, false));
    }
}
