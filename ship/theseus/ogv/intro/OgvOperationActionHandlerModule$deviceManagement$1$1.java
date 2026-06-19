package com.bilibili.ship.theseus.ogv.intro;

import androidx.lifecycle.Lifecycle;
import ev0.InterfaceC7008a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/OgvOperationActionHandlerModule$deviceManagement$1$1.class */
final class OgvOperationActionHandlerModule$deviceManagement$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final InterfaceC7008a $businessScopeDriver;
    final Lifecycle $lifecycle;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.OgvOperationActionHandlerModule$deviceManagement$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/OgvOperationActionHandlerModule$deviceManagement$1$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Lifecycle.State, Continuation<? super Unit>, Object> {
        final InterfaceC7008a $businessScopeDriver;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC7008a interfaceC7008a, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$businessScopeDriver = interfaceC7008a;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$businessScopeDriver, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(Lifecycle.State state, Continuation<? super Unit> continuation) {
            return create(state, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (((Lifecycle.State) this.L$0) == Lifecycle.State.RESUMED) {
                this.$businessScopeDriver.a();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvOperationActionHandlerModule$deviceManagement$1$1(Lifecycle lifecycle, InterfaceC7008a interfaceC7008a, Continuation<? super OgvOperationActionHandlerModule$deviceManagement$1$1> continuation) {
        super(2, continuation);
        this.$lifecycle = lifecycle;
        this.$businessScopeDriver = interfaceC7008a;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvOperationActionHandlerModule$deviceManagement$1$1(this.$lifecycle, this.$businessScopeDriver, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowDrop = FlowKt.drop(this.$lifecycle.getCurrentStateFlow(), 1);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$businessScopeDriver, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDrop, anonymousClass1, this) == coroutine_suspended) {
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
