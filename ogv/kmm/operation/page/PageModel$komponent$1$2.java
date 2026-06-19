package com.bilibili.ogv.kmm.operation.page;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import kntr.base.account.KAccountStoreKt;
import kntr.common.komponent.KomponentScope;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/PageModel$komponent$1$2.class */
final class PageModel$komponent$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<Boolean> $lastIsNormalWindow;
    final Ref.ObjectRef<q91.i> $lastRefreshTime;
    final KomponentScope<com.bilibili.ogv.kmm.operation.page.a> $this_Komponent;
    final MutableState<p> $uiState$delegate;
    int label;
    final o this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/PageModel$komponent$1$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KomponentScope<com.bilibili.ogv.kmm.operation.page.a> f68550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Ref.ObjectRef<q91.i> f68551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o f68552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Ref.ObjectRef<Boolean> f68553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MutableState<p> f68554e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(KomponentScope<? super com.bilibili.ogv.kmm.operation.page.a> komponentScope, Ref.ObjectRef<q91.i> objectRef, o oVar, Ref.ObjectRef<Boolean> objectRef2, MutableState<p> mutableState) {
            this.f68550a = komponentScope;
            this.f68551b = objectRef;
            this.f68552c = oVar;
            this.f68553d = objectRef2;
            this.f68554e = mutableState;
        }

        public final Object emit(Object obj, Continuation continuation) {
            o.a(this.f68550a, this.f68551b, this.f68552c, this.f68553d, this.f68554e);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PageModel$komponent$1$2(o oVar, KomponentScope<? super com.bilibili.ogv.kmm.operation.page.a> komponentScope, Ref.ObjectRef<q91.i> objectRef, Ref.ObjectRef<Boolean> objectRef2, MutableState<p> mutableState, Continuation<? super PageModel$komponent$1$2> continuation) {
        super(2, continuation);
        this.this$0 = oVar;
        this.$this_Komponent = komponentScope;
        this.$lastRefreshTime = objectRef;
        this.$lastIsNormalWindow = objectRef2;
        this.$uiState$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PageModel$komponent$1$2(this.this$0, this.$this_Komponent, this.$lastRefreshTime, this.$lastIsNormalWindow, this.$uiState$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowDrop = FlowKt.drop(FlowKt.distinctUntilChanged(FlowExtKt.flowWithLifecycle(KAccountStoreKt.getAccountHolder().getState(), this.this$0.f68639c, Lifecycle.State.RESUMED)), 1);
            a aVar = new a(this.$this_Komponent, this.$lastRefreshTime, this.this$0, this.$lastIsNormalWindow, this.$uiState$delegate);
            this.label = 1;
            if (flowDrop.collect(aVar, this) == coroutine_suspended) {
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
