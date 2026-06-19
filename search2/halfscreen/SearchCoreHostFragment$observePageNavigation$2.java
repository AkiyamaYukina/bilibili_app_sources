package com.bilibili.search2.halfscreen;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bilibili.search2.halfscreen.g;
import com.bilibili.search2.main.data.SearchPageStateModel;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/SearchCoreHostFragment$observePageNavigation$2.class */
final class SearchCoreHostFragment$observePageNavigation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final SearchPageStateModel $stateModel;
    int label;
    final SearchCoreHostFragment this$0;

    /* JADX INFO: renamed from: com.bilibili.search2.halfscreen.SearchCoreHostFragment$observePageNavigation$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/SearchCoreHostFragment$observePageNavigation$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final SearchPageStateModel $stateModel;
        int label;
        final SearchCoreHostFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.search2.halfscreen.SearchCoreHostFragment$observePageNavigation$2$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/SearchCoreHostFragment$observePageNavigation$2$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SearchCoreHostFragment f86554a;

            public a(SearchCoreHostFragment searchCoreHostFragment) {
                this.f86554a = searchCoreHostFragment;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f86554a.jf().J0(new g.e((SearchPageStateModel.DisplayPage) obj));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SearchPageStateModel searchPageStateModel, SearchCoreHostFragment searchCoreHostFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$stateModel = searchPageStateModel;
            this.this$0 = searchCoreHostFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$stateModel, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<SearchPageStateModel.DisplayPage> sharedFlow = this.$stateModel.f86775w;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCoreHostFragment$observePageNavigation$2(SearchCoreHostFragment searchCoreHostFragment, SearchPageStateModel searchPageStateModel, Continuation<? super SearchCoreHostFragment$observePageNavigation$2> continuation) {
        super(2, continuation);
        this.this$0 = searchCoreHostFragment;
        this.$stateModel = searchPageStateModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchCoreHostFragment$observePageNavigation$2(this.this$0, this.$stateModel, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$stateModel, this.this$0, null);
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
