package com.bilibili.ogv.infra.android.view;

import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/android/view/c.class */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f67861a;

    public c(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f67861a = cancellableContinuationImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CancellableContinuationImpl cancellableContinuationImpl = this.f67861a;
        Result.Companion companion = Result.Companion;
        cancellableContinuationImpl.resumeWith(Result.constructor-impl(Unit.INSTANCE));
    }
}
