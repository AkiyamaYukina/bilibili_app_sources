package com.bilibili.playset.detail.widget;

import com.bilibili.playset.detail.data.f;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/StaggeredMixedLayoutKt$StaggeredMixedLayout$1$3$1.class */
final class StaggeredMixedLayoutKt$StaggeredMixedLayout$1$3$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Function1<com.bilibili.playset.detail.data.f, Unit> $onAction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StaggeredMixedLayoutKt$StaggeredMixedLayout$1$3$1(Function1<? super com.bilibili.playset.detail.data.f, Unit> function1, Continuation<? super StaggeredMixedLayoutKt$StaggeredMixedLayout$1$3$1> continuation) {
        super(1, continuation);
        this.$onAction = function1;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new StaggeredMixedLayoutKt$StaggeredMixedLayout$1$3$1(this.$onAction, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$onAction.invoke(f.o.f84488a);
        return Unit.INSTANCE;
    }
}
