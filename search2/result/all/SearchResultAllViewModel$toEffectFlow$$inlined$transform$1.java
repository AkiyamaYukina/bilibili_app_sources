package com.bilibili.search2.result.all;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllViewModel$toEffectFlow$$inlined$transform$1.class */
public final class SearchResultAllViewModel$toEffectFlow$$inlined$transform$1 extends SuspendLambda implements Function2<FlowCollector<? super com.bilibili.search2.result.base.q>, Continuation<? super Unit>, Object> {
    final Flow $this_transform;
    private Object L$0;
    int label;
    final SearchResultAllViewModel this$0;

    /* JADX INFO: renamed from: com.bilibili.search2.result.all.SearchResultAllViewModel$toEffectFlow$$inlined$transform$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllViewModel$toEffectFlow$$inlined$transform$1$1.class */
    public static final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlowCollector<com.bilibili.search2.result.base.q> f87264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SearchResultAllViewModel f87265b;

        /* JADX INFO: renamed from: com.bilibili.search2.result.all.SearchResultAllViewModel$toEffectFlow$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllViewModel$toEffectFlow$$inlined$transform$1$1$1.class */
        public static final class C05841 extends ContinuationImpl {
            int label;
            Object result;
            final AnonymousClass1 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05841(AnonymousClass1 anonymousClass1, Continuation continuation) {
                super(continuation);
                this.this$0 = anonymousClass1;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        public AnonymousClass1(FlowCollector flowCollector, SearchResultAllViewModel searchResultAllViewModel) {
            this.f87265b = searchResultAllViewModel;
            this.f87264a = flowCollector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.all.SearchResultAllViewModel$toEffectFlow$$inlined$transform$1.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultAllViewModel$toEffectFlow$$inlined$transform$1(Flow flow, Continuation continuation, SearchResultAllViewModel searchResultAllViewModel) {
        super(2, continuation);
        this.$this_transform = flow;
        this.this$0 = searchResultAllViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchResultAllViewModel$toEffectFlow$$inlined$transform$1 searchResultAllViewModel$toEffectFlow$$inlined$transform$1 = new SearchResultAllViewModel$toEffectFlow$$inlined$transform$1(this.$this_transform, continuation, this.this$0);
        searchResultAllViewModel$toEffectFlow$$inlined$transform$1.L$0 = obj;
        return searchResultAllViewModel$toEffectFlow$$inlined$transform$1;
    }

    public final Object invoke(FlowCollector<? super com.bilibili.search2.result.base.q> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flow = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(flowCollector, this.this$0);
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == coroutine_suspended) {
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
