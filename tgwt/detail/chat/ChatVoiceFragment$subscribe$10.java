package com.bilibili.tgwt.detail.chat;

import com.bilibili.tgwt.service.ChatVoiceRtcService;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatVoiceFragment$subscribe$10.class */
final class ChatVoiceFragment$subscribe$10 extends SuspendLambda implements Function2<hu.a, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final ChatVoiceFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatVoiceFragment$subscribe$10(ChatVoiceFragment chatVoiceFragment, Continuation<? super ChatVoiceFragment$subscribe$10> continuation) {
        super(2, continuation);
        this.this$0 = chatVoiceFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatVoiceFragment$subscribe$10 chatVoiceFragment$subscribe$10 = new ChatVoiceFragment$subscribe$10(this.this$0, continuation);
        chatVoiceFragment$subscribe$10.L$0 = obj;
        return chatVoiceFragment$subscribe$10;
    }

    public final Object invoke(hu.a aVar, Continuation<? super Unit> continuation) {
        return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        hu.a aVar = (hu.a) this.L$0;
        u uVar = this.this$0.f111044b;
        u uVar2 = uVar;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            uVar2 = null;
        }
        if (uVar2.f111148f.f111075i) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f111045c;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            ChatVoiceRtcService chatVoiceRtcService = togetherWatchDetailPageViewModel2.getChatVoiceRtcService();
            u uVar3 = this.this$0.f111044b;
            if (uVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                uVar3 = null;
            }
            m mVar = uVar3.f111148f;
            chatVoiceRtcService.getClass();
            ChatVoiceRtcService.c(mVar, aVar);
        } else {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.this$0.f111045c;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
            if (togetherWatchDetailPageViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel4 = null;
            }
            ChatVoiceRtcService chatVoiceRtcService2 = togetherWatchDetailPageViewModel4.getChatVoiceRtcService();
            u uVar4 = this.this$0.f111044b;
            if (uVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                uVar4 = null;
            }
            m mVar2 = uVar4.f111149g;
            chatVoiceRtcService2.getClass();
            ChatVoiceRtcService.c(mVar2, aVar);
        }
        return Unit.INSTANCE;
    }
}
