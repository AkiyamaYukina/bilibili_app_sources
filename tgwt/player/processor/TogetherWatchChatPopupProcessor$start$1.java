package com.bilibili.tgwt.player.processor;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchChatPopupProcessor$start$1.class */
final class TogetherWatchChatPopupProcessor$start$1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    int I$0;
    int label;
    final f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchChatPopupProcessor$start$1(f fVar, Continuation<? super TogetherWatchChatPopupProcessor$start$1> continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TogetherWatchChatPopupProcessor$start$1 togetherWatchChatPopupProcessor$start$1 = new TogetherWatchChatPopupProcessor$start$1(this.this$0, continuation);
        togetherWatchChatPopupProcessor$start$1.I$0 = ((Number) obj).intValue();
        return togetherWatchChatPopupProcessor$start$1;
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
        f fVar = this.this$0;
        fVar.f111647g = i7;
        if (i7 != 0) {
            fVar.a();
        } else {
            fVar.b();
        }
        return Unit.INSTANCE;
    }
}
