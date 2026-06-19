package com.bilibili.pegasus.channelv2.home.center;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import po0.C8336a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/home/center/ChannelHomeCenterViewModel$buildListData$2.class */
final class ChannelHomeCenterViewModel$buildListData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ArrayList<C8336a<?>> $list;
    int label;
    final ChannelHomeCenterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelHomeCenterViewModel$buildListData$2(ChannelHomeCenterViewModel channelHomeCenterViewModel, ArrayList<C8336a<?>> arrayList, Continuation<? super ChannelHomeCenterViewModel$buildListData$2> continuation) {
        super(2, continuation);
        this.this$0 = channelHomeCenterViewModel;
        this.$list = arrayList;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChannelHomeCenterViewModel$buildListData$2(this.this$0, this.$list, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x032e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 1615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterViewModel$buildListData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
