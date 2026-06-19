package com.bilibili.topix.compose.create;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/TopicCreateViewModel$initView$1.class */
final class TopicCreateViewModel$initView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $initDesc;
    final String $initName;
    final String $scene;
    Object L$0;
    int label;
    final TopicCreateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicCreateViewModel$initView$1(TopicCreateViewModel topicCreateViewModel, String str, String str2, String str3, Continuation<? super TopicCreateViewModel$initView$1> continuation) {
        super(2, continuation);
        this.this$0 = topicCreateViewModel;
        this.$initName = str;
        this.$initDesc = str2;
        this.$scene = str3;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TopicCreateViewModel$initView$1(this.this$0, this.$initName, this.$initDesc, this.$scene, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023c A[Catch: Exception -> 0x0035, TRY_ENTER, TryCatch #0 {Exception -> 0x0035, blocks: (B:13:0x002e, B:58:0x0233, B:60:0x023c, B:66:0x024c, B:53:0x01eb), top: B:76:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.compose.create.TopicCreateViewModel$initView$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
