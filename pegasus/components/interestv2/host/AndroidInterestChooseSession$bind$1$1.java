package com.bilibili.pegasus.components.interestv2.host;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/host/AndroidInterestChooseSession$bind$1$1.class */
public final class AndroidInterestChooseSession$bind$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final StateFlow<Rg0.b> $loginState;
    int label;
    final AndroidInterestChooseSession this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interestv2.host.AndroidInterestChooseSession$bind$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/host/AndroidInterestChooseSession$bind$1$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Rg0.b, Continuation<? super Unit>, Object> {
        int label;
        final AndroidInterestChooseSession this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidInterestChooseSession androidInterestChooseSession, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = androidInterestChooseSession;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(Rg0.b bVar, Continuation<? super Unit> continuation) {
            return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.c();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidInterestChooseSession$bind$1$1(StateFlow<Rg0.b> stateFlow, AndroidInterestChooseSession androidInterestChooseSession, Continuation<? super AndroidInterestChooseSession$bind$1$1> continuation) {
        super(2, continuation);
        this.$loginState = stateFlow;
        this.this$0 = androidInterestChooseSession;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AndroidInterestChooseSession$bind$1$1(this.$loginState, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow<Rg0.b> stateFlow = this.$loginState;
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
