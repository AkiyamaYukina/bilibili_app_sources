package com.bilibili.tgwt.im.ui;

import androidx.databinding.ObservableBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatFragment$subscribeData$4.class */
final class PlayerChatFragment$subscribeData$4 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    int I$0;
    int label;
    final PlayerChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerChatFragment$subscribeData$4(PlayerChatFragment playerChatFragment, Continuation<? super PlayerChatFragment$subscribeData$4> continuation) {
        super(2, continuation);
        this.this$0 = playerChatFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayerChatFragment$subscribeData$4 playerChatFragment$subscribeData$4 = new PlayerChatFragment$subscribeData$4(this.this$0, continuation);
        playerChatFragment$subscribeData$4.I$0 = ((Number) obj).intValue();
        return playerChatFragment$subscribeData$4;
    }

    public final Object invoke(int i7, Continuation<? super Unit> continuation) {
        return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i7 = this.I$0;
        com.bilibili.tgwt.detail.chat.p pVar = this.this$0.f111250b;
        com.bilibili.tgwt.detail.chat.p pVar2 = pVar;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            pVar2 = null;
        }
        pVar2.f111100L.set(i7 != 2);
        com.bilibili.tgwt.detail.chat.p pVar3 = this.this$0.f111250b;
        if (pVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            pVar3 = null;
        }
        ObservableBoolean observableBoolean = pVar3.f111101M;
        boolean z6 = false;
        if (i7 != 2) {
            z6 = true;
        }
        observableBoolean.set(z6);
        PlayerChatFragment.jf(this.this$0);
        return Unit.INSTANCE;
    }
}
