package com.bilibili.studio.comm.manager;

import SB0.b;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/k.class */
public final class k implements b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f105406a;

    public k(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f105406a = cancellableContinuationImpl;
    }

    @Override // SB0.b.c
    public final void a() {
        CancellableContinuationImpl cancellableContinuationImpl = this.f105406a;
        if (cancellableContinuationImpl.isActive()) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(Boolean.TRUE));
        }
    }

    @Override // SB0.b.c
    public final void onFail(int i7) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f105406a;
        if (cancellableContinuationImpl.isActive()) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(Boolean.FALSE));
        }
    }
}
