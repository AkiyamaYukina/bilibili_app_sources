package com.bilibili.ogv.kmm.operation.page;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/PageModel$komponent$1$refreshIfEmpty$1.class */
final class PageModel$komponent$1$refreshIfEmpty$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageModel$komponent$1$refreshIfEmpty$1(o oVar, Continuation<? super PageModel$komponent$1$refreshIfEmpty$1> continuation) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PageModel$komponent$1$refreshIfEmpty$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            dk0.m mVar = this.this$0.f68641e;
            this.label = 1;
            mVar.getClass();
            Object obj2 = Unit.INSTANCE;
            Object objEmit = mVar.f116483a.emit(obj2, this);
            if (objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                obj2 = objEmit;
            }
            if (obj2 == coroutine_suspended) {
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
