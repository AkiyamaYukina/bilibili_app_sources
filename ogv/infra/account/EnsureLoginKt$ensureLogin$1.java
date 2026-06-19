package com.bilibili.ogv.infra.account;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/account/EnsureLoginKt$ensureLogin$1.class */
final class EnsureLoginKt$ensureLogin$1 extends ContinuationImpl {
    int label;
    Object result;

    public EnsureLoginKt$ensureLogin$1(Continuation<? super EnsureLoginKt$ensureLogin$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.a(null, this);
    }
}
