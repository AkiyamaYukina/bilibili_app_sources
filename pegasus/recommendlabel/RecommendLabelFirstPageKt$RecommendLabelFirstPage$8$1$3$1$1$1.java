package com.bilibili.pegasus.recommendlabel;

import androidx.compose.material.I2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelFirstPageKt$RecommendLabelFirstPage$8$1$3$1$1$1.class */
final class RecommendLabelFirstPageKt$RecommendLabelFirstPage$8$1$3$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final I2 $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendLabelFirstPageKt$RecommendLabelFirstPage$8$1$3$1$1$1(I2 i22, Continuation<? super RecommendLabelFirstPageKt$RecommendLabelFirstPage$8$1$3$1$1$1> continuation) {
        super(2, continuation);
        this.$sheetState = i22;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecommendLabelFirstPageKt$RecommendLabelFirstPage$8$1$3$1$1$1(this.$sheetState, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            I2 i22 = this.$sheetState;
            this.label = 1;
            if (i22.d(this) == coroutine_suspended) {
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
