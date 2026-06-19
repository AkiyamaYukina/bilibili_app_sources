package com.bilibili.tgwt.detail.chat;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatVoiceFragment$subscribe$13.class */
final class ChatVoiceFragment$subscribe$13 extends SuspendLambda implements Function2<hu.a[], Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final ChatVoiceFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatVoiceFragment$subscribe$13(ChatVoiceFragment chatVoiceFragment, Continuation<? super ChatVoiceFragment$subscribe$13> continuation) {
        super(2, continuation);
        this.this$0 = chatVoiceFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatVoiceFragment$subscribe$13 chatVoiceFragment$subscribe$13 = new ChatVoiceFragment$subscribe$13(this.this$0, continuation);
        chatVoiceFragment$subscribe$13.L$0 = obj;
        return chatVoiceFragment$subscribe$13;
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
                u uVar3 = chatVoiceFragment.f111044b;
                if (uVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    uVar3 = null;
                }
                uVar3.f111148f.o(0.0f);
            } else {
                u uVar4 = chatVoiceFragment.f111044b;
                u uVar5 = uVar4;
                if (uVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("vm");
                    uVar5 = null;
                }
                if (Intrinsics.areEqual(aVar.a, String.valueOf(uVar5.f111149g.f111076j))) {
                    u uVar6 = chatVoiceFragment.f111044b;
                    if (uVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("vm");
                        uVar6 = null;
                    }
                    uVar6.f111149g.o(0.0f);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
