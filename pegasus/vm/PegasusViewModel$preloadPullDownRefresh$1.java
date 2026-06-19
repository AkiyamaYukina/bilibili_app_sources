package com.bilibili.pegasus.vm;

import com.bilibili.pegasus.Action;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/PegasusViewModel$preloadPullDownRefresh$1.class */
public final class PegasusViewModel$preloadPullDownRefresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Action>, Object> {
    final lp0.c $param;
    int label;
    final PegasusViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PegasusViewModel$preloadPullDownRefresh$1(lp0.c cVar, PegasusViewModel pegasusViewModel, Continuation<? super PegasusViewModel$preloadPullDownRefresh$1> continuation) {
        super(2, continuation);
        this.$param = cVar;
        this.this$0 = pegasusViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PegasusViewModel$preloadPullDownRefresh$1(this.$param, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Action> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            lp0.c cVar = this.$param;
            com.bilibili.pegasus.request.i iVar = this.this$0.f79009a;
            this.label = 1;
            Object objFetchPreloadedPullDownRefreshAction = ActionsKt.fetchPreloadedPullDownRefreshAction(cVar, iVar, this);
            obj = objFetchPreloadedPullDownRefreshAction;
            if (objFetchPreloadedPullDownRefreshAction == coroutine_suspended) {
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
