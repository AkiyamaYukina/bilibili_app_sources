package com.bilibili.studio.kaleidoscope.sdk.montage;

import com.bilibili.montage.MontageLiveWindow;
import com.bilibili.studio.kaleidoscope.sdk.LiveWindow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/b.class */
public final class b implements MontageLiveWindow.VideoFrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LiveWindow.a f108421a;

    public b(LiveWindow.a aVar) {
        this.f108421a = aVar;
    }

    @Override // com.bilibili.montage.MontageLiveWindow.VideoFrameCallback
    public final void onVideoFrameRendered(MontageLiveWindow.VideoFrameInfo videoFrameInfo) {
        MonLiveWindowVideoFrameInfoImpl.box(videoFrameInfo);
        this.f108421a.a();
        throw null;
    }
}
