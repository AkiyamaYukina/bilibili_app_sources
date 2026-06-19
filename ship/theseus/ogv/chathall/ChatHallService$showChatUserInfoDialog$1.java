package com.bilibili.ship.theseus.ogv.chathall;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$showChatUserInfoDialog$1.class */
final class ChatHallService$showChatUserInfoDialog$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final ChatHallService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHallService$showChatUserInfoDialog$1(ChatHallService chatHallService, Continuation<? super ChatHallService$showChatUserInfoDialog$1> continuation) {
        super(continuation);
        this.this$0 = chatHallService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(null, this);
    }
}
