package com.bilibili.ship.theseus.united.page.backpress;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/backpress/BackActionRepository$keepBackAction$1.class */
public final class BackActionRepository$keepBackAction$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final BackActionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackActionRepository$keepBackAction$1(BackActionRepository backActionRepository, Continuation<? super BackActionRepository$keepBackAction$1> continuation) {
        super(continuation);
        this.this$0 = backActionRepository;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
