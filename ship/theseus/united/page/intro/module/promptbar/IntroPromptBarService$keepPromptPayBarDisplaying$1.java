package com.bilibili.ship.theseus.united.page.intro.module.promptbar;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/IntroPromptBarService$keepPromptPayBarDisplaying$1.class */
final class IntroPromptBarService$keepPromptPayBarDisplaying$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroPromptBarService$keepPromptPayBarDisplaying$1(c cVar, Continuation<IntroPromptBarService$keepPromptPayBarDisplaying$1> continuation) {
        super(continuation);
        this.this$0 = cVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.a(this.this$0, null, null, this);
    }
}
