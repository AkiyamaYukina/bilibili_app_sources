package com.bilibili.ship.theseus.ogv.activity.countdown;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/countdown/OgvWatchingCountdownTaskService$startCountdown$1.class */
public final class OgvWatchingCountdownTaskService$startCountdown$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final OgvWatchingCountdownTaskService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvWatchingCountdownTaskService$startCountdown$1(OgvWatchingCountdownTaskService ogvWatchingCountdownTaskService, Continuation<? super OgvWatchingCountdownTaskService$startCountdown$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvWatchingCountdownTaskService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvWatchingCountdownTaskService$startCountdown$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0116  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0051 -> B:14:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.activity.countdown.OgvWatchingCountdownTaskService$startCountdown$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
