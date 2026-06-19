package com.bilibili.ship.theseus.ogv.viewingduration;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/viewingduration/ViewingDurationService$awaitEpViewingDuration$1.class */
final class ViewingDurationService$awaitEpViewingDuration$1 extends ContinuationImpl {
    long J$0;
    int label;
    Object result;
    final ViewingDurationService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewingDurationService$awaitEpViewingDuration$1(ViewingDurationService viewingDurationService, Continuation<? super ViewingDurationService$awaitEpViewingDuration$1> continuation) {
        super(continuation);
        this.this$0 = viewingDurationService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0L, this);
    }
}
