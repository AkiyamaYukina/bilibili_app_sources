package com.bilibili.ship.theseus.united.page.toolbar;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarRepository$keepActionReplayVisible$1.class */
final class ToolbarRepository$keepActionReplayVisible$1 extends ContinuationImpl {
    int label;
    Object result;
    final ToolbarRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarRepository$keepActionReplayVisible$1(ToolbarRepository toolbarRepository, Continuation<? super ToolbarRepository$keepActionReplayVisible$1> continuation) {
        super(continuation);
        this.this$0 = toolbarRepository;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(null, this);
    }
}
