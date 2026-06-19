package com.bilibili.search2.result.base;

import com.bilibili.search2.result.base.q;
import com.bilibili.search2.result.base.u;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$11.class */
final class BaseSearchResultViewModel$toEffectFlow$11 extends SuspendLambda implements Function2<u.j, Continuation<? super Flow<? extends q>>, Object> {
    Object L$0;
    int label;

    /* JADX INFO: renamed from: com.bilibili.search2.result.base.BaseSearchResultViewModel$toEffectFlow$11$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$11$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super q>, Continuation<? super Unit>, Object> {
        final u.j $it;
        private Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(u.j jVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$it = jVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
                q.f fVar = new q.f(this.$it.f87638a);
                this.label = 1;
                if (flowCollector.emit(fVar, this) == coroutine_suspended) {
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

    public BaseSearchResultViewModel$toEffectFlow$11(Continuation<? super BaseSearchResultViewModel$toEffectFlow$11> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseSearchResultViewModel$toEffectFlow$11 baseSearchResultViewModel$toEffectFlow$11 = new BaseSearchResultViewModel$toEffectFlow$11(continuation);
        baseSearchResultViewModel$toEffectFlow$11.L$0 = obj;
        return baseSearchResultViewModel$toEffectFlow$11;
    }

    public final Object invoke(u.j jVar, Continuation<? super Flow<? extends q>> continuation) {
        return create(jVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return FlowKt.flow(new AnonymousClass1((u.j) this.L$0, null));
    }
}
