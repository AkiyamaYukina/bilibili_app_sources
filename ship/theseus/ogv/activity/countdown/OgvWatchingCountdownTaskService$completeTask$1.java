package com.bilibili.ship.theseus.ogv.activity.countdown;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/countdown/OgvWatchingCountdownTaskService$completeTask$1.class */
final class OgvWatchingCountdownTaskService$completeTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $timestamp;
    int label;
    final OgvWatchingCountdownTaskService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvWatchingCountdownTaskService$completeTask$1(OgvWatchingCountdownTaskService ogvWatchingCountdownTaskService, String str, Continuation<? super OgvWatchingCountdownTaskService$completeTask$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvWatchingCountdownTaskService;
        this.$timestamp = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvWatchingCountdownTaskService$completeTask$1(this.this$0, this.$timestamp, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.activity.countdown.OgvWatchingCountdownTaskService$completeTask$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
