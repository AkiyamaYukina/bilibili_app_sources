package com.bilibili.playset.playlist.viewmodels;

import com.bilibili.okretro.BiliApiDataCallback;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/l.class */
public final class l extends BiliApiDataCallback<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlaylistViewModel f85591c;

    public l(int i7, PlaylistViewModel playlistViewModel) {
        this.f85590b = i7;
        this.f85591c = playlistViewModel;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(String str) {
        PlaylistViewModel playlistViewModel = this.f85591c;
        int i7 = this.f85590b;
        if (i7 == 1) {
            playlistViewModel.h.setValue(Boolean.TRUE);
        } else if (i7 == 2) {
            playlistViewModel.f85528i.setValue(Boolean.TRUE);
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        PlaylistViewModel playlistViewModel = this.f85591c;
        int i7 = this.f85590b;
        if (i7 == 1) {
            playlistViewModel.h.setValue(Boolean.FALSE);
        } else if (i7 == 2) {
            playlistViewModel.f85528i.setValue(Boolean.FALSE);
        }
    }
}
