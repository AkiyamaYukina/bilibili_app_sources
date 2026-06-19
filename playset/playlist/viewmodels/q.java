package com.bilibili.playset.playlist.viewmodels;

import com.bilibili.okretro.BaseResponse;
import com.bilibili.okretro.BiliApiDataCallback;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/q.class */
public final class q extends BiliApiDataCallback<BaseResponse> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f85600b;

    public q(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f85600b = cancellableContinuationImpl;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(BaseResponse baseResponse) {
        Result.Companion companion = Result.Companion;
        this.f85600b.resumeWith(Result.constructor-impl(Boolean.TRUE));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        Result.Companion companion = Result.Companion;
        this.f85600b.resumeWith(Result.constructor-impl(Boolean.FALSE));
    }
}
