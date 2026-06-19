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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatVoiceFragment$subscribe$12.class */
final class ChatVoiceFragment$subscribe$12 extends SuspendLambda implements Function2<hu.a[], Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final ChatVoiceFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatVoiceFragment$subscribe$12(ChatVoiceFragment chatVoiceFragment, Continuation<? super ChatVoiceFragment$subscribe$12> continuation) {
        super(2, continuation);
        this.this$0 = chatVoiceFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatVoiceFragment$subscribe$12 chatVoiceFragment$subscribe$12 = new ChatVoiceFragment$subscribe$12(this.this$0, continuation);
        chatVoiceFragment$subscribe$12.L$0 = obj;
        return chatVoiceFragment$subscribe$12;
    }

    public final Object invoke(hu.a[] aVarArr, Continuation<? super Unit> continuation) {
        return create(aVarArr, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        hu.a[] aVarArr = (hu.a[]) this.L$0;
        ChatVoiceFragment chatVoiceFragment = this.this$0;
        for (hu.a aVar : aVarArr) {
            String str = aVar.a;
            u uVar = chatVoiceFragment.f111044b;
            u uVar2 = uVar;
            if (uVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                uVar2 = null;
            }
            if (Intrinsics.areEqual(str, String.valueOf(uVar2.f111148f.f111076j))) {
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatVoiceFragment.f111045c;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
                if (togetherWatchDetailPageViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    togetherWatchDetailPageViewModel2 = null;
                }
                ChatVoiceRtcService chatVoiceRtcService = togetherWatchDetailPageViewModel2.getChatVoiceRtcService();
                u uVar3 = chatVoiceFragment.f111044b;
                if (uVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    uVar3 = null;
                }
                m mVar = uVar3.f111148f;
                chatVoiceRtcService.getClass();
                ChatVoiceRtcService.c(mVar, aVar);
            } else {
                u uVar4 = chatVoiceFragment.f111044b;
                u uVar5 = uVar4;
                if (uVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    uVar5 = null;
                }
                if (Intrinsics.areEqual(aVar.a, String.valueOf(uVar5.f111149g.f111076j))) {
                    TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = chatVoiceFragment.f111045c;
                    TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
                    if (togetherWatchDetailPageViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        togetherWatchDetailPageViewModel4 = null;
                    }
                    ChatVoiceRtcService chatVoiceRtcService2 = togetherWatchDetailPageViewModel4.getChatVoiceRtcService();
                    u uVar6 = chatVoiceFragment.f111044b;
                    if (uVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                        uVar6 = null;
                    }
                    m mVar2 = uVar6.f111149g;
                    chatVoiceRtcService2.getClass();
                    ChatVoiceRtcService.c(mVar2, aVar);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
