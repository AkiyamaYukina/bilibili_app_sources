package com.bilibili.tgwt.detail.chat;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatVoiceFragment$subscribe$11.class */
final class ChatVoiceFragment$subscribe$11 extends SuspendLambda implements Function2<hu.a, Continuation<? super Unit>, Object> {
    int label;
    final ChatVoiceFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatVoiceFragment$subscribe$11(ChatVoiceFragment chatVoiceFragment, Continuation<? super ChatVoiceFragment$subscribe$11> continuation) {
        super(2, continuation);
        this.this$0 = chatVoiceFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatVoiceFragment$subscribe$11(this.this$0, continuation);
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
        u uVar = this.this$0.f111044b;
        u uVar2 = uVar;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            uVar2 = null;
        }
        if (uVar2.f111148f.f111075i) {
            u uVar3 = this.this$0.f111044b;
            if (uVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                uVar3 = null;
            }
            uVar3.f111148f.o(0.0f);
        } else {
            u uVar4 = this.this$0.f111044b;
            if (uVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                uVar4 = null;
            }
            uVar4.f111149g.o(0.0f);
        }
        return Unit.INSTANCE;
    }
}
