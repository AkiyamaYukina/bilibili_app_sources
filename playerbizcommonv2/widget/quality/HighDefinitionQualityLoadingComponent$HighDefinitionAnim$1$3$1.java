package com.bilibili.playerbizcommonv2.widget.quality;

import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/HighDefinitionQualityLoadingComponent$HighDefinitionAnim$1$3$1.class */
public final class HighDefinitionQualityLoadingComponent$HighDefinitionAnim$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $boxWidthPx;
    final MutableState<Float> $contentBlurTarget$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighDefinitionQualityLoadingComponent$HighDefinitionAnim$1$3$1(int i7, MutableState<Float> mutableState, Continuation<? super HighDefinitionQualityLoadingComponent$HighDefinitionAnim$1$3$1> continuation) {
        super(2, continuation);
        this.$boxWidthPx = i7;
        this.$contentBlurTarget$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HighDefinitionQualityLoadingComponent$HighDefinitionAnim$1$3$1(this.$boxWidthPx, this.$contentBlurTarget$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$boxWidthPx <= 0) {
                return Unit.INSTANCE;
            }
            MutableState<Float> mutableState = this.$contentBlurTarget$delegate;
            int i8 = HighDefinitionQualityLoadingComponent.f82674e;
            mutableState.setValue(Float.valueOf(0.0f));
            this.label = 1;
            if (DelayKt.delay(1100L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        MutableState<Float> mutableState2 = this.$contentBlurTarget$delegate;
        int i9 = HighDefinitionQualityLoadingComponent.f82674e;
        mutableState2.setValue(Float.valueOf(20.0f));
        return Unit.INSTANCE;
    }
}
