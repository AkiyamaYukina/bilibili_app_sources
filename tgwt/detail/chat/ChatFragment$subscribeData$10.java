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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatFragment$subscribeData$10.class */
final class ChatFragment$subscribeData$10 extends SuspendLambda implements Function2<SurpriseEvent, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final ChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$subscribeData$10(ChatFragment chatFragment, Continuation<? super ChatFragment$subscribeData$10> continuation) {
        super(2, continuation);
        this.this$0 = chatFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatFragment$subscribeData$10 chatFragment$subscribeData$10 = new ChatFragment$subscribeData$10(this.this$0, continuation);
        chatFragment$subscribeData$10.L$0 = obj;
        return chatFragment$subscribeData$10;
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
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f111019i;
        if (togetherWatchDetailPageViewModel != null) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            if (!togetherWatchDetailPageViewModel2.getScreenStateService().getScreenStateHelper().a().b) {
                p pVar = this.this$0.f111021k;
                if (pVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar = null;
                }
                pVar.j0(surpriseEvent);
            }
        }
        return Unit.INSTANCE;
    }
}
