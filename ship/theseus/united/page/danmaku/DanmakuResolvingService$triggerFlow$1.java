package com.bilibili.ship.theseus.united.page.danmaku;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuResolvingService$triggerFlow$1.class */
public final class DanmakuResolvingService$triggerFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super Unit>, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final DanmakuResolvingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DanmakuResolvingService$triggerFlow$1(DanmakuResolvingService danmakuResolvingService, Continuation<? super DanmakuResolvingService$triggerFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = danmakuResolvingService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DanmakuResolvingService$triggerFlow$1 danmakuResolvingService$triggerFlow$1 = new DanmakuResolvingService$triggerFlow$1(this.this$0, continuation);
        danmakuResolvingService$triggerFlow$1.L$0 = obj;
        return danmakuResolvingService$triggerFlow$1;
    }

    public final Object invoke(FlowCollector<? super Unit> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.danmaku.DanmakuResolvingService$triggerFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
