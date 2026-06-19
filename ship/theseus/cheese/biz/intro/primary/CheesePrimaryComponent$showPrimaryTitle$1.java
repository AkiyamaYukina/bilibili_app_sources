package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryComponent$showPrimaryTitle$1.class */
final class CheesePrimaryComponent$showPrimaryTitle$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final C6081b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePrimaryComponent$showPrimaryTitle$1(C6081b c6081b, Continuation<? super CheesePrimaryComponent$showPrimaryTitle$1> continuation) {
        super(continuation);
        this.this$0 = c6081b;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C6081b.e(this.this$0, null, null, null, this);
    }
}
