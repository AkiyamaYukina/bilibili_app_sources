package com.bilibili.search2.result.base;

import com.bilibili.search2.result.base.q;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$sendEvent$1.class */
final class BaseSearchResultViewModel$sendEvent$1 extends SuspendLambda implements Function2<q, Continuation<? super Unit>, Object> {
    final Flow<q> $this_sendEvent;
    Object L$0;
    int label;
    final BaseSearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseSearchResultViewModel$sendEvent$1(BaseSearchResultViewModel baseSearchResultViewModel, Flow<? extends q> flow, Continuation<? super BaseSearchResultViewModel$sendEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = baseSearchResultViewModel;
        this.$this_sendEvent = flow;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseSearchResultViewModel$sendEvent$1 baseSearchResultViewModel$sendEvent$1 = new BaseSearchResultViewModel$sendEvent$1(this.this$0, this.$this_sendEvent, continuation);
        baseSearchResultViewModel$sendEvent$1.L$0 = obj;
        return baseSearchResultViewModel$sendEvent$1;
    }

    public final Object invoke(q qVar, Continuation<? super Unit> continuation) {
        return create(qVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            q qVar = (q) this.L$0;
            if (!(qVar instanceof q.a)) {
                this.this$0.S0(this.$this_sendEvent, "sendEvent other");
                BLog.v(this.this$0.f87495b, "log sendEvent2 other SearchEffect " + qVar);
                return Unit.INSTANCE;
            }
            BaseSearchResultViewModel baseSearchResultViewModel = this.this$0;
            baseSearchResultViewModel.T0(baseSearchResultViewModel.f87495b, "log sendEvent2 SearchEffect.Event SearchEffect " + qVar);
            q.a aVar = (q.a) qVar;
            MutableSharedFlow<q.a> mutableSharedFlow = this.this$0.f87497d;
            this.label = 1;
            if (mutableSharedFlow.emit(aVar, this) == coroutine_suspended) {
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
