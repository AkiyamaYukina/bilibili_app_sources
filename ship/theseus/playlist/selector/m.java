package com.bilibili.ship.theseus.playlist.selector;

import com.bilibili.ship.theseus.playlist.selector.k;
import com.bilibili.ship.theseus.playlist.uicomponent.PlaylistRecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/m.class */
public final class m implements PlaylistRecyclerView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f95903a;

    public m(k kVar) {
        this.f95903a = kVar;
    }

    @Override // com.bilibili.ship.theseus.playlist.uicomponent.PlaylistRecyclerView.a
    public final void a() {
    }

    @Override // com.bilibili.ship.theseus.playlist.uicomponent.PlaylistRecyclerView.a
    public final void b() {
        this.f95903a.f95882d.tryEmit(k.b.C0797b.f95886a);
    }

    @Override // com.bilibili.ship.theseus.playlist.uicomponent.PlaylistRecyclerView.a
    public final void c() {
        this.f95903a.f95882d.tryEmit(k.b.a.f95885a);
    }
}
