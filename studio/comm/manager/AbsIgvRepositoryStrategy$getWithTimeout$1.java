package com.bilibili.studio.comm.manager;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/AbsIgvRepositoryStrategy$getWithTimeout$1.class */
final class AbsIgvRepositoryStrategy$getWithTimeout$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final c<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsIgvRepositoryStrategy$getWithTimeout$1(c<T> cVar, Continuation<? super AbsIgvRepositoryStrategy$getWithTimeout$1> continuation) {
        super(continuation);
        this.this$0 = cVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.d(this.this$0, 0L, this);
    }
}
