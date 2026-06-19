package com.bilibili.search2.result.base;

import com.bilibili.search2.result.base.u;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$toEffectFlow$4.class */
final class BaseSearchResultViewModel$toEffectFlow$4 extends SuspendLambda implements Function2<u.g, Continuation<? super Flow<? extends q>>, Object> {
    Object L$0;
    int label;
    final BaseSearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSearchResultViewModel$toEffectFlow$4(BaseSearchResultViewModel baseSearchResultViewModel, Continuation<? super BaseSearchResultViewModel$toEffectFlow$4> continuation) {
        super(2, continuation);
        this.this$0 = baseSearchResultViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseSearchResultViewModel$toEffectFlow$4 baseSearchResultViewModel$toEffectFlow$4 = new BaseSearchResultViewModel$toEffectFlow$4(this.this$0, continuation);
        baseSearchResultViewModel$toEffectFlow$4.L$0 = obj;
        return baseSearchResultViewModel$toEffectFlow$4;
    }

    public final Object invoke(u.g gVar, Continuation<? super Flow<? extends q>> continuation) {
        return create(gVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            u.g gVar = (u.g) this.L$0;
            BaseSearchResultViewModel baseSearchResultViewModel = this.this$0;
            this.label = 1;
            Object objY0 = baseSearchResultViewModel.Y0(gVar, this);
            obj = objY0;
            if (objY0 == coroutine_suspended) {
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
