package com.bilibili.ship.theseus.united.page.tab;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabUIComponent$bind$generateView$1.class */
final class CommentTabUIComponent$bind$generateView$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;

    public CommentTabUIComponent$bind$generateView$1(Continuation<? super CommentTabUIComponent$bind$generateView$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return f.c(null, null, this);
    }
}
