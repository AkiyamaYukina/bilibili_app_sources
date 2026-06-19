package com.bilibili.studio.editor.moudle.caption.manager;

import Qh1.V;
import UB0.m;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/manager/f.class */
public final class f extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f105785a;

    public f(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f105785a = cancellableContinuationImpl;
    }

    @Override // UB0.c
    public final void c(long j7, long j8, long j9, String str) {
        Result.Companion companion = Result.Companion;
        this.f105785a.resumeWith(V.a("download file error"));
        UB0.b.e(j7, this);
    }

    @Override // UB0.c
    public final void d(long j7, float f7, long j8, long j9, int i7) {
    }

    @Override // UB0.c
    public final void f(long j7, String str, String str2) {
        Result.Companion companion = Result.Companion;
        this.f105785a.resumeWith(Result.constructor-impl(Boolean.TRUE));
    }
}
