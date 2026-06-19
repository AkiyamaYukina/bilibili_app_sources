package com.bilibili.search2.result.all;

import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllFragment$setResult$1$2.class */
final class SearchResultAllFragment$setResult$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final RecyclerView.ItemAnimator $old;
    int label;
    final SearchResultAllFragment this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllFragment$setResult$1$2$a.class */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecyclerView f87229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RecyclerView.ItemAnimator f87230b;

        public a(RecyclerView recyclerView, RecyclerView.ItemAnimator itemAnimator) {
            this.f87229a = recyclerView;
            this.f87230b = itemAnimator;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f87229a.setItemAnimator(this.f87230b);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllFragment$setResult$1$2$b.class */
    public static final class b implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchResultAllFragment f87231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RecyclerView.ItemAnimator f87232b;

        public b(SearchResultAllFragment searchResultAllFragment, RecyclerView.ItemAnimator itemAnimator) {
            this.f87231a = searchResultAllFragment;
            this.f87232b = itemAnimator;
        }

        public final Unit invoke() {
            RecyclerView recyclerView = this.f87231a.h;
            if (recyclerView != null) {
                OneShotPreDrawListener.add(recyclerView, new a(recyclerView, this.f87232b));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultAllFragment$setResult$1$2(SearchResultAllFragment searchResultAllFragment, RecyclerView.ItemAnimator itemAnimator, Continuation<? super SearchResultAllFragment$setResult$1$2> continuation) {
        super(2, continuation);
        this.this$0 = searchResultAllFragment;
        this.$old = itemAnimator;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchResultAllFragment$setResult$1$2(this.this$0, this.$old, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r7
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L24
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            goto Lbd
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L24:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            com.bilibili.search2.result.all.SearchResultAllFragment r0 = r0.this$0
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            r8 = r0
            r0 = r7
            com.bilibili.search2.result.all.SearchResultAllFragment r0 = r0.this$0
            r15 = r0
            r0 = r7
            androidx.recyclerview.widget.RecyclerView$ItemAnimator r0 = r0.$old
            r13 = r0
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
            r12 = r0
            kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getMain()
            kotlinx.coroutines.MainCoroutineDispatcher r0 = r0.getImmediate()
            r14 = r0
            r0 = r14
            r1 = r7
            kotlin.coroutines.CoroutineContext r1 = r1.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L97
            r0 = r8
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 == r1) goto L8f
            r0 = r8
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            r1 = r12
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto L97
            r0 = r15
            androidx.recyclerview.widget.RecyclerView r0 = r0.h
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L88
            r0 = r8
            com.bilibili.search2.result.all.SearchResultAllFragment$setResult$1$2$a r1 = new com.bilibili.search2.result.all.SearchResultAllFragment$setResult$1$2$a
            r2 = r1
            r3 = r8
            r4 = r13
            r2.<init>(r3, r4)
            androidx.core.view.OneShotPreDrawListener r0 = androidx.core.view.OneShotPreDrawListener.add(r0, r1)
        L88:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r8 = r0
            goto Lbd
        L8f:
            androidx.lifecycle.LifecycleDestroyedException r0 = new androidx.lifecycle.LifecycleDestroyedException
            r1 = r0
            r1.<init>()
            throw r0
        L97:
            com.bilibili.search2.result.all.SearchResultAllFragment$setResult$1$2$b r0 = new com.bilibili.search2.result.all.SearchResultAllFragment$setResult$1$2$b
            r1 = r0
            r2 = r15
            r3 = r13
            r1.<init>(r2, r3)
            r13 = r0
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r8
            r1 = r12
            r2 = r10
            r3 = r14
            r4 = r13
            r5 = r7
            java.lang.Object r0 = androidx.lifecycle.Q.a(r0, r1, r2, r3, r4, r5)
            r1 = r11
            if (r0 != r1) goto Lbd
            r0 = r11
            return r0
        Lbd:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.all.SearchResultAllFragment$setResult$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
