package com.bilibili.pegasus.components.interest.ui.v32.page;

import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import com.bilibili.pegasus.components.interest.ui.v32.vm.InterestChooseV32PageViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/InterestChooseV32SecondTab$initRv$3$1.class */
final class InterestChooseV32SecondTab$initRv$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Fo0.j $item;
    int label;
    final InterestChooseV32SecondTab this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV32SecondTab$initRv$3$1(InterestChooseV32SecondTab interestChooseV32SecondTab, Fo0.j jVar, Continuation<? super InterestChooseV32SecondTab$initRv$3$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV32SecondTab;
        this.$item = jVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV32SecondTab$initRv$3$1(this.this$0, this.$item, continuation);
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
        InterestChooseV32SecondTab interestChooseV32SecondTab = this.this$0;
        Fo0.j jVar = this.$item;
        InterestChooseV32PageViewModel interestChooseV32PageViewModelHf = interestChooseV32SecondTab.hf();
        if (interestChooseV32PageViewModelHf != null) {
            interestChooseV32PageViewModelHf.I0(new Actions.ReportActions.b(jVar, Actions.ReportActions.Type.Show));
        }
        return Unit.INSTANCE;
    }
}
