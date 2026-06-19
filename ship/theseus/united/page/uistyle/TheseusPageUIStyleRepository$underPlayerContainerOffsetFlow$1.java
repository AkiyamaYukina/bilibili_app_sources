package com.bilibili.ship.theseus.united.page.uistyle;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleRepository$underPlayerContainerOffsetFlow$1.class */
final class TheseusPageUIStyleRepository$underPlayerContainerOffsetFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super Integer>, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final TheseusPageUIStyleRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPageUIStyleRepository$underPlayerContainerOffsetFlow$1(TheseusPageUIStyleRepository theseusPageUIStyleRepository, Continuation<? super TheseusPageUIStyleRepository$underPlayerContainerOffsetFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = theseusPageUIStyleRepository;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusPageUIStyleRepository$underPlayerContainerOffsetFlow$1 theseusPageUIStyleRepository$underPlayerContainerOffsetFlow$1 = new TheseusPageUIStyleRepository$underPlayerContainerOffsetFlow$1(this.this$0, continuation);
        theseusPageUIStyleRepository$underPlayerContainerOffsetFlow$1.L$0 = obj;
        return theseusPageUIStyleRepository$underPlayerContainerOffsetFlow$1;
    }

    public final Object invoke(FlowCollector<? super Integer> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository$underPlayerContainerOffsetFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
