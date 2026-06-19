package com.bilibili.topix.compose.create;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/TopicCreateViewModel$checkTitle$1.class */
final class TopicCreateViewModel$checkTitle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final double $count;
    final String $title;
    private Object L$0;
    Object L$1;
    int label;
    final TopicCreateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicCreateViewModel$checkTitle$1(double d7, TopicCreateViewModel topicCreateViewModel, String str, Continuation<? super TopicCreateViewModel$checkTitle$1> continuation) {
        super(2, continuation);
        this.$count = d7;
        this.this$0 = topicCreateViewModel;
        this.$title = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TopicCreateViewModel$checkTitle$1 topicCreateViewModel$checkTitle$1 = new TopicCreateViewModel$checkTitle$1(this.$count, this.this$0, this.$title, continuation);
        topicCreateViewModel$checkTitle$1.L$0 = obj;
        return topicCreateViewModel$checkTitle$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.compose.create.TopicCreateViewModel$checkTitle$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
