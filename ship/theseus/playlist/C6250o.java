package com.bilibili.ship.theseus.playlist;

import com.bilibili.app.comm.supermenu.share.v2.ShareCallback;
import com.bilibili.ship.theseus.playlist.api.PlaylistInfo;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/o.class */
public final class C6250o implements ShareCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6241f f95777a;

    public C6250o(C6241f c6241f) {
        this.f95777a = c6241f;
    }

    public final boolean onShareCancel(String str, int i7) {
        return false;
    }

    public final boolean onShareFail(String str, int i7, String str2) {
        return false;
    }

    public final boolean onShareSuccess(String str, String str2) {
        MutableStateFlow<PlaylistInfo> mutableStateFlow;
        Object value;
        PlaylistRepository playlistRepository = this.f95777a.f95748d;
        do {
            mutableStateFlow = playlistRepository.f95101i;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ((PlaylistInfo) value).h()));
        return false;
    }
}
