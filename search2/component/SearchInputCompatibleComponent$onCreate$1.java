package com.bilibili.search2.component;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.search2.main.BiliMainSearchActivity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/component/SearchInputCompatibleComponent$onCreate$1.class */
public final class SearchInputCompatibleComponent$onCreate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final SearchInputCompatibleComponent this$0;

    /* JADX INFO: renamed from: com.bilibili.search2.component.SearchInputCompatibleComponent$onCreate$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/component/SearchInputCompatibleComponent$onCreate$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final SearchInputCompatibleComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.search2.component.SearchInputCompatibleComponent$onCreate$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/component/SearchInputCompatibleComponent$onCreate$1$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SearchInputCompatibleComponent f86390a;

            public a(SearchInputCompatibleComponent searchInputCompatibleComponent) {
                this.f86390a = searchInputCompatibleComponent;
            }

            public final Object emit(Object obj, Continuation continuation) {
                SearchInputCompatibleComponent searchInputCompatibleComponent = this.f86390a;
                searchInputCompatibleComponent.f86387d = (WindowSizeClass) obj;
                searchInputCompatibleComponent.b();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SearchInputCompatibleComponent searchInputCompatibleComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = searchInputCompatibleComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowWindowSizeFlow = ScreenAdjustUtilsKt.windowSizeFlow(this.this$0.f86384a);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowWindowSizeFlow.collect(aVar, this) == coroutine_suspended) {
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
    public SearchInputCompatibleComponent$onCreate$1(SearchInputCompatibleComponent searchInputCompatibleComponent, Continuation<? super SearchInputCompatibleComponent$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = searchInputCompatibleComponent;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchInputCompatibleComponent$onCreate$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SearchInputCompatibleComponent searchInputCompatibleComponent = this.this$0;
            BiliMainSearchActivity biliMainSearchActivity = searchInputCompatibleComponent.f86384a;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(searchInputCompatibleComponent, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(biliMainSearchActivity, state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) anonymousClass1, (Continuation<? super Unit>) this) == coroutine_suspended) {
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
