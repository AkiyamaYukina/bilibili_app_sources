package com.bilibili.search2.result;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/BiliMainSearchResultDataLoader$searchAllMossSuspend$1.class */
final class BiliMainSearchResultDataLoader$searchAllMossSuspend$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliMainSearchResultDataLoader$searchAllMossSuspend$1(b bVar, Continuation<? super BiliMainSearchResultDataLoader$searchAllMossSuspend$1> continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, null, null, null, null, null, null, null, 0, false, false, 0, null, 0L, 0L, 0L, null, null, null, null, null, 0, null, null, null, false, this);
    }
}
