package com.bilibili.ogv.misc.timeline.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/TimelinePagerKt$NewTimelinePager$1$3$1$1$1$1$1.class */
final class TimelinePagerKt$NewTimelinePager$1$3$1$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final LazyListState $listState;
    final PagerState $pagerState;
    final int $position;
    final int $scrollOffset;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelinePagerKt$NewTimelinePager$1$3$1$1$1$1$1(LazyListState lazyListState, int i7, int i8, PagerState pagerState, Continuation<? super TimelinePagerKt$NewTimelinePager$1$3$1$1$1$1$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$position = i7;
        this.$scrollOffset = i8;
        this.$pagerState = pagerState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TimelinePagerKt$NewTimelinePager$1$3$1$1$1$1$1(this.$listState, this.$position, this.$scrollOffset, this.$pagerState, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            LazyListState lazyListState = this.$listState;
            int i8 = this.$position;
            int i9 = this.$scrollOffset;
            this.label = 1;
            if (lazyListState.scrollToItem(i8, i9, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        PagerState pagerState = this.$pagerState;
        int i10 = this.$position;
        this.label = 2;
        if (PagerState.scrollToPage$default(pagerState, i10, 0.0f, this, 2, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
