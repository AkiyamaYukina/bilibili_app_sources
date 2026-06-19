package com.bilibili.playset.playlist.viewmodels;

import com.bilibili.okretro.BiliApiDataCallback;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/n.class */
public final class n extends BiliApiDataCallback<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlaylistViewModel f85593b;

    public n(PlaylistViewModel playlistViewModel) {
        this.f85593b = playlistViewModel;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(String str) {
        this.f85593b.f85530k.setValue(Boolean.TRUE);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        this.f85593b.f85530k.setValue(Boolean.FALSE);
    }
}
