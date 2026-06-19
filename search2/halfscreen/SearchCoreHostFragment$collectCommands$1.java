package com.bilibili.search2.halfscreen;

import Ns0.b;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bilibili.search2.halfscreen.g;
import com.bilibili.search2.main.BiliMainSearchCoreFragment;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/SearchCoreHostFragment$collectCommands$1.class */
final class SearchCoreHostFragment$collectCommands$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final SearchCoreHostFragment this$0;

    /* JADX INFO: renamed from: com.bilibili.search2.halfscreen.SearchCoreHostFragment$collectCommands$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/SearchCoreHostFragment$collectCommands$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final SearchCoreHostFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.search2.halfscreen.SearchCoreHostFragment$collectCommands$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/SearchCoreHostFragment$collectCommands$1$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SearchCoreHostFragment f86552a;

            public a(SearchCoreHostFragment searchCoreHostFragment) {
                this.f86552a = searchCoreHostFragment;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Ns0.b bVar = (Ns0.b) obj;
                boolean z6 = bVar instanceof b.a;
                SearchCoreHostFragment searchCoreHostFragment = this.f86552a;
                if (z6) {
                    m mVarJf = searchCoreHostFragment.jf();
                    b.a aVar = (b.a) bVar;
                    mVarJf.J0(new g.a(aVar.f17431a, aVar.f17432b));
                } else if (bVar instanceof b.C0099b) {
                    BiliMainSearchCoreFragment biliMainSearchCoreFragmentM8676if = searchCoreHostFragment.m8676if();
                    if (biliMainSearchCoreFragmentM8676if != null) {
                        biliMainSearchCoreFragmentM8676if.kf().f86765m.tryEmit(Unit.INSTANCE);
                    }
                } else {
                    searchCoreHostFragment.jf().J0(new g.d(bVar));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SearchCoreHostFragment searchCoreHostFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = searchCoreHostFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
                SearchCoreHostFragment searchCoreHostFragment = this.this$0;
                MutableSharedFlow<Ns0.b> mutableSharedFlow = searchCoreHostFragment.f86550j;
                a aVar = new a(searchCoreHostFragment);
                this.label = 1;
                if (mutableSharedFlow.collect(aVar, this) == coroutine_suspended) {
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
    public SearchCoreHostFragment$collectCommands$1(SearchCoreHostFragment searchCoreHostFragment, Continuation<? super SearchCoreHostFragment$collectCommands$1> continuation) {
        super(2, continuation);
        this.this$0 = searchCoreHostFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchCoreHostFragment$collectCommands$1(this.this$0, continuation);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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
