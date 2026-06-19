package com.bilibili.studio.videoeditor.capturev3.music;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.studio.videoeditor.capturev3.data.MusicDetailsEntry;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/m.class */
public final class m extends BiliApiDataCallback<MusicDetailsEntry> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f109276b;

    public m(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f109276b = cancellableContinuationImpl;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(MusicDetailsEntry musicDetailsEntry) {
        MusicDetailsEntry musicDetailsEntry2 = musicDetailsEntry;
        Result.Companion companion = Result.Companion;
        this.f109276b.resumeWith(Result.constructor-impl(musicDetailsEntry2 != null ? musicDetailsEntry2.lyric_url : null));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        this.f109276b.resumeWith(Result.constructor-impl((Object) null));
    }
}
