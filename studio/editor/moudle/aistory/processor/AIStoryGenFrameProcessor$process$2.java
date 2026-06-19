package com.bilibili.studio.editor.moudle.aistory.processor;

import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryProcessorBean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/processor/AIStoryGenFrameProcessor$process$2.class */
final class AIStoryGenFrameProcessor$process$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final AIStoryProcessorBean $bean;
    final Function1<Result<AIStoryProcessorBean>, Unit> $onNext;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    int label;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIStoryGenFrameProcessor$process$2(AIStoryProcessorBean aIStoryProcessorBean, b bVar, Function1<? super Result<AIStoryProcessorBean>, Unit> function1, Continuation<? super AIStoryGenFrameProcessor$process$2> continuation) {
        super(2, continuation);
        this.$bean = aIStoryProcessorBean;
        this.this$0 = bVar;
        this.$onNext = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AIStoryGenFrameProcessor$process$2(this.$bean, this.this$0, this.$onNext, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0106  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ab -> B:27:0x00f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00df -> B:26:0x00e2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenFrameProcessor$process$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
