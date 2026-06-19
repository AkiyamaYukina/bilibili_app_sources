package com.bilibili.search2.result.base;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/BaseSearchResultViewModel$send$1.class */
public final class BaseSearchResultViewModel$send$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final u $intent;
    int label;
    final BaseSearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSearchResultViewModel$send$1(BaseSearchResultViewModel baseSearchResultViewModel, u uVar, Continuation<? super BaseSearchResultViewModel$send$1> continuation) {
        super(2, continuation);
        this.this$0 = baseSearchResultViewModel;
        this.$intent = uVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseSearchResultViewModel$send$1(this.this$0, this.$intent, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BaseSearchResultViewModel baseSearchResultViewModel = this.this$0;
            baseSearchResultViewModel.T0(baseSearchResultViewModel.f87495b, "send in VM scope " + this.$intent);
            boolean zTryEmit = this.this$0.f87496c.tryEmit(this.$intent);
            BaseSearchResultViewModel baseSearchResultViewModel2 = this.this$0;
            baseSearchResultViewModel2.T0(baseSearchResultViewModel2.f87495b, "result " + zTryEmit + "  send " + this.$intent);
            if (!zTryEmit) {
                BaseSearchResultViewModel baseSearchResultViewModel3 = this.this$0;
                baseSearchResultViewModel3.T0(baseSearchResultViewModel3.f87495b, "force emit");
                MutableSharedFlow<u> mutableSharedFlow = this.this$0.f87496c;
                u uVar = this.$intent;
                this.label = 1;
                if (mutableSharedFlow.emit(uVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BaseSearchResultViewModel baseSearchResultViewModel4 = this.this$0;
        baseSearchResultViewModel4.T0(baseSearchResultViewModel4.f87495b, "force emit over");
        return Unit.INSTANCE;
    }
}
