package com.bilibili.pegasus.components.interest.ui.v26;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/InterestChooseMultiPageDialog$handleConfirmButtonClicked$1.class */
final class InterestChooseMultiPageDialog$handleConfirmButtonClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseMultiPageDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseMultiPageDialog$handleConfirmButtonClicked$1(InterestChooseMultiPageDialog interestChooseMultiPageDialog, Continuation<? super InterestChooseMultiPageDialog$handleConfirmButtonClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseMultiPageDialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseMultiPageDialog$handleConfirmButtonClicked$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v26.InterestChooseMultiPageDialog$handleConfirmButtonClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
