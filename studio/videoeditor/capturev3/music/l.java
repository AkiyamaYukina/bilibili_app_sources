package com.bilibili.studio.videoeditor.capturev3.music;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.studio.videoeditor.bgm.BgmDynamic;
import java.util.List;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/l.class */
public final class l extends BiliApiDataCallback<BgmDynamic> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f109275b;

    public l(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f109275b = cancellableContinuationImpl;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(BgmDynamic bgmDynamic) {
        String str;
        List<String> list;
        BgmDynamic bgmDynamic2 = bgmDynamic;
        CancellableContinuationImpl cancellableContinuationImpl = this.f109275b;
        if (bgmDynamic2 == null || (list = bgmDynamic2.cdns) == null) {
            str = null;
        } else {
            if (list.size() <= 0) {
                return;
            }
            Result.Companion companion = Result.Companion;
            str = list.get(0);
        }
        cancellableContinuationImpl.resumeWith(Result.constructor-impl(str));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        this.f109275b.resumeWith(Result.constructor-impl((Object) null));
    }
}
