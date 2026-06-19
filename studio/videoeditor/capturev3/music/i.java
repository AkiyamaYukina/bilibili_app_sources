package com.bilibili.studio.videoeditor.capturev3.music;

import Qh1.V;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/i.class */
public final class i extends UB0.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f109272a;

    public i(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f109272a = cancellableContinuationImpl;
    }

    @Override // UB0.c
    public final void c(long j7, long j8, long j9, String str) {
        Result.Companion companion = Result.Companion;
        this.f109272a.resumeWith(V.a(str));
    }

    @Override // UB0.c
    public final void d(long j7, float f7, long j8, long j9, int i7) {
    }

    @Override // UB0.c
    public final void f(long j7, String str, String str2) {
        Result.Companion companion = Result.Companion;
        this.f109272a.resumeWith(Result.constructor-impl(Boolean.TRUE));
    }
}
