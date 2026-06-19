package com.bilibili.tgwt.detail.chat;

import com.bilibili.tgwt.api.ChatRoomOperationService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatFragment$subscribeData$6.class */
final class ChatFragment$subscribeData$6 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    boolean Z$0;
    int label;
    final ChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$subscribeData$6(ChatFragment chatFragment, Continuation<? super ChatFragment$subscribeData$6> continuation) {
        super(2, continuation);
        this.this$0 = chatFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatFragment$subscribeData$6 chatFragment$subscribeData$6 = new ChatFragment$subscribeData$6(this.this$0, continuation);
        chatFragment$subscribeData$6.Z$0 = ((Boolean) obj).booleanValue();
        return chatFragment$subscribeData$6;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
        return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.Z$0) {
                ChatFragment chatFragment = this.this$0;
                if (chatFragment.f111023m == 62) {
                    ChatRoomOperationService chatRoomOperationService = chatFragment.f111028r;
                    Long l7 = chatFragment.f111014c;
                    this.label = 1;
                    if (chatRoomOperationService.activeRoom(l7, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ChatFragment chatFragment2 = this.this$0;
        chatFragment2.f111022l.postDelayed(chatFragment2.f111030t, chatFragment2.f111018g == 0 ? chatFragment2.f111016e : chatFragment2.f111016e * ((long) 2));
        return Unit.INSTANCE;
    }
}
