package com.bilibili.playset.playlist.viewmodels;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.playset.api.MultitypePlaylist;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/k.class */
public final class k extends BiliApiDataCallback<MultitypePlaylist.Info> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlaylistViewModel f85588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f85589c;

    public k(PlaylistViewModel playlistViewModel, boolean z6) {
        this.f85588b = playlistViewModel;
        this.f85589c = z6;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(MultitypePlaylist.Info info) {
        MultitypePlaylist.Info info2 = info;
        if (info2 != null) {
            PlaylistViewModel playlistViewModel = this.f85588b;
            Integer value = playlistViewModel.f85531l.getValue();
            if (value != null && value.intValue() == 3) {
                return;
            }
            playlistViewModel.f85525e = (int) Math.ceil(((double) info2.mediaCount) / 1000.0d);
            playlistViewModel.f85527g.setValue(info2);
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        if (this.f85589c) {
            this.f85588b.f85531l.setValue(3);
        }
    }
}
