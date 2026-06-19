package com.bilibili.ship.theseus.detail;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$enforceBusinessData$1.class */
final class BusinessScopeDriverImpl$enforceBusinessData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final BusinessScopeDriverImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessScopeDriverImpl$enforceBusinessData$1(BusinessScopeDriverImpl businessScopeDriverImpl, Continuation<? super BusinessScopeDriverImpl$enforceBusinessData$1> continuation) {
        super(continuation);
        this.this$0 = businessScopeDriverImpl;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BusinessScopeDriverImpl.g(this.this$0, null, this);
    }
}
