package com.bilibili.tgwt.detail.chat;

import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatVoiceFragment$subscribe$3.class */
final class ChatVoiceFragment$subscribe$3 extends SuspendLambda implements Function2<ChatRoomMember, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final ChatVoiceFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatVoiceFragment$subscribe$3(ChatVoiceFragment chatVoiceFragment, Continuation<? super ChatVoiceFragment$subscribe$3> continuation) {
        super(2, continuation);
        this.this$0 = chatVoiceFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatVoiceFragment$subscribe$3 chatVoiceFragment$subscribe$3 = new ChatVoiceFragment$subscribe$3(this.this$0, continuation);
        chatVoiceFragment$subscribe$3.L$0 = obj;
        return chatVoiceFragment$subscribe$3;
    }

    public final Object invoke(ChatRoomMember chatRoomMember, Continuation<? super Unit> continuation) {
        return create(chatRoomMember, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ChatRoomMember chatRoomMember = (ChatRoomMember) this.L$0;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f111045c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        togetherWatchDetailPageViewModel2.getChatService().i(chatRoomMember);
        return Unit.INSTANCE;
    }
}
