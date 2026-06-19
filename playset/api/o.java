package com.bilibili.playset.api;

import com.bilibili.okretro.BiliApiDataCallback;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/o.class */
public final class o extends BiliApiDataCallback<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f84098b;

    public o(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f84098b = cancellableContinuationImpl;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(Object obj) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f84098b;
        if (cancellableContinuationImpl.isActive()) {
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(obj));
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f84098b;
        if (cancellableContinuationImpl.isActive()) {
            Result.Companion companion = Result.Companion;
            Throwable runtimeException = th;
            if (th == null) {
                runtimeException = new RuntimeException("unknown error");
            }
            S9.r.b(runtimeException, cancellableContinuationImpl);
        }
    }
}
