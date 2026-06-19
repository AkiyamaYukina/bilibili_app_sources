package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/o.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class o implements Factory<tv.danmaku.biliplayerv2.service.v> {
    public static tv.danmaku.biliplayerv2.service.v a(PlayerContainer playerContainer) {
        PlayerServiceManager.Client client = new PlayerServiceManager.Client();
        return (tv.danmaku.biliplayerv2.service.v) Preconditions.checkNotNullFromProvides(c.a(PlayerServiceManager.ServiceDescriptor.Companion, Ki1.b.class, playerContainer.getPlayerServiceManager(), client, false));
    }
}
