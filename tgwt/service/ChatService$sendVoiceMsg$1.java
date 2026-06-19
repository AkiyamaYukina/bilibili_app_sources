package com.bilibili.tgwt.service;

import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$sendVoiceMsg$1.class */
final class ChatService$sendVoiceMsg$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $chatMessageVo;
    final long $roomId;
    int label;
    final ChatService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatService$sendVoiceMsg$1(ChatService chatService, long j7, String str, Continuation<? super ChatService$sendVoiceMsg$1> continuation) {
        super(2, continuation);
        this.this$0 = chatService;
        this.$roomId = j7;
        this.$chatMessageVo = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatService$sendVoiceMsg$1(this.this$0, this.$roomId, this.$chatMessageVo, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChatRoomOperationService chatRoomOperationService = this.this$0.f111869R;
            long j7 = this.$roomId;
            String str = this.$chatMessageVo;
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.label = 1;
            Object objSendChatRoomMessage = chatRoomOperationService.sendChatRoomMessage(j7, 3, str, jCurrentTimeMillis, this);
            obj = objSendChatRoomMessage;
            if (objSendChatRoomMessage == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!(((BiliApiResponse) obj) instanceof BiliApiResponse.Success)) {
            Kl.a.a(this.this$0.f111899r, 2131836330);
        }
        return Unit.INSTANCE;
    }
}
