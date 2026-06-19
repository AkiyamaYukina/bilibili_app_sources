package com.bilibili.pegasus.components.interest.ui.v31.vm;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/vm/InterestChooseV31PageViewModel$dispatch$1$3$1.class */
public final class InterestChooseV31PageViewModel$dispatch$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Flow<Do0.a> $events;
    int label;
    final InterestChooseV31PageViewModel this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/vm/InterestChooseV31PageViewModel$dispatch$1$3$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterestChooseV31PageViewModel f76642a;

        public a(InterestChooseV31PageViewModel interestChooseV31PageViewModel) {
            this.f76642a = interestChooseV31PageViewModel;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
            Do0.a aVar = (Do0.a) obj;
            InterestChooseV31PageViewModel interestChooseV31PageViewModel = this.f76642a;
            interestChooseV31PageViewModel.f76628a.b(aVar, "Interest-V31");
            Object objEmit = interestChooseV31PageViewModel.f76630c.emit(aVar, continuation);
            if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objEmit = Unit.INSTANCE;
            }
            return objEmit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InterestChooseV31PageViewModel$dispatch$1$3$1(Flow<? extends Do0.a> flow, InterestChooseV31PageViewModel interestChooseV31PageViewModel, Continuation<? super InterestChooseV31PageViewModel$dispatch$1$3$1> continuation) {
        super(2, continuation);
        this.$events = flow;
        this.this$0 = interestChooseV31PageViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV31PageViewModel$dispatch$1$3$1(this.$events, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Do0.a> flow = this.$events;
            a aVar = new a(this.this$0);
            this.label = 1;
            if (flow.collect(aVar, this) == coroutine_suspended) {
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
