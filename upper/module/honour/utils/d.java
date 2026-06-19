package com.bilibili.upper.module.honour.utils;

import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/utils/d.class */
public final class d extends UB0.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f113342a;

    public d(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f113342a = cancellableContinuationImpl;
    }

    @Override // UB0.c
    public final void c(long j7, long j8, long j9, String str) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f113342a;
        if (cancellableContinuationImpl.isActive()) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(ResultKt.createFailure(new Exception(str))));
        }
    }

    @Override // UB0.c
    public final void d(long j7, float f7, long j8, long j9, int i7) {
    }

    @Override // UB0.c
    public final void f(long j7, String str, String str2) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f113342a;
        if (cancellableContinuationImpl.isActive()) {
            com.bilibili.studio.videoeditor.extension.d.b(Boolean.TRUE, cancellableContinuationImpl);
        }
    }
}
