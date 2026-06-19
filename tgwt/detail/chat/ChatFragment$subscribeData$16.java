package com.bilibili.tgwt.detail.chat;

import com.bilibili.mobile.BLHumanActionParamsType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatFragment$subscribeData$16.class */
final class ChatFragment$subscribeData$16 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    boolean Z$0;
    int label;
    final ChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$subscribeData$16(ChatFragment chatFragment, Continuation<? super ChatFragment$subscribeData$16> continuation) {
        super(2, continuation);
        this.this$0 = chatFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatFragment$subscribeData$16 chatFragment$subscribeData$16 = new ChatFragment$subscribeData$16(this.this$0, continuation);
        chatFragment$subscribeData$16.Z$0 = ((Boolean) obj).booleanValue();
        return chatFragment$subscribeData$16;
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
        p pVar = this.this$0.f111021k;
        p pVar2 = pVar;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
            pVar2 = null;
        }
        if (z6 != pVar2.f111121g) {
            pVar2.f111121g = z6;
            pVar2.notifyPropertyChanged(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_SEGMENT_REFINE_CPU_PROCESS);
        }
        return Unit.INSTANCE;
    }
}
