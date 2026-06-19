package com.bilibili.ship.theseus.united.page.comment;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$1.class */
final class TheseusCommentService$createNewState$1 extends ContinuationImpl {
    int label;
    Object result;
    final TheseusCommentService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusCommentService$createNewState$1(TheseusCommentService theseusCommentService, Continuation<? super TheseusCommentService$createNewState$1> continuation) {
        super(continuation);
        this.this$0 = theseusCommentService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TheseusCommentService.b(this.this$0, null, this);
    }
}
