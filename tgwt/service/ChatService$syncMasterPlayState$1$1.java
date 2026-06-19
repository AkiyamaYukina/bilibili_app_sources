package com.bilibili.tgwt.service;

import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$syncMasterPlayState$1$1.class */
public final class ChatService$syncMasterPlayState$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $it;
    int label;
    final ChatService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatService$syncMasterPlayState$1$1(ChatService chatService, long j7, Continuation<? super ChatService$syncMasterPlayState$1$1> continuation) {
        super(2, continuation);
        this.this$0 = chatService;
        this.$it = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatService$syncMasterPlayState$1$1(this.this$0, this.$it, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChatRoomManagerService chatRoomManagerService = this.this$0.h;
            long j7 = this.$it;
            this.label = 1;
            Object objM = chatRoomManagerService.m(j7, this, false);
            obj = objM;
            if (objM == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!(((BiliApiResponse) obj) instanceof BiliApiResponse.Success)) {
            ChatService chatService = this.this$0;
            pm.c.b(chatService.f111895n, chatService.f111878a.getString(2131836269));
        }
        return Unit.INSTANCE;
    }
}
