package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import SB0.b;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/D.class */
public final class D implements b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f107673a;

    public D(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f107673a = cancellableContinuationImpl;
    }

    @Override // SB0.b.c
    public final void a() {
        Result.Companion companion = Result.Companion;
        this.f107673a.resumeWith(Result.constructor-impl(Boolean.TRUE));
    }

    @Override // SB0.b.c
    public final void onFail(int i7) {
        Result.Companion companion = Result.Companion;
        this.f107673a.resumeWith(Result.constructor-impl(Boolean.FALSE));
    }
}
