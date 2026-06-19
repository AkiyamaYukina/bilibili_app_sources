package com.bilibili.tgwt.im.ui;

import com.bilibili.chatroomsdk.SurpriseEvent;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatFragment$subscribeData$5.class */
final class PlayerChatFragment$subscribeData$5 extends SuspendLambda implements Function2<SurpriseEvent, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final PlayerChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerChatFragment$subscribeData$5(PlayerChatFragment playerChatFragment, Continuation<? super PlayerChatFragment$subscribeData$5> continuation) {
        super(2, continuation);
        this.this$0 = playerChatFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayerChatFragment$subscribeData$5 playerChatFragment$subscribeData$5 = new PlayerChatFragment$subscribeData$5(this.this$0, continuation);
        playerChatFragment$subscribeData$5.L$0 = obj;
        return playerChatFragment$subscribeData$5;
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
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = this.this$0.f111251c;
        if (togetherWatchDetailPageViewModel != null) {
            TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
            if (togetherWatchDetailPageViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                togetherWatchDetailPageViewModel2 = null;
            }
            if (!togetherWatchDetailPageViewModel2.getScreenStateService().getScreenStateHelper().a().a) {
                com.bilibili.tgwt.detail.chat.p pVar = this.this$0.f111250b;
                if (pVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mVm");
                    pVar = null;
                }
                pVar.j0(surpriseEvent);
            }
        }
        return Unit.INSTANCE;
    }
}
