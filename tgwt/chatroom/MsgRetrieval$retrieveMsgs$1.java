package com.bilibili.tgwt.chatroom;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/MsgRetrieval$retrieveMsgs$1.class */
final class MsgRetrieval$retrieveMsgs$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    Object result;
    final h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsgRetrieval$retrieveMsgs$1(h hVar, Continuation<? super MsgRetrieval$retrieveMsgs$1> continuation) {
        super(continuation);
        this.this$0 = hVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return h.a(this.this$0, null, 0L, this);
    }
}
