package com.bilibili.tgwt.detail.chat;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatFragment$subscribeData$3.class */
final class ChatFragment$subscribeData$3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    boolean Z$0;
    int label;
    final ChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$subscribeData$3(ChatFragment chatFragment, Continuation<? super ChatFragment$subscribeData$3> continuation) {
        super(2, continuation);
        this.this$0 = chatFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatFragment$subscribeData$3 chatFragment$subscribeData$3 = new ChatFragment$subscribeData$3(this.this$0, continuation);
        chatFragment$subscribeData$3.Z$0 = ((Boolean) obj).booleanValue();
        return chatFragment$subscribeData$3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
        return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.Z$0) {
            ChatFragment chatFragment = this.this$0;
            if (chatFragment.f111011B) {
                chatFragment.kf();
            }
        }
        return Unit.INSTANCE;
    }
}
