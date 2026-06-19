package com.bilibili.pegasus.components.interest.ui.v31.page;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/page/InterestChooseV31SecondTab$initRv$3$1.class */
final class InterestChooseV31SecondTab$initRv$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Fo0.j $item;
    int label;
    final InterestChooseV31SecondTab this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV31SecondTab$initRv$3$1(InterestChooseV31SecondTab interestChooseV31SecondTab, Fo0.j jVar, Continuation<? super InterestChooseV31SecondTab$initRv$3$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV31SecondTab;
        this.$item = jVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV31SecondTab$initRv$3$1(this.this$0, this.$item, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r6
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L24
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            goto L5c
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L24:
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            com.bilibili.pegasus.components.interest.ui.v31.page.InterestChooseV31SecondTab r0 = r0.this$0
            com.bilibili.pegasus.components.interest.ui.v31.vm.InterestChooseV31PageViewModel r0 = r0.hf()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L61
            r0 = r7
            kotlinx.coroutines.flow.StateFlow<Fo0.k> r0 = r0.f76634g
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L61
            com.bilibili.pegasus.components.interest.ui.v31.page.InterestChooseV31SecondTab$initRv$3$1$invokeSuspend$$inlined$filter$1 r0 = new com.bilibili.pegasus.components.interest.ui.v31.page.InterestChooseV31SecondTab$initRv$3$1$invokeSuspend$$inlined$filter$1
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r7 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r7
            r1 = r6
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.first(r0, r1)
            r9 = r0
            r0 = r9
            r7 = r0
            r0 = r9
            r1 = r10
            if (r0 != r1) goto L5c
            r0 = r10
            return r0
        L5c:
            r0 = r7
            Fo0.k r0 = (Fo0.k) r0
            r7 = r0
        L61:
            r0 = r6
            com.bilibili.pegasus.components.interest.ui.v31.page.InterestChooseV31SecondTab r0 = r0.this$0
            r9 = r0
            r0 = r6
            Fo0.j r0 = r0.$item
            r7 = r0
            r0 = r9
            com.bilibili.pegasus.components.interest.ui.v31.vm.InterestChooseV31PageViewModel r0 = r0.hf()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L83
            r0 = r9
            com.bilibili.pegasus.components.interest.ui.udf.actions.Actions$ReportActions$b r1 = new com.bilibili.pegasus.components.interest.ui.udf.actions.Actions$ReportActions$b
            r2 = r1
            r3 = r7
            com.bilibili.pegasus.components.interest.ui.udf.actions.Actions$ReportActions$Type r4 = com.bilibili.pegasus.components.interest.ui.udf.actions.Actions.ReportActions.Type.Show
            r2.<init>(r3, r4)
            r0.I0(r1)
        L83:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v31.page.InterestChooseV31SecondTab$initRv$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
