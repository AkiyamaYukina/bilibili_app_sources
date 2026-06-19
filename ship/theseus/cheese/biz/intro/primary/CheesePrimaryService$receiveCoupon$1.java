package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryService$receiveCoupon$1.class */
final class CheesePrimaryService$receiveCoupon$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final CheesePrimaryService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePrimaryService$receiveCoupon$1(CheesePrimaryService cheesePrimaryService, Continuation<? super CheesePrimaryService$receiveCoupon$1> continuation) {
        super(continuation);
        this.this$0 = cheesePrimaryService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CheesePrimaryService.a(this.this$0, null, this);
    }
}
