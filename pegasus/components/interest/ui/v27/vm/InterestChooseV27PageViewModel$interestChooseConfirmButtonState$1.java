package com.bilibili.pegasus.components.interest.ui.v27.vm;

import Ho0.b;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kp0.C7779b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v27/vm/InterestChooseV27PageViewModel$interestChooseConfirmButtonState$1.class */
public final class InterestChooseV27PageViewModel$interestChooseConfirmButtonState$1 extends SuspendLambda implements Function3<List<? extends InterestChooseItem>, b, Continuation<? super C7779b>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final InterestChooseV27PageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV27PageViewModel$interestChooseConfirmButtonState$1(InterestChooseV27PageViewModel interestChooseV27PageViewModel, Continuation<? super InterestChooseV27PageViewModel$interestChooseConfirmButtonState$1> continuation) {
        super(3, continuation);
        this.this$0 = interestChooseV27PageViewModel;
    }

    public final Object invoke(List<InterestChooseItem> list, b bVar, Continuation<? super C7779b> continuation) {
        InterestChooseV27PageViewModel$interestChooseConfirmButtonState$1 interestChooseV27PageViewModel$interestChooseConfirmButtonState$1 = new InterestChooseV27PageViewModel$interestChooseConfirmButtonState$1(this.this$0, continuation);
        interestChooseV27PageViewModel$interestChooseConfirmButtonState$1.L$0 = list;
        interestChooseV27PageViewModel$interestChooseConfirmButtonState$1.L$1 = bVar;
        return interestChooseV27PageViewModel$interestChooseConfirmButtonState$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02da A[EDGE_INSN: B:176:0x02da->B:126:0x02da BREAK  A[LOOP:2: B:95:0x0244->B:177:0x0244]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel$interestChooseConfirmButtonState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
