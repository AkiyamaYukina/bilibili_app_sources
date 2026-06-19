package com.bilibili.tgwt.chatroom;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatRoomManagerService$changeFollowStatus$1.class */
final class ChatRoomManagerService$changeFollowStatus$1 extends ContinuationImpl {
    int label;
    Object result;
    final ChatRoomManagerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRoomManagerService$changeFollowStatus$1(ChatRoomManagerService chatRoomManagerService, Continuation<? super ChatRoomManagerService$changeFollowStatus$1> continuation) {
        super(continuation);
        this.this$0 = chatRoomManagerService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objD = this.this$0.d(0L, false, 0, null, this);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : Result.box-impl(objD);
    }
}
