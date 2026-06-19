package com.bilibili.music.podcast.data;

import com.bapis.bilibili.app.listener.v1.FavFolderDetailResp;
import com.bilibili.music.podcast.collection.api.PlaySetGroups;
import kotlin.TuplesKt;
import li0.C7860c;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/l.class */
public final class l extends com.bilibili.music.podcast.moss.a<FavFolderDetailResp, FavFolderDetailResp> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MusicCollectionViewModel f66475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlaySetGroups f66476c;

    public l(MusicCollectionViewModel musicCollectionViewModel, PlaySetGroups playSetGroups) {
        this.f66475b = musicCollectionViewModel;
        this.f66476c = playSetGroups;
    }

    @Override // com.bilibili.music.podcast.moss.a
    public final FavFolderDetailResp d(FavFolderDetailResp favFolderDetailResp) {
        return favFolderDetailResp;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(Object obj) {
        FavFolderDetailResp favFolderDetailResp = (FavFolderDetailResp) obj;
        if (favFolderDetailResp == null) {
            BLog.d("FavFolderListResp has no data !");
            return;
        }
        PlaySetGroups playSetGroups = this.f66476c;
        PlaySetGroups.DefaultFolderGroup defaultFolderGroup = playSetGroups.defaultFolderGroup;
        if (defaultFolderGroup != null) {
            C7860c.a(favFolderDetailResp, defaultFolderGroup);
        }
        this.f66475b.f66418b.setValue(TuplesKt.to(1, playSetGroups));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        String message = null;
        this.f66475b.f66418b.setValue(TuplesKt.to(2, (Object) null));
        if (th != null) {
            message = th.getMessage();
        }
        BLog.i("MusicCollectionViewModel", message);
    }
}
