package com.bilibili.ogv.rank;

import androidx.compose.foundation.pager.PagerState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/PageReadyUiKt$TabContent$1$1$1.class */
public final class PageReadyUiKt$TabContent$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $index;
    final PagerState $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageReadyUiKt$TabContent$1$1$1(PagerState pagerState, int i7, Continuation<? super PageReadyUiKt$TabContent$1$1$1> continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
        this.$index = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PageReadyUiKt$TabContent$1$1$1(this.$pagerState, this.$index, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            PagerState pagerState = this.$pagerState;
            int i8 = this.$index;
            this.label = 1;
            if (PagerState.animateScrollToPage$default(pagerState, i8, 0.0f, null, this, 6, null) == coroutine_suspended) {
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
