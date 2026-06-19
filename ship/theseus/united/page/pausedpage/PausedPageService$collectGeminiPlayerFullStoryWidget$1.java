package com.bilibili.ship.theseus.united.page.pausedpage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$collectGeminiPlayerFullStoryWidget$1.class */
final class PausedPageService$collectGeminiPlayerFullStoryWidget$1 extends ContinuationImpl {
    int label;
    Object result;
    final PausedPageService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausedPageService$collectGeminiPlayerFullStoryWidget$1(PausedPageService pausedPageService, Continuation<? super PausedPageService$collectGeminiPlayerFullStoryWidget$1> continuation) {
        super(continuation);
        this.this$0 = pausedPageService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PausedPageService.c(this.this$0, this);
    }
}
