package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/k.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.PageScope")
@DaggerGenerated
@QualifierMetadata
public final class k implements Factory<com.bilibili.app.gemini.player.feature.snapshot.y> {
    public static com.bilibili.app.gemini.player.feature.snapshot.y a(PlayerContainer playerContainer) {
        PlayerServiceManager.Client client = new PlayerServiceManager.Client();
        return (com.bilibili.app.gemini.player.feature.snapshot.y) Preconditions.checkNotNullFromProvides(c.a(PlayerServiceManager.ServiceDescriptor.Companion, com.bilibili.app.gemini.player.feature.snapshot.y.class, playerContainer.getPlayerServiceManager(), client, false));
    }
}
