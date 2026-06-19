package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import tv.danmaku.biliplayerv2.service.IPlayerService;
import tv.danmaku.biliplayerv2.service.IPlayerServiceManager;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/c.class */
public final /* synthetic */ class c {
    public static IPlayerService a(PlayerServiceManager.ServiceDescriptor.Companion companion, Class cls, IPlayerServiceManager iPlayerServiceManager, PlayerServiceManager.Client client, boolean z6) {
        iPlayerServiceManager.bindService(companion.obtain(cls), client, z6);
        return client.getService();
    }
}
