package com.bilibili.ship.theseus.ogv;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvDrmService$startCheck$2$1$requestDeferred$1.class */
public final class OgvDrmService$startCheck$2$1$requestDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final OgvDrmService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvDrmService$startCheck$2$1$requestDeferred$1(OgvDrmService ogvDrmService, Continuation<? super OgvDrmService$startCheck$2$1$requestDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvDrmService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvDrmService$startCheck$2$1$requestDeferred$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.OgvDrmService$startCheck$2$1$requestDeferred$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
