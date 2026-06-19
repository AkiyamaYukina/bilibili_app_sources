package com.bilibili.tgwt.chatroom;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatRoomManagerService$requestRefreshRoomState$1.class */
final class ChatRoomManagerService$requestRefreshRoomState$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    Object result;
    final ChatRoomManagerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRoomManagerService$requestRefreshRoomState$1(ChatRoomManagerService chatRoomManagerService, Continuation<? super ChatRoomManagerService$requestRefreshRoomState$1> continuation) {
        super(continuation);
        this.this$0 = chatRoomManagerService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m(0L, this, false);
    }
}
