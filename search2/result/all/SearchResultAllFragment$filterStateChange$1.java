package com.bilibili.search2.result.all;

import Yt0.C3153g;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllFragment$filterStateChange$1.class */
public final class SearchResultAllFragment$filterStateChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $clicking;
    int label;
    final SearchResultAllFragment this$0;

    /* JADX INFO: renamed from: com.bilibili.search2.result.all.SearchResultAllFragment$filterStateChange$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllFragment$filterStateChange$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final boolean $clicking;
        int label;
        final SearchResultAllFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SearchResultAllFragment searchResultAllFragment, boolean z6, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = searchResultAllFragment;
            this.$clicking = z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$clicking, continuation);
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
            C3153g c3153g = this.this$0.f87207v;
            if (c3153g != null) {
                c3153g.g(this.$clicking);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultAllFragment$filterStateChange$1(SearchResultAllFragment searchResultAllFragment, boolean z6, Continuation<? super SearchResultAllFragment$filterStateChange$1> continuation) {
        super(2, continuation);
        this.this$0 = searchResultAllFragment;
        this.$clicking = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchResultAllFragment$filterStateChange$1(this.this$0, this.$clicking, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowFilterNotNull = FlowKt.filterNotNull(FlowLiveDataConversions.a(this.this$0.getViewLifecycleOwnerLiveData()));
            this.label = 1;
            Object objFirst = FlowKt.first(flowFilterNotNull, this);
            obj = objFirst;
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) obj), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$clicking, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
