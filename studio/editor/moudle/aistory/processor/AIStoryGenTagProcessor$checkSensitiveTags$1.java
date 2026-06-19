package com.bilibili.studio.editor.moudle.aistory.processor;

import com.bilibili.studio.editor.moudle.aistory.bean.AiFrameResultBean;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/processor/AIStoryGenTagProcessor$checkSensitiveTags$1.class */
final class AIStoryGenTagProcessor$checkSensitiveTags$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    Object result;
    final AIStoryGenTagProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIStoryGenTagProcessor$checkSensitiveTags$1(AIStoryGenTagProcessor aIStoryGenTagProcessor, Continuation<? super AIStoryGenTagProcessor$checkSensitiveTags$1> continuation) {
        super(continuation);
        this.this$0 = aIStoryGenTagProcessor;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        AIStoryGenTagProcessor aIStoryGenTagProcessor = this.this$0;
        Map<String, List<AiFrameResultBean>> map = AIStoryGenTagProcessor.f105707f;
        return aIStoryGenTagProcessor.e(null, this);
    }
}
