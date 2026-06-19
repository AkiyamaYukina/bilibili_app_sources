package com.bilibili.tgwt.detail.chat;

import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.chatroomsdk.Announcement;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatVoiceFragment$subscribe$5.class */
final class ChatVoiceFragment$subscribe$5 extends SuspendLambda implements Function2<BangumiUniformSeason, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final ChatVoiceFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatVoiceFragment$subscribe$5(ChatVoiceFragment chatVoiceFragment, Continuation<? super ChatVoiceFragment$subscribe$5> continuation) {
        super(2, continuation);
        this.this$0 = chatVoiceFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatVoiceFragment$subscribe$5 chatVoiceFragment$subscribe$5 = new ChatVoiceFragment$subscribe$5(this.this$0, continuation);
        chatVoiceFragment$subscribe$5.L$0 = obj;
        return chatVoiceFragment$subscribe$5;
    }

    public final Object invoke(BangumiUniformSeason bangumiUniformSeason, Continuation<? super Unit> continuation) {
        return create(bangumiUniformSeason, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Announcement announcementA;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BangumiUniformSeason bangumiUniformSeason = (BangumiUniformSeason) this.L$0;
        if (bangumiUniformSeason != null) {
            ChatRoomInfo chatRoomInfo = bangumiUniformSeason.E;
            if (chatRoomInfo == null || (announcementA = chatRoomInfo.a()) == null) {
                return Unit.INSTANCE;
            }
            u uVar = this.this$0.f111044b;
            u uVar2 = uVar;
            if (uVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                uVar2 = null;
            }
            uVar2.f111156o = announcementA;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f111045c;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel = null;
            }
            if (!togetherWatchDetailPageViewModel.getChatService().f111868Q) {
                ChatVoiceFragment.jf(this.this$0);
            }
        }
        return Unit.INSTANCE;
    }
}
