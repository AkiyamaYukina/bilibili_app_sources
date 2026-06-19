package com.bilibili.ship.theseus.ugc.intro.ugcseason;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import tv.danmaku.bili.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/f.class */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f97486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f97487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f97488c;

    public f(d dVar, RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f97486a = dVar;
        this.f97487b = recyclerView;
        this.f97488c = recyclerView2;
    }

    @Override // com.bilibili.ship.theseus.ugc.intro.ugcseason.a
    public final void a() {
        d.c(this.f97486a, this.f97487b);
    }

    @Override // com.bilibili.ship.theseus.ugc.intro.ugcseason.a
    public final void b() {
        RecyclerView.LayoutManager layoutManager = this.f97488c.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(this.f97486a.f97470a.f97493d.element, 0);
        }
    }
}
