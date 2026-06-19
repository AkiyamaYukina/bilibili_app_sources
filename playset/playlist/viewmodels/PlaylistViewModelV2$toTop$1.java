package com.bilibili.playset.playlist.viewmodels;

import androidx.lifecycle.ViewModelKt;
import com.bilibili.okretro.BiliApiDataCallback;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/PlaylistViewModelV2$toTop$1.class */
public final class PlaylistViewModelV2$toTop$1 extends BiliApiDataCallback<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlaylistViewModelV2 f85566b;

    public PlaylistViewModelV2$toTop$1(PlaylistViewModelV2 playlistViewModelV2) {
        this.f85566b = playlistViewModelV2;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(String str) {
        PlaylistViewModelV2 playlistViewModelV2 = this.f85566b;
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(playlistViewModelV2), (CoroutineContext) null, (CoroutineStart) null, new PlaylistViewModelV2$toTop$1$onDataSuccess$1(playlistViewModelV2, null), 3, (Object) null);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        PlaylistViewModelV2 playlistViewModelV2 = this.f85566b;
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(playlistViewModelV2), (CoroutineContext) null, (CoroutineStart) null, new PlaylistViewModelV2$toTop$1$onError$1(playlistViewModelV2, null), 3, (Object) null);
    }
}
