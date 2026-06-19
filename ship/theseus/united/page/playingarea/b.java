package com.bilibili.ship.theseus.united.page.playingarea;

import com.bilibili.ship.theseus.united.widget.AppBarScrollObserverBehavior;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/b.class */
public final class b implements AppBarScrollObserverBehavior.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PageNestedScrollFusionRepository f102358a;

    public b(PageNestedScrollFusionRepository pageNestedScrollFusionRepository) {
        this.f102358a = pageNestedScrollFusionRepository;
    }

    @Override // com.bilibili.ship.theseus.united.widget.AppBarScrollObserverBehavior.a
    public final void a() {
        this.f102358a.f102263o = false;
    }

    @Override // com.bilibili.ship.theseus.united.widget.AppBarScrollObserverBehavior.a
    public final void onScrollStart() {
        this.f102358a.f102263o = true;
    }
}
