package com.bilibili.playset.detail.widget;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/CoordinatorContentKt$CoordinatorContent$3$1$performFling$2.class */
public final class CoordinatorContentKt$CoordinatorContent$3$1$performFling$2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    final FlingBehavior $flingBehavior;
    final float $remain;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinatorContentKt$CoordinatorContent$3$1$performFling$2(FlingBehavior flingBehavior, float f7, Continuation<? super CoordinatorContentKt$CoordinatorContent$3$1$performFling$2> continuation) {
        super(2, continuation);
        this.$flingBehavior = flingBehavior;
        this.$remain = f7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CoordinatorContentKt$CoordinatorContent$3$1$performFling$2 coordinatorContentKt$CoordinatorContent$3$1$performFling$2 = new CoordinatorContentKt$CoordinatorContent$3$1$performFling$2(this.$flingBehavior, this.$remain, continuation);
        coordinatorContentKt$CoordinatorContent$3$1$performFling$2.L$0 = obj;
        return coordinatorContentKt$CoordinatorContent$3$1$performFling$2;
    }

    public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
        return create(scrollScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ScrollScope scrollScope = (ScrollScope) this.L$0;
            FlingBehavior flingBehavior = this.$flingBehavior;
            float f7 = -this.$remain;
            this.label = 1;
            if (flingBehavior.performFling(scrollScope, f7, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
