package com.bilibili.ship.theseus.united.page.weblayer;

import com.bilibili.app.comm.IJsBridgeBehavior;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/c.class */
public final class c implements IJsBridgeBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BgmFloatLayerService f104247a;

    public c(BgmFloatLayerService bgmFloatLayerService) {
        this.f104247a = bgmFloatLayerService;
    }

    public final boolean isDestroyed() {
        return this.f104247a.f104148s;
    }

    public final void release() {
    }
}
