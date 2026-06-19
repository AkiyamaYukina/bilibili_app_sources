package com.bilibili.tgwt.detail.chat;

import com.bilibili.chatroomsdk.SurpriseEvent;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatVoiceFragment$subscribe$7.class */
final class ChatVoiceFragment$subscribe$7 extends SuspendLambda implements Function2<SurpriseEvent, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final ChatVoiceFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatVoiceFragment$subscribe$7(ChatVoiceFragment chatVoiceFragment, Continuation<? super ChatVoiceFragment$subscribe$7> continuation) {
        super(2, continuation);
        this.this$0 = chatVoiceFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatVoiceFragment$subscribe$7 chatVoiceFragment$subscribe$7 = new ChatVoiceFragment$subscribe$7(this.this$0, continuation);
        chatVoiceFragment$subscribe$7.L$0 = obj;
        return chatVoiceFragment$subscribe$7;
    }

    public final Object invoke(SurpriseEvent surpriseEvent, Continuation<? super Unit> continuation) {
        return create(surpriseEvent, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SurpriseEvent surpriseEvent = (SurpriseEvent) this.L$0;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f111045c;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        if (!togetherWatchDetailPageViewModel2.getScreenStateService().getScreenStateHelper().a().b) {
            u uVar = this.this$0.f111044b;
            u uVar2 = uVar;
            if (uVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                uVar2 = null;
            }
            if (true != uVar2.h) {
                uVar2.h = true;
                uVar2.notifyPropertyChanged(181);
            }
            u uVar3 = this.this$0.f111044b;
            if (uVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                uVar3 = null;
            }
            uVar3.f111150i = surpriseEvent.getAnim();
            uVar3.notifyPropertyChanged(180);
        }
        return Unit.INSTANCE;
    }
}
