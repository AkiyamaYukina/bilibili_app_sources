package com.bilibili.playset.playlist.viewmodels;

import com.bilibili.okretro.BiliApiDataCallback;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/v.class */
public final class v extends BiliApiDataCallback<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlaylistViewModelV2 f85608c;

    public v(int i7, PlaylistViewModelV2 playlistViewModelV2) {
        this.f85607b = i7;
        this.f85608c = playlistViewModelV2;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(String str) {
        PlaylistViewModelV2 playlistViewModelV2 = this.f85608c;
        int i7 = this.f85607b;
        if (i7 == 1) {
            playlistViewModelV2.f85545f.setValue(Boolean.TRUE);
        } else if (i7 == 2) {
            playlistViewModelV2.f85546g.setValue(Boolean.TRUE);
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        PlaylistViewModelV2 playlistViewModelV2 = this.f85608c;
        int i7 = this.f85607b;
        if (i7 == 1) {
            playlistViewModelV2.f85545f.setValue(Boolean.FALSE);
        } else if (i7 == 2) {
            playlistViewModelV2.f85546g.setValue(Boolean.FALSE);
        }
    }
}
