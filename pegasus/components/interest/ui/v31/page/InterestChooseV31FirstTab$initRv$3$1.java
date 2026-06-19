package com.bilibili.pegasus.components.interest.ui.v31.page;

import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import com.bilibili.pegasus.components.interest.ui.v31.vm.InterestChooseV31PageViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/page/InterestChooseV31FirstTab$initRv$3$1.class */
final class InterestChooseV31FirstTab$initRv$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Fo0.c $item;
    int label;
    final InterestChooseV31FirstTab this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV31FirstTab$initRv$3$1(InterestChooseV31FirstTab interestChooseV31FirstTab, Fo0.c cVar, Continuation<? super InterestChooseV31FirstTab$initRv$3$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV31FirstTab;
        this.$item = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV31FirstTab$initRv$3$1(this.this$0, this.$item, continuation);
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
        InterestChooseV31FirstTab interestChooseV31FirstTab = this.this$0;
        Fo0.c cVar = this.$item;
        InterestChooseV31PageViewModel interestChooseV31PageViewModelHf = interestChooseV31FirstTab.hf();
        if (interestChooseV31PageViewModelHf != null) {
            interestChooseV31PageViewModelHf.I0(new Actions.ReportActions.a("main.interest-select.extra-btn.0.show", cVar));
        }
        return Unit.INSTANCE;
    }
}
