package com.bilibili.search2.result.base;

import com.bilibili.search2.result.base.u;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$8.class */
final class BaseSearchResultViewModel$toEffectFlow$8 extends SuspendLambda implements Function2<u.a, Continuation<? super Flow<? extends q>>, Object> {
    Object L$0;
    int label;
    final BaseSearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSearchResultViewModel$toEffectFlow$8(BaseSearchResultViewModel baseSearchResultViewModel, Continuation<? super BaseSearchResultViewModel$toEffectFlow$8> continuation) {
        super(2, continuation);
        this.this$0 = baseSearchResultViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseSearchResultViewModel$toEffectFlow$8 baseSearchResultViewModel$toEffectFlow$8 = new BaseSearchResultViewModel$toEffectFlow$8(this.this$0, continuation);
        baseSearchResultViewModel$toEffectFlow$8.L$0 = obj;
        return baseSearchResultViewModel$toEffectFlow$8;
    }

    public final Object invoke(u.a aVar, Continuation<? super Flow<? extends q>> continuation) {
        return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            u.a aVar = (u.a) this.L$0;
            BaseSearchResultViewModel baseSearchResultViewModel = this.this$0;
            this.label = 1;
            Flow flowA1 = baseSearchResultViewModel.a1(aVar);
            obj = flowA1;
            if (flowA1 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
