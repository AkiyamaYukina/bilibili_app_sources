package com.bilibili.tgwt.service;

import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$sendInteractEmote$1.class */
public final class ChatService$sendInteractEmote$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $emoteId;
    int label;
    final ChatService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatService$sendInteractEmote$1(ChatService chatService, int i7, Continuation<? super ChatService$sendInteractEmote$1> continuation) {
        super(2, continuation);
        this.this$0 = chatService;
        this.$emoteId = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatService$sendInteractEmote$1(this.this$0, this.$emoteId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ChatRoomInfo chatRoomInfo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChatService chatService = this.this$0;
            ChatRoomOperationService chatRoomOperationService = chatService.f111869R;
            BangumiUniformSeason season = chatService.f111882c.getSeason();
            long jE = (season == null || (chatRoomInfo = season.E) == null) ? 0L : chatRoomInfo.e();
            int i8 = this.$emoteId;
            this.label = 1;
            if (chatRoomOperationService.sendInteractEmote(jE, i8, 0, this) == coroutine_suspended) {
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
