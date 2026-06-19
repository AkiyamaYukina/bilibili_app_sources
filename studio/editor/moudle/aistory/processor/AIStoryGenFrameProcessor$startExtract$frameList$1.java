package com.bilibili.studio.editor.moudle.aistory.processor;

import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryFrameBean;
import com.bilibili.studio.videoeditor.bean.SelectVideo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/processor/AIStoryGenFrameProcessor$startExtract$frameList$1.class */
final class AIStoryGenFrameProcessor$startExtract$frameList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<AIStoryFrameBean>>, Object> {
    final List<SelectVideo> $it;
    int label;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AIStoryGenFrameProcessor$startExtract$frameList$1(List<? extends SelectVideo> list, b bVar, Continuation<? super AIStoryGenFrameProcessor$startExtract$frameList$1> continuation) {
        super(2, continuation);
        this.$it = list;
        this.this$0 = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AIStoryGenFrameProcessor$startExtract$frameList$1(this.$it, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<AIStoryFrameBean>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x024a A[LOOP:1: B:57:0x0240->B:59:0x024a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenFrameProcessor$startExtract$frameList$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
