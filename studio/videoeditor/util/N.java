package com.bilibili.studio.videoeditor.util;

import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/N.class */
public final class N extends UB0.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f110210a;

    public N(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f110210a = cancellableContinuationImpl;
    }

    @Override // UB0.c
    public final void c(long j7, long j8, long j9, String str) {
        Result.Companion companion = Result.Companion;
        this.f110210a.resumeWith(Qh1.V.a(str));
    }

    @Override // UB0.c
    public final void d(long j7, float f7, long j8, long j9, int i7) {
    }

    @Override // UB0.c
    public final void f(long j7, String str, String str2) {
        Result.Companion companion = Result.Companion;
        this.f110210a.resumeWith(Result.constructor-impl(Boolean.TRUE));
    }
}
