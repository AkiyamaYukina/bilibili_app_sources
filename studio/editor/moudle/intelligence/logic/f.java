package com.bilibili.studio.editor.moudle.intelligence.logic;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.studio.videoeditor.capturev3.data.BgmMissionInfo;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/logic/f.class */
public final class f extends BiliApiDataCallback<BgmMissionInfo> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f107352b;

    public f(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f107352b = cancellableContinuationImpl;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(BgmMissionInfo bgmMissionInfo) {
        this.f107352b.resumeWith(Result.constructor-impl(bgmMissionInfo));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        this.f107352b.resumeWith(Result.constructor-impl((Object) null));
    }
}
