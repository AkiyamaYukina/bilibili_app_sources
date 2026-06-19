package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/RestrictionPlaylistUIComponent$AutoScrollingLazyRow$1$1.class */
final class RestrictionPlaylistUIComponent$AutoScrollingLazyRow$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final LazyListState $lazyListState;
    final CoroutineScope $scope;
    final float $scrollDx;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionPlaylistUIComponent$AutoScrollingLazyRow$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/RestrictionPlaylistUIComponent$AutoScrollingLazyRow$1$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final LazyListState $lazyListState;
        final float $scrollDx;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState, float f7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$lazyListState = lazyListState;
            this.$scrollDx = f7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$lazyListState, this.$scrollDx, continuation);
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
                int iMax = Math.max(0, lazyListState.getFirstVisibleItemScrollOffset() - ((int) this.$scrollDx));
                this.label = 1;
                if (lazyListState.scrollToItem(0, iMax, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestrictionPlaylistUIComponent$AutoScrollingLazyRow$1$1(CoroutineScope coroutineScope, LazyListState lazyListState, float f7, Continuation<? super RestrictionPlaylistUIComponent$AutoScrollingLazyRow$1$1> continuation) {
        super(2, continuation);
        this.$scope = coroutineScope;
        this.$lazyListState = lazyListState;
        this.$scrollDx = f7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RestrictionPlaylistUIComponent$AutoScrollingLazyRow$1$1(this.$scope, this.$lazyListState, this.$scrollDx, continuation);
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
        BuildersKt.launch$default(this.$scope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$lazyListState, this.$scrollDx, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
