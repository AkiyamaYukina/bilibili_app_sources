package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.lifecycle.Lifecycle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/RestrictionPlaylistUIComponent$AutoScrollingLazyRow$3$1$ob$1$1.class */
final class RestrictionPlaylistUIComponent$AutoScrollingLazyRow$3$1$ob$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $delayBetweenScrollMs;
    final LazyListState $lazyListState;
    final Lifecycle $lifecycle;
    final float $scrollDx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestrictionPlaylistUIComponent$AutoScrollingLazyRow$3$1$ob$1$1(LazyListState lazyListState, float f7, long j7, Lifecycle lifecycle, Continuation<? super RestrictionPlaylistUIComponent$AutoScrollingLazyRow$3$1$ob$1$1> continuation) {
        super(2, continuation);
        this.$lazyListState = lazyListState;
        this.$scrollDx = f7;
        this.$delayBetweenScrollMs = j7;
        this.$lifecycle = lifecycle;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RestrictionPlaylistUIComponent$AutoScrollingLazyRow$3$1$ob$1$1(this.$lazyListState, this.$scrollDx, this.$delayBetweenScrollMs, this.$lifecycle, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            LazyListState lazyListState = this.$lazyListState;
            float f7 = this.$scrollDx;
            long j7 = this.$delayBetweenScrollMs;
            Lifecycle lifecycle = this.$lifecycle;
            this.label = 1;
            if (U.b(lazyListState, f7, j7, lifecycle, this) == coroutine_suspended) {
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
