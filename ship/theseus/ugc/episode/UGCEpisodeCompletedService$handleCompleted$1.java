package com.bilibili.ship.theseus.ugc.episode;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/episode/UGCEpisodeCompletedService$handleCompleted$1.class */
final class UGCEpisodeCompletedService$handleCompleted$1 extends ContinuationImpl {
    int label;
    Object result;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCEpisodeCompletedService$handleCompleted$1(a aVar, Continuation<? super UGCEpisodeCompletedService$handleCompleted$1> continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(this.this$0, this);
    }
}
