package com.bilibili.tgwt.chatroom;

import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatRoomManagerService$chatRoomListener$1$onJoin$1.class */
public final class ChatRoomManagerService$chatRoomListener$1$onJoin$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ChatRoomInfo $connectRoomInfo;
    int label;
    final ChatRoomManagerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRoomManagerService$chatRoomListener$1$onJoin$1(ChatRoomManagerService chatRoomManagerService, ChatRoomInfo chatRoomInfo, Continuation<? super ChatRoomManagerService$chatRoomListener$1$onJoin$1> continuation) {
        super(2, continuation);
        this.this$0 = chatRoomManagerService;
        this.$connectRoomInfo = chatRoomInfo;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatRoomManagerService$chatRoomListener$1$onJoin$1(this.this$0, this.$connectRoomInfo, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChatRoomManagerService chatRoomManagerService = this.this$0;
            long jT = this.$connectRoomInfo.t();
            this.label = 1;
            if (chatRoomManagerService.m(jT, this, false) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
