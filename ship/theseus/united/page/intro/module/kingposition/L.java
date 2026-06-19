package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/L.class */
public final class L implements KingPositionService.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6289c f100444a;

    public L(C6289c c6289c) {
        this.f100444a = c6289c;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService.b
    public final O a() {
        H h;
        C6289c c6289c = this.f100444a;
        return (c6289c == null || (h = c6289c.f100463f) == null) ? null : h.f100222a;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService.b
    public final String getLikeAnimation() {
        H h;
        C6289c c6289c = this.f100444a;
        return (c6289c == null || (h = c6289c.f100463f) == null) ? null : h.f100223b;
    }
}
