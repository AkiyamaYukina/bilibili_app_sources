package com.bilibili.ship.theseus.playlist.di.biz;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/d.class */
public final class d extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f95367a;

    public d(e eVar) {
        this.f95367a = eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
        e eVar = this.f95367a;
        if (i7 == 0) {
            eVar.f95369b.b(this);
        } else {
            eVar.f95369b.a(this);
        }
    }
}
