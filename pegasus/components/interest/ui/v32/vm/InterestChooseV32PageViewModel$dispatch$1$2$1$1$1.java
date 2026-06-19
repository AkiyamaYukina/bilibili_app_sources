package com.bilibili.pegasus.components.interest.ui.v32.vm;

import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/vm/InterestChooseV32PageViewModel$dispatch$1$2$1$1$1.class */
final class InterestChooseV32PageViewModel$dispatch$1$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Actions $it;
    int label;
    final InterestChooseV32PageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV32PageViewModel$dispatch$1$2$1$1$1(InterestChooseV32PageViewModel interestChooseV32PageViewModel, Actions actions, Continuation<? super InterestChooseV32PageViewModel$dispatch$1$2$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV32PageViewModel;
        this.$it = actions;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV32PageViewModel$dispatch$1$2$1$1$1(this.this$0, this.$it, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.I0(this.$it);
        return Unit.INSTANCE;
    }
}
