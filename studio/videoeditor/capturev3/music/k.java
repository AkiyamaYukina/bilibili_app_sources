package com.bilibili.studio.videoeditor.capturev3.music;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.studio.videoeditor.capturev3.data.BgmMissionInfo;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/k.class */
public final class k extends BiliApiDataCallback<BgmMissionInfo> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f109274b;

    public k(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f109274b = cancellableContinuationImpl;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(BgmMissionInfo bgmMissionInfo) {
        BgmMissionInfo bgmMissionInfo2 = bgmMissionInfo;
        this.f109274b.resumeWith(Result.constructor-impl(Long.valueOf(bgmMissionInfo2 != null ? bgmMissionInfo2.recommend_point : 0L)));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        Result.Companion companion = Result.Companion;
        this.f109274b.resumeWith(Result.constructor-impl(0L));
    }
}
