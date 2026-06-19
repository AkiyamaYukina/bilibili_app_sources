package com.bilibili.search2.result.all;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/DownPullPopWindow$tryStartOnceGuideAnimation$1.class */
final class DownPullPopWindow$tryStartOnceGuideAnimation$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    Object result;
    final C6052f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownPullPopWindow$tryStartOnceGuideAnimation$1(C6052f c6052f, Continuation<? super DownPullPopWindow$tryStartOnceGuideAnimation$1> continuation) {
        super(continuation);
        this.this$0 = c6052f;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, null, this);
    }
}
