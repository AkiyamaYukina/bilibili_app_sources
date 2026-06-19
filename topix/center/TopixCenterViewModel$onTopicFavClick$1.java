package com.bilibili.topix.center;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/TopixCenterViewModel$onTopicFavClick$1.class */
final class TopixCenterViewModel$onTopicFavClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final IpTopicItem $item;
    final int $position;
    final boolean $toFav;
    final long $topicId;
    int label;
    final E this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopixCenterViewModel$onTopicFavClick$1(E e7, boolean z6, long j7, int i7, IpTopicItem ipTopicItem, Continuation<? super TopixCenterViewModel$onTopicFavClick$1> continuation) {
        super(2, continuation);
        this.this$0 = e7;
        this.$toFav = z6;
        this.$topicId = j7;
        this.$position = i7;
        this.$item = ipTopicItem;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TopixCenterViewModel$onTopicFavClick$1(this.this$0, this.$toFav, this.$topicId, this.$position, this.$item, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.center.TopixCenterViewModel$onTopicFavClick$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
