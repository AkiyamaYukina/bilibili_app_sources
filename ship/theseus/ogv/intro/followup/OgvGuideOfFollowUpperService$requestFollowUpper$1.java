package com.bilibili.ship.theseus.ogv.intro.followup;

import com.bilibili.ship.theseus.ogv.intro.followup.c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/OgvGuideOfFollowUpperService$requestFollowUpper$1.class */
final class OgvGuideOfFollowUpperService$requestFollowUpper$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $mid;
    final c.a $vm;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final OgvGuideOfFollowUpperService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvGuideOfFollowUpperService$requestFollowUpper$1(long j7, OgvGuideOfFollowUpperService ogvGuideOfFollowUpperService, c.a aVar, Continuation<? super OgvGuideOfFollowUpperService$requestFollowUpper$1> continuation) {
        super(2, continuation);
        this.$mid = j7;
        this.this$0 = ogvGuideOfFollowUpperService;
        this.$vm = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvGuideOfFollowUpperService$requestFollowUpper$1(this.$mid, this.this$0, this.$vm, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.followup.OgvGuideOfFollowUpperService$requestFollowUpper$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
