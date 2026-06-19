package com.bilibili.ship.theseus.ugc.charge;

import android.util.Range;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeIAAService$2$1$1$1.class */
public final class ChargeIAAService$2$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final com.bilibili.comm.charge.api.b $this_run;
    Object L$0;
    int label;
    final ChargeIAAService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargeIAAService$2$1$1$1(ChargeIAAService chargeIAAService, com.bilibili.comm.charge.api.b bVar, Continuation<? super ChargeIAAService$2$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = chargeIAAService;
        this.$this_run = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sb0.c invokeSuspend$lambda$2$0(com.bilibili.comm.charge.api.b bVar, sb0.c cVar) {
        return sb0.c.a(cVar, new Range(Duration.box-impl(Duration.Companion.getZERO-UwyO8pc()), Duration.box-impl(bVar.d)));
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ChargeIAAService$2$1$1$1(this.this$0, this.$this_run, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.charge.ChargeIAAService$2$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
