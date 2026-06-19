package com.bilibili.pegasus.components.graduation;

import dp0.C6828a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$startObserver$1.class */
final class Graduation26Component$startObserver$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final Graduation26Component this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.graduation.Graduation26Component$startObserver$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$startObserver$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C6828a, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final Graduation26Component this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Graduation26Component graduation26Component, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = graduation26Component;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(C6828a c6828a, Continuation<? super Unit> continuation) {
            return create(c6828a, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C6828a c6828a = (C6828a) this.L$0;
            this.this$0.q(c6828a != null ? c6828a.s() : null, true);
            this.this$0.p();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Graduation26Component$startObserver$1(Graduation26Component graduation26Component, Continuation<? super Graduation26Component$startObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = graduation26Component;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Graduation26Component$startObserver$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow<C6828a> stateFlow = this.this$0.f().f79027t;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
