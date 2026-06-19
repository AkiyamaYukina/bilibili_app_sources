package com.bilibili.ship.theseus.united.page.tab;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabGuideService$showCommentTabGuide$1.class */
final class CommentTabGuideService$showCommentTabGuide$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final CommentTabGuideService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentTabGuideService$showCommentTabGuide$1(CommentTabGuideService commentTabGuideService, Continuation<? super CommentTabGuideService$showCommentTabGuide$1> continuation) {
        super(continuation);
        this.this$0 = commentTabGuideService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
