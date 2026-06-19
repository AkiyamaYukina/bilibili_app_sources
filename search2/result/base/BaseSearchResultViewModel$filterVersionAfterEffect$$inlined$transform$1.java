package com.bilibili.search2.result.base;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$filterVersionAfterEffect$$inlined$transform$1.class */
public final class BaseSearchResultViewModel$filterVersionAfterEffect$$inlined$transform$1 extends SuspendLambda implements Function2<FlowCollector<? super q>, Continuation<? super Unit>, Object> {
    final Flow $this_transform;
    private Object L$0;
    int label;
    final BaseSearchResultViewModel this$0;

    /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$filterVersionAfterEffect$$inlined$transform$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$filterVersionAfterEffect$$inlined$transform$1$1.class */
    public static final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlowCollector<q> f87507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BaseSearchResultViewModel f87508b;

        /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$filterVersionAfterEffect$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$filterVersionAfterEffect$$inlined$transform$1$1$1.class */
        public static final class C05901 extends ContinuationImpl {
            int label;
            Object result;
            final AnonymousClass1 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05901(AnonymousClass1 anonymousClass1, Continuation continuation) {
                super(continuation);
                this.this$0 = anonymousClass1;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        public AnonymousClass1(FlowCollector flowCollector, BaseSearchResultViewModel baseSearchResultViewModel) {
            this.f87508b = baseSearchResultViewModel;
            this.f87507a = flowCollector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            /*
                Method dump skipped, instruction units count: 287
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.base.BaseSearchResultViewModel$filterVersionAfterEffect$$inlined$transform$1.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSearchResultViewModel$filterVersionAfterEffect$$inlined$transform$1(Flow flow, Continuation continuation, BaseSearchResultViewModel baseSearchResultViewModel) {
        super(2, continuation);
        this.$this_transform = flow;
        this.this$0 = baseSearchResultViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseSearchResultViewModel$filterVersionAfterEffect$$inlined$transform$1 baseSearchResultViewModel$filterVersionAfterEffect$$inlined$transform$1 = new BaseSearchResultViewModel$filterVersionAfterEffect$$inlined$transform$1(this.$this_transform, continuation, this.this$0);
        baseSearchResultViewModel$filterVersionAfterEffect$$inlined$transform$1.L$0 = obj;
        return baseSearchResultViewModel$filterVersionAfterEffect$$inlined$transform$1;
    }

    public final Object invoke(FlowCollector<? super q> flowCollector, Continuation<? super Unit> continuation) {
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
