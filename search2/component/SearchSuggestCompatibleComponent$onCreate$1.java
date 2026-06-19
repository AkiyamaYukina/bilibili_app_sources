package com.bilibili.search2.component;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.search2.main.BiliMainSearchSuggestFragment;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/component/SearchSuggestCompatibleComponent$onCreate$1.class */
public final class SearchSuggestCompatibleComponent$onCreate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FragmentActivity $activity;
    int label;
    final SearchSuggestCompatibleComponent this$0;

    /* JADX INFO: renamed from: com.bilibili.search2.component.SearchSuggestCompatibleComponent$onCreate$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/component/SearchSuggestCompatibleComponent$onCreate$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final FragmentActivity $activity;
        int label;
        final SearchSuggestCompatibleComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.search2.component.SearchSuggestCompatibleComponent$onCreate$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/component/SearchSuggestCompatibleComponent$onCreate$1$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SearchSuggestCompatibleComponent f86396a;

            public a(SearchSuggestCompatibleComponent searchSuggestCompatibleComponent) {
                this.f86396a = searchSuggestCompatibleComponent;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f86396a.b((WindowSizeClass) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FragmentActivity fragmentActivity, SearchSuggestCompatibleComponent searchSuggestCompatibleComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activity = fragmentActivity;
            this.this$0 = searchSuggestCompatibleComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$activity, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(ScreenAdjustUtilsKt.windowSizeFlow(this.$activity));
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowDistinctUntilChanged.collect(aVar, this) == coroutine_suspended) {
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
    public SearchSuggestCompatibleComponent$onCreate$1(SearchSuggestCompatibleComponent searchSuggestCompatibleComponent, FragmentActivity fragmentActivity, Continuation<? super SearchSuggestCompatibleComponent$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = searchSuggestCompatibleComponent;
        this.$activity = fragmentActivity;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchSuggestCompatibleComponent$onCreate$1(this.this$0, this.$activity, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SearchSuggestCompatibleComponent searchSuggestCompatibleComponent = this.this$0;
            BiliMainSearchSuggestFragment biliMainSearchSuggestFragment = searchSuggestCompatibleComponent.f86394a;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$activity, searchSuggestCompatibleComponent, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(biliMainSearchSuggestFragment, state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) anonymousClass1, (Continuation<? super Unit>) this) == coroutine_suspended) {
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
