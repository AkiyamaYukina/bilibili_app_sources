package com.bilibili.pegasus.components;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/NoticeViewModel$loadNotice$1.class */
final class NoticeViewModel$loadNotice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final d0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoticeViewModel$loadNotice$1(d0 d0Var, Continuation<? super NoticeViewModel$loadNotice$1> continuation) {
        super(2, continuation);
        this.this$0 = d0Var;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NoticeViewModel$loadNotice$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        MutableStateFlow<BiliNotice> mutableStateFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                d0 d0Var = this.this$0;
                mutableStateFlow = d0Var.f75951a;
                this.L$0 = mutableStateFlow;
                this.label = 1;
                obj = d0.I0(d0Var, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow = (MutableStateFlow) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            mutableStateFlow.setValue(obj);
        } finally {
            try {
            } finally {
            }
        }
        return Unit.INSTANCE;
    }
}
