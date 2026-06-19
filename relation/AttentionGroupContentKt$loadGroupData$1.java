package com.bilibili.relation;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/AttentionGroupContentKt$loadGroupData$1.class */
final class AttentionGroupContentKt$loadGroupData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;

    public AttentionGroupContentKt$loadGroupData$1(Continuation<? super AttentionGroupContentKt$loadGroupData$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C6029v.k(null, null, null, 0L, null, null, this);
    }
}
