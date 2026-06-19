package com.bilibili.studio.editor.moudle.aistory.processor;

import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryFrameBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/processor/AIStoryGenTagProcessor$uploadBatchFrame$2.class */
final class AIStoryGenTagProcessor$uploadBatchFrame$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final AIStoryFrameBean $frameBean;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final AIStoryGenTagProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIStoryGenTagProcessor$uploadBatchFrame$2(AIStoryGenTagProcessor aIStoryGenTagProcessor, AIStoryFrameBean aIStoryFrameBean, Continuation<? super AIStoryGenTagProcessor$uploadBatchFrame$2> continuation) {
        super(2, continuation);
        this.this$0 = aIStoryGenTagProcessor;
        this.$frameBean = aIStoryFrameBean;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AIStoryGenTagProcessor$uploadBatchFrame$2(this.this$0, this.$frameBean, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02c8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01e5 -> B:51:0x01eb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$uploadBatchFrame$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
