package com.bilibili.player.tangram.playercore;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/i.class */
public final class i implements tv.danmaku.biliplayerv2.service.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PCSFacadeImpl f79447a;

    public i(PCSFacadeImpl pCSFacadeImpl) {
        this.f79447a = pCSFacadeImpl;
    }

    public final void c(int i7, int i8, boolean z6, boolean z7) {
        if (z6) {
            this.f79447a.Q(i8);
        }
    }

    public final void d(int i7) {
        if (i7 > 0) {
            this.f79447a.Q(i7);
        }
    }
}
