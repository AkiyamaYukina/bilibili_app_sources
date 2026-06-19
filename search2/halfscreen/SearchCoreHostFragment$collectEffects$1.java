package com.bilibili.search2.halfscreen;

import android.view.Window;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bilibili.search2.halfscreen.b;
import com.bilibili.search2.main.BiliMainSearchCoreFragment;
import com.bilibili.search2.main.data.SearchPageStateModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/SearchCoreHostFragment$collectEffects$1.class */
final class SearchCoreHostFragment$collectEffects$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final SearchCoreHostFragment this$0;

    /* JADX INFO: renamed from: com.bilibili.search2.halfscreen.SearchCoreHostFragment$collectEffects$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/SearchCoreHostFragment$collectEffects$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final SearchCoreHostFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.search2.halfscreen.SearchCoreHostFragment$collectEffects$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/SearchCoreHostFragment$collectEffects$1$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SearchCoreHostFragment f86553a;

            public a(SearchCoreHostFragment searchCoreHostFragment) {
                this.f86553a = searchCoreHostFragment;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object emit(Object obj, Continuation continuation) throws Exception {
                Object objEmit;
                b bVar = (b) obj;
                boolean z6 = bVar instanceof b.c;
                SearchCoreHostFragment searchCoreHostFragment = this.f86553a;
                if (z6) {
                    objEmit = searchCoreHostFragment.f86547f.emit(((b.c) bVar).f86559a, continuation);
                    if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objEmit = Unit.INSTANCE;
                    }
                } else {
                    if (bVar instanceof b.d) {
                        BiliMainSearchCoreFragment biliMainSearchCoreFragmentM8676if = searchCoreHostFragment.m8676if();
                        if (biliMainSearchCoreFragmentM8676if != null) {
                            biliMainSearchCoreFragmentM8676if.mf();
                            Boxing.boxBoolean(true);
                        }
                    } else if (bVar instanceof b.C0578b) {
                        BiliMainSearchCoreFragment biliMainSearchCoreFragmentM8676if2 = searchCoreHostFragment.m8676if();
                        SearchPageStateModel searchPageStateModelKf = biliMainSearchCoreFragmentM8676if2 != null ? biliMainSearchCoreFragmentM8676if2.kf() : null;
                        if (searchPageStateModelKf != null) {
                            MutableLiveData<Boolean> mutableLiveData = searchPageStateModelKf.f86771s;
                            if (Intrinsics.areEqual(mutableLiveData.getValue(), Boolean.TRUE)) {
                                mutableLiveData.setValue(Boolean.FALSE);
                            }
                        }
                    } else {
                        if (!(bVar instanceof b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Window windowHf = searchCoreHostFragment.hf();
                        if (windowHf != null) {
                            if (searchCoreHostFragment.f86546e == null) {
                                searchCoreHostFragment.f86546e = Boxing.boxBoolean(WindowCompat.getInsetsController(windowHf, windowHf.getDecorView()).isAppearanceLightStatusBars());
                            }
                            WindowCompat.getInsetsController(windowHf, windowHf.getDecorView()).setAppearanceLightStatusBars(((b.a) bVar).f86557a);
                        }
                    }
                    objEmit = Unit.INSTANCE;
                }
                return objEmit;
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

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<b> flow = this.this$0.jf().f86612d;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flow.collect(aVar, this) == coroutine_suspended) {
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
    public SearchCoreHostFragment$collectEffects$1(SearchCoreHostFragment searchCoreHostFragment, Continuation<? super SearchCoreHostFragment$collectEffects$1> continuation) {
        super(2, continuation);
        this.this$0 = searchCoreHostFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchCoreHostFragment$collectEffects$1(this.this$0, continuation);
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
