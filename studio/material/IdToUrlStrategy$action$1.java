package com.bilibili.studio.material;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/IdToUrlStrategy$action$1.class */
public final class IdToUrlStrategy$action$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final IdToUrlStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdToUrlStrategy$action$1(IdToUrlStrategy idToUrlStrategy, Continuation<? super IdToUrlStrategy$action$1> continuation) {
        super(continuation);
        this.this$0 = idToUrlStrategy;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
