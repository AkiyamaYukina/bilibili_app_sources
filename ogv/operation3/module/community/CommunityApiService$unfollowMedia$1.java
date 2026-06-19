package com.bilibili.ogv.operation3.module.community;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/community/CommunityApiService$unfollowMedia$1.class */
final class CommunityApiService$unfollowMedia$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    Object result;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommunityApiService$unfollowMedia$1(c cVar, Continuation<? super CommunityApiService$unfollowMedia$1> continuation) {
        super(continuation);
        this.this$0 = cVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(0L, this);
    }
}
