package com.bilibili.ogv.infra.coroutine;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/coroutine/SelectKt$selectCancellingUnselected$scope$1$selectAsync$1.class */
public final class SelectKt$selectCancellingUnselected$scope$1$selectAsync$1<R> extends SuspendLambda implements Function2<FlowCollector<? super R>, Continuation<? super Unit>, Object> {
    final Function1<Continuation<? super R>, Object> $block;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectKt$selectCancellingUnselected$scope$1$selectAsync$1(Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super SelectKt$selectCancellingUnselected$scope$1$selectAsync$1> continuation) {
        super(2, continuation);
        this.$block = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SelectKt$selectCancellingUnselected$scope$1$selectAsync$1 selectKt$selectCancellingUnselected$scope$1$selectAsync$1 = new SelectKt$selectCancellingUnselected$scope$1$selectAsync$1(this.$block, continuation);
        selectKt$selectCancellingUnselected$scope$1$selectAsync$1.L$0 = obj;
        return selectKt$selectCancellingUnselected$scope$1$selectAsync$1;
    }

    public final Object invoke(FlowCollector<? super R> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            Function1<Continuation<? super R>, Object> function1 = this.$block;
            this.L$0 = flowCollector;
            this.label = 1;
            Object objInvoke = function1.invoke(this);
            obj = objInvoke;
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
