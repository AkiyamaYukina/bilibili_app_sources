package com.bilibili.playset.playlist.viewmodels;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.playset.api.MultitypePlaylist;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/u.class */
public final class u extends BiliApiDataCallback<MultitypePlaylist.Info> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlaylistViewModelV2 f85605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f85606c;

    public u(PlaylistViewModelV2 playlistViewModelV2, boolean z6) {
        this.f85605b = playlistViewModelV2;
        this.f85606c = z6;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(MultitypePlaylist.Info info) {
        MultitypePlaylist.Info info2 = info;
        if (info2 != null) {
            PlaylistViewModelV2 playlistViewModelV2 = this.f85605b;
            Integer value = playlistViewModelV2.f85548j.getValue();
            if (value != null && value.intValue() == 3) {
                return;
            }
            Math.ceil(((double) info2.mediaCount) / 1000.0d);
            playlistViewModelV2.f85544e.setValue(info2);
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        if (this.f85606c) {
            this.f85605b.f85548j.setValue(3);
        }
    }
}
