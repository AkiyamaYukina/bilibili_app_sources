package com.bilibili.pegasus.components.recover;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/CardRecoverComponent$showRefreshRecoverTips$1.class */
final class CardRecoverComponent$showRefreshRecoverTips$1 extends ContinuationImpl {
    int label;
    Object result;
    final CardRecoverComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRecoverComponent$showRefreshRecoverTips$1(CardRecoverComponent cardRecoverComponent, Continuation<? super CardRecoverComponent$showRefreshRecoverTips$1> continuation) {
        super(continuation);
        this.this$0 = cardRecoverComponent;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CardRecoverComponent.b(this.this$0, null, 0, this);
    }
}
