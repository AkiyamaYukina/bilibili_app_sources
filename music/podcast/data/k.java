package com.bilibili.music.podcast.data;

import android.os.Bundle;
import com.bapis.bilibili.app.listener.v1.FavItemDelResp;
import kotlin.TuplesKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/k.class */
public final class k extends com.bilibili.music.podcast.moss.a<FavItemDelResp, FavItemDelResp> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MusicCollectionViewModel f66473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f66474c;

    public k(MusicCollectionViewModel musicCollectionViewModel, Bundle bundle) {
        this.f66473b = musicCollectionViewModel;
        this.f66474c = bundle;
    }

    @Override // com.bilibili.music.podcast.moss.a
    public final FavItemDelResp d(FavItemDelResp favItemDelResp) {
        return favItemDelResp;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(Object obj) {
        if (((FavItemDelResp) obj) == null) {
            onError(new IllegalArgumentException("response message is null after deleting default favorite item "));
        } else {
            this.f66473b.f66420d.setValue(TuplesKt.to(1, this.f66474c));
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        BLog.w("MusicCollectionViewModel", th != null ? th.getMessage() : null);
        this.f66473b.f66420d.setValue(TuplesKt.to(2, this.f66474c));
    }
}
