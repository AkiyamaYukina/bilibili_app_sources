package com.bilibili.tgwt.im.ui;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/PlayerChatFragment$subscribeData$10.class */
final class PlayerChatFragment$subscribeData$10 extends SuspendLambda implements Function2<Pair<? extends String, ? extends Boolean>, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final PlayerChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerChatFragment$subscribeData$10(PlayerChatFragment playerChatFragment, Continuation<? super PlayerChatFragment$subscribeData$10> continuation) {
        super(2, continuation);
        this.this$0 = playerChatFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayerChatFragment$subscribeData$10 playerChatFragment$subscribeData$10 = new PlayerChatFragment$subscribeData$10(this.this$0, continuation);
        playerChatFragment$subscribeData$10.L$0 = obj;
        return playerChatFragment$subscribeData$10;
    }

    public final Object invoke(Pair<String, Boolean> pair, Continuation<? super Unit> continuation) {
        return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Pair pair = (Pair) this.L$0;
        com.bilibili.tgwt.detail.chat.p pVar = this.this$0.f111250b;
        com.bilibili.tgwt.detail.chat.p pVar2 = pVar;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            pVar2 = null;
        }
        pVar2.f111108T.set((String) pair.getFirst());
        com.bilibili.tgwt.detail.chat.p pVar3 = this.this$0.f111250b;
        if (pVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            pVar3 = null;
        }
        pVar3.f111107S.set(((Boolean) pair.getSecond()).booleanValue());
        return Unit.INSTANCE;
    }
}
