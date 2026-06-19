package com.bilibili.studio.editor.moudle.aistory.processor;

import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryFrameBean;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/processor/AIStoryGenTagProcessor$cacheLocalFrameTag$2.class */
final class AIStoryGenTagProcessor$cacheLocalFrameTag$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<AIStoryFrameBean> $frameBean;
    int label;
    final AIStoryGenTagProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIStoryGenTagProcessor$cacheLocalFrameTag$2(List<AIStoryFrameBean> list, AIStoryGenTagProcessor aIStoryGenTagProcessor, Continuation<? super AIStoryGenTagProcessor$cacheLocalFrameTag$2> continuation) {
        super(2, continuation);
        this.$frameBean = list;
        this.this$0 = aIStoryGenTagProcessor;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AIStoryGenTagProcessor$cacheLocalFrameTag$2(this.$frameBean, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$cacheLocalFrameTag$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
