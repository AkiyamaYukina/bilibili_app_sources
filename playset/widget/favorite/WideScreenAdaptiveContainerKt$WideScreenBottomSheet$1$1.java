package com.bilibili.playset.widget.favorite;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/WideScreenAdaptiveContainerKt$WideScreenBottomSheet$1$1.class */
public final class WideScreenAdaptiveContainerKt$WideScreenBottomSheet$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final a $animationState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WideScreenAdaptiveContainerKt$WideScreenBottomSheet$1$1(a aVar, Continuation<? super WideScreenAdaptiveContainerKt$WideScreenBottomSheet$1$1> continuation) {
        super(2, continuation);
        this.$animationState = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WideScreenAdaptiveContainerKt$WideScreenBottomSheet$1$1(this.$animationState, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        a aVar = this.$animationState;
        aVar.f85736a.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
