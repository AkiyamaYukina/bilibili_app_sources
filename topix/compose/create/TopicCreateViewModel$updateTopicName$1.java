package com.bilibili.topix.compose.create;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/TopicCreateViewModel$updateTopicName$1.class */
final class TopicCreateViewModel$updateTopicName$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $fromInitView;
    final androidx.compose.ui.text.input.G $name;
    int I$0;
    int I$1;
    Object L$0;
    int label;
    final TopicCreateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicCreateViewModel$updateTopicName$1(TopicCreateViewModel topicCreateViewModel, androidx.compose.ui.text.input.G g7, boolean z6, Continuation<? super TopicCreateViewModel$updateTopicName$1> continuation) {
        super(2, continuation);
        this.this$0 = topicCreateViewModel;
        this.$name = g7;
        this.$fromInitView = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TopicCreateViewModel$updateTopicName$1(this.this$0, this.$name, this.$fromInitView, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0348  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 847
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.compose.create.TopicCreateViewModel$updateTopicName$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
