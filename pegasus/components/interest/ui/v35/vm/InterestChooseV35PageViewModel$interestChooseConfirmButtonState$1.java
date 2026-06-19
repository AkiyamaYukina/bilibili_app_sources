package com.bilibili.pegasus.components.interest.ui.v35.vm;

import To0.a;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kp0.C7779b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/vm/InterestChooseV35PageViewModel$interestChooseConfirmButtonState$1.class */
public final class InterestChooseV35PageViewModel$interestChooseConfirmButtonState$1 extends SuspendLambda implements Function4<InterestChoose, List<? extends InterestChooseItem>, a, Continuation<? super C7779b>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final InterestChooseV35PageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV35PageViewModel$interestChooseConfirmButtonState$1(InterestChooseV35PageViewModel interestChooseV35PageViewModel, Continuation<? super InterestChooseV35PageViewModel$interestChooseConfirmButtonState$1> continuation) {
        super(4, continuation);
        this.this$0 = interestChooseV35PageViewModel;
    }

    public final Object invoke(InterestChoose interestChoose, List<InterestChooseItem> list, a aVar, Continuation<? super C7779b> continuation) {
        InterestChooseV35PageViewModel$interestChooseConfirmButtonState$1 interestChooseV35PageViewModel$interestChooseConfirmButtonState$1 = new InterestChooseV35PageViewModel$interestChooseConfirmButtonState$1(this.this$0, continuation);
        interestChooseV35PageViewModel$interestChooseConfirmButtonState$1.L$0 = interestChoose;
        interestChooseV35PageViewModel$interestChooseConfirmButtonState$1.L$1 = list;
        interestChooseV35PageViewModel$interestChooseConfirmButtonState$1.L$2 = aVar;
        return interestChooseV35PageViewModel$interestChooseConfirmButtonState$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 1189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel$interestChooseConfirmButtonState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
