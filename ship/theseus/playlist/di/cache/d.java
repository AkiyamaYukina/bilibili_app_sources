package com.bilibili.ship.theseus.playlist.di.cache;

import com.bilibili.ship.theseus.playlist.D;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.toolbar.MenuService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/cache/d.class */
public final class d implements MenuService.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlaylistRepository f95405a;

    public d(PlaylistRepository playlistRepository) {
        this.f95405a = playlistRepository;
    }

    @Override // com.bilibili.ship.theseus.united.page.toolbar.MenuService.a
    public final long getAvid() {
        return this.f95405a.c().f95137a.d();
    }

    @Override // com.bilibili.ship.theseus.united.page.toolbar.MenuService.a
    public final BusinessType getBusinessType() {
        return D.a(this.f95405a.c().f95137a);
    }

    @Override // com.bilibili.ship.theseus.united.page.toolbar.MenuService.a
    public final long getCid() {
        Ou0.c cVar = this.f95405a.c().f95138b;
        return cVar != null ? cVar.f18089b : 0L;
    }
}
