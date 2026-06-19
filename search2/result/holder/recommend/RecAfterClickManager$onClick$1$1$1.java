package com.bilibili.search2.result.holder.recommend;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import com.bilibili.search2.result.all.SearchResultAllFragment;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/RecAfterClickManager$onClick$1$1$1.class */
public final class RecAfterClickManager$onClick$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final SearchResultAllFragment $fragment;
    final LifecycleEventObserver $observer;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecAfterClickManager$onClick$1$1$1(SearchResultAllFragment searchResultAllFragment, LifecycleEventObserver lifecycleEventObserver, Continuation<? super RecAfterClickManager$onClick$1$1$1> continuation) {
        super(2, continuation);
        this.$fragment = searchResultAllFragment;
        this.$observer = lifecycleEventObserver;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecAfterClickManager$onClick$1$1$1(this.$fragment, this.$observer, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Lifecycle lifecycle;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FragmentActivity fragmentActivityP3 = this.$fragment.p3();
        if (fragmentActivityP3 != null && (lifecycle = fragmentActivityP3.getLifecycle()) != null) {
            lifecycle.removeObserver(this.$observer);
        }
        return Unit.INSTANCE;
    }
}
