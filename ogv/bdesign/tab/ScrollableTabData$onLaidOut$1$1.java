package com.bilibili.ogv.bdesign.tab;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ScrollState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bdesign/tab/ScrollableTabData$onLaidOut$1$1.class */
final class ScrollableTabData$onLaidOut$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $calculatedOffset;
    int label;
    final d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableTabData$onLaidOut$1$1(d dVar, int i7, Continuation<? super ScrollableTabData$onLaidOut$1$1> continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$calculatedOffset = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScrollableTabData$onLaidOut$1$1(this.this$0, this.$calculatedOffset, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ScrollState scrollState = this.this$0.f67426a;
            int i8 = this.$calculatedOffset;
            TweenSpec tweenSpec = m.f67480c;
            this.label = 1;
            if (scrollState.animateScrollTo(i8, tweenSpec, this) == coroutine_suspended) {
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
