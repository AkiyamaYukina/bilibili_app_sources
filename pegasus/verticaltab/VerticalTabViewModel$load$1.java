package com.bilibili.pegasus.verticaltab;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/VerticalTabViewModel$load$1.class */
final class VerticalTabViewModel$load$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalTabViewModel$load$1(l lVar, Continuation<? super VerticalTabViewModel$load$1> continuation) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerticalTabViewModel$load$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 821
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.verticaltab.VerticalTabViewModel$load$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
