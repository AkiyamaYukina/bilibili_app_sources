package com.bilibili.search2.result.base;

import com.bilibili.search2.result.base.u;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$5.class */
final class BaseSearchResultViewModel$toEffectFlow$5 extends SuspendLambda implements Function2<u.f, Continuation<? super Flow<? extends q>>, Object> {
    Object L$0;
    int label;
    final BaseSearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSearchResultViewModel$toEffectFlow$5(BaseSearchResultViewModel baseSearchResultViewModel, Continuation<? super BaseSearchResultViewModel$toEffectFlow$5> continuation) {
        super(2, continuation);
        this.this$0 = baseSearchResultViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseSearchResultViewModel$toEffectFlow$5 baseSearchResultViewModel$toEffectFlow$5 = new BaseSearchResultViewModel$toEffectFlow$5(this.this$0, continuation);
        baseSearchResultViewModel$toEffectFlow$5.L$0 = obj;
        return baseSearchResultViewModel$toEffectFlow$5;
    }

    public final Object invoke(u.f fVar, Continuation<? super Flow<? extends q>> continuation) {
        return create(fVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            u.f fVar = (u.f) this.L$0;
            BaseSearchResultViewModel baseSearchResultViewModel = this.this$0;
            this.label = 1;
            Object objX0 = baseSearchResultViewModel.X0(fVar, this);
            obj = objX0;
            if (objX0 == coroutine_suspended) {
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
