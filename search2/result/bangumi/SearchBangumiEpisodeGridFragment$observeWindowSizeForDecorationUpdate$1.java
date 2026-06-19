package com.bilibili.search2.result.bangumi;

import androidx.compose.foundation.Q;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1.class */
final class SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final RecyclerView $recyclerView;
    int label;
    final SearchBangumiEpisodeGridFragment this$0;

    /* JADX INFO: renamed from: com.bilibili.search2.result.bangumi.SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.IntRef $lastWidthDp;
        final RecyclerView $recyclerView;
        int label;
        final SearchBangumiEpisodeGridFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.search2.result.bangumi.SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1$1.class */
        public static final class C05881 extends SuspendLambda implements Function2<FlowCollector<? super WindowSizeClass>, Continuation<? super Unit>, Object> {
            final FragmentActivity $activity;
            private Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05881(FragmentActivity fragmentActivity, Continuation<? super C05881> continuation) {
                super(2, continuation);
                this.$activity = fragmentActivity;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05881 c05881 = new C05881(this.$activity, continuation);
                c05881.L$0 = obj;
                return c05881;
            }

            public final Object invoke(FlowCollector<? super WindowSizeClass> flowCollector, Continuation<? super Unit> continuation) {
                return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    WindowSizeClass windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(this.$activity);
                    this.label = 1;
                    if (flowCollector.emit(windowSizeClassWindowSize, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.search2.result.bangumi.SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Ref.IntRef f87368a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final RecyclerView f87369b;

            public a(Ref.IntRef intRef, RecyclerView recyclerView) {
                this.f87368a = intRef;
                this.f87369b = recyclerView;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Unit unit;
                int iIntValue = ((Number) obj).intValue();
                Ref.IntRef intRef = this.f87368a;
                if (iIntValue == intRef.element) {
                    unit = Unit.INSTANCE;
                } else {
                    intRef.element = iIntValue;
                    this.f87369b.invalidateItemDecorations();
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SearchBangumiEpisodeGridFragment searchBangumiEpisodeGridFragment, Ref.IntRef intRef, RecyclerView recyclerView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = searchBangumiEpisodeGridFragment;
            this.$lastWidthDp = intRef;
            this.$recyclerView = recyclerView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$lastWidthDp, this.$recyclerView, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                FragmentActivity fragmentActivityP3 = this.this$0.p3();
                if (fragmentActivityP3 == null) {
                    return Unit.INSTANCE;
                }
                Flow flowOnStart = FlowKt.onStart(ScreenAdjustUtilsKt.windowSizeFlow(fragmentActivityP3), new C05881(fragmentActivityP3, null));
                a aVar = new a(this.$lastWidthDp, this.$recyclerView);
                this.label = 1;
                Object objCollect = flowOnStart.collect(new SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1$1$invokeSuspend$$inlined$map$1$2(aVar), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = Unit.INSTANCE;
                }
                if (objCollect == coroutine_suspended) {
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
    public SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1(RecyclerView recyclerView, SearchBangumiEpisodeGridFragment searchBangumiEpisodeGridFragment, Continuation<? super SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1> continuation) {
        super(2, continuation);
        this.$recyclerView = recyclerView;
        this.this$0 = searchBangumiEpisodeGridFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1(this.$recyclerView, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            Ref.IntRef intRefA = Q.a(obj);
            intRefA.element = ScreenAdjustUtilsKt.windowSize(this.$recyclerView.getContext()).getMinWidthDp();
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, intRefA, this.$recyclerView, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) anonymousClass1, (Continuation<? super Unit>) this) == coroutine_suspended) {
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
