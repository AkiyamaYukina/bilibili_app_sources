package com.bilibili.playset.playlist.viewmodels;

import com.bilibili.okretro.BiliApiDataCallback;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/t.class */
public final class t extends BiliApiDataCallback<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlaylistViewModelV2 f85604b;

    public t(PlaylistViewModelV2 playlistViewModelV2) {
        this.f85604b = playlistViewModelV2;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(String str) {
        this.f85604b.h.setValue(new b(null, true));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        this.f85604b.h.setValue(new b(th, false));
    }
}
