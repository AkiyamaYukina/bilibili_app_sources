package com.bilibili.studio.material.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/BaseDispatcher$queryProgress$1.class */
public final class BaseDispatcher$queryProgress$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final BaseDispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDispatcher$queryProgress$1(BaseDispatcher baseDispatcher, Continuation<? super BaseDispatcher$queryProgress$1> continuation) {
        super(continuation);
        this.this$0 = baseDispatcher;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BaseDispatcher.d(this.this$0, this);
    }
}
