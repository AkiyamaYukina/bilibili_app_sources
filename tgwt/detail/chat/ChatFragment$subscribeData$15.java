package com.bilibili.tgwt.detail.chat;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatFragment$subscribeData$15.class */
final class ChatFragment$subscribeData$15 extends SuspendLambda implements Function2<Pair<? extends String, ? extends Boolean>, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final ChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$subscribeData$15(ChatFragment chatFragment, Continuation<? super ChatFragment$subscribeData$15> continuation) {
        super(2, continuation);
        this.this$0 = chatFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatFragment$subscribeData$15 chatFragment$subscribeData$15 = new ChatFragment$subscribeData$15(this.this$0, continuation);
        chatFragment$subscribeData$15.L$0 = obj;
        return chatFragment$subscribeData$15;
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
        p pVar = this.this$0.f111021k;
        p pVar2 = pVar;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
            pVar2 = null;
        }
        pVar2.f111108T.set((String) pair.getFirst());
        p pVar3 = this.this$0.f111021k;
        if (pVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
            pVar3 = null;
        }
        pVar3.f111107S.set(((Boolean) pair.getSecond()).booleanValue());
        return Unit.INSTANCE;
    }
}
