package com.bilibili.ship.theseus.united.page.tab;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabUIComponent$commentTextWithBadgeMoveTab$1.class */
final class CommentTabUIComponent$commentTextWithBadgeMoveTab$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    Object result;
    final f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentTabUIComponent$commentTextWithBadgeMoveTab$1(f fVar, Continuation<? super CommentTabUIComponent$commentTextWithBadgeMoveTab$1> continuation) {
        super(continuation);
        this.this$0 = fVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        f fVar = this.this$0;
        int i7 = f.f103174e;
        return fVar.d(null, null, null, null, null, 0.0f, 0.0f, false, this);
    }
}
