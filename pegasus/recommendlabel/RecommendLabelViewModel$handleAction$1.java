package com.bilibili.pegasus.recommendlabel;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelViewModel$handleAction$1.class */
public final class RecommendLabelViewModel$handleAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final InterfaceC5739h $action;
    int label;
    final RecommendLabelViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendLabelViewModel$handleAction$1(RecommendLabelViewModel recommendLabelViewModel, InterfaceC5739h interfaceC5739h, Continuation<? super RecommendLabelViewModel$handleAction$1> continuation) {
        super(2, continuation);
        this.this$0 = recommendLabelViewModel;
        this.$action = interfaceC5739h;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecommendLabelViewModel$handleAction$1(this.this$0, this.$action, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            l0 l0Var = this.this$0.f78648a;
            InterfaceC5739h interfaceC5739h = this.$action;
            this.label = 1;
            Object objA = l0Var.a((f0) l0Var.f78757a.getValue(), interfaceC5739h, this);
            if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objA = Unit.INSTANCE;
            }
            if (objA == coroutine_suspended) {
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
