package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/j.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.PageScope")
@DaggerGenerated
@QualifierMetadata
public final class j implements Factory<com.bilibili.app.gemini.share.d> {
    public static com.bilibili.app.gemini.share.d a(PlayerContainer playerContainer) {
        PlayerServiceManager.Client client = new PlayerServiceManager.Client();
        return (com.bilibili.app.gemini.share.d) Preconditions.checkNotNullFromProvides(c.a(PlayerServiceManager.ServiceDescriptor.Companion, com.bilibili.app.gemini.share.d.class, playerContainer.getPlayerServiceManager(), client, false));
    }
}
