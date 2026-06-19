package com.bilibili.ship.theseus.ugc.weblayer;

import com.bilibili.app.comm.IJsBridgeBehavior;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/i.class */
public final class i implements IJsBridgeBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NoteFloatLayerService f98686a;

    public i(NoteFloatLayerService noteFloatLayerService) {
        this.f98686a = noteFloatLayerService;
    }

    public final boolean isDestroyed() {
        return this.f98686a.f98616v;
    }

    public final void release() {
    }
}
