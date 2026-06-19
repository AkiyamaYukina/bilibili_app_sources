package com.bilibili.search2.result.column.api;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/column/api/ColumnSearchApiManager$searchColumnSuspend$1.class */
final class ColumnSearchApiManager$searchColumnSuspend$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColumnSearchApiManager$searchColumnSuspend$1(b bVar, Continuation<? super ColumnSearchApiManager$searchColumnSuspend$1> continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, 0L, null, null, null, null, null, this);
    }
}
