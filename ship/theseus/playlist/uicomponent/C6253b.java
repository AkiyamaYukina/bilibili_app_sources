package com.bilibili.ship.theseus.playlist.uicomponent;

import com.bilibili.app.comm.supermenu.SuperMenu;
import com.bilibili.app.comm.supermenu.share.v2.SharePanelShowCallback;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/b.class */
public final class C6253b implements SharePanelShowCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6254c f96020a;

    public C6253b(C6254c c6254c) {
        this.f96020a = c6254c;
    }

    public final boolean onShowFailed(int i7, String str) {
        return false;
    }

    public final void onShowSuccess(SuperMenu superMenu) {
        this.f96020a.getClass();
    }
}
