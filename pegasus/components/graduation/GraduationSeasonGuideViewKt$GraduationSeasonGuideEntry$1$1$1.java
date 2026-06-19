package com.bilibili.pegasus.components.graduation;

import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/GraduationSeasonGuideViewKt$GraduationSeasonGuideEntry$1$1$1.class */
final class GraduationSeasonGuideViewKt$GraduationSeasonGuideEntry$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $guideVisible;
    final MutableState<Boolean> $iconAnimationReady$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraduationSeasonGuideViewKt$GraduationSeasonGuideEntry$1$1$1(boolean z6, MutableState<Boolean> mutableState, Continuation<? super GraduationSeasonGuideViewKt$GraduationSeasonGuideEntry$1$1$1> continuation) {
        super(2, continuation);
        this.$guideVisible = z6;
        this.$iconAnimationReady$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GraduationSeasonGuideViewKt$GraduationSeasonGuideEntry$1$1$1(this.$guideVisible, this.$iconAnimationReady$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableState<Boolean> mutableState = this.$iconAnimationReady$delegate;
            float f7 = O.f76075a;
            mutableState.setValue(Boolean.FALSE);
            if (this.$guideVisible) {
                this.label = 1;
                if (DelayKt.delay(300L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MutableState<Boolean> mutableState2 = this.$iconAnimationReady$delegate;
        float f8 = O.f76075a;
        mutableState2.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
