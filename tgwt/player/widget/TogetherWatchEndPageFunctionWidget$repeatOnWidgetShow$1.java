package com.bilibili.tgwt.player.widget;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/TogetherWatchEndPageFunctionWidget$repeatOnWidgetShow$1.class */
public final class TogetherWatchEndPageFunctionWidget$repeatOnWidgetShow$1 extends ContinuationImpl {
    int label;
    Object result;
    final TogetherWatchEndPageFunctionWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchEndPageFunctionWidget$repeatOnWidgetShow$1(TogetherWatchEndPageFunctionWidget togetherWatchEndPageFunctionWidget, Continuation<? super TogetherWatchEndPageFunctionWidget$repeatOnWidgetShow$1> continuation) {
        super(continuation);
        this.this$0 = togetherWatchEndPageFunctionWidget;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(this);
    }
}
