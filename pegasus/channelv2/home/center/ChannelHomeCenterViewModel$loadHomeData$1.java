package com.bilibili.pegasus.channelv2.home.center;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/home/center/ChannelHomeCenterViewModel$loadHomeData$1.class */
public final class ChannelHomeCenterViewModel$loadHomeData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $autoRefresh;
    final boolean $refresh;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final ChannelHomeCenterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelHomeCenterViewModel$loadHomeData$1(ChannelHomeCenterViewModel channelHomeCenterViewModel, boolean z6, boolean z7, Continuation<? super ChannelHomeCenterViewModel$loadHomeData$1> continuation) {
        super(2, continuation);
        this.this$0 = channelHomeCenterViewModel;
        this.$refresh = z6;
        this.$autoRefresh = z7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChannelHomeCenterViewModel$loadHomeData$1(this.this$0, this.$refresh, this.$autoRefresh, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0103 A[Catch: Exception -> 0x0040, TRY_ENTER, TryCatch #0 {Exception -> 0x0040, blocks: (B:9:0x0036, B:32:0x00e2, B:35:0x0103, B:37:0x010b, B:15:0x004e, B:22:0x0088, B:24:0x00a7, B:26:0x00b2, B:17:0x0059), top: B:41:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterViewModel$loadHomeData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
