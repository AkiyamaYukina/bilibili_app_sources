package com.bilibili.playset.playlist.viewmodels;

import com.bilibili.okretro.BiliApiDataCallback;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/i.class */
public final class i extends BiliApiDataCallback<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlaylistViewModel f85583b;

    public i(PlaylistViewModel playlistViewModel) {
        this.f85583b = playlistViewModel;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(String str) {
        this.f85583b.f85529j.setValue(new a(null, true));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        this.f85583b.f85529j.setValue(new a(th, false));
    }
}
