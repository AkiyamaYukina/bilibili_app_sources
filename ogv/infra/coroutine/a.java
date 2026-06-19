package com.bilibili.ogv.infra.coroutine;

import S9.r;
import com.bilibili.ogv.infra.util.e;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/coroutine/a.class */
public final class a {
    public static final <T> void a(@NotNull CancellableContinuation<? super T> cancellableContinuation, T t7) {
        if (cancellableContinuation.isCompleted()) {
            e.b(new IllegalStateException("Continuation has already been resumed."));
        } else {
            cancellableContinuation.resumeWith(Result.constructor-impl(t7));
        }
    }

    public static final void b(@NotNull Throwable th, @NotNull CancellableContinuationImpl cancellableContinuationImpl) {
        if (cancellableContinuationImpl.isCompleted()) {
            e.b(new IllegalStateException("Continuation has already been resumed."));
        } else {
            Result.Companion companion = Result.Companion;
            r.b(th, cancellableContinuationImpl);
        }
    }
}
