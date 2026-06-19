package com.bilibili.search2.result.base;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$log$1.class */
public final class BaseSearchResultViewModel$log$1<T> extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
    final String $state;
    final Flow<T> $this_log;
    Object L$0;
    int label;
    final BaseSearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseSearchResultViewModel$log$1(BaseSearchResultViewModel baseSearchResultViewModel, String str, Flow<? extends T> flow, Continuation<? super BaseSearchResultViewModel$log$1> continuation) {
        super(2, continuation);
        this.this$0 = baseSearchResultViewModel;
        this.$state = str;
        this.$this_log = flow;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseSearchResultViewModel$log$1 baseSearchResultViewModel$log$1 = new BaseSearchResultViewModel$log$1(this.this$0, this.$state, this.$this_log, continuation);
        baseSearchResultViewModel$log$1.L$0 = obj;
        return baseSearchResultViewModel$log$1;
    }

    public final Object invoke(T t7, Continuation<? super Unit> continuation) {
        return create(t7, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
