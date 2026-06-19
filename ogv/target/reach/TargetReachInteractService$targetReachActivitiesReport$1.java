package com.bilibili.ogv.target.reach;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/target/reach/TargetReachInteractService$targetReachActivitiesReport$1.class */
final class TargetReachInteractService$targetReachActivitiesReport$1 extends ContinuationImpl {
    int label;
    Object result;
    final TargetReachInteractService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetReachInteractService$targetReachActivitiesReport$1(TargetReachInteractService targetReachInteractService, Continuation<? super TargetReachInteractService$targetReachActivitiesReport$1> continuation) {
        super(continuation);
        this.this$0 = targetReachInteractService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        TargetReachInteractService targetReachInteractService = this.this$0;
        TargetReachInteractService targetReachInteractService2 = TargetReachInteractService.f73134a;
        return targetReachInteractService.b(null, this);
    }
}
