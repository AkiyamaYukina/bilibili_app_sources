package com.bilibili.ogv.target.reach;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/target/reach/TargetReachInteractService$preloadTargetReach$1.class */
final class TargetReachInteractService$preloadTargetReach$1 extends ContinuationImpl {
    int label;
    Object result;
    final TargetReachInteractService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetReachInteractService$preloadTargetReach$1(TargetReachInteractService targetReachInteractService, Continuation<? super TargetReachInteractService$preloadTargetReach$1> continuation) {
        super(continuation);
        this.this$0 = targetReachInteractService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TargetReachInteractService.a(this.this$0, this);
    }
}
