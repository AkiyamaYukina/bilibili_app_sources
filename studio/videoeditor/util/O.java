package com.bilibili.studio.videoeditor.util;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.studio.videoeditor.bgm.BgmDynamic;
import java.util.List;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/O.class */
public final class O extends BiliApiDataCallback<BgmDynamic> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f110211b;

    public O(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f110211b = cancellableContinuationImpl;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(BgmDynamic bgmDynamic) {
        String str;
        List<String> list;
        BgmDynamic bgmDynamic2 = bgmDynamic;
        CancellableContinuationImpl cancellableContinuationImpl = this.f110211b;
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
        this.f110211b.resumeWith(Result.constructor-impl((Object) null));
    }
}
