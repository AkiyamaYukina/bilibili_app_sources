package com.bilibili.ship.theseus.united.page.toolbar;

import tv.danmaku.biliplayerv2.PlayerContainerKt;
import tv.danmaku.biliplayerv2.service.VideoDirectorObserver;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/C.class */
public final class C implements com.bilibili.playerbizcommon.features.subtitle.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuService f103224a;

    public C(MenuService menuService) {
        this.f103224a = menuService;
    }

    @Override // com.bilibili.playerbizcommon.features.subtitle.a
    public final void a(Object obj, String str) {
        this.f103224a.f103251j.putBoolean(str, ((Boolean) obj).booleanValue());
    }

    @Override // com.bilibili.playerbizcommon.features.subtitle.a
    public final void addVideoDirectorObserver(VideoDirectorObserver videoDirectorObserver) {
        PlayerContainerKt.getPlayDirector(this.f103224a.f103255n).addVideoDirectorObserver(videoDirectorObserver);
    }

    @Override // com.bilibili.playerbizcommon.features.subtitle.a
    public final Object c(String str) {
        return Boolean.valueOf(this.f103224a.f103251j.getBoolean(str, Boolean.FALSE.booleanValue()));
    }

    @Override // com.bilibili.playerbizcommon.features.subtitle.a
    public final void d(NeuronsEvents.NormalEvent normalEvent) {
        this.f103224a.f103253l.report(normalEvent);
    }

    @Override // com.bilibili.playerbizcommon.features.subtitle.a
    public final IInteractLayerService getInteractLayerService() {
        return this.f103224a.f103252k;
    }

    @Override // com.bilibili.playerbizcommon.features.subtitle.a
    public final void removeVideoDirectorObserver(VideoDirectorObserver videoDirectorObserver) {
        PlayerContainerKt.getPlayDirector(this.f103224a.f103255n).removeVideoDirectorObserver(videoDirectorObserver);
    }
}
