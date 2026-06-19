package com.bilibili.ship.theseus.united.page.comment;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$kntrFragment$3$snapshotToFile$1.class */
public final class TheseusCommentService$createNewState$kntrFragment$3$snapshotToFile$1 extends ContinuationImpl {
    int label;
    Object result;
    final TheseusCommentService$createNewState$kntrFragment$3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusCommentService$createNewState$kntrFragment$3$snapshotToFile$1(TheseusCommentService$createNewState$kntrFragment$3 theseusCommentService$createNewState$kntrFragment$3, Continuation<? super TheseusCommentService$createNewState$kntrFragment$3$snapshotToFile$1> continuation) {
        super(continuation);
        this.this$0 = theseusCommentService$createNewState$kntrFragment$3;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.h(false, this);
    }
}
