package com.bilibili.tgwt.service;

import com.bilibili.api.BiliApiException;
import com.bilibili.chatroomsdk.ChatMsg;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$msgLongClick$1$itemClick$1.class */
public final class ChatService$msgLongClick$1$itemClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ChatMsg $message;
    int label;
    final ChatService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatService$msgLongClick$1$itemClick$1(ChatService chatService, ChatMsg chatMsg, Continuation<? super ChatService$msgLongClick$1$itemClick$1> continuation) {
        super(2, continuation);
        this.this$0 = chatService;
        this.$message = chatMsg;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatService$msgLongClick$1$itemClick$1(this.this$0, this.$message, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChatRoomOperationService chatRoomOperationService = this.this$0.f111869R;
            long msgId = this.$message.getMsgId();
            this.label = 1;
            Object objWithdrawMsg = chatRoomOperationService.withdrawMsg(msgId, this);
            obj = objWithdrawMsg;
            if (objWithdrawMsg == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
