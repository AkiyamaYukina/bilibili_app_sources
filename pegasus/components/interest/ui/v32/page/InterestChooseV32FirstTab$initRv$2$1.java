package com.bilibili.pegasus.components.interest.ui.v32.page;

import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import com.bilibili.pegasus.components.interest.ui.udf.model.InterestChooseAgeUi;
import com.bilibili.pegasus.components.interest.ui.udf.model.InterestChooseGenderUi;
import com.bilibili.pegasus.components.interest.ui.v32.vm.InterestChooseV32PageViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/InterestChooseV32FirstTab$initRv$2$1.class */
final class InterestChooseV32FirstTab$initRv$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Fo0.c $item;
    int label;
    final InterestChooseV32FirstTab this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV32FirstTab$initRv$2$1(InterestChooseV32FirstTab interestChooseV32FirstTab, Fo0.c cVar, Continuation<? super InterestChooseV32FirstTab$initRv$2$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV32FirstTab;
        this.$item = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV32FirstTab$initRv$2$1(this.this$0, this.$item, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        InterestChooseV32PageViewModel interestChooseV32PageViewModelHf;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterestChooseV32FirstTab interestChooseV32FirstTab = this.this$0;
        Fo0.c cVar = this.$item;
        interestChooseV32FirstTab.getClass();
        if (cVar instanceof InterestChooseGenderUi) {
            InterestChooseV32PageViewModel interestChooseV32PageViewModelHf2 = interestChooseV32FirstTab.hf();
            if (interestChooseV32PageViewModelHf2 != null) {
                interestChooseV32PageViewModelHf2.I0(new Actions.a.b((InterestChooseGenderUi) cVar));
            }
        } else if ((cVar instanceof InterestChooseAgeUi) && (interestChooseV32PageViewModelHf = interestChooseV32FirstTab.hf()) != null) {
            interestChooseV32PageViewModelHf.I0(new Actions.a.C0490a((InterestChooseAgeUi) cVar));
        }
        return Unit.INSTANCE;
    }
}
