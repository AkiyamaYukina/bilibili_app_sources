package com.bilibili.pegasus.channelv2.home.center;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/home/center/ChannelHomeCenterViewModel$refreshRcmdData$1.class */
final class ChannelHomeCenterViewModel$refreshRcmdData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final ChannelHomeCenterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelHomeCenterViewModel$refreshRcmdData$1(ChannelHomeCenterViewModel channelHomeCenterViewModel, Continuation<? super ChannelHomeCenterViewModel$refreshRcmdData$1> continuation) {
        super(2, continuation);
        this.this$0 = channelHomeCenterViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelHomeCenterViewModel$refreshRcmdData$1 channelHomeCenterViewModel$refreshRcmdData$1 = new ChannelHomeCenterViewModel$refreshRcmdData$1(this.this$0, continuation);
        channelHomeCenterViewModel$refreshRcmdData$1.L$0 = obj;
        return channelHomeCenterViewModel$refreshRcmdData$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterViewModel$refreshRcmdData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
