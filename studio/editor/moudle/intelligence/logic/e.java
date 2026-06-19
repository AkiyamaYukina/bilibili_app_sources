package com.bilibili.studio.editor.moudle.intelligence.logic;

import Qh1.V;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/logic/e.class */
public final class e extends VB0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f107351a;

    public e(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f107351a = cancellableContinuationImpl;
    }

    @Override // VB0.a
    public final void onError(String str) {
        Result.Companion companion = Result.Companion;
        this.f107351a.resumeWith(V.a(str));
    }

    @Override // VB0.a
    public final void onFinish() {
        CancellableContinuationImpl cancellableContinuationImpl = this.f107351a;
        try {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(Boolean.TRUE));
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }
}
