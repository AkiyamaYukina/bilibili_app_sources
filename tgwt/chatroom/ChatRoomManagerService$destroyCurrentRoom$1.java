package com.bilibili.tgwt.chatroom;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatRoomManagerService$destroyCurrentRoom$1.class */
public final class ChatRoomManagerService$destroyCurrentRoom$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Long $roomId;
    int label;
    final ChatRoomManagerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRoomManagerService$destroyCurrentRoom$1(ChatRoomManagerService chatRoomManagerService, Long l7, Continuation<? super ChatRoomManagerService$destroyCurrentRoom$1> continuation) {
        super(2, continuation);
        this.this$0 = chatRoomManagerService;
        this.$roomId = l7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatRoomManagerService$destroyCurrentRoom$1(this.this$0, this.$roomId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChatRoomOperationService chatRoomOperationService = this.this$0.f110920m;
            long jLongValue = this.$roomId.longValue();
            BangumiUniformSeason season = this.this$0.f110912d.getSeason();
            int i8 = 0;
            if (season != null) {
                ChatRoomInfo chatRoomInfo = season.E;
                i8 = 0;
                if (chatRoomInfo != null) {
                    i8 = 0;
                    if (chatRoomInfo.u() == 8) {
                        i8 = 1;
                    }
                }
            }
            this.label = 1;
            if (chatRoomOperationService.leaveRoom(jLongValue, i8, this) == coroutine_suspended) {
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
