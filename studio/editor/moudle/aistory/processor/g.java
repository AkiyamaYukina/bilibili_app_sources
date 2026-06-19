package com.bilibili.studio.editor.moudle.aistory.processor;

import com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/processor/g.class */
public final class g implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f105752a;

    public g(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f105752a = cancellableContinuationImpl;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d.a
    public final void a() {
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d.a
    public final void b(int i7, String str, String str2) {
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d.a
    public final void c(int i7, long j7, String str) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f105752a;
        if (cancellableContinuationImpl.isActive()) {
            if (str == null) {
                cancellableContinuationImpl.resumeWith(Result.constructor-impl((Object) null));
            } else {
                cancellableContinuationImpl.resumeWith(Result.constructor-impl(str));
            }
        }
    }
}
