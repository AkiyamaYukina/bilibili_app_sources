package com.bilibili.ogv.misc.timeline.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import yk0.C9061a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/TimelinePagerKt$NewTimelinePager$1$2$1.class */
public final class TimelinePagerKt$NewTimelinePager$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final LazyListState $listState;
    final PagerState $pagerState;
    final int $scrollOffset;
    final C9061a $viewModel;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ogv.misc.timeline.ui.TimelinePagerKt$NewTimelinePager$1$2$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/TimelinePagerKt$NewTimelinePager$1$2$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        final LazyListState $listState;
        final PagerState $pagerState;
        final int $scrollOffset;
        final C9061a $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C9061a c9061a, PagerState pagerState, LazyListState lazyListState, int i7, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$viewModel = c9061a;
            this.$pagerState = pagerState;
            this.$listState = lazyListState;
            this.$scrollOffset = i7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$viewModel, this.$pagerState, this.$listState, this.$scrollOffset, continuation);
        }

        public final Object invoke(int i7, Continuation<? super Unit> continuation) {
            return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.$viewModel.f129728p.setValue(Integer.valueOf(this.$pagerState.getCurrentPage()));
                LazyListState lazyListState = this.$listState;
                int currentPage = this.$pagerState.getCurrentPage();
                int i8 = this.$scrollOffset;
                this.label = 1;
                if (lazyListState.animateScrollToItem(currentPage, i8, this) == coroutine_suspended) {
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
    public TimelinePagerKt$NewTimelinePager$1$2$1(PagerState pagerState, C9061a c9061a, LazyListState lazyListState, int i7, Continuation<? super TimelinePagerKt$NewTimelinePager$1$2$1> continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
        this.$viewModel = c9061a;
        this.$listState = lazyListState;
        this.$scrollOffset = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TimelinePagerKt$NewTimelinePager$1$2$1(this.$pagerState, this.$viewModel, this.$listState, this.$scrollOffset, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final PagerState pagerState = this.$pagerState;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0(pagerState) { // from class: com.bilibili.ogv.misc.timeline.ui.u

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PagerState f69604a;

                {
                    this.f69604a = pagerState;
                }

                public final Object invoke() {
                    return Integer.valueOf(this.f69604a.getCurrentPage());
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$viewModel, this.$pagerState, this.$listState, this.$scrollOffset, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowSnapshotFlow, anonymousClass2, this) == coroutine_suspended) {
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
