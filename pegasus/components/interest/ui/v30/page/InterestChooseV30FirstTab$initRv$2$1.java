package com.bilibili.pegasus.components.interest.ui.v30.page;

import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v30/page/InterestChooseV30FirstTab$initRv$2$1.class */
final class InterestChooseV30FirstTab$initRv$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final InterestChoose $data;
    final Object $item;
    int label;
    final InterestChooseV30FirstTab this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV30FirstTab$initRv$2$1(InterestChooseV30FirstTab interestChooseV30FirstTab, Object obj, InterestChoose interestChoose, Continuation<? super InterestChooseV30FirstTab$initRv$2$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV30FirstTab;
        this.$item = obj;
        this.$data = interestChoose;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV30FirstTab$initRv$2$1(this.this$0, this.$item, this.$data, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v30.page.InterestChooseV30FirstTab$initRv$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
