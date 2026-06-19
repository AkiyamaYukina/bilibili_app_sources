package com.bilibili.pegasus.components.interest.ui.v36.vm;

import Vo0.a;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kp0.C7779b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/vm/InterestChooseV36PageViewModel$interestChooseConfirmButtonState$1.class */
public final class InterestChooseV36PageViewModel$interestChooseConfirmButtonState$1 extends SuspendLambda implements Function4<InterestChoose, List<? extends InterestChooseItem>, a, Continuation<? super C7779b>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final InterestChooseV36PageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV36PageViewModel$interestChooseConfirmButtonState$1(InterestChooseV36PageViewModel interestChooseV36PageViewModel, Continuation<? super InterestChooseV36PageViewModel$interestChooseConfirmButtonState$1> continuation) {
        super(4, continuation);
        this.this$0 = interestChooseV36PageViewModel;
    }

    public final Object invoke(InterestChoose interestChoose, List<InterestChooseItem> list, a aVar, Continuation<? super C7779b> continuation) {
        InterestChooseV36PageViewModel$interestChooseConfirmButtonState$1 interestChooseV36PageViewModel$interestChooseConfirmButtonState$1 = new InterestChooseV36PageViewModel$interestChooseConfirmButtonState$1(this.this$0, continuation);
        interestChooseV36PageViewModel$interestChooseConfirmButtonState$1.L$0 = list;
        interestChooseV36PageViewModel$interestChooseConfirmButtonState$1.L$1 = aVar;
        return interestChooseV36PageViewModel$interestChooseConfirmButtonState$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021c A[EDGE_INSN: B:164:0x021c->B:90:0x021c BREAK  A[LOOP:2: B:62:0x0192->B:165:0x0192]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v36.vm.InterestChooseV36PageViewModel$interestChooseConfirmButtonState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
