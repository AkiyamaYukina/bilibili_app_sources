package com.bilibili.ship.theseus.united.page.comment;

import com.bilibili.ship.theseus.united.page.comment.TheseusCommentService;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$TheseusCommentExternalHandler$snapshot$1.class */
public final class TheseusCommentService$TheseusCommentExternalHandler$snapshot$1 extends ContinuationImpl {
    int label;
    Object result;
    final TheseusCommentService.TheseusCommentExternalHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusCommentService$TheseusCommentExternalHandler$snapshot$1(TheseusCommentService.TheseusCommentExternalHandler theseusCommentExternalHandler, Continuation<? super TheseusCommentService$TheseusCommentExternalHandler$snapshot$1> continuation) {
        super(continuation);
        this.this$0 = theseusCommentExternalHandler;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(false, this);
    }
}
