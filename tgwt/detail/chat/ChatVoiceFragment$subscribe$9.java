package com.bilibili.tgwt.detail.chat;

import com.bilibili.bililive.bilirtc.BiliRtcClientProxy;
import com.bilibili.tgwt.service.ChatService;
import com.bilibili.tgwt.service.ChatVoiceRtcService;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatVoiceFragment$subscribe$9.class */
final class ChatVoiceFragment$subscribe$9 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    boolean Z$0;
    int label;
    final ChatVoiceFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatVoiceFragment$subscribe$9(ChatVoiceFragment chatVoiceFragment, Continuation<? super ChatVoiceFragment$subscribe$9> continuation) {
        super(2, continuation);
        this.this$0 = chatVoiceFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatVoiceFragment$subscribe$9 chatVoiceFragment$subscribe$9 = new ChatVoiceFragment$subscribe$9(this.this$0, continuation);
        chatVoiceFragment$subscribe$9.Z$0 = ((Boolean) obj).booleanValue();
        return chatVoiceFragment$subscribe$9;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
        return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        BiliRtcClientProxy biliRtcClientProxy;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.Z$0) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f111045c;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            ChatService chatService = togetherWatchDetailPageViewModel2.getChatService();
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = this.this$0.f111045c;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
            if (togetherWatchDetailPageViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel4 = null;
            }
            chatService.v(((Boolean) togetherWatchDetailPageViewModel4.getChatService().f111855D.getValue()).booleanValue());
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = this.this$0.f111045c;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel6 = togetherWatchDetailPageViewModel5;
            if (togetherWatchDetailPageViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel6 = null;
            }
            ChatService chatService2 = togetherWatchDetailPageViewModel6.getChatService();
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel7 = this.this$0.f111045c;
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel8 = togetherWatchDetailPageViewModel7;
            if (togetherWatchDetailPageViewModel7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel8 = null;
            }
            chatService2.n(((Number) togetherWatchDetailPageViewModel8.getChatService().f111853B.getValue()).intValue());
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel9 = this.this$0.f111045c;
            if (togetherWatchDetailPageViewModel9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                togetherWatchDetailPageViewModel9 = null;
            }
            ChatVoiceRtcService chatVoiceRtcService = togetherWatchDetailPageViewModel9.getChatVoiceRtcService();
            Unit unit = Unit.INSTANCE;
            com.bilibili.tgwt.service.u uVar = chatVoiceRtcService.f111937f;
            if (uVar != null && (biliRtcClientProxy = uVar.f112010d) != null) {
                biliRtcClientProxy.registerAudioLevel(80);
            }
        }
        return Unit.INSTANCE;
    }
}
