package com.bilibili.pegasus.components.interest.ui.udf.handlers;

import S9.r;
import com.bilibili.okretro.BiliApiDataCallback;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;
import kp0.C7782e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/handlers/c.class */
public final class c extends BiliApiDataCallback<C7782e> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f76427b;

    public c(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f76427b = cancellableContinuationImpl;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final boolean isCancel() {
        return !this.f76427b.isActive();
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(C7782e c7782e) {
        C7782e c7782e2 = c7782e;
        CancellableContinuationImpl cancellableContinuationImpl = this.f76427b;
        if (cancellableContinuationImpl.isActive()) {
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(c7782e2));
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f76427b;
        if (cancellableContinuationImpl.isActive()) {
            Result.Companion companion = Result.Companion;
            Throwable exc = th;
            if (th == null) {
                exc = new Exception("unknown error");
            }
            r.b(exc, cancellableContinuationImpl);
        }
    }
}
