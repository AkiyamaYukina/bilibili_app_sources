package com.bilibili.tgwt.detail.chat;

import com.bilibili.mobile.BLHumanActionParamsType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatVoiceFragment$subscribe$4.class */
final class ChatVoiceFragment$subscribe$4 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    boolean Z$0;
    int label;
    final ChatVoiceFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatVoiceFragment$subscribe$4(ChatVoiceFragment chatVoiceFragment, Continuation<? super ChatVoiceFragment$subscribe$4> continuation) {
        super(2, continuation);
        this.this$0 = chatVoiceFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatVoiceFragment$subscribe$4 chatVoiceFragment$subscribe$4 = new ChatVoiceFragment$subscribe$4(this.this$0, continuation);
        chatVoiceFragment$subscribe$4.Z$0 = ((Boolean) obj).booleanValue();
        return chatVoiceFragment$subscribe$4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
        return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean z6 = this.Z$0;
        u uVar = this.this$0.f111044b;
        u uVar2 = uVar;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
            uVar2 = null;
        }
        if (z6 != uVar2.f111154m) {
            uVar2.f111154m = z6;
            uVar2.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAIR_BLUR_STRENGTH);
        }
        return Unit.INSTANCE;
    }
}
