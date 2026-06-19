package com.bilibili.pegasus.components.interest.ui.udf.handlers;

import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/handlers/FetchSecondHandler$reduce$2.class */
final class FetchSecondHandler$reduce$2 extends SuspendLambda implements Function2<FlowCollector<? super Actions>, Continuation<? super Unit>, Object> {
    final int $cnt;
    final Fo0.k $current;
    private Object L$0;
    int label;
    final d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchSecondHandler$reduce$2(d dVar, Fo0.k kVar, int i7, Continuation<? super FetchSecondHandler$reduce$2> continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$current = kVar;
        this.$cnt = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FetchSecondHandler$reduce$2 fetchSecondHandler$reduce$2 = new FetchSecondHandler$reduce$2(this.this$0, this.$current, this.$cnt, continuation);
        fetchSecondHandler$reduce$2.L$0 = obj;
        return fetchSecondHandler$reduce$2;
    }

    public final Object invoke(FlowCollector<? super Actions> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x031a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 803
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.udf.handlers.FetchSecondHandler$reduce$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
