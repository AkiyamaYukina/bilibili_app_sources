package com.bilibili.pegasus.components.interest.ui.v31.vm;

import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/vm/InterestChooseV31PageViewModel$dispatch$1$2$1.class */
public final class InterestChooseV31PageViewModel$dispatch$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Flow<Actions> $sideEffects;
    private Object L$0;
    int label;
    final InterestChooseV31PageViewModel this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/vm/InterestChooseV31PageViewModel$dispatch$1$2$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CoroutineScope f76640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterestChooseV31PageViewModel f76641b;

        public a(CoroutineScope coroutineScope, InterestChooseV31PageViewModel interestChooseV31PageViewModel) {
            this.f76640a = coroutineScope;
            this.f76641b = interestChooseV31PageViewModel;
        }

        public final Object emit(Object obj, Continuation continuation) {
            BuildersKt.launch$default(this.f76640a, (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV31PageViewModel$dispatch$1$2$1$1$1(this.f76641b, (Actions) obj, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InterestChooseV31PageViewModel$dispatch$1$2$1(Flow<? extends Actions> flow, InterestChooseV31PageViewModel interestChooseV31PageViewModel, Continuation<? super InterestChooseV31PageViewModel$dispatch$1$2$1> continuation) {
        super(2, continuation);
        this.$sideEffects = flow;
        this.this$0 = interestChooseV31PageViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InterestChooseV31PageViewModel$dispatch$1$2$1 interestChooseV31PageViewModel$dispatch$1$2$1 = new InterestChooseV31PageViewModel$dispatch$1$2$1(this.$sideEffects, this.this$0, continuation);
        interestChooseV31PageViewModel$dispatch$1$2$1.L$0 = obj;
        return interestChooseV31PageViewModel$dispatch$1$2$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Flow<Actions> flow = this.$sideEffects;
            a aVar = new a(coroutineScope, this.this$0);
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
