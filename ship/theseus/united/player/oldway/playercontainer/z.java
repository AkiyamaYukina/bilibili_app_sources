package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/z.class */
public final class z implements tv.danmaku.biliplayerv2.service.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.ship.theseus.keel.player.h f104786a;

    public z(com.bilibili.ship.theseus.keel.player.h hVar) {
        this.f104786a = hVar;
    }

    public final int a(int i7) {
        Long lH;
        com.bilibili.ship.theseus.keel.player.j jVarJ = this.f104786a.j();
        return (jVarJ == null || (lH = jVarJ.h()) == null) ? 0 : (int) lH.longValue();
    }
}
