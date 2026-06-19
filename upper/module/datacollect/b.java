package com.bilibili.upper.module.datacollect;

import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;
import ng0.g;
import og0.C8213a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/datacollect/b.class */
public final class b extends C8213a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f113082a;

    public b(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f113082a = cancellableContinuationImpl;
    }

    @Override // og0.C8213a, og0.f
    public final void i(g gVar, String str) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f113082a;
        if (cancellableContinuationImpl.isActive()) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(gVar != null ? gVar.z() : null));
        }
    }

    @Override // og0.C8213a, og0.f
    public final void k(int i7, g gVar) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f113082a;
        if (cancellableContinuationImpl.isActive()) {
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(""));
        }
    }
}
