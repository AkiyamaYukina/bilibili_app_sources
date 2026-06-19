package com.bilibili.tgwt.service;

import HD0.B;
import com.bilibili.api.BiliApiException;
import com.bilibili.chatroom.vo.ChatMessageVo;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$clickVoiceMsg$1.class */
public final class ChatService$clickVoiceMsg$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final B $vm;
    int label;
    final ChatService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatService$clickVoiceMsg$1(ChatService chatService, B b7, Continuation<? super ChatService$clickVoiceMsg$1> continuation) {
        super(2, continuation);
        this.this$0 = chatService;
        this.$vm = b7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatService$clickVoiceMsg$1(this.this$0, this.$vm, continuation);
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
            long j7 = this.$vm.f8166c;
            this.label = 1;
            Object uposSignUrl = chatRoomOperationService.getUposSignUrl(j7, this);
            obj = uposSignUrl;
            if (uposSignUrl == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        B b7 = this.$vm;
        ChatService chatService = this.this$0;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
                if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                ChatMessageVo chatMessageVo = (ChatMessageVo) ((BiliApiResponse.Success) biliApiResponse).getData();
                b7.f8177o = chatMessageVo.j;
                String str = chatMessageVo.h;
                b7.f8176n = str;
                chatService.getClass();
                BuildersKt.launch$default(chatService.f111896o, (CoroutineContext) null, (CoroutineStart) null, new ChatService$downloadVoiceFile$1(chatService, str, b7, null), 3, (Object) null);
                return Unit.INSTANCE;
            }
            ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
        }
        Kl.a.a(chatService.f111899r, 2131836341);
        return Unit.INSTANCE;
    }
}
