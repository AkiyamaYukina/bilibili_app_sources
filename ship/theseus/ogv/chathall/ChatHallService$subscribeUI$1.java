package com.bilibili.ship.theseus.ogv.chathall;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/ChatHallService$subscribeUI$1.class */
final class ChatHallService$subscribeUI$1 extends ContinuationImpl {
    int label;
    Object result;
    final ChatHallService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHallService$subscribeUI$1(ChatHallService chatHallService, Continuation<? super ChatHallService$subscribeUI$1> continuation) {
        super(continuation);
        this.this$0 = chatHallService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChatHallService.a(this.this$0, this);
    }
}
