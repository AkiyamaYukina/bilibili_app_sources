package com.bilibili.tgwt.service;

import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$openChatUserInfoDialog$1$1$1$3$onUnfollowSuccess$1.class */
public final class ChatService$openChatUserInfoDialog$1$1$1$3$onUnfollowSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $roomId;
    final ChatRoomMember $user;
    int label;
    final ChatService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatService$openChatUserInfoDialog$1$1$1$3$onUnfollowSuccess$1(ChatService chatService, ChatRoomMember chatRoomMember, long j7, Continuation<? super ChatService$openChatUserInfoDialog$1$1$1$3$onUnfollowSuccess$1> continuation) {
        super(2, continuation);
        this.this$0 = chatService;
        this.$user = chatRoomMember;
        this.$roomId = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatService$openChatUserInfoDialog$1$1$1$3$onUnfollowSuccess$1(this.this$0, this.$user, this.$roomId, continuation);
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
            long mid = this.$user.getMid();
            long j7 = this.$roomId;
            this.label = 1;
            if (chatRoomOperationService.changeFreyaRoomRelation(mid, j7, "cancel", this) == coroutine_suspended) {
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
