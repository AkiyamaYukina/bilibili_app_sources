package com.bilibili.ship.theseus.playlist.uicomponent;

import com.bilibili.ship.theseus.playlist.uicomponent.D;
import com.bilibili.ship.theseus.playlist.uicomponent.PlaylistRecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/K.class */
public final class K implements PlaylistRecyclerView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f96000a;

    public K(D d7) {
        this.f96000a = d7;
    }

    @Override // com.bilibili.ship.theseus.playlist.uicomponent.PlaylistRecyclerView.a
    public final void a() {
        this.f96000a.f95930e.tryEmit(D.c.a.f95945a);
    }

    @Override // com.bilibili.ship.theseus.playlist.uicomponent.PlaylistRecyclerView.a
    public final void b() {
        this.f96000a.f95933i.tryEmit(D.a.b.f95941a);
    }

    @Override // com.bilibili.ship.theseus.playlist.uicomponent.PlaylistRecyclerView.a
    public final void c() {
        this.f96000a.f95933i.tryEmit(D.a.C0799a.f95940a);
    }
}
