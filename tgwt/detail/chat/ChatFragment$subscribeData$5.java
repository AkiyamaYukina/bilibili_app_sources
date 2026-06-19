package com.bilibili.tgwt.detail.chat;

import com.bilibili.chatroom.widget.userDialog.ChatUserFollowStatus;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatFragment$subscribeData$5.class */
final class ChatFragment$subscribeData$5 extends SuspendLambda implements Function2<ChatUserFollowStatus, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final ChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$subscribeData$5(ChatFragment chatFragment, Continuation<? super ChatFragment$subscribeData$5> continuation) {
        super(2, continuation);
        this.this$0 = chatFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatFragment$subscribeData$5 chatFragment$subscribeData$5 = new ChatFragment$subscribeData$5(this.this$0, continuation);
        chatFragment$subscribeData$5.L$0 = obj;
        return chatFragment$subscribeData$5;
    }

    public final Object invoke(ChatUserFollowStatus chatUserFollowStatus, Continuation<? super Unit> continuation) {
        return create(chatUserFollowStatus, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ChatUserFollowStatus chatUserFollowStatus = (ChatUserFollowStatus) this.L$0;
        p pVar = this.this$0.f111021k;
        p pVar2 = pVar;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
            pVar2 = null;
        }
        pVar2.f111098J.set(chatUserFollowStatus);
        return Unit.INSTANCE;
    }
}
