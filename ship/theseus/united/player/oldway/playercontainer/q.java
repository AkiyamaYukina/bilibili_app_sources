package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.report.statistics.StatisticsService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/q.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.PageScope")
@DaggerGenerated
@QualifierMetadata
public final class q implements Factory<tv.danmaku.biliplayerv2.service.report.statistics.a> {
    public static tv.danmaku.biliplayerv2.service.report.statistics.a a(PlayerContainer playerContainer) {
        PlayerServiceManager.Client client = new PlayerServiceManager.Client();
        return (tv.danmaku.biliplayerv2.service.report.statistics.a) Preconditions.checkNotNullFromProvides(c.a(PlayerServiceManager.ServiceDescriptor.Companion, StatisticsService.class, playerContainer.getPlayerServiceManager(), client, false));
    }
}
